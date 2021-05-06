package com.example.demo.NBP.service;

import com.example.demo.NBP.dto.NBPResponseDTO;
import com.example.demo.NBP.dto.RateDTO;
import com.example.demo.NBP.dto.ValueDTO;
import com.example.demo.NBP.entity.Currency;
import com.example.demo.NBP.repository.NBPRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class NBPServiceImpl implements NBPService {

    private final NBPRepository nbpRepository;
    private final WebClient.Builder webClientBuilder;


    @Autowired
    public NBPServiceImpl(NBPRepository nbpRepository, WebClient.Builder webClientBuilder) {
        this.nbpRepository = nbpRepository;
        this.webClientBuilder = webClientBuilder;
    }



    @Override
    public List<RateDTO> getAvaliableCurrencies() throws JsonProcessingException {
        NBPResponseDTO[] waluty = webClientBuilder.build()
                .get()
                .uri("http://api.nbp.pl/api/exchangerates/tables/A")
                .retrieve()
                .bodyToMono(NBPResponseDTO[].class)
                .block();

        ObjectMapper objectMapper = new ObjectMapper();
        String nbpresponse = objectMapper.writeValueAsString(waluty[0].getRates());
        Currency obiekt = new com.example.demo.NBP.entity.Currency("getAvaliableCurrencies",nbpresponse);
        nbpRepository.save(obiekt);
        return waluty[0].getRates();
    }
//sgdshyhry
    @Override
    public BigDecimal exchangeCurrencies(BigDecimal value, String currency1, String currency2) {
        ValueDTO waluta1 = webClientBuilder.build()
                .get()
                .uri("http://api.nbp.pl/api/exchangerates/rates/A/{id}",currency1)
                .retrieve()
                .bodyToMono(ValueDTO.class)
                .block();
        ValueDTO waluta2 = webClientBuilder.build()
                .get()
                .uri("http://api.nbp.pl/api/exchangerates/rates/A/{id}",currency2)
                .retrieve()
                .bodyToMono(ValueDTO.class)
                .block();
        BigDecimal valuePierwszej = waluta1.getRates().get(0).getMid();
        BigDecimal valueDrugiej = waluta2.getRates().get(0).getMid();
        return (value.multiply(valuePierwszej)).divide(valueDrugiej,5, RoundingMode.HALF_UP);
    }

    @Override
    public BigDecimal exchangeCurrenciesStream(BigDecimal value, String currency1, String currency2) {
        NBPResponseDTO[] waluty = webClientBuilder.build()
                .get()
                .uri("http://api.nbp.pl/api/exchangerates/tables/A")
                .retrieve()
                .bodyToMono(NBPResponseDTO[].class)
                .block();
        List<RateDTO> collect1 = waluty[0].getRates().stream()
                .filter(r -> r.getCode().equals(currency1))
                .collect(Collectors.toList());
        List<RateDTO> collect2 = waluty[0].getRates().stream()
                .filter(r -> r.getCode().equals(currency2))
                .collect(Collectors.toList());
        return (value.multiply(collect1.get(0).getMid())).divide(collect2.get(0).getMid(),5, RoundingMode.HALF_UP);
    }
}

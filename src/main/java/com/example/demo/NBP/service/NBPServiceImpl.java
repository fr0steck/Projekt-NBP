package com.example.demo.NBP.service;

import com.example.demo.NBP.dto.NBPResponseDTO;
import com.example.demo.NBP.dto.RateDTO;
import com.example.demo.NBP.dto.ValueDTO;
import com.example.demo.NBP.repository.NBPRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

@Service
public class NBPServiceImpl implements NBPService {

    private final NBPRepository nbpRepository;
    private final WebClient.Builder webClientBuilder;


    @Autowired
    public NBPServiceImpl(NBPRepository nbpRepository, WebClient.Builder webClientBuilder) {
        this.nbpRepository = nbpRepository;
        this.webClientBuilder = webClientBuilder;
    }

//    @Override
//    public NBPResponseDTO[] getAllCurrencies(){
//        NBPResponseDTO[] waluty = webClientBuilder.build()
//                .get()
//                .uri("http://api.nbp.pl/api/exchangerates/tables/A")
//                .retrieve()
//                .bodyToMono(NBPResponseDTO[].class)
//                .block();
//        return waluty;
//    }

    @Override
    public List<RateDTO> getAvaliableCurrencies(){
        NBPResponseDTO[] waluty = webClientBuilder.build()
                .get()
                .uri("http://api.nbp.pl/api/exchangerates/tables/A")
                .retrieve()
                .bodyToMono(NBPResponseDTO[].class)
                .block();
        return waluty[0].getRates();
//        List<RateDTO> listawalut = waluty[0].getRates();
//        List<String> listaNazwa = new ArrayList<>();
//        for(RateDTO r : listawalut)
//            listaNazwa.add(r.getCurrency());
//        return listaNazwa;
    }

//    @Override
//    public List<BigDecimal> getCurrentValues() {
//        NBPResponseDTO[] waluty = webClientBuilder.build()
//                .get()
//                .uri("http://api.nbp.pl/api/exchangerates/tables/A")
//                .retrieve()
//                .bodyToMono(NBPResponseDTO[].class)
//                .block();
//        List<RateDTO> listawalut = waluty[0].getRates();
//        List<BigDecimal> listakursy = new ArrayList<>();
//        for(RateDTO r : listawalut)
//            listakursy.add(r.getMid());
//        return listakursy;
//    }

//    @Override
//    public BigDecimal exchangeCurrencies(BigDecimal value, String currency1, String currency2) {
//        NBPResponseDTO[] waluty = webClientBuilder.build()
//                .get()
//                .uri("http://api.nbp.pl/api/exchangerates/tables/A")
//                .retrieve()
//                .bodyToMono(NBPResponseDTO[].class)
//                .block();
//        List<RateDTO> listawalut = waluty[0].getRates();
//        BigDecimal valuePierwszej = null;
//        BigDecimal valueDrugiej = null;
//        for(RateDTO r : listawalut) {
//            if (r.getCurrency().equals(currency1)) {
//                valuePierwszej = r.getMid();
//            }
//        }
//        for(RateDTO r : listawalut) {
//            if (r.getCurrency().equals(currency2)) {
//                valueDrugiej = r.getMid();
//            }
//        }
//        return (value.multiply(valuePierwszej)).divide(valueDrugiej,5, RoundingMode.HALF_UP);
//    }

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
}

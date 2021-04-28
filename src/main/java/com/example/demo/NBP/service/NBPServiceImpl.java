package com.example.demo.NBP.service;

import com.example.demo.NBP.dto.NBPResponseDTO;
import com.example.demo.NBP.dto.RateDTO;
import com.example.demo.NBP.repository.NBPRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class NBPServiceImpl implements NBPService {

    private final NBPRepository nbpRepository;
    private final WebClient.Builder webClientBuilder;

    /*
    Currency currency = webClientBuilder.build()
    .get()
        .uri("http://api.nbp.pl/api/exchangerates/tables/A")
        .retrive()
        .bodyToMono(Currency.class)
        .block();
*/


    @Autowired
    public NBPServiceImpl(NBPRepository nbpRepository, WebClient.Builder webClientBuilder) {
        this.nbpRepository = nbpRepository;
        this.webClientBuilder = webClientBuilder;
    }

    @Override
    public NBPResponseDTO[] getAllCurrencies(){
        NBPResponseDTO[] waluty = webClientBuilder.build()
                .get()
                .uri("http://api.nbp.pl/api/exchangerates/tables/A")
                .retrieve()
                .bodyToMono(NBPResponseDTO[].class)
                .block();
        return waluty;
    }

    @Override
    public List<String> getAvaliableCurrencies(){
        NBPResponseDTO[] waluty = webClientBuilder.build()
                .get()
                .uri("http://api.nbp.pl/api/exchangerates/tables/A")
                .retrieve()
                .bodyToMono(NBPResponseDTO[].class)
                .block();
        List<RateDTO> listawalut = waluty[0].getRates();
        List<String> listaNazwa = new ArrayList<>();
        for(RateDTO r : listawalut)
            listaNazwa.add(r.getCurrency());
        return listaNazwa;
    }

    @Override
    public List<BigDecimal> getCurrentValues() {
        NBPResponseDTO[] waluty = webClientBuilder.build()
                .get()
                .uri("http://api.nbp.pl/api/exchangerates/tables/A")
                .retrieve()
                .bodyToMono(NBPResponseDTO[].class)
                .block();
        List<RateDTO> listawalut = waluty[0].getRates();
        List<BigDecimal> listakursy = new ArrayList<>();
        for(RateDTO r : listawalut)
            listakursy.add(r.getMid());
        return listakursy;
    }

/*
ma odpytac NBP
zapisuje dane z NBP do Currency
save przez NBPRepository na baze
zwracam na front informacje ktore chcialem uzyskac z resta
 */

}

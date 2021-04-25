package com.example.demo.NBP.service;

import com.example.demo.NBP.dto.ExchangeRatesTableDTO;
import com.example.demo.NBP.dto.NBPResponseDTO;
import com.example.demo.NBP.dto.TestDTO1;
import com.example.demo.NBP.repository.NBPRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

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

    public TestDTO1 getAvaliableCurrencies(){
        TestDTO1 block = webClientBuilder.build()
                .get()
                .uri("http://api.nbp.pl/api/exchangerates/tables/A")
                .retrieve()
                .bodyToMono(TestDTO1.class)
                .block();
        return block;
    }
/*
ma odpytac NBP
zapisuje dane z NBP do Currency
save przez NBPRepository na baze
zwracam na front informacje ktore chcialem uzyskac z resta
 */

}

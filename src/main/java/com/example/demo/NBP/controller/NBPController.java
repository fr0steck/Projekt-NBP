package com.example.demo.NBP.controller;


import com.example.demo.NBP.service.NBPService;
import com.example.demo.NBP.service.NBPServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/waluta")
public class NBPController {

    private final NBPService nbpService;

    @Autowired
    public NBPController(NBPServiceImpl nbpService) {
        this.nbpService = nbpService;
    }

    @Autowired
    private WebClient.Builder webClientBuilder;

    @GetMapping(path = "/avaliableCurrencies")
    public List<String> getAvaliableCurrencies(){
        return nbpService.getAvaliableCurrencies();
    }

    @GetMapping(path = "/currentValues")
    public List<BigDecimal> getCurrentValues(){
        return nbpService.getCurrentValues();
    }

    @PostMapping(path = "/exchangeCurrencies")
    public BigDecimal exchangeCurrencies(@RequestBody BigDecimal value, String currency1, String currency2){
        return nbpService.exchangeCurrencies(value,currency1,currency2);
    }



}

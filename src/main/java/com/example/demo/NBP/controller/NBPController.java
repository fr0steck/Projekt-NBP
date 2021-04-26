package com.example.demo.NBP.controller;


import com.example.demo.NBP.dto.NBPResponseDTO;
import com.example.demo.NBP.service.NBPService;
import com.example.demo.NBP.service.NBPServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

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
    public NBPResponseDTO[] getAvaliableCurrencies(){
        return nbpService.getAvaliableCurrencies();
    }

}

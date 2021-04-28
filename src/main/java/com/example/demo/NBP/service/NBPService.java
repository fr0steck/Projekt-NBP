package com.example.demo.NBP.service;

import com.example.demo.NBP.dto.NBPResponseDTO;

import java.util.List;


public interface NBPService {
    NBPResponseDTO [] getAllCurrencies();
    List<String> getAvaliableCurrencies();
}

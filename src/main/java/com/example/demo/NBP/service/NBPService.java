package com.example.demo.NBP.service;

import com.example.demo.NBP.dto.NBPResponseDTO;
import com.example.demo.NBP.dto.RateDTO;

import java.math.BigDecimal;
import java.util.List;


public interface NBPService {
    NBPResponseDTO [] getAllCurrencies();
    List<String> getAvaliableCurrencies();
    List<BigDecimal> getCurrentValues();
}

package com.example.demo.NBP.service;

import com.example.demo.NBP.dto.NBPResponseDTO;
import com.example.demo.NBP.dto.RateDTO;

import java.math.BigDecimal;
import java.util.List;


public interface NBPService {
    //NBPResponseDTO [] getAllCurrencies();
    List<RateDTO> getAvaliableCurrencies();
    BigDecimal exchangeCurrencies(BigDecimal value, String currency1, String currency2);
}

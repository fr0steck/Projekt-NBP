package com.example.demo.NBP.service;

import com.example.demo.NBP.dto.NBPResponseDTO;
import com.example.demo.NBP.dto.RateDTO;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.math.BigDecimal;
import java.util.List;


public interface NBPService {
    List<RateDTO> getAvaliableCurrencies() throws JsonProcessingException;
    BigDecimal exchangeCurrencies(BigDecimal value, String currency1, String currency2) throws JsonProcessingException;
    BigDecimal exchangeCurrenciesStream(BigDecimal value, String currency1, String currency2);
}

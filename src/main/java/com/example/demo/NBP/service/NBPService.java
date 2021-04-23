package com.example.demo.NBP.service;

import com.example.demo.NBP.dto.ExchangeRatesTableDTO;
import com.example.demo.NBP.dto.NBPResponseDTO;

public interface NBPService {
    ExchangeRatesTableDTO[] getAvaliableCurrencies();
}

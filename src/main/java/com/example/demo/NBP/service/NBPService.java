package com.example.demo.NBP.service;

import com.example.demo.NBP.dto.ExchangeRatesTableDTO;
import com.example.demo.NBP.dto.NBPResponseDTO;
import com.example.demo.NBP.dto.TestDTO;

public interface NBPService {
    TestDTO[] getAvaliableCurrencies();
}

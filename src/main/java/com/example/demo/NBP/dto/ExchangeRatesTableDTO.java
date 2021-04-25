package com.example.demo.NBP.dto;

public class ExchangeRatesTableDTO {
    private NBPResponseDTO ExchangeRatesTable1;

    @Override
    public String toString() {
        return "ExchangeRatesTableDTO{" +
                "ExchangeRatesTable1=" + ExchangeRatesTable1 +
                '}';
    }

    public void setExchangeRatesTable1(NBPResponseDTO exchangeRatesTable1) {
        ExchangeRatesTable1 = exchangeRatesTable1;
    }

    public NBPResponseDTO getExchangeRatesTable1() {
        return ExchangeRatesTable1;
    }

    public ExchangeRatesTableDTO() {
    }

    public ExchangeRatesTableDTO(NBPResponseDTO exchangeRatesTable1) {
        ExchangeRatesTable1 = exchangeRatesTable1;
    }


}

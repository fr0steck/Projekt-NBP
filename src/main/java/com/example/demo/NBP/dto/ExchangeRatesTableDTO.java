package com.example.demo.NBP.dto;

public class ExchangeRatesTableDTO {
    private NBPResponseDTO ExchangeRatesTable;

    @Override
    public String toString() {
        return "ExchangeRatesTableDTO{" +
                "ExchangeRatesTable=" + ExchangeRatesTable +
                '}';
    }

    public void setExchangeRatesTable(NBPResponseDTO exchangeRatesTable) {
        ExchangeRatesTable = exchangeRatesTable;
    }

    public NBPResponseDTO getExchangeRatesTable() {
        return ExchangeRatesTable;
    }

    public ExchangeRatesTableDTO() {
    }

    public ExchangeRatesTableDTO(NBPResponseDTO exchangeRatesTable) {
        ExchangeRatesTable = exchangeRatesTable;
    }


}

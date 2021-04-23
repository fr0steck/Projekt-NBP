package com.example.demo.NBP.dto;

import java.util.List;

public class NBPResponseDTO {
    private String Table;
    private String No;
    private List<RateDTO> Rates;

    @Override
    public String toString() {
        return "NBPResponseDTO{" +
                "Table='" + Table + '\'' +
                ", No='" + No + '\'' +
                ", Rates=" + Rates +
                '}';
    }

    public void setTable(String table) {
        Table = table;
    }

    public void setNo(String no) {
        No = no;
    }

    public void setRates(List<RateDTO> rates) {
        Rates = rates;
    }

    public NBPResponseDTO(String table, String no, List<RateDTO> rates) {
        Table = table;
        No = no;
        Rates = rates;
    }

    public NBPResponseDTO() {
    }

    public String getTable() {
        return Table;
    }

    public String getNo() {
        return No;
    }

    public List<RateDTO> getRates() {
        return Rates;
    }
}


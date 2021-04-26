package com.example.demo.NBP.dto;

import java.util.Date;
import java.util.List;

public class NBPResponseDTO {
    private String table;
    private String no;
    private Date effectiveDate;
    private List<RateDTO> rates;

    @Override
    public String toString() {
        return "NBPResponseDTO{" +
                "table='" + table + '\'' +
                ", no='" + no + '\'' +
                ", effectiveDate=" + effectiveDate +
                ", rates=" + rates +
                '}';
    }

    public NBPResponseDTO() {
    }

    public NBPResponseDTO(String table, String no, Date effectiveDate, List<RateDTO> rates) {
        this.table = table;
        this.no = no;
        this.effectiveDate = effectiveDate;
        this.rates = rates;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public List<RateDTO> getRates() {
        return rates;
    }

    public void setRates(List<RateDTO> rates) {
        this.rates = rates;
    }
}


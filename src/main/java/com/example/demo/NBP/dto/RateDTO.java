package com.example.demo.NBP.dto;

import java.math.BigDecimal;

public class RateDTO {
    private String currency;
    private String code;
    private BigDecimal mid;

    public RateDTO(String currency, String code, BigDecimal mid) {
        this.currency = currency;
        this.code = code;
        this.mid = mid;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMid(BigDecimal mid) {
        this.mid = mid;
    }

    public String getCurrency() {
        return currency;
    }

    public String getCode() {
        return code;
    }

    public BigDecimal getMid() {
        return mid;
    }

    public RateDTO() {
    }

    @Override
    public String toString() {
        return "RateDTO{" +
                "currency='" + currency + '\'' +
                ", code='" + code + '\'' +
                ", mid=" + mid +
                '}';
    }


}

package com.example.demo.NBP.entity;

import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;


@Entity
@Table
public class Currency {
    @Id
    private String currencyCode;
    private String currencyName;
    private BigDecimal avarageValue;

    public Currency() {

    }



    @Override
    public String toString() {
        return "Currency{" +
                "kod waluty='" + currencyCode + '\'' +
                ", nazwa waluty='" + currencyName + '\'' +
                ", przeliczony kurs średni waluty=" + avarageValue +
                '}';
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public void setAvarageValue(BigDecimal avarageValue) {
        this.avarageValue = avarageValue;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public BigDecimal getAvarageValue() {
        return avarageValue;
    }

    public Currency(String currencyCode, String currencyName, BigDecimal avarageValue) {
        this.currencyCode = currencyCode;
        this.currencyName = currencyName;
        this.avarageValue = avarageValue;
    }
}

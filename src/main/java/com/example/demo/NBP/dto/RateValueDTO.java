package com.example.demo.NBP.dto;

import java.math.BigDecimal;
import java.util.Date;

public class RateValueDTO {
    private String No;
    private Date EffectiveDate;
    private BigDecimal mid;

    @Override
    public String toString() {
        return "RateValueDTO{" +
                "No='" + No + '\'' +
                ", EffectiveDate=" + EffectiveDate +
                ", mid=" + mid +
                '}';
    }

    public String getNo() {
        return No;
    }

    public void setNo(String no) {
        No = no;
    }

    public Date getEffectiveDate() {
        return EffectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        EffectiveDate = effectiveDate;
    }

    public BigDecimal getMid() {
        return mid;
    }

    public void setMid(BigDecimal mid) {
        this.mid = mid;
    }

    public RateValueDTO() {
    }

    public RateValueDTO(String no, Date effectiveDate, BigDecimal mid) {
        No = no;
        EffectiveDate = effectiveDate;
        this.mid = mid;
    }
}

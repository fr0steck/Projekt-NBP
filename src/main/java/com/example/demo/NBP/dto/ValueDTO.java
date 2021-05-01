package com.example.demo.NBP.dto;

import java.math.BigDecimal;
import java.util.List;

public class ValueDTO {
        private String Table;
        private String Currency;
        private String Code;
        private List<RateValueDTO> Rates;

        @Override
        public String toString() {
                return "ValueDTO{" +
                        "Table='" + Table + '\'' +
                        ", Currency='" + Currency + '\'' +
                        ", Code='" + Code + '\'' +
                        ", Rates=" + Rates +
                        '}';
        }

        public String getTable() {
                return Table;
        }

        public void setTable(String table) {
                Table = table;
        }

        public String getCurrency() {
                return Currency;
        }

        public void setCurrency(String currency) {
                Currency = currency;
        }

        public String getCode() {
                return Code;
        }

        public void setCode(String code) {
                Code = code;
        }

        public List<RateValueDTO> getRates() {
                return Rates;
        }

        public void setRates(List<RateValueDTO> rates) {
                Rates = rates;
        }

        public ValueDTO() {
        }

        public ValueDTO(String table, String currency, String code, List<RateValueDTO> rates) {
                Table = table;
                Currency = currency;
                Code = code;
                Rates = rates;
        }
}

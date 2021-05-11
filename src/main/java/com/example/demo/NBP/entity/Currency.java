package com.example.demo.NBP.entity;

import com.example.demo.NBP.common.RequestType;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table
public class Currency {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long id;
    @Enumerated(EnumType.STRING)
    private RequestType requestType;
    @Column(columnDefinition="TEXT")
    private String request;
    @Column(columnDefinition="TEXT")
    private String response;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date = new Date();

    @Override
    public String toString() {
        return "Currency{" +
                "id=" + id +
                ", requestType=" + requestType +
                ", request='" + request + '\'' +
                ", response='" + response + '\'' +
                ", date=" + date +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public void setRequestType(RequestType requestType) {
        this.requestType = requestType;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Currency() {
    }

    public Currency(RequestType requestType, String request) {
        this.requestType = requestType;
        this.request = request;
    }

    public Currency(RequestType requestType, String request, String response) {
        this.requestType = requestType;
        this.request = request;
        this.response = response;
    }

}

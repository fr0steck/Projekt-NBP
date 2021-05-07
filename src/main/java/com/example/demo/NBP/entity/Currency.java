package com.example.demo.NBP.entity;

import com.example.demo.NBP.common.RequestType;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.*;


@Entity
@Table
public class Currency {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long id;
    @Enumerated(EnumType.STRING)
    private RequestType requestType;
    @Column(columnDefinition="TEXT")
    private String NBPResponse;
    @Column(columnDefinition="TEXT")
    private String APIResponse;

    @Override
    public String toString() {
        return "Currency{" +
                "id=" + id +
                ", typEndpointu=" + requestType +
                ", NBPResponse='" + NBPResponse + '\'' +
                ", APIResponse='" + APIResponse + '\'' +
                '}';
    }

    public String getAPIResponse() {
        return APIResponse;
    }

    public void setAPIResponse(String APIResponse) {
        this.APIResponse = APIResponse;
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

    public void setRequestType(RequestType typEndpointu) {
        this.requestType = typEndpointu;
    }

    public String getNBPResponse() {
        return NBPResponse;
    }

    public void setNBPResponse(String zwroconaWartosc) {
        this.NBPResponse = zwroconaWartosc;
    }

    public Currency() {
    }

    public Currency(RequestType requestType, String NBPResponse) {
        this.requestType = requestType;
        this.NBPResponse = NBPResponse;
    }

    public Currency(RequestType requestType, String NBPResponse, String APIResponse) {
        this.requestType = requestType;
        this.NBPResponse = NBPResponse;
        this.APIResponse = APIResponse;
    }
}

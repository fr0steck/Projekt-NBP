package com.example.demo.NBP.entity;

import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.*;


@Entity
@Table
public class Currency {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String typEndpointu;
    @Lob
    @Column(columnDefinition="TEXT")
    private String zwroconaWartosc;

    @Override
    public String toString() {
        return "Currency{" +
                "id=" + id +
                ", typEndpointu='" + typEndpointu + '\'' +
                ", zwroconaWartosc='" + zwroconaWartosc + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypEndpointu() {
        return typEndpointu;
    }

    public void setTypEndpointu(String typEndpointu) {
        this.typEndpointu = typEndpointu;
    }

    public String getZwroconaWartosc() {
        return zwroconaWartosc;
    }

    public void setZwroconaWartosc(String zwroconaWartosc) {
        this.zwroconaWartosc = zwroconaWartosc;
    }

    public Currency() {
    }

    public Currency(String typEndpointu, String zwroconaWartosc) {
        this.typEndpointu = typEndpointu;
        this.zwroconaWartosc = zwroconaWartosc;
    }
}

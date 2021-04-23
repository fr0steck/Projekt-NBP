package com.example.demo.NBP.repository;

import com.example.demo.NBP.entity.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NBPRepository
extends JpaRepository<Currency,String> {
}

package com.example.stockhistory.repository;

import com.example.stockhistory.entities.StockSymbols;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockSymbolsRepo extends JpaRepository<StockSymbols, Long> {

}

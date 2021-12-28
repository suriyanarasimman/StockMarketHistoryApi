package com.example.stockhistory.repository;

import com.example.stockhistory.entities.Symbols;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SymbolsRepo extends JpaRepository<Symbols,Long > {
}

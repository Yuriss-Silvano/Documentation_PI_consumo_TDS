package com.ods10.feira.repository;

import com.ods10.feira.model.HistoricoPreco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoricoPrecoRepository extends JpaRepository<HistoricoPreco, Long> {
}


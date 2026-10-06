package com.ods10.feira.repository;

import com.ods10.feira.model.AlertaPreco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlertaPrecoRepository extends JpaRepository<AlertaPreco, Long> {
}


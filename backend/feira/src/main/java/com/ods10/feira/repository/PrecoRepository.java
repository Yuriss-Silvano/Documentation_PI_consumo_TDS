package com.ods10.feira.repository;

import com.ods10.feira.model.Preco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrecoRepository extends JpaRepository<Preco, Long> {
}

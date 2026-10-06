package com.ods10.feira.repository;

import com.ods10.feira.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    // Aqui estamos a dizer: "Este repositório gere a entidade Categoria, e a Chave Primária (ID) é do tipo Long".
    // Só com esta linha, já conseguimos fazer INSERT, SELECT, UPDATE e DELETE!
}
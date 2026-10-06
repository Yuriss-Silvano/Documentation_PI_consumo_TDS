package com.ods10.feira.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "preco")
public class Preco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_preco")
    private Long idPreco;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal valor;

    @Column(name = "data_coleta", nullable = false)
    private LocalDate dataColeta;

    @Column(name = "data_validade")
    private LocalDate dataValidade;

    @ManyToOne
    @JoinColumn(name = "id_produto", nullable = false)
    private com.ods10.feira.model.Produto produto;

    @ManyToOne
    @JoinColumn(name = "id_fornecedor", nullable = false)
    private com.ods10.feira.model.Fornecedor fornecedor;

    public Preco() {}

    // Lembre-se de gerar os Getters e Setters (Alt + Insert no Windows)
}
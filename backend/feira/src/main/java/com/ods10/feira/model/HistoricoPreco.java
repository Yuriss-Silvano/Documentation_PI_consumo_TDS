package com.ods10.feira.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "historico_preco")
public class HistoricoPreco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_historico")
    private Long idHistorico;

    @Column(name = "valor_antigo", nullable = false, precision = 10, scale = 2)
    private BigDecimal valorAntigo;

    @Column(name = "valor_novo", nullable = false, precision = 10, scale = 2)
    private BigDecimal valorNovo;

    // Preenche automaticamente a data e hora do sistema
    @Column(name = "data_alteracao", nullable = false)
    private LocalDateTime dataAlteracao = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "id_preco", nullable = false)
    private com.ods10.feira.model.Preco preco;

    public HistoricoPreco() {}

    // Gere os Getters e Setters
}
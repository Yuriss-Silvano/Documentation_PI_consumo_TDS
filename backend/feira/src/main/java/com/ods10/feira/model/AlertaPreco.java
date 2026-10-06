package com.ods10.feira.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "alerta_preco")
public class AlertaPreco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alerta")
    private Long idAlerta;

    @Column(name = "valor_desejado", nullable = false, precision = 10, scale = 2)
    private BigDecimal valorDesejado;

    @Column(nullable = false)
    private Boolean ativo = true;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private com.ods10.feira.model.Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_produto", nullable = false)
    private com.ods10.feira.model.Produto produto;

    public AlertaPreco() {}
    // Gere os Getters e Setters
}
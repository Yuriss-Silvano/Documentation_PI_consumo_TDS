package com.ods10.feira.model;

import jakarta.persistence.*;

@Entity
@Table(name = "favorito")
public class Favorito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_favorito")
    private Long idFavorito;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private com.ods10.feira.model.Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_produto", nullable = false)
    private com.ods10.feira.model.Produto produto;

    public Favorito() {}
    // Gere os Getters e Setters
}
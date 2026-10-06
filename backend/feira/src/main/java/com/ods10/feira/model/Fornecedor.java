package com.ods10.feira.model;

import jakarta.persistence.*;

@Entity
@Table(name = "fornecedor")
public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_fornecedor")
    private Long idFornecedor;

    @Column(name = "razao_social", nullable = false, length = 150)
    private String razaoSocial;

    @Column(name = "nome_fantasia", length = 150)
    private String nomeFantasia;

    @Column(nullable = false, length = 18, unique = true)
    private String cnpj;

    @Column(length = 20)
    private String telefone;

    @Column(length = 150)
    private String email;

    public Fornecedor() {}

    // Gere os Getters e Setters aqui
    public Long getIdFornecedor() { return idFornecedor; }
    public void setIdFornecedor(Long idFornecedor) { this.idFornecedor = idFornecedor; }
    public String getRazaoSocial() { return razaoSocial; }
    public void setRazaoSocial(String razaoSocial) { this.razaoSocial = razaoSocial; }
    public String getNomeFantasia() { return nomeFantasia; }
    public void setNomeFantasia(String nomeFantasia) { this.nomeFantasia = nomeFantasia; }
    public String getCnpj() { return cnpj; }
    public void setCnpj(String cnpj) { this.cnpj = cnpj; }
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
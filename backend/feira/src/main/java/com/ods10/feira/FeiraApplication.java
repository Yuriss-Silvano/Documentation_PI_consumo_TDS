package com.ods10.feira;

import com.ods10.feira.model.Categoria;
import com.ods10.feira.model.Produto;
import com.ods10.feira.repository.CategoriaRepository;
import com.ods10.feira.repository.ProdutoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FeiraApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeiraApplication.class, args);
	}

	// Este bloco insere dados de teste automaticamente assim que o programa liga!
	@Bean
	public CommandLineRunner demo(CategoriaRepository categoriaRepo, ProdutoRepository produtoRepo) {
		return args -> {
			// Cria e guarda uma Categoria de exemplo
			Categoria cat = new Categoria();
			cat.setNomeCategoria("Eletrônicos");
			cat.setDescricao("Bens de consumo tecnológico");
			cat = categoriaRepo.save(cat);

			// Cria e guarda um Produto de exemplo vinculado à categoria
			Produto prod = new Produto();
			prod.setNome("Smartphone Galaxy");
			prod.setDescricao("Celular de última geração");
			prod.setMarca("Samsung");
			prod.setUnidadeMedida("Unidade");
			prod.setCodigoBarras("7891234567890");
			prod.setCategoria(cat);
			produtoRepo.save(prod);

			System.out.println(">>> DADOS DE TESTE INSERIDOS COM SUCESSO NO BANCO H2! <<<");
		};
	}
}
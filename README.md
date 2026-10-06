# 🛒 FEIRA

Backend do **Projeto Integrador (PI)** desenvolvido durante o curso Técnico em Desenvolvimento de Sistemas (TDS).

O **FEIRA** é um sistema voltado à gestão e consulta de produtos comercializados em feiras, conectando informações de **produtos, categorias, clientes, fornecedores e preços**.

O projeto busca facilitar o acesso a informações sobre os produtos e sua variação de preços, contribuindo para decisões de compra mais conscientes e tendo como ODS impactada a **ODS 12 – Consumo e Produção Responsáveis**.

> **Status:** 🚧 Em desenvolvimento

---

## 🎯 Sobre o Projeto

O FEIRA tem como proposta desenvolver uma plataforma capaz de organizar informações relacionadas a produtos e fornecedores, permitindo futuramente que consumidores e empresas consultem e acompanhem dados relevantes para suas decisões de compra.

Entre as funcionalidades planejadas estão:

* Cadastro e consulta de produtos;
* Organização dos produtos por categorias;
* Cadastro de clientes e fornecedores;
* Registro e acompanhamento de preços;
* Histórico de variação de preços;
* Comparação de valores;
* Sistema de favoritos;
* Alertas de preço;
* Visualização de informações por meio de uma interface web.

O projeto está sendo desenvolvido inicialmente com foco no **backend**, responsável pela API e pelas regras de negócio. O **frontend será desenvolvido posteriormente**, consumindo os endpoints disponibilizados pela API.

---

## 🌱 ODS Impactada

### ODS 12 — Consumo e Produção Responsáveis

O projeto está relacionado à **ODS 12 da Organização das Nações Unidas (ONU)**, que busca promover padrões de consumo e produção mais responsáveis e sustentáveis.

O FEIRA contribui para esse objetivo ao buscar disponibilizar informações organizadas sobre produtos e preços, permitindo que consumidores tenham maior conhecimento antes de realizar suas compras.

A proposta não é realizar a venda ou negociação dos produtos, mas **facilitar o acesso à informação** para apoiar decisões de consumo.

---

## 🏗️ Arquitetura do Projeto

Atualmente, o projeto está concentrado no desenvolvimento do **backend**, estruturado como uma API REST.

```text
FEIRA
│
├── Backend
│   ├── API REST
│   ├── Regras de negócio
│   ├── Entidades
│   ├── Repositories
│   └── Banco de dados
│
└── Frontend
    └── Planejado
```

A arquitetura será expandida conforme novas funcionalidades forem implementadas.

---

## 🚀 Tecnologias Utilizadas

### Backend

* ☕ **Java 21**
* 🌱 **Spring Boot 3.3.4**
* 🔗 **Spring Web**
* 🗃️ **Spring Data JPA**
* 🛢️ **H2 Database**
* 🔄 **Hibernate**
* 📦 **Maven**

### Futuramente

* 🖥️ Frontend da aplicação
* 🗄️ Banco de dados persistente
* 📊 Visualização de estatísticas e histórico de preços

---

## 🗂️ Estrutura do Domínio

O backend atualmente possui entidades relacionadas ao gerenciamento de produtos, preços e usuários.

### Principais entidades

```text
Categoria
    │
    └── Produto
          │
          └── Preço
                 │
                 └── Histórico de Preço

Cliente
    ├── Favoritos
    └── Alertas de Preço

Fornecedor
    └── Produtos / Preços
```

### Entidades implementadas

* `Categoria`
* `Produto`
* `Cliente`
* `Fornecedor`
* `Preco`
* `HistoricoPreco`
* `Favorito`
* `AlertaPreco`

A estrutura poderá ser ampliada conforme o desenvolvimento do projeto.

---

## ⚙️ Como Executar

O projeto utiliza **Maven Wrapper**, facilitando sua execução sem a necessidade de instalar uma versão específica do Maven.

### Pré-requisitos

* **Java 21**
* IDE compatível com projetos Maven
* Git, caso o projeto seja clonado pelo repositório

### 1. Clone o repositório

```bash
git clone https://github.com/Yuriss-Silvano/Documentation_PI_consumo_TDS.git
```

### 2. Acesse a pasta

```bash
cd Documentation_PI_consumo_TDS
```

### 3. Execute o projeto

No Windows:

```bash
mvnw.cmd spring-boot:run
```

Ou execute a classe principal pela IDE:

```text
FeiraApplication.java
```

### 4. Acesse a API

Por padrão, o backend é executado na porta:

```text
8081
```

```text
http://localhost:8081
```

> O banco H2 é utilizado atualmente como banco em memória. Os dados podem ser reinicializados quando a aplicação for encerrada e executada novamente.

---

## 🔌 API REST

O backend disponibiliza endpoints para que futuramente o frontend possa consumir os dados.

### 📁 Categorias

| Método | Endpoint          | Descrição                       |
| ------ | ----------------- | ------------------------------- |
| `GET`  | `/api/categorias` | Lista as categorias cadastradas |
| `POST` | `/api/categorias` | Cadastra uma nova categoria     |

### 📦 Produtos

| Método | Endpoint        | Descrição                     |
| ------ | --------------- | ----------------------------- |
| `GET`  | `/api/produtos` | Lista os produtos cadastrados |
| `POST` | `/api/produtos` | Cadastra um novo produto      |

> Novos endpoints serão adicionados conforme o desenvolvimento do backend.

---

## 🧪 Dados de Teste

Durante o desenvolvimento, o sistema utiliza dados iniciais para facilitar os testes e as apresentações acadêmicas.

Esses dados são utilizados para verificar o funcionamento dos endpoints e das relações entre as entidades.

---

## 🛣️ Roadmap

### Backend

* [x] Configuração inicial do projeto Spring Boot
* [x] Estrutura inicial da API REST
* [x] Entidade `Categoria`
* [x] Entidade `Produto`
* [x] Entidade `Cliente`
* [x] Entidade `Fornecedor`
* [x] Entidade `Preco`
* [x] Entidade `HistoricoPreco`
* [x] Entidade `Favorito`
* [x] Entidade `AlertaPreco`
* [x] Endpoints iniciais de categorias
* [x] Endpoints iniciais de produtos
* [ ] CRUD completo das entidades
* [ ] Validação dos dados
* [ ] Tratamento global de exceções
* [ ] Autenticação e autorização
* [ ] Persistência em banco de dados definitivo
* [ ] Documentação da API

### Frontend

* [ ] Definição da tecnologia
* [ ] Interface inicial
* [ ] Tela de produtos
* [ ] Tela de categorias
* [ ] Consulta de preços
* [ ] Histórico de preços
* [ ] Comparação de preços
* [ ] Favoritos
* [ ] Alertas de preço
* [ ] Dashboard/estatísticas
* [ ] Integração com a API

### Projeto Integrador

* [x] Definição do problema
* [x] Definição da proposta
* [x] Definição da ODS impactada
* [x] Modelagem inicial do banco de dados
* [x] Desenvolvimento inicial do backend
* [ ] Desenvolvimento do frontend
* [ ] Integração entre frontend e backend
* [ ] Testes
* [ ] Documentação
* [ ] Apresentação final

---

## 📌 Status Atual

O projeto encontra-se em **fase de desenvolvimento do backend**.

A API REST já possui uma estrutura inicial funcional, incluindo entidades relacionadas a produtos, categorias, clientes, fornecedores e preços.

O próximo estágio será a expansão das funcionalidades do backend e, posteriormente, o desenvolvimento do frontend para disponibilizar essas informações aos usuários de forma visual e acessível.

---

## 👨‍💻 Desenvolvedor

**Yuri Silvano da Silva Santana**

Projeto desenvolvido para fins acadêmicos no curso **Técnico em Desenvolvimento de Sistemas (TDS)**.

---

## 📚 Contexto Acadêmico

**Projeto:** FEIRA
**Curso:** Técnico em Desenvolvimento de Sistemas (TDS)
**Instituição:** ETE Cícero Dias
**Projeto:** Projeto Integrador (PI)
**ODS Impactada:** ODS 12 — Consumo e Produção Responsáveis

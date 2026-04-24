# Microservices Java

Projeto desenvolvido no curso de Ciência da Computação na ATITUS Educação.

## Descrição

Sistema baseado em arquitetura de microserviços REST utilizando Spring Boot. O projeto segue padronização entre serviços, separação em camadas e integração entre componentes, conforme desenvolvido em aula.

## Microserviços

* `greeting-service`
* `config-service`
* `currency-service`
* `product-service`

## Funcionalidades

* Comunicação entre microserviços
* Gerenciamento de configurações centralizadas
* Conversão de moedas
* Cadastro e consulta de produtos
* APIs REST padronizadas
* Integração com banco de dados PostgreSQL

## Tecnologias Utilizadas

* Java
* Spring Boot
* Spring Web
* Spring Data JPA
* PostgreSQL
* Flyway
* Maven

## Estrutura do Projeto

Cada microserviço segue o mesmo padrão arquitetural:

* **Controller** → exposição dos endpoints REST
* **Repository** → acesso a dados com JPA
* **Entity** → mapeamento das tabelas
* **DTO** → transporte de dados entre camadas

## Como Executar

```bash
# Clonar o repositório
git clone https://github.com/seu-usuario/microservices-java-202601e.git
```

* Importar como projeto Maven
* Configurar o PostgreSQL
* Executar os serviços individualmente
* Utilizar ferramentas como Postman para testar os endpoints

## Observações

* Cada serviço é independente e pode ser executado separadamente
* Banco de dados versionado com Flyway

## Responsável

Isadora Aguirre Dal Conte — RA: 1136123

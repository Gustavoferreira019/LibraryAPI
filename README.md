📚 Projeto Biblioteca

Este projeto tem como objetivo aplicar, na prática, os conceitos estudados sobre desenvolvimento backend, por meio da criação de uma API REST para o gerenciamento de uma biblioteca.
Ele serve como um laboratório de experimentação, onde são exploradas boas práticas, padrões de projeto e conceitos essenciais do ecossistema Java e Spring.

🛠️ Tecnologias Utilizadas

Java 17

Spring Boot (Spring Web, Spring Data JPA)

Hibernate

H2 Database

Lombok

Postman (para testes das requisições)

📖 Descrição do Projeto

A aplicação permite realizar operações típicas de uma biblioteca, como o gerenciamento de livros e leitores, através de requisições REST.
O foco principal está em consolidar conhecimentos de backend com Java e Spring, simulando situações reais e regras de negócio aplicáveis ao contexto de uma aplicação corporativa.

⚙️ Como Executar o Projeto
🔧 Pré-requisitos

Java 17 ou superior instalado

Maven configurado

IDE de sua preferência (IntelliJ, Eclipse, VS Code, etc.)

🚀 Passos para execução

Clone este repositório:

git clone https://github.com/seu-usuario/projeto-biblioteca.git


Acesse o diretório do projeto:

cd projeto-biblioteca


Execute o projeto com Maven:

mvn spring-boot:run


A API estará disponível em:

http://localhost:8080


Para acessar o console do banco de dados H2, utilize:

http://localhost:8080/h2-console


JDBC URL: jdbc:h2:mem:testdb

User: sa

Password: (em branco, por padrão)

🗃️ Banco de Dados e Dados Iniciais

O projeto utiliza o H2 Database em modo memória, ou seja, os dados são armazenados apenas enquanto a aplicação está em execução.
Ao reiniciar o servidor, todas as informações são apagadas.

Para garantir que a aplicação tenha registros disponíveis durante os testes, existe um arquivo chamado data.sql na raiz do projeto, responsável por popular automaticamente o banco com dados iniciais, como livros e usuários.
Isso permite que as requisições REST possam ser testadas imediatamente após o projeto ser iniciado.

🎯 Objetivo

Este projeto foi desenvolvido exclusivamente para fins de estudo e prática, servindo como uma base de referência para aplicar conceitos teóricos em um projeto funcional.
O intuito é aprimorar habilidades de desenvolvimento backend, arquitetura de software e boas práticas no ecossistema Java.

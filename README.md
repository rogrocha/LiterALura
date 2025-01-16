# 📚 Catálogo de Livros

## 📌 Objetivo
O objetivo deste projeto é desenvolver um **Catálogo de Livros** que permita interação textual via console com os usuários. O sistema permitirá a busca de livros através de uma API específica, proporcionando no mínimo 5 opções de interação.

## ⚙️ Funcionalidades Principais
1. **Buscar livros pelo título**
2. **Listar livros registrados no banco de dados**
3. **Listar autores registrados**
4. **Listar autores vivos em um determinado ano**
5. **Listar livros em um determinado idioma**

## 🔍 API Utilizada
O projeto consumirá dados de uma API específica para busca de livros. Mais detalhes sobre a API podem ser encontrados na coluna **“Backlog” / “Pronto para iniciar”**.

## 💻 Tecnologias Utilizadas
- **Java**
- **Spring Boot**
- **JPA / Hibernate**
- **PostgreSQL**
- **API Gutendex** (ou outra API de livros)
- **Maven**

## 🚀 Como Executar o Projeto
### Pré-requisitos:
Antes de executar o projeto, certifique-se de ter instalado:
- Java 17+
- PostgreSQL
- Maven

### Passos para execução:
1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
   ```
2. Acesse o diretório do projeto:
   ```bash
   cd nome-do-projeto
   ```
3. Configure o banco de dados no arquivo `application.properties`:
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/nome_do_banco
   spring.datasource.username=seu_usuario
   spring.datasource.password=sua_senha
   ```
4. Compile e execute o projeto:
   ```bash
   mvn spring-boot:run
   ```
5. Siga as instruções no terminal para interagir com o catálogo de livros.

## 🤝 Contribuição
Contribuições são bem-vindas! Para contribuir:
1. **Fork** este repositório
2. Crie uma **branch** para sua funcionalidade:
   ```bash
   git checkout -b minha-feature
   ```
3. Faça as alterações e commit:
   ```bash
   git commit -m "Minha nova feature"
   ```
4. Envie para o repositório remoto:
   ```bash
   git push origin minha-feature
   ```
5. Abra um **Pull Request**.




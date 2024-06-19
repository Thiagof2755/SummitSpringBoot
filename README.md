# Summit API

## Descrição

A Summit API é uma aplicação desenvolvida com Spring Boot para gerenciar eventos, incluindo categorias de eventos, endereços, imagens, login de usuários e informações de participantes. A API facilita a criação, consulta e interação com eventos de entretenimento.

## Tecnologias Utilizadas

- Java 17
- Spring Boot
- PostgreSQL
- Docker
- Docker Compose

## Estrutura do Projeto

- **Controllers:**
  - `CategoryController.java`: Controlador para gerenciar categorias de eventos.
  - `EventAddressController.java`: Controlador para gerenciar endereços de eventos.
  - `EventController.java`: Controlador para gerenciar eventos.
  - `ImageController.java`: Controlador para gerenciar imagens de eventos.
  - `LoginController.java`: Controlador para gerenciar login e autenticação de usuários.
  - `PersonController.java`: Controlador para gerenciar informações dos participantes.

- **Domain:**
  - Contém as classes de domínio da aplicação, representando as entidades e suas relações.

- **Repositories:**
  - Contém as interfaces de repositórios que estendem `JpaRepository` para persistência dos dados.

- **Services:**
  - Contém as classes de serviços que implementam a lógica de negócios da aplicação.

## Como Executar

### Pré-requisitos

- Docker
- Docker Compose
- JDK 17

### Passo a Passo

1. **Clone o repositório:**

    ```sh
    git clone https://github.com/seu-usuario/summit-api.git
    cd summit-api
    ```

2. **Empacote a aplicação:**

    Gere o arquivo `.jar` da aplicação:

    ```sh
    ./mvnw clean package
    ```

3. **Crie e configure os containers:**

    Use o Docker Compose para criar e subir os containers:

    ```sh
    docker-compose up --build
    ```

4. **Acesse a aplicação:**

    A aplicação estará disponível em `http://localhost:8080`.

## Endpoints da API

### Categoria de Eventos

- **GET /categories**: Lista todas as categorias.
- **POST /categories**: Cria uma nova categoria.
- **PUT /categories/{id}**: Atualiza uma categoria existente.
- **DELETE /categories/{id}**: Deleta uma categoria.

### Endereços de Eventos

- **GET /event-addresses**: Lista todos os endereços de eventos.
- **POST /event-addresses**: Cria um novo endereço de evento.
- **PUT /event-addresses/{id}**: Atualiza um endereço de evento existente.
- **DELETE /event-addresses/{id}**: Deleta um endereço de evento.

### Eventos

- **GET /events**: Lista todos os eventos.
- **POST /events**: Cria um novo evento.
- **PUT /events/{id}**: Atualiza um evento existente.
- **DELETE /events/{id}**: Deleta um evento.

### Imagens

- **GET /images**: Lista todas as imagens.
- **POST /images**: Carrega uma nova imagem.
- **DELETE /images/{id}**: Deleta uma imagem.

### Login

- **POST /login**: Realiza login e retorna um token de autenticação.

### Participantes

- **GET /persons**: Lista todos os participantes.
- **POST /persons**: Registra um novo participante.
- **PUT /persons/{id}**: Atualiza as informações de um participante.
- **DELETE /persons/{id}**: Deleta um participante.

## Configurações

As variáveis de ambiente para configurar a conexão com o banco de dados devem ser definidas no arquivo `application.properties` ou `application.yml`:

```properties
spring.datasource.url=${SPRING_DATASOURCE_URL}
spring.datasource.username=${SPRING_DATASOURCE_USERNAME}
spring.datasource.password=${SPRING_DATASOURCE_PASSWORD}
```

Essas variáveis são passadas pelo Docker Compose:

```yaml
services:
  app:
    environment:
      SPRING_DATASOURCE_URL: jdbc:postgresql://db:5432/summitdb
      SPRING_DATASOURCE_USERNAME: postgres
      SPRING_DATASOURCE_PASSWORD: 1234
```

## Contribuição

Se você deseja contribuir com o projeto, sinta-se à vontade para abrir uma issue ou enviar um pull request.

## Licença

Este projeto está licenciado sob a licença MIT.


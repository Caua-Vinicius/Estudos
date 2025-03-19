# Projeto Docker

Este é um exemplo de aplicação Node.js utilizando Docker e Docker Compose para rodar um backend simples com Express e um banco de dados MySQL.

## Estrutura do Projeto

- **Backend (Node.js + Express)**: Uma aplicação simples utilizando Express para servir uma API que retorna "Hello World!".
- **MySQL**: Um banco de dados MySQL rodando em um container, com a configuração para persistir dados.

## Como Rodar o Projeto

### Pré-requisitos

- Docker e Docker Compose instalados no seu sistema.

### Passos para rodar

1. Clone o repositório:

    ```bash
    git clone <URL-do-repositório>
    cd <diretório-do-projeto>
    ```

2. Construa e inicie os containers com Docker Compose:

    ```bash
    docker-compose up --build
    ```

    O comando acima irá:
    - Construir a imagem do backend a partir do Dockerfile.
    - Baixar a imagem oficial do MySQL.
    - Rodar os containers para o backend e MySQL.

3. Acesse a aplicação:

    Abra o navegador e acesse `http://localhost:3000`. Você verá a mensagem "Hello World!" sendo retornada pela API.

### Parâmetros de Configuração

- O backend estará rodando na porta `3000`.
- O MySQL estará disponível na porta `3306`.

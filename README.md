# sistema-biblioteca-java-sql

## Sobre o Projeto

Sistema de biblioteca desenvolvido para praticar lógica de programação. O projeto tem três partes:

1. **Java (POO):** classes, herança e polimorfismo.
2. **Modelagem SQL (PostgreSQL):** criação de tabelas, chaves e dados de teste.
3. **Consultas SQL (PostgreSQL):** consultas sobre os dados modelados.

Também usei o projeto para praticar Git e GitHub em um fluxo parecido com o de trabalho: uma branch por exercício, commits pequenos e merges no repositório da `main`.

## Exercício 1: Java (POO)

Uma biblioteca de bairro controla um acervo de livros e revistas, emprestado a alunos e professores.

| Item | Prazo | Multa por dia |
|---|---|---|
| Livro | 14 dias | R$ 0,50 |
| Revista | 7 dias | R$ 1,00 |

| Usuário | Limite de itens |
|---|---|
| Aluno | 3 |
| Professor | 5 |

- `ItemBiblioteca` e `Usuario` são classes abstratas. Prazo, multa e limite de itens são métodos abstratos, implementados nas subclasses.
- `Biblioteca` guarda itens e usuários em arrays de tamanho fixo e tem os métodos `emprestar()`, `devolver()` e `listarAcervo()`.
- `Main` executa um cenário de teste: cadastro, empréstimos bem-sucedidos e um empréstimo recusado por limite atingido.
- Extra: a classe `DVD` (prazo de 4 dias, multa de R$ 2,00 por dia) foi criada só para testar que uma categoria nova funciona sem alterar o código existente.

## Exercícios 2 e 3: SQL (PostgreSQL)

- **Modelagem:** três tabelas, `item`, `usuario` e `emprestimo`, sem herança. O tipo de item e o de usuário são colunas com restrição `CHECK`.
- **Consultas:**
    1. listar todo o acervo;
    2. listar os empréstimos em aberto, com o nome do usuário e o título do item;
    3. calcular o total de multas por usuário;
    4. listar os itens que nunca foram emprestados.

## Estrutura de pastas

```
Sistema-Biblioteca/
├── src/biblioteca/    # classes Java
├── sql/
│   ├── schema.sql     # criação das tabelas
│   ├── dados.sql      # dados de teste
│   └── consultas.sql  # as 4 consultas
└── README.md
```

## Como executar

**Java:** abra o projeto no IntelliJ e execute a classe `Main`.

**SQL:** no pgAdmin, abra a Query Tool em um banco e execute os arquivos nesta ordem:
1. `sql/schema.sql`
2. `sql/dados.sql`
3. `sql/consultas.sql`

A parte Java e a parte SQL são independentes: o Java não se conecta ao banco.

## Tecnologias usadas

- IntelliJ IDEA
- Java 21
- PostgreSQL
- Git e GitHub
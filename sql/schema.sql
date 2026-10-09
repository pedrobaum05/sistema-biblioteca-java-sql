CREATE TABLE item (

    id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    codigo INTEGER,
    titulo VARCHAR(180),
    tipo TEXT CHECK(tipo IN ('livro', 'revista', 'DVD')),
    autor VARCHAR(180),
    edicao INTEGER,
    disponivel BOOLEAN

);

CREATE TABLE usuario (

    id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    nome TEXT NOT NULL,
    tipo TEXT CHECK(tipo IN ('aluno', 'professor')),
    limite_itens INTEGER
);

CREATE TABLE emprestimo (

    id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    item_id INTEGER REFERENCES item(id),
    usuario_id INTEGER REFERENCES usuario(id),
    data_retirada DATE,
    data_devolucao_prevista DATE NOT NULL,
    data_devolucao DATE,
    valor_multa FLOAT
);
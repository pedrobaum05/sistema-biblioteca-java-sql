INSERT INTO item (codigo, titulo, tipo, autor, edicao, disponivel) VALUES
          (909090, 'Apologia de Sócrates', 'livro', 'Platão',1, true),
          (505050, 'a CHAVE da Virada', 'revista', 'MarcelloNiek e BrunoRaso', 5, false),
          (141414, 'DISCIPLINA, limite na medida certa', 'livro', 'Içami Tiba', 4, true),
          (303030, 'As Seis Lições', 'livro', 'Ludwig Von Mises', 2, true),
          (222222, 'Platão A República', 'livro', 'Platão', 7, true),
          (144444, 'A Máquina que Pensa', 'livro', 'Stephen WITT', 3, true);


INSERT INTO usuario (nome, tipo, limite_itens) VALUES
    ('Arlindo Orlando', 'aluno', 3),
    ('Rodolfo Dolfo', 'professor', 5);

INSERT INTO emprestimo (item_id, usuario_id, data_retirada, data_devolucao_prevista, data_devolucao, valor_multa) VALUES
    (3, 1, '2026-09-28', '2026-10-12', NULL, 0),
    (5, 2, '2026-09-05', '2026-09-19', '2026-09-22', 1.50);

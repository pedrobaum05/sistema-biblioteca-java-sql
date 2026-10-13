SELECT
        codigo,
        titulo,
        tipo,
        disponivel
 FROM item ;



    SELECT usuario.nome, item.titulo
    FROM emprestimo

    JOIN usuario ON emprestimo.usuario_id = usuario.id
    JOIN item    ON emprestimo.item_id = item.id

    WHERE emprestimo.data_devolucao IS NULL;

    SELECT
    FROM usuario

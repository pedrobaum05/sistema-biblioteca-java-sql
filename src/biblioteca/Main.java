package biblioteca;

public class Main {

    public static void main(String[] args) {

        //Criação dos objetos de testes revista/livros e professor/usuario
        Livro livros2 = new Livro(696969, "O Almanaque de Naval Ravikant - Eric Jorgenson");
        Livro livros = new Livro (676767, "Como fazer Amigos e Influenciar Pessoas - Dale Carnegie");
        Revista revistas = new Revista(141414,  "Revista  -  VEJA");
        Revista revistas2 = new Revista(171717, "Revista - GZH");
        Aluno alunos = new Aluno("Renan Santos");
        Professor professores = new Professor("Juca Martelo");
        Biblioteca biblioteca = new Biblioteca();

        // Cadastra e registra os itens e usuários criado acima
        biblioteca.cadastrarItem(livros);
        biblioteca.cadastrarItem(livros2);
        biblioteca.cadastrarItem(revistas);
        biblioteca.cadastrarItem(revistas2);
        biblioteca.cadastrarUsuario(alunos);
        biblioteca.cadastrarUsuario(professores);

        //Testa os 3 empréstimos válidos e o 4 empréstimo deve retornar "Usuário atingiu o limite máximo de itens"
            biblioteca.emprestar(livros, alunos);
            biblioteca.emprestar(livros2, alunos);
            biblioteca.emprestar(revistas, alunos);
            biblioteca.emprestar(revistas2, alunos);
    }

}

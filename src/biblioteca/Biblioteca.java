package biblioteca;


public class Biblioteca {
    ItemBiblioteca[] itens = new ItemBiblioteca[10]; //Guarda os itens livros e revistas em um só lugar
    Usuario[] usuarios = new Usuario[10]; //faz o cadastro dos Alunos e Professores tudo junto

    private int quantidadeItens;
    private int quantidadeUsuarios;

//Biblioteca nova começa sem nenhum item e nome cadastrado pois é NOVA
    public Biblioteca() {
        quantidadeItens = 0;
        quantidadeUsuarios = 0;

    }

    //For percorre varias posicoes chamando os metodos
    public void listarAcervo() {
        for (int i = 0; i < quantidadeItens; i++) {
            System.out.println("Código: " + itens[i].getCodigo() + "Título: " + itens[i].getTitulo() + "Disponível: " + itens[i].isDisponivel());

        }
    }

    //Guarda o item na posição vazia do array e o contador avança mais uma casa do array
    public void cadastrarItem(ItemBiblioteca item) {
        itens[quantidadeItens] = item;
        quantidadeItens++;

    }

    //Guarda o nome do usuário no array e depois o contador avança mais uma casa do array
    public void cadastrarUsuario(Usuario usuario) {
        usuarios[quantidadeUsuarios] = usuario;
        quantidadeUsuarios++;
    }

    //Verifica  duas vezes com o if se é possível fazer o empréstimo com base nas regras do enunciado
    public void emprestar(ItemBiblioteca item, Usuario usuario) {
        if (!item.isDisponivel()) {
            System.out.println("Item indisponível.");
            return; //recusa caso o item ja foi emprestado
        }
        if (usuario.getQuantidadeEmprestada() >= usuario.limiteItens()) {
            System.out.println("Usuário atingiu o limite máximo de itens.");
            return; //recusa caso o usuario queira pegar mais itens do que o seu limite maximo
        }

        //Caso passou nas checagens efetiva o empréstimo
        item.definirDisponivel(false);
        usuario.incrementarEmprestimo();
        System.out.println("Empréstimo realizado com sucesso.");
    }

        //Libera o item e diminui a quantidade de itens que cada um item
    public void devolver(ItemBiblioteca item, Usuario usuario) {
        item.definirDisponivel (true);
        usuario.devolverItem();
    }
}

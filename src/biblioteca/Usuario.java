package biblioteca;

//Representa qualquer usuario tanto faz se é Aluno ou Professor
public abstract class Usuario {
    private String nome;
    private int quantidadeEmprestada;

//Todo usuario novo começa sem nenhum item emprestado  pois o usuario é NOVO
    public Usuario(String nome) {
        this.nome = nome;
        this.quantidadeEmprestada = 0;

    }
//Cada subclasse do Aluno e Professor definem seu proprio limite de itens
    public abstract int limiteItens();

//Getter permite ler o nome fora da classe
    public String getNome() {
        return nome;
    }

    //Virou atributo privado o get está lendo quantidadeEmprestada
    public int getQuantidadeEmprestada() {
        return quantidadeEmprestada;
    }

    //Operador ++ incrementa um novo item
    void incrementarEmprestimo() {
        quantidadeEmprestada++;
    }

    //Operador -- vai diminuir o item quando for devolver
    void devolverItem() {
        quantidadeEmprestada--;
    }
}


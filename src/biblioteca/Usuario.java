package biblioteca;

public abstract class Usuario {
    private String nome;
    private int quantidadeEmprestada;

    public Usuario(String nome) {
        this.nome = nome;
        this.quantidadeEmprestada = 0;

    }

    public abstract int limiteItens();

    public String getNome() {
        return nome;
    }

    //Virou atributo privado o get está lendo quantidadeEmprestada
    public int getQuantidadeEmprestada() {
        return quantidadeEmprestada;
    }
}


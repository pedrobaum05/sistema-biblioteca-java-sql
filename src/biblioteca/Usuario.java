package biblioteca;

public abstract class Usuario {
    private String nome;
    private int quantidadeEmprestada;

    public Usuario(String nome, int quantidadeEmprestada) {
        this.nome = nome;
        this.quantidadeEmprestada = quantidadeEmprestada;
    }

    public abstract int limiteItens();

    public String getNome() {
        return nome;
    }

    public int getQuantidadeEmprestada() {
        return quantidadeEmprestada;
    }
}


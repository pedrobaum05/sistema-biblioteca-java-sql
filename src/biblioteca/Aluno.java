package biblioteca;

//Herda do Usuario as informacoes mais importantes
public class Aluno extends Usuario {

    public Aluno(String nome) {
        super(nome);
    }

    @Override
    public int limiteItens() {
        int limiteItens = 3;
        return limiteItens;
    }

}

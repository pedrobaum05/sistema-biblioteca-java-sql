package biblioteca;

public class Professor extends Usuario{

    public Professor(String nome) {
        super(nome);
    }

    //Override subscreve metodos existentes da classe mae
    @Override
    public int limiteItens(){
        int limiteItens = 5;
        return limiteItens;
    }
}

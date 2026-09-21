package biblioteca;

//extends usa-se para herdar informacoes da classe mae ItemBiblioteca
public class Livro extends ItemBiblioteca {

    //super chama os construtores que são das classes do (ItemBiblioteca) e passa os valores que vão ser preenchidos dentro do
    //objeto  public Livro. Vai funcionar via (herança)
    public Livro(int codigo, String titulo) {

        super(codigo, titulo);
    }

    //substitui ou subscreve um metodo que existe na classe mae
    @Override
    public int prazo() {
    int prazo = 14;
        return prazo;
    }

    @Override
    public double multa() {
        double multa = 0.50;
            return multa;
    }
}





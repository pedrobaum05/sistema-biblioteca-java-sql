package biblioteca;

//Usa-se public para deixar criar classes em qualquer pacote do projeto
public class Revista extends ItemBiblioteca {

    public Revista(int codigo, String titulo) {

        super(codigo, titulo);
    }

    @Override
    public int prazo() {
        int prazo = 7;
        return prazo;
    }

    @Override
    public double multa() {
        double multa = 1.00;
        return multa;
    }

}

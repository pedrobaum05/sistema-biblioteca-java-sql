package biblioteca;

//Puxa os dados do ItemBiblioteca
public class DVD extends ItemBiblioteca {

    //Super chama os construtores da classes ItemBiblioteca
    public DVD(int codigo, String titulo) {

        super(codigo, titulo);
    }

    //Herda as subclasses
    @Override
    public int prazo() {
        int prazo = 4;
        return prazo;
    }

    @Override
    public double multa() {
        double multa = 2.00;
        return multa;
    }
}

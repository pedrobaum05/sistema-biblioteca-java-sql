package biblioteca;

//public qualquer classe pode chamar esse metodo
//abastract serve para que  outras classes herdem dela.  ex cachorro e gato herdam da clase Animal

 public abstract class ItemBiblioteca {
    //atributos
     private int codigo;
     private String titulo;
     private boolean disponivel;

    public ItemBiblioteca(int codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.disponivel = true; //item novo comeca dispinivel

    }

    public abstract int prazo();

    public abstract double multa();

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    void definirDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

 }


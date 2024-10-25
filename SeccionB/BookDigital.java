package SeccionB;

public class BookDigital extends Producto implements ProductoDigital {

    public BookDigital(String name, double price) {
        super(name, price);
    }

    @Override
    public double calcularIVA() {
        return 0;  // Los libros no tienen IVA
    }
}

package SeccionB;

public class BookFisico extends Producto implements ProductoFisico {
    private double weight;

    public BookFisico(String name, double price, double weight) {
        super(name, price);
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double calcularIVA() {
        return 0;  // Los libros no tienen IVA
    }
    

}

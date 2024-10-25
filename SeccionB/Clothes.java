package SeccionB;

public class Clothes extends Producto implements ProductoFisico {
    private double weight;

    public Clothes(String name, double price, double weight) {
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
        return this.price * 0.12;  // IVA para ropa es del 12%
    }
}

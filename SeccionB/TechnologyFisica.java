package SeccionB;

public class TechnologyFisica extends Producto implements ProductoFisico {
    private double weight;

    public TechnologyFisica(String name, double price, double weight) {
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
        return this.price * 0.15;  // IVA para tecnología
    }
}

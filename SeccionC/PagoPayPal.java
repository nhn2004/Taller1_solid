package SeccionC;
public class PagoPayPal implements Cobro{
    private boolean loggedIn;

    public PagoPayPal(boolean loggedIn){
        this.loggedIn = loggedIn;
    }
    public void realizarCobro(double monto){
        if(!loggedIn){
            System.out.println("Usuario no autenticado en PayPal");
            return;
        }
        //Lógica de cobro con PayPal
        System.out.println("Cobro realizado por PayPal por el mondo de: " + monto);
    }
}

public class Toalha extends Decoracao {
    
    public Toalha(Mesa mesa) {
        super(mesa);
    }

    public void descrever() {
        super.descrever();
        System.out.print(" com toalha");
    }
}

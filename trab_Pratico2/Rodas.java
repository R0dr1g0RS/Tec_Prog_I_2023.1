public class Rodas extends Decoracao {
    
    public Rodas(Mesa mesa) {
        super(mesa);
    }

    public void descrever() {
        super.descrever();
        System.out.print(" com rodas");
    }
}

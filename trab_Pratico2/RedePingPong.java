public class RedePingPong extends Decoracao {

    public RedePingPong(Mesa mesa) {
        super(mesa);
    }

    public void descrever() {
        super.descrever();
        System.out.print(" com rede de ping pong");
    }
    
}

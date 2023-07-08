public class Main {
    public static void main(String[] args) {
        Mesa mesa = new MesaBasica();
        mesa.decorar();
        mesa.descrever();

        mesa = new Rodas(new MesaBasica());
        
        mesa.decorar();
        mesa.descrever();

        mesa = new RedePingPong(mesa);
        
        mesa.decorar();
        mesa.descrever();
    }
}

abstract class Decoracao implements Mesa{
    protected Mesa mesa;

    public Decoracao(Mesa mesa){
        this.mesa = mesa;
        System.out.print("\n");
    }

    public void decorar(){
        mesa.decorar();        
    }

    public void descrever(){
        mesa.descrever();
    }
}

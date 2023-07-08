public class MesaBasica implements Mesa {
    protected String descricao;

    public void decorar(){
        descricao = "Mesa básica";
    }

    public void descrever(){
        System.out.print(descricao);
    }
}

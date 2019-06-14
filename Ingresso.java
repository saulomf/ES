public class Ingresso {
    //Metodos de validacao dos atributos de todas as classes
    private int Codigo;
    private float Preco;
    private int Quantidade;

    public SetCodigo(int codigo){
        this.Codigo = codigo;
    }
    public SetPreco(float preco){
        this.Preco = preco;
    }
    public SetQuantidade(int quantidade){
        this.Quantidade = quantidade;
    }


    protected int getIngressoCodigo(){
           return Codigo;
    }
    protected float getIngressoPreco(){
           return Preco;
    }
    protected int getIngressoQuantidade(){
           return Quantidade;
    }


    public bool ValidaIngresso(int quantidade, float preco){
        if(( quantidade > 0) || (preco > 0)){
            return true;
        }
        return false;
    }

}

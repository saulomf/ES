public class Cartao extends Data{
    private int Numero;
    private int CVV;

    public SetNumero(int numero){
        this.Numero = numero;
    }
    public SetCVV(int cvv){
        this.CVV = cvv;
    }


    protected int getCartaoNumero(){
           return Numero;
    }
    protected int getCartaoCVV(){
           return CVV;
    }
    protected String getCartaoValidade(){
           return Data;
    }


    public bool ValidaNumero(int numero){
        if((numero > 9999999999999999) || (numero < 1000000000000000)){
            return false;
        }
    }
    public bool ValidaCVV(int cvv){
        if((cvv > 999) || (cvv < 100)){
            return false;
        }
    }


}

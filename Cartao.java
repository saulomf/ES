package main;

public class Cartao extends Data{
    private String Numero;
    private int CVV;

    public void SetNumero(String numero){
        this.Numero = numero;
    }
    public void SetCVV(int cvv){
        this.CVV = cvv;
    }


    protected String getCartaoNumero(){
           return Numero;
    }
    protected int getCartaoCVV(){
           return CVV;
    }
    protected String getCartaoValidade(){
           return Data;
    }


    public boolean ValidaNumero(String numero){
        int aux;
        if (numero.length() != 16){
            return false;
        }
        for (int i = 0; i < numero.length(); i++){
            aux = (int)(numero.charAt(i));
            if((aux < 48) && (aux > 57)){
                return false;
            }
        }
        return true;
    }
    public boolean ValidaCVV(int cvv){
        if((cvv > 999) || (cvv < 100)){
            return false;
        }
        return true;
    }


}

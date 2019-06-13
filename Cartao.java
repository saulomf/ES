public class Cartao {
    private int Numero;
    private int CVV;
    private String Validade;

    public SetNumero(int numero){
        this.Numero = numero;
    }
    public SetCVV(int cvv){
        this.CVV = cvv;
    }
    public SetValidade(String data){
        this.Validade = data;
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
    public bool ValidaData (int dia, int mes, int ano){
        if((dia > 31) || (dia < 1)){
            return false;
        }
        if((mes > 12) || (mes < 1)){
            return false;
        }
        if(ano < 2019){
            return false;
        }
        return true;
    }
    public String MontaData(int dia, int mes, int ano){
        String data = null;
        String d, m, a;
        d = Integer.toString(dia);
        m = Integer.toString(mes);
        a = Integer.toString(ano);
        data = d + m + a;
        return data;
    }

}

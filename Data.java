package main;
import java.util.*;

public class Data {
    public String Data;

    public boolean ValidaData (int dia, int mes, int ano){
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

    public void SetData(int dia, int mes, int ano){
        String data = null;
        String d, m, a;
        d = Integer.toString(dia);
        m = Integer.toString(mes);
        a = Integer.toString(ano);
        data = d + "." + m + "." + a;
        this.Data = data;
    }
}

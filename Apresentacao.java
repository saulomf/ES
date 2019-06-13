public class Apresentacao {
    private int Codigo;
    private int Sala;
    private String Data;
    private int Horario;

    public SetCodigo(int codigo){
        this.Codigo = codigo;
    }
    public SetSala(int sala){
        this.Sala = sala;
    }
    public SetData(String data){
        this.Data = data;
    }
    public SetHorario(int horario){
        this.Horario = horario;
    }


    public bool ValidaHorario(int horario){
        if((horario < 0) || (horario > 24)){
            return false;
        }
        return true;
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

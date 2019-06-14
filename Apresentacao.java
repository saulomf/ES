public class Apresentacao extends Data{
    private int Codigo;
    private int Sala;
    private int Horario;

    public SetCodigo(int codigo){
        this.Codigo = codigo;
    }
    public SetSala(int sala){
        this.Sala = sala;
    }
    public SetHorario(int horario){
        this.Horario = horario;
    }


    protected int getApresentacaoCodigo(){
           return Codigo;
    }
    protected int getApresentacaoSala(){
           return Sala;
    }
    protected int getApresentacaoHorario(){
           return Horario;
    }
    protected String getApresentacaoData(){
           return Data;
    }

    public bool ValidaHorario(int horario){
        if((horario < 0) || (horario > 24)){
            return false;
        }
        return true;
    }


}

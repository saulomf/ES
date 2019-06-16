package main;

public class Apresentacao extends Data{
    private int Codigo;
    private int Sala;
    private int Horario;
    private int Preco;
    private int Quantidade;


    public void SetCodigo(int codigo){
        this.Codigo = codigo;
    }
    public void SetSala(int sala){
        this.Sala = sala;
    }
    public void SetHorario(int horario){
        this.Horario = horario;
    }

    public void SetPreco(int preco){
        this.Preco = preco;
    }
    public void SetQuantidade(int quantidade){
        this.Quantidade = quantidade;
    }


    protected int getIngressoPreco(){
           return Preco;
    }
    protected int getIngressoQuantidade(){
           return Quantidade;
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

    public boolean ValidaHorario(int horario){
        if((horario < 0) || (horario > 24)){
            return false;
        }
        return true;
    }


    public boolean ValidaIngresso(int quantidade, int preco){
        if(( quantidade > 0) || (preco > 0)){
            return true;
        }
        return false;
    }


}

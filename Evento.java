
public class Evento extends Data{
    private int Codigo;
    private String Nome;
    private String Local;
    private String Classe;
    private int Idade;
    private Apresentacao Apresentacoes;
    private int Duracao;

    //Usuario(){}
    public SetCodigo(int codigo){
        this.Codigo = codigo;
    }
    public SetNome(String nome){
        this.Nome = nome;
    }
    public SetLocal(String local){
        this.Local = local;
    }
    public SetClasse(String classe){
        this.Classe = classe;
    }
    public SetIdade(int idade){
        this.Idade = idade;
    }
    public SetApresentacoes(Apresentacao apresentacao){
        this.Apresentacoes = apresentacao;
    }
    public SetDuracao(int duracao){
        this.Duracao = duracao;
    }


    protected int getEventoCodigo(){
           return Codigo;
    }
    protected String getEventoNome(){
           return Nome;
    }
    protected String getEventoLocal(){
           return Local;
    }
    protected String getEventoClasse(){
           return Classe;
    }
    protected int getEventoIdade(){
           return Idade;
    }
    /*protected String getEvento(){
           return ;
    }*/
    protected int getEventoDuracao(){
           return Duracao;
    }
    protected String getEventoData(){
           return Data;
    }


    public bool ValidaNome(String nome){
        if (nome.length() > 50){
            return false;
        }
        return true;
    }

    public bool ValidaIdade(int idade){
        if (idade < 1){
            return false;
        }
        return true;
    }

    public bool ValidaClasse(String classe){
        if ((classe == "teatro") || (classe == "esporte") || (classe == "show nacional")
        || (classe == "show internacional"){
            return true;
        }
        return false;
    }


    public bool Cadastrar(){}
    public bool Apagar(int codigo){}
    public bool Editar(int codigo){}
}

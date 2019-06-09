
public class Evento {
    private int Codigo;
    private String Nome;
    private float Preco;
    private String Local;
    private String Classe;
    private int Idade;
    private Apresentacao Apresentacoes;
    private String Data;
    private int Duracao;

    //Usuario(){}
    public SetCodigo(int codigo){
        this.Codigo = codigo;
    }
    public SetNome(String nome){
        this.Nome = nome;
    }
    public SetPreco(float preco){
        this.Preco = preco;
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
    public SetData(String data){
        this.Data = data;
    }
    public SetDuracao(int duracao){
        this.Duracao = duracao;
    }

    public bool Cadastrar(){}
    public bool Apagar(int codigo){}
    public bool Editar(int codigo){}
}

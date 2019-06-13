
public class Evento {
    private int Codigo;
    private String Nome;
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

    public bool Cadastrar(){}
    public bool Apagar(int codigo){}
    public bool Editar(int codigo){}
}

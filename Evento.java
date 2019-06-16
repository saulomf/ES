package main;
import java.util.*;

public class Evento {
    private String DonoCPF;
    private int Codigo;
    private String Nome;
    private String Cidade;
    private String Sigla;
    private String Classe;
    private int Idade;
    //private Apresentacao Apresentacoes;
    public ArrayList<Apresentacao> Apresentacoes = new ArrayList<Apresentacao>();
    private int Duracao;

    //Usuario(){}

    public void SetDonoCPF(String cpf){
        this.DonoCPF = cpf;
    }
    public void SetCodigo(int codigo){
        this.Codigo = codigo;
    }
    public void SetNome(String nome){
        this.Nome = nome;
    }
    public void SetCidade(String cidade){
        this.Cidade = cidade;
    }
    public void SetSigla(String sigla){
        this.Sigla = sigla;
    }
    public void SetClasse(String classe){
        this.Classe = classe;
    }
    public void SetIdade(int idade){
        this.Idade = idade;
    }
    /*public SetApresentacoes(Apresentacao apresentacao){
        this.Apresentacoes = apresentacao;
    }*/
    public void SetDuracao(int duracao){
        this.Duracao = duracao;
    }


    protected String getEventoCPF(){
           return DonoCPF;
    }
    protected int getEventoCodigo(){
           return Codigo;
    }
    protected String getEventoNome(){
           return Nome;
    }
    protected String getEventoCidade(){
           return Cidade;
    }
    protected String getEventoSigla(){
           return Sigla;
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
    /*protected String getEventoData(){
           return Data;
    }*/


    public boolean ValidaNome(String nome){
        if (nome.length() > 50){
            return false;
        }
        return true;
    }

    public boolean ValidaIdade(int idade){
        if (idade < 1){
            return false;
        }
        return true;
    }

    public boolean ValidaClasse(String classe){
        if ((classe.equals("teatro")) || (classe.equals("esporte")) || (classe.equals("show nacional"))
        || (classe.equals("show internacional"))) {
            return true;
        }
        return false;
    }

    public void mostraEvento(){
        System.out.println("Evento Encontrado");
        System.out.println("Codigo: " + Codigo);
        System.out.println("Nome: " + Nome);
        System.out.println("Cidade: " + Cidade);
        System.out.println("Estado: " + Sigla);
        System.out.println("Classe: " + Classe);
        System.out.println("Idade Minima: " + Idade);
        System.out.println();
        for(Apresentacao apr : Apresentacoes) {
            System.out.println("Apresentacao: " + apr.getApresentacaoCodigo());
            System.out.println("Sala: " + apr.getApresentacaoSala());
            System.out.println("Data: " + apr.getApresentacaoData());
            System.out.println("Horario: " + apr.getApresentacaoHorario());
            System.out.println("Preco do Ingresso: " + apr.getIngressoPreco());
            System.out.println("Quantidade de Ingressos disponiveis: " + apr.getIngressoQuantidade());
            System.out.println();
        }
    }

    /*public boolean Cadastrar(){}
    public boolean Apagar(int codigo){}
    public boolean Editar(int codigo){}*/
}

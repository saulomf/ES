package main;

import java.util.*;

public class Usuario {
    private String Nome;
    private String CPF;
    private String Senha;
    private Cartao cartaoCred;
    //Usuario(){}
    public void SetNome(String nome){
        this.Nome = nome;
    }
    public void SetCPF(String cpf){
        this.CPF = cpf;
    }
    public void SetSenha(String senha){
        this.Senha = senha;
    }
    public void SetCartao(Cartao cartao){
        this.cartaoCred = cartao;
    }


    protected String getUsuarioNome(){
           return Nome;
    }
    protected String getUsuarioCPF(){
           return CPF;
    }
    protected String getUsuarioSenha(){
           return Senha;
    }
    protected Cartao getUsuarioCartao(){
           return cartaoCred;
    }


    public boolean ValidaNome(String nome){
        if ((nome.length() > 50) || (nome.length() < 1)) {
            return false;
        }
        return true;
    }

    public boolean ValidaCPF(String cpf){
        int aux;
        if (cpf.length()!= 11){
            return false;
        }
        for (int i = 0; i < cpf.length(); i++){
            aux = (int)(cpf.charAt(i));
            if((aux < 48) && (aux > 57)){
                return false;
            }
        }
        return true;
    }

    public boolean ValidaSenha(String senha){
        if (senha.length() < 6){
            return false;
        }
        return true;
    }


    public Evento CadastrarEvento(){
        System.out.println("Usuario Logado");
        System.out.println("Cadastrar Evento");
        Scanner ler = new Scanner(System.in);

        Apresentacao apresentacao = new Apresentacao();
        Evento evento = new Evento();
        evento.SetDonoCPF(CPF);

        String nome, local, classe;
        int dia, mes, ano, codigo, idade, sala, horario, duracao, quantidade, preco;
        boolean cadastraApresentacao = true;

        System.out.println("Digite o Nome do Evento");
        nome = ler.nextLine();
        while(evento.ValidaNome(nome)==false){
            System.out.println("Nome de Evento Invalido, digite novamente");
            nome = ler.nextLine();
        }
        evento.SetNome(nome);

        System.out.println("Digite a Idade para o Evento");
        idade = ler.nextInt();
        while(evento.ValidaIdade(idade)==false){
            System.out.println("Idade Invalida, digite novamente");
            idade = ler.nextInt();
        }
        evento.SetIdade(idade);
        ler.nextLine();

        System.out.println("Digite a Classe do Evento (teatro, esporte, show nacional, show internacional)");
        classe = ler.nextLine();
        while(evento.ValidaClasse(classe)==false){
            System.out.println("Classe Invalida, digite novamente");
            classe = ler.nextLine();
        }
        evento.SetClasse(classe);


        System.out.println("Digite o Codigo do Evento:");
        codigo = ler.nextInt();
        evento.SetCodigo(codigo);

        System.out.println("Digite a Duracao do Evento(em dias):");
        duracao = ler.nextInt();
        evento.SetDuracao(duracao);
        ler.nextLine();

        System.out.println("Digite a cidade do Evento:");
        local = ler.nextLine();
        evento.SetCidade(local);
        System.out.println("Digite a sigla do estado do Evento:");
        local = ler.nextLine();
        evento.SetSigla(local);

        while(cadastraApresentacao == true){
            System.out.println("Cadastrar Apresentacao:");
            System.out.println("Digite o codigo da apresentacao:");
            codigo = ler.nextInt();
            apresentacao.SetCodigo(codigo);

            System.out.println("Digite o numero da sala da apresentacao:");
            sala = ler.nextInt();
            apresentacao.SetSala(sala);

            System.out.println("Digite o Horario da Apresentacao");
            horario = ler.nextInt();
            while(apresentacao.ValidaHorario(horario)==false){
                System.out.println("Horario Invalido, digite novamente");
                horario = ler.nextInt();
            }
            apresentacao.SetHorario(horario);

            System.out.println("Digite a quantidade de Ingressos");
            quantidade = ler.nextInt();
            System.out.println("Digite o preco do Ingresso");
            preco = ler.nextInt();
            while(apresentacao.ValidaIngresso(quantidade, preco)==false){
                System.out.println("Invalido, digite novamente a Quantidade:");
                quantidade = ler.nextInt();
                System.out.println("Digite novamente o preco:");
                preco = ler.nextInt();
            }
            apresentacao.SetPreco(preco);
            apresentacao.SetQuantidade(quantidade);

            System.out.println("Digite o dia da apresentacao:");
            dia = ler.nextInt();
            System.out.println("Digite o mes de  da apresentacao:");
            mes = ler.nextInt();
            System.out.println("Digite o ano da apresentacao:");
            ano = ler.nextInt();

            while(apresentacao.ValidaData(dia, mes, ano)==false){
                System.out.println("Invalido, digite o dia novamente:");
                dia = ler.nextInt();
                System.out.println("digite o mes novamente:");
                mes = ler.nextInt();
                System.out.println("digite o ano novamente:");
                ano = ler.nextInt();
            }
            apresentacao.SetData(dia, mes, ano);

            evento.Apresentacoes.add(apresentacao);

            System.out.println("Deseja inserir outra apresentacao?(1 - sim; 2 - nao)");
            if(ler.nextInt()==1){
                cadastraApresentacao = true;
                apresentacao = null;
                apresentacao = new Apresentacao();
                ler.nextLine();
            }
            else{
                cadastraApresentacao = false;
            }
        }

        System.out.println("Evento cadastrado com sucesso");
        ler.nextLine();
        return evento;
    }


    //public boolean Deletar_Conta(String CPF){}
    //public void Buscar_Evento(/*String nome_evento*/){    }
    //public bool Comprar_Ingresso(String codigo_evento){}

}

public class Usuario {
    private String Nome;
    private String CPF;
    private String Senha;
    private Cartao cartaoCred;
    //Usuario(){}
    public SetNome(String nome){
        this.Nome = nome;
    }
    public SetCPF(String cpf){
        this.Nome = cpf;
    }
    public SetSenha(String senha){
        this.Senha = senha;
    }
    public SetCartao(Cartao cartao){
        this.cartaoCred = cartao;
    }
    public bool Deletar_Conta(String CPF){}
    public Buscar_Evento(String nome_evento){}
    public bool Comprar_Ingresso(String codigo_evento){}

}

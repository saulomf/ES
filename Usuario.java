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

    public bool ValidaNome(String nome){
        if (nome.length() > 50){
            return false;
        }
        return true;
    }

    public bool ValidaCPF(String cpf){
        int aux;
        if (cpf.length() > 11){
            return false;
        }
        for (int i = 0; i < cpf.length(); i++){
            aux = (int)(cpf.charAt(i))
            if((aux < 48) && (aux > 57)){
                return false;
            }
        }
        return true;
    }

    public bool ValidaSenha(String senha){
        if (senha.length() < 6){
            return false;
        }
        return true;
    }


    public bool Deletar_Conta(String CPF){}
    public Buscar_Evento(String nome_evento){}
    public bool Comprar_Ingresso(String codigo_evento){}

}

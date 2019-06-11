public class Validacao {
    //Metodos de validacao dos atributos de todas as classes
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

}

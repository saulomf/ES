package main;

import java.util.*;

class Interface{
    Scanner ler = new Scanner(System.in);
    public ArrayList<Usuario> lista_usuarios = new ArrayList<Usuario>();
    public ArrayList<Evento> lista_eventos = new ArrayList<Evento>();

    public void CadastrarUsuario(){
        //Interface obj = new Interface;
        Usuario usuario = new Usuario();
        Cartao cartao = new Cartao();
        String nome, cpf, senha, numeroCartao;
        int cvv, mes, ano;

        System.out.println("Digite o Nome do Usuario:");
        nome = ler.nextLine();
        while(usuario.ValidaNome(nome)==false){
            System.out.println("Nome de Usuario Invalido, digite novamente");
            nome = ler.nextLine();
        }
        usuario.SetNome(nome);

        System.out.println("Digite o CPF do Usuario:");
        cpf = ler.nextLine();
        while(usuario.ValidaCPF(cpf)==false){
            System.out.println("CPF de Usuario Invalido, digite novamente");
            cpf = ler.nextLine();
        }
        usuario.SetCPF(cpf);

        System.out.println("Digite a senha para o Usuario:");
        senha = ler.nextLine();
        while(usuario.ValidaSenha(senha)==false){
            System.out.println("senha de Usuario Invalida, digite novamente");
            senha = ler.nextLine();
        }
        usuario.SetSenha(senha);

        System.out.println("Digite o numero do cartao do Usuario:");
        numeroCartao = ler.nextLine();
        while(cartao.ValidaNumero(numeroCartao)==false){
            System.out.println("numero do cartao do Usuario Invalido, digite novamente");
            numeroCartao = ler.nextLine();
        }
        cartao.SetNumero(numeroCartao);

        System.out.println("Digite o codigo de seguranca do cartao do Usuario:");
        cvv = ler.nextInt();
        while(cartao.ValidaCVV(cvv)==false){
            System.out.println("numero do cartao do Usuario Invalido, digite novamente");
            cvv = ler.nextInt();
        }
        cartao.SetCVV(cvv);

        System.out.println("Digite o mes de validade do cartao do Usuario:");
        mes = ler.nextInt();
        System.out.println("Digite o ano de validade do cartao do Usuario:");
        ano = ler.nextInt();
        while(cartao.ValidaData(1, mes, ano)==false){
            System.out.println("Invalido, digite o mes novamente:");
            mes = ler.nextInt();
            System.out.println("digite o ano novamente:");
            ano = ler.nextInt();
        }
        cartao.SetData(1, mes, ano);
        usuario.SetCartao(cartao);
        lista_usuarios.add(usuario);
        System.out.println("Usuario cadastrado com sucesso");
        ler.nextLine();
        ler.nextLine();
    }


    public void Buscar_Evento(boolean logado){
        System.out.println("Buscar Evento");
        String dataI, dataT, cidade, sigla;
        int i, quantidade, j, encontrou=0;
        ler.nextLine();

        System.out.println("Digite a data de inicio (aceitos: x.xx.xxxx ou xx.x.xxxx ou xx.xx.xxxx)");
        dataI = ler.nextLine();
        System.out.println("Digite a data de encerramento");
        dataT = ler.nextLine();
        System.out.println("Digite a cidade");
        cidade = ler.nextLine();
        System.out.println("Digite a sigla do estado");
        sigla = ler.nextLine();
        limparTela();
        for(i=0; i < lista_eventos.size(); i++){
            for(Apresentacao apr : lista_eventos.get(i).Apresentacoes){
                if(((dataT.equals(apr.getApresentacaoData())) || (dataI.equals(apr.getApresentacaoData()))
                || (cidade.equals(lista_eventos.get(i).getEventoCidade()))
                || (cidade.equals(lista_eventos.get(i).getEventoSigla())))){
                    encontrou = 1;
                    lista_eventos.get(i).mostraEvento();
                    ler.nextLine();
                    if(logado == true){
                        System.out.println("Deseja Comprar Ingresso para esta apresentacao? (1-Sim; 2-Nao)");
                        if(ler.nextInt()==1){
                            System.out.println("Quantos Ingressos?");
                            quantidade = ler.nextInt();
                            while(quantidade > apr.getIngressoQuantidade()){
                                System.out.println("Quantidade indisponivel de Ingressos, digite outra");
                                quantidade = ler.nextInt();
                            }
                            System.out.println("O codigo dos Ingressos e:");
                            for(j=1; j<=quantidade; j++){
                                System.out.println(apr.getIngressoQuantidade()-j);
                            }
                            apr.SetQuantidade(apr.getIngressoQuantidade()-quantidade);
                            System.out.println("Quantidade atual de Ingressos: " + apr.getIngressoQuantidade());
                            ler.nextLine();
                            ler.nextLine();
                        }
                    }
                }
            }
        }
        if(encontrou == 0){
            System.out.println("Evento nao existente");
            ler.nextLine();
        }


    }


    public void Editar_Evento(int user, String cpf_log){
        int codigo, i, continua=0;

        System.out.println("Digite o Codigo do evento que deseja editar:");
        codigo = ler.nextInt();
        for(i=0; i < lista_eventos.size(); i++){
            if(codigo == lista_eventos.get(i).getEventoCodigo()){
                if(cpf_log.equals(lista_eventos.get(i).getEventoCPF())){
                    continua = 1;
                }
                else{
                    System.out.println("Este evento nao foi cadastrado por voce");
                }
                break;
            }
        }
        if(continua == 1){
            lista_eventos.get(i).mostraEvento();
            System.out.println("Deseja mesmo editar:(1-Sim; 2-Nao)");
            if(ler.nextInt()==1){
                lista_eventos.remove(i);
                lista_eventos.add(i, lista_usuarios.get(user).CadastrarEvento());
                System.out.println("Evento editado com sucesso");
            }
        }
        ler.nextLine();

    }


    public void Apagar_Evento(String cpf_log){
        int codigo, i, continua=0;

        System.out.println("Digite o Codigo do evento que deseja apagar:");
        codigo = ler.nextInt();
        for(i=0; i < lista_eventos.size(); i++){
            if(codigo == lista_eventos.get(i).getEventoCodigo()){
                if(cpf_log.equals(lista_eventos.get(i).getEventoCPF())){
                    continua = 1;
                }
                else{
                    System.out.println("Este evento nao foi cadastrado por voce");
                }
                break;
            }
        }
        if(continua == 1){
            lista_eventos.get(i).mostraEvento();
            System.out.println("Deseja mesmo apagar:(1-Sim; 2-Nao)");
            if(ler.nextInt()==1){
                lista_eventos.remove(i);
                System.out.println("Evento apagado com sucesso");
            }
        }
        ler.nextLine();

    }

    public void LogarUsuario(){
        String cpf, senha;
        int i=0, continua=0, opcao;

        System.out.println("Digite o CPF do Usuario:");
        cpf = ler.nextLine();
        for(i=0; i < lista_usuarios.size(); i++){
            if(cpf.equals(lista_usuarios.get(i).getUsuarioCPF())){
                continua = 1;
                break;
            }
        }
        if(continua == 1){
            System.out.println("Digite a senha do Usuario:");
            senha = ler.nextLine();
            if(senha.equals(lista_usuarios.get(i).getUsuarioSenha())) {
                System.out.println("Escolha uma opcao abaixo:");
                System.out.println("1 - Cadastrar Evento");
                System.out.println("2 - Buscar Evento");
                System.out.println("3 - Editar Evento");
                System.out.println("4 - Apagar Evento");
                System.out.println("5 - sair");
                opcao = ler.nextInt();
                limparTela();
                switch(opcao){
                    case 1:
                        lista_eventos.add(lista_usuarios.get(i).CadastrarEvento());
                        //lista_eventos.get(0).mostraEvento();
                        ler.nextLine();
                        break;

                    case 2:
                        Buscar_Evento(true);
                        break;

                    case 3:
                        Editar_Evento(i, cpf);
                        break;

                    case 4:
                        Apagar_Evento(cpf);
                        break;
                }

            }
            else
                System.out.println("Senha incorreta");
        }
        else
            System.out.println("CPF nao existente");
        ler.nextLine();
    }

    public void limparTela(){
        int i;
        for(i=0; i < 100; i++)
            System.out.println();
    }

    public static void main(String args[]){
        Interface obj = new Interface();
        int opcao = 0;
        while(opcao!=4){
            obj.limparTela();
            System.out.println("Digite uma das opcoes abaixo:");
            System.out.println("1 - Cadastrar-se");
            System.out.println("2 - Entrar");
            System.out.println("3 - Buscar Evento");
            System.out.println("4 - Sair");
            opcao = obj.ler.nextInt();
            obj.ler.nextLine();
            switch(opcao){

                case 1:
                    obj.CadastrarUsuario();
                    break;

                case 2:
                    obj.LogarUsuario();
                    break;

                case 3:
                    obj.Buscar_Evento(false);
                    break;

            }
        }
    }
}

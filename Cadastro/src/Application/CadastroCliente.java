package Application;

import array.Array;
import java.util.Scanner;
import modelo.Cliente;

public class CadastroCliente {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Array array = new Array();
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar cliente");
            System.out.println("2. Remover cliente");
            System.out.println("3. Atualizar cliente");
            System.out.println("4. Exibir cliente por ID");
            System.out.println("5. Exibir todos os clientes");
            System.out.println("6. Sair");
            int opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("FAÇA SEU CADASTRO DE SEU PLANO DE SAUDE");
                    System.out.println("Digite o seu nome completo: ");
                    teclado.nextLine();
                    String nome = teclado.nextLine();
                    System.out.println("Digite o seu gênero: ");
                    String genero = teclado.nextLine();
                    System.out.println("De acordo com a sua idade, iremos indicar o plano adequado");
                    System.out.println("Digite sua idade: ");
                    int idade = teclado.nextInt();
                    System.out.println("Digite seu CPF: ");
                    long cpf = teclado.nextLong();
                    System.out.println("Digite seu telefone: ");
                    long telefone = teclado.nextLong();
                    array.cadastrarCliente(new Cliente(nome, genero, idade, cpf, telefone));
                    break;
                case 2:
                    System.out.println("Digite o ID do cliente a ser removido");
                    int idRemover = teclado.nextInt();
                    array.removerObjeto(idRemover);
                    System.out.println("Cliente removido com sucesso!");
                    break;
                case 3:
                    System.out.println("Digite o ID que deseja alterar");
                    int idAtualizar = teclado.nextInt();
                    if (idAtualizar > 0) {
                        System.out.println("Digite o nome no qual deseja alterar cliente");
                        teclado.nextLine();
                        String novoNome = teclado.nextLine();
                        System.out.println("Digite o seu gênero: ");
                        String novoGenero = teclado.nextLine();
                        System.out.println("De acordo com a sua idade, iremos indicar o plano adequado");
                        System.out.println("Digite sua idade: ");
                        int novaIdade = teclado.nextInt();
                        System.out.println("Digite seu CPF: ");
                        long novoCpf = teclado.nextLong();
                        System.out.println("Digite seu telefone: ");
                        long novoTelefone = teclado.nextLong();
                        array.atualizarCliente(idAtualizar, novoNome, novoGenero, novaIdade, novoCpf, novoTelefone);
                        System.out.println(array.obterClientePorId(idAtualizar));
                    } else {
                        System.out.println("Cliente nao encontrado");
                    }
                    break;
                case 4:
                    System.out.println("Digite o ID para buscar suas informações");
                    int idBuscar = teclado.nextInt();
                    Cliente clienteExibir = array.obterClientePorId(idBuscar);
                    if (clienteExibir != null) {
                        System.out.println(clienteExibir);
                    }
                    break;
                case 5:
                    System.out.println("Lista de todos os clientes");
                    array.exibeDados();
                    break;
                case 6:
                    continuar = false;
                    System.out.println("Sistema encerrado!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        /* 
        char resposta = 'S';
        char resposta2 = 'S';
        
        while (resposta == 'S' || resposta == 's') {
            System.out.println("FAÇA SEU CADASTRO DE SEU PLANO DE SAUDE");
            System.out.println("Digite o seu nome completo: ");
            String nome = teclado.nextLine();
            System.out.println("Digite o seu gênero: ");
            String genero = teclado.nextLine();
            System.out.println("De acordo com a sua idade, iremos indicar o plano adequado");
            System.out.println("Digite sua idade: ");
            int idade = teclado.nextInt();
            System.out.println("Digite seu CPF: ");
            long cpf = teclado.nextLong();
            System.out.println("Digite seu telefone: ");
            long telefone = teclado.nextLong();
            array.cadastrarCliente(new Cliente(nome, genero, idade, cpf, telefone));
            System.out.println("Deseja Continuar? S/N");
            resposta = teclado.next().charAt(0);
            teclado.nextLine();
        }

        System.out.println("Deseja atualizar algum dado? Digite S/N ");
        resposta = teclado.next().charAt(0);
        if (resposta == 's' || resposta == 'S') {
            System.out.println("Digite o ID que deseja alterar");
            int idAtualizar = teclado.nextInt();
            if (idAtualizar > 0) {
                System.out.println("Digite o nome no qual deseja alterar cliente");
                teclado.nextLine();
                String novoNome = teclado.nextLine();
                System.out.println("Digite o seu gênero: ");
                String novoGenero = teclado.nextLine();
                System.out.println("De acordo com a sua idade, iremos indicar o plano adequado");
                System.out.println("Digite sua idade: ");
                int novaIdade = teclado.nextInt();
                System.out.println("Digite seu CPF: ");
                long novoCpf = teclado.nextLong();
                System.out.println("Digite seu telefone: ");
                long novoTelefone = teclado.nextLong();
                array.atualizarCliente(idAtualizar, novoNome, novoGenero, novaIdade, novoCpf, novoTelefone);
                System.out.println(array.obterClientePorId(1));
            } else {
                System.out.println("Cliente nao encontraado");
            }
        }

        System.out.println("Deseja remover algum dado? Digite S/N");
        resposta = teclado.next().charAt(0);
        if (resposta == 's' || resposta == 'S') {
            System.out.println("Digite o ID do cliente a ser removido");
            int idRemover = teclado.nextInt();
            array.removerObjeto(idRemover);
        }

        System.out.println("Deseja buscar suas informações? Digite S/N");
        resposta = teclado.next().charAt(0);
        if (resposta == 's' || resposta == 'S') {
            System.out.println("Digite o ID para buscar suas informações");
            int idBuscar = teclado.nextInt();
            Cliente clienteExibir = array.obterClientePorId(idBuscar);
            if (clienteExibir != null) {
                System.out.println(clienteExibir);
            }
        }

        System.out.println("Deseja exibir a lista de todos os clientes? Digite S/N");
        resposta = teclado.next().charAt(0);
        if (resposta == 's' || resposta == 'S') {
            System.out.println("Lista de todos os clientes");
            array.exibeDados();
        }

        teclado.close(); */
    }
}

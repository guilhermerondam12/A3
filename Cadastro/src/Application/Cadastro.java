package Application;

import array.Array;
import java.util.Scanner;
import modelo.Cliente;


public class Cadastro {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        char resposta = 'S';
        Array array = new Array();
        while (resposta == 'S' || resposta == 's') {
        System.out.println("FAÇA SEU CADASTRO DE SEU PLANO DE SAUDE");
        System.out.println("Digite o seu nome completo: ");
        String nome = teclado.nextLine();
        System.out.println("De acordo com a sua idade, iremos indicar o plano adequado");
        System.out.println("Digite sua idade: ");
        int idade = teclado.nextInt();
        array.cadastrar (new Cliente (nome, idade));
        array.exibeDados();
        System.out.println("Deseja Continuar? S/N");
        resposta = teclado.next().charAt(0);
        teclado.nextLine();
        }
        
    }
}

package array;

import modelo.Cliente;

public class Array {

    private Cliente[] cliente = new Cliente[1];
    private static int contador = 0;

    /**
     * Cadastra um paciente armazenando na lista
     */
    public void cadastrar(Cliente paciente) {
        cliente[contador++] = paciente;
        redimensionarObjeto();
    }

    public void redimensionarObjeto() {
        Cliente[] novoArray = new Cliente[cliente.length + 1];
        for (int i = 0; i < cliente.length; i++) {
            novoArray[i] = cliente[i];
        }
        cliente = novoArray;
    }

    public void removerObjeto(int selecionarID) {
        
    }

    

    int cont = 0;

    public void exibeDados() {
        System.out.println(cliente[cont++]);
    }
}

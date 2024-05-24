
package array;

import modelo.Cliente;

public class Array {
    private Cliente [] lista = new Cliente [3];
    private static int contador = 0;
    
    /**
     * Cadastra um paciente armazenando na lista
     */
    
    public void cadastrar (Cliente cliente){
        lista [contador++] = cliente;
    }
    
    int cont = 0;
    public void exibeDados () {
        System.out.println(lista[cont++]);
    }
}

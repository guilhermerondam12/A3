package array;

import javax.swing.JOptionPane;
import modelo.Cliente;

public class Array {

    private Cliente[] cliente = new Cliente[1];
    private static int contador = 0;

    /**
     * Cadastra um paciente armazenando na lista
     *
     * @param paciente
     */
    public void cadastrarCliente(Cliente paciente) {
        cliente[contador++] = paciente;
        redimensionarObjeto();
    }

    // metodo para redimensionar o array.
    public void redimensionarObjeto() {
        Cliente[] novoArray = new Cliente[cliente.length + 1];
        for (int i = 0; i < cliente.length; i++) {
            novoArray[i] = cliente[i];
        }
        cliente = novoArray;
    }
    // metodo que remove os dados do array pelo ID

    public void removerObjeto(int id) {
        int index = encontrarIndicePorId(id);
        if (index != -1) {
            for (int i = index; i < contador - 1; i++) {
                cliente[i] = cliente[i + 1];
            }
            cliente[--contador] = null;
            JOptionPane.showMessageDialog(null, "Cadastro removido com sucesso!", "Remover", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado!", "ERRO", JOptionPane.PLAIN_MESSAGE);
        }
    }

    // metodo para atualizar os dados referente ao ID selecionado
    public void atualizarCliente(int id, String novoNome, String novoGenero, String novaIdade, String novoCpf, String novoTelefone, String novoTipoPlano) {
        int index = encontrarIndicePorId(id);
        if (index != -1) {
            cliente[index].setNome(novoNome);
            cliente[index].setGenero(novoGenero);
            cliente[index].setIdade(novaIdade);
            cliente[index].setCpf(novoCpf);
            cliente[index].setTelefone(novoTelefone);
            cliente[index].setTipoPlano(novoTipoPlano);
        } else if (index == 0){
            JOptionPane.showMessageDialog(null, "Não existe identificador zero", "ERRO", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado", "ERRO", JOptionPane.PLAIN_MESSAGE);
        }
    }

    // ira buscar informações do cliente pelo ID
    public Cliente obterClientePorId(int id) {
        int index = encontrarIndicePorId(id);
        if (index != -1) {
            return cliente[index];
        } else {
            throw new IllegalArgumentException("Cliente não encontrado!");
        }
    }

    // encontrar o indice do array pelo ID do cliente.
    private int encontrarIndicePorId(int id) {
        for (int i = 0; i < contador; i++) {
            if (cliente[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

}

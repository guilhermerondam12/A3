package modelo;


public class Cliente {

    private String nome, genero, tipoPlano, cpf, telefone;
    private int id, idade;
    private static int contador = 1;
    // Construtores de objetos
    public Cliente() {
        id = contador++;
    }

    public Cliente(String nome, String genero, int idade, String cpf, String telefone, String tipoPlano) {
        this.nome = nome;
        this.genero = genero;
        this.tipoPlano = tipoPlano;
        this.idade = idade;
        this.cpf = cpf;
        this.telefone = telefone;
        id = contador++;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipoPlano() {
        return tipoPlano;
    }
    
    
    public void setTipoPlano(String tipoPlano) {
        this.tipoPlano = tipoPlano;
  
    }
    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
        
    }
    
     public String defineValor () {
         String valorAtual = "";
        if ("Plano Junior".equals(tipoPlano)) {
            valorAtual = "R$ 330,00";
        } else if ("Plano Pleno".equals(tipoPlano)) {
            valorAtual = "R$ 520,00";
        } else {
            valorAtual = "R$ 890,00";
        }
        return valorAtual;
    }
     

    
    // Define o plano do cliente com base em sua idade
    
    @Override
    public String toString() {
        
        return "Seu identificador (ID): " + this.id + "\nSeu nome é: " + this.nome + "\nGenero: " + this.genero + "\nIdade: " + this.idade + "\nCPF: " + this.cpf + "\nTelefone para contato " + this.telefone
                ;
        
    }

}
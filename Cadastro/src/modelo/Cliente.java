package modelo;


public class Cliente {

    private String nome, genero, tipoPlano, cpf, telefone, idade;
    private int id;
    private static int contador = 1;
    // Construtores de objetos
    public Cliente() {
        id = contador++;
    }

    public Cliente(String nome, String genero, String idade, String cpf, String telefone, String tipoPlano) {
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

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
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
        } else if ("Plano Senior".equals(tipoPlano)) {
            valorAtual = "R$ 890,00";
        } else {
            valorAtual = "Sem identificação de plano, não é definido o valor";
        }
        return valorAtual;
    }
     

    
    // Define o plano do cliente com base em sua idade
    
    @Override
    public String toString() {
        
        return "Seu identificador (ID): " + this.id + "\nSeu nome é: " + this.nome + "\nGenero: " + this.genero + "\nIdade: " + this.idade + "\nCPF: " + this.cpf + "\nTelefone para contato " + this.telefone + 
                "\nPlano escolhido: " + this.tipoPlano + "\nO valor do seu plano é: " + defineValor()
                ;
        
    }

}
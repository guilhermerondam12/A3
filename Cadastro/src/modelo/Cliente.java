
package modelo;


public class Cliente {

    private String nome, genero, tipoPlano;
    private int id, idade;
    private long telefone, cpf;
    private double precoPlano;
    private static int contador = 1;
    // Construtores de objetos
    public Cliente() {
        id = contador++;
    }

    public Cliente(String nome, String genero, int idade, long cpf, long telefone) {
        this.nome = nome;
        this.genero = genero;
        this.tipoPlano = tipoPlano;
        this.idade = idade;
        this.cpf = cpf;
        this.telefone = telefone;
        id = contador++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecoPlano() {
        return precoPlano;
    }

    public void setPrecoPlano(double precoPlano) {
        this.precoPlano = precoPlano;
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
    
    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
        
    }
    
    // Define o plano do cliente com base em sua idade
    public String definePlano (){
        String planoAtual = "";
        if (this.idade <= 18) {
            planoAtual = "PLANO JUNIOR";
        } else if (idade <= 30) {
            planoAtual = "PLANO PLENO";
        } else {
            planoAtual = "PLANO SENIOR";
        }
        
        return planoAtual;
    }
    
    public double defineValor () {
        double valorAtual = 0;
        if ("PLANO JUNIOR".equals(tipoPlano)) {
            valorAtual = 230.00;
        } else if (idade <= 30) {
            valorAtual = 480.00;
        } else {
            valorAtual = 890.00;
        }
        return valorAtual;
    }
    
    @Override
    public String toString() {
        
        return "Seu identificador (ID): " + this.id + "\nSeu nome é: " + this.nome + "\nGenero: " + this.genero + "\nIdade: " + this.idade + "\nCPF: " + this.cpf + "\nTelefone para contato " + this.telefone +
                "\nO plano mais indicado para o senhor é: " + this.definePlano() + "\nO valor do plano adequado ao senhor é: " + this.defineValor();
        
    }

}

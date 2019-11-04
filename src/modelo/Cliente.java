package modelo;

public class Cliente {

    String Cpf;
    String Rg;
    String Nome;
    String Endereco;
    int Telefone;
    String informBancaria;

    public Cliente(String cpf, String nome, int telefone){
        this.Cpf = cpf;
        this.Nome = nome;
        this.Telefone = telefone;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return Cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        Cpf = cpf;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return Rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        Rg = rg;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        Nome = nome;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return Endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    /**
     * @return the telefone
     */
    public int getTelefone() {
        return Telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(int telefone) {
        Telefone = telefone;
    }

    /**
     * @return the informBancaria
     */
    public String getInformBancaria() {
        return informBancaria;
    }

    /**
     * @param informBancaria the informBancaria to set
     */
    public void setInformBancaria(String informBancaria) {
        this.informBancaria = informBancaria;
    }


}
package modelo;

public class Mecanico {

    String Cpf;
    String Rg;
    String Nome;
    String Endereco;
    int telefone;
    String cargo;
    String grauDeInstrucao;
    double Salario;
    int DataNasc;

    public Mecanico(String cpf, String nome){
        this.Cpf = cpf;
        this.Nome = nome;
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
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the grauDeInstrucao
     */
    public String getGrauDeInstrucao() {
        return grauDeInstrucao;
    }

    /**
     * @param grauDeInstrucao the grauDeInstrucao to set
     */
    public void setGrauDeInstrucao(String grauDeInstrucao) {
        this.grauDeInstrucao = grauDeInstrucao;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return Salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        Salario = salario;
    }

    /**
     * @return the dataNasc
     */
    public int getDataNasc() {
        return DataNasc;
    }

    /**
     * @param dataNasc the dataNasc to set
     */
    public void setDataNasc(int dataNasc) {
        DataNasc = dataNasc;
    }



}
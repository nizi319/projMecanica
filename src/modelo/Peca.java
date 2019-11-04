package modelo;

public class Peca {

    private int Codigo;
    private String nome;
    private int Ano;
    private String modelo;
    private double preco;

public Peca (int codigo, double preco, String nome){
    this.Codigo = codigo;
    this.nome = nome;
    this.preco = preco;
}

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return Codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return Ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        Ano = ano;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }



    
}
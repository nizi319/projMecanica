package modelo;

public class InforBacario {

    int NumeroDoBanco;
    int Agencia;
    String NumeroConta;

    public InforBacario(int num, int ag, String numero){
        this.NumeroDoBanco = num;
        this.Agencia =ag;
        this.NumeroConta = numero;
    }

    /**
     * @return the numeroDoBanco
     */
    public int getNumeroDoBanco() {
        return NumeroDoBanco;
    }

    /**
     * @param numeroDoBanco the numeroDoBanco to set
     */
    public void setNumeroDoBanco(int numeroDoBanco) {
        NumeroDoBanco = numeroDoBanco;
    }

    /**
     * @return the agencia
     */
    public int getAgencia() {
        return Agencia;
    }

    /**
     * @param agencia the agencia to set
     */
    public void setAgencia(int agencia) {
        Agencia = agencia;
    }

    /**
     * @return the numeroConta
     */
    public String getNumeroConta() {
        return NumeroConta;
    }

    /**
     * @param numeroConta the numeroConta to set
     */
    public void setNumeroConta(String numeroConta) {
        NumeroConta = numeroConta;
    }



}
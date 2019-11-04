package modelo;

public class Carro {

    String Placa;
    String Modelo;
    int AnoFabricacao;
    String Proprietario;

    public Carro(String placa, String modelo, String prop){
        this.Modelo = modelo;
        this.Placa = placa;
        this.Proprietario = prop;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return Placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        Placa = placa;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return Modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    /**
     * @return the anoFabricacao
     */
    public int getAnoFabricacao() {
        return AnoFabricacao;
    }

    /**
     * @param anoFabricacao the anoFabricacao to set
     */
    public void setAnoFabricacao(int anoFabricacao) {
        AnoFabricacao = anoFabricacao;
    }

    /**
     * @return the proprietario
     */
    public String getProprietario() {
        return Proprietario;
    }

    /**
     * @param proprietario the proprietario to set
     */
    public void setProprietario(String proprietario) {
        Proprietario = proprietario;
    }



}
package edu.dio.aparelhosEletroncos;

public class InfoAparelhosEletronicos {
    //atributos
    private String modelo;
    private double peso;
    private int anoFabricacao;

    public String getModelo() {
        return modelo;
    }

    public double getPeso() {
        return peso;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
}

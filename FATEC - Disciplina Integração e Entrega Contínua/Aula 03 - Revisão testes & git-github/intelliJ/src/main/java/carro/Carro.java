package carro;


public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    private int velocidade;
    private int aceleracao;

    public Carro(String marca, String modelo, int ano, int aceleracao) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.aceleracao = aceleracao;
        this.velocidade = 0;
    }

    public void parar(){
        while(velocidade > 10) frear();
        this.velocidade = 0;
    }

    public void acelerar(){
        this.velocidade += this.aceleracao;
    }

    public void frear(){
        this.velocidade -= this.aceleracao;
    }


    //Getters and Setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(int aceleracao) {
        this.aceleracao = aceleracao;
    }
}

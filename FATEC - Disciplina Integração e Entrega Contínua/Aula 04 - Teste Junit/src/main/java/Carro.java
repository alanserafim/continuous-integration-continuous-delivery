public class Carro {

    private int ano;
    private int potencia;
    private int velocidade;
    private String marca;
    private String modelo;
    private int km_rodados;

    private final int CONSTANTE_DESACELERACAO = 10;
    private final int CONSTANTE_KM_CARRO_SEMINOVO = 20000;
    private final int CONSTANTE_ANO_REFERENCIA_CARRO_NOVO = 2023;

    public Carro(String marca, String modelo, int ano, int potencia) {
        this.ano = ano;
        this.potencia = potencia;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = 0;
        this.km_rodados = 0;
    }

    public Carro(int potencia, int velocidade) {
        this.potencia = potencia;
        this.velocidade = velocidade;
    }

    public void acelerar(int aceleracao){
        this.velocidade += aceleracao;
        this.km_rodados += aceleracao;
    }

    public void reduzir() {
        while (velocidade > CONSTANTE_DESACELERACAO) {
            this.velocidade -= CONSTANTE_DESACELERACAO;
        }
    }

    private void parar(){
        this.velocidade = 0;
    }

    public void frear(){
        reduzir();
        parar();
    }

    public int getAno() {
        return ano;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean eCarroNovo(){
        return ((this.ano == CONSTANTE_ANO_REFERENCIA_CARRO_NOVO) || (km_rodados <= CONSTANTE_KM_CARRO_SEMINOVO));
    }

    // É considerado carro novo se a km_rodados é igual <=50
    // ou se o km_rodados é igual é menor que CONSTANTE_KM_CARRO_SEMINOVO
    // ou se o carro é do ano;

}

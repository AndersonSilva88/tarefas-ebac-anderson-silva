public class Carro {

    /**
     * atributos
     */

    private String marca;
    private int ano;
    private String modelo;
    private String cor;

    /**
     *
     * getters e setters
     */

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * metodos da classe
     */

    public void acelerar(){
        System.out.println("Acelerar carro");
    }

}

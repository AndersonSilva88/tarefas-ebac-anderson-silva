public class Car {
    private int potencia;
    private String combustivel;
    private String cor;

    public Car(int potencia, String combustivel, String cor) {
        this.potencia = potencia;
        this.combustivel = combustivel;
        this.cor = cor;
    }

    public void ligar() {
        System.out.println(getClass().getSimpleName());
        System.out.println("Ligar carro");
    }
    public void limpo() {
        System.out.println("Carro está limpo");
    }
    public void revisao() {
        System.out.println("Moto está ok");
    }
    public void tanqueCombustivel() {
        System.out.println("Tanque cheio");
    }

}

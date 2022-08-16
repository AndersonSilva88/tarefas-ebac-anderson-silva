import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Genero genero = new Genero();

        System.out.println("Digite seu nome e seu genero masculino/feminino");
        String nome = sc.next();

        genero.setNome(nome);

        if (nome.equals(",masculino")){
            genero.setMasculino(nome);
        } else {
            genero.setFeminino(nome);
        }

        List<Genero> lista = (List<Genero>) new Genero();

        lista.stream().forEach(genero1 -> System.out.println(genero1.getFeminino()));












    }
}

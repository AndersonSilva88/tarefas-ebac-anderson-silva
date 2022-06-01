import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tarefa2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome e seu Generoo masculino/feminino");
        String nome = sc.next();

        String[] genero = nome.split(",");

        List<String> lista = new ArrayList<String>(List.of(genero));

        System.out.println(lista);



    }
}

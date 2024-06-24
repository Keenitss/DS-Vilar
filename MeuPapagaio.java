import java.util.Scanner;

public class MeuPapagaio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o nome do seu papagaio?");
        
        Papagaio Loro = new Papagaio();
        Loro.setNome("Loro");
        Loro.idade = 5;
        Loro.setCor("verde");
        Loro.raca = "bolivia";

        Loro.cantar();

        System.out.println("O meu papagaio se chama " + Loro.getNome());
        System.out.println("A cor do meu papagaio é " + Loro.getCor());
    }
}

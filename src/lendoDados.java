import java.util.Scanner;

public class lendoDados {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in); // rastreia se fiz entrada de dados

        System.out.println("digite o filme que sedeja assitir");
        String filme = leitura.nextLine(); // variavel para ler o que vou  digitar

        System.out.println("qual é o ano de lançamento desse filme");
        int anoDelancamento = leitura.nextInt();

        System.out.println("qual a a nota que  você da para esse filme de 0 a 5 ");
        double notaFilme = leitura.nextDouble();

        System.out.println(filme); // comando que vai mostrar oque digitei
        System.out.println(anoDelancamento);
        System.out.println(notaFilme);

    }
}

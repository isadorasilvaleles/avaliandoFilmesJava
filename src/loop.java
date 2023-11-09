import java.util.Scanner;

public class loop {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;



        for (int i = 0; i < 3; i++) { // esse i++ significa incrementar em 1


          System.out.println("qual a a nota que  você da para esse filme de 0 a 5 ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota; //igual a ele mesmo mais a nota , é o que esse += significa

        }
            System.out.println("media avaliações" + mediaAvaliacao / 3);




    }
}



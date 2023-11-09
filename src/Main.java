public class Main {
    public static void main(String[] args) {

        int anoDeLancamento= 2023;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        //Média calculada pelas 3 notas da Jack, Paulo e Suelem
        double media = (9.8 + 6.3 + 8.0) /3;
        String sinopse ;
        sinopse = """
                o filme barbie é uma releitura da história da boneca loira 
                o ano de lançamento dele é 
                """ + anoDeLancamento ;
   System.out.println(sinopse);

   int classificacao = (int) (media /2);
   System.out.println(classificacao);

    }
}
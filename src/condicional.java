public class condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2023;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";


        if (anoDeLancamento >= 2022) {
            System.out.println("lançamentos que clientes estão curtindo");
        }
        else {
            System.out.println ("filme retro que vale a pena assistir");

        }

   if ((incluidoNoPlano == true) || tipoPlano.equals("plus")){

       System.out.println("filme liberado");
   }
    else {

       System.out.println("liberado para locação. consultar valores");

   }

    }
}

package br.com.alura.screenmatch.calc;

public class RateFilter {
    public void filter(Classify classify){
        if (classify.getRate() >= 4){
            System.out.println("Filme popular e bem avaliado!");
        } else if (classify.getRate() >= 2) {
            System.out.println("Avaliações razoáveis");
        } else {
            System.out.println("Mal avaliado.");
        }
    }
}
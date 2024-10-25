import br.com.alura.screenmatch.calc.RateFilter;
import br.com.alura.screenmatch.calc.TimeCalc;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;

public class Main {
    public static void main(String[] args) {

        //Filme
        Movie myMovie = new Movie("Clube da Luta", 140);
        myMovie.releaseYear = 1999;
        myMovie.rate(8);
        myMovie.rate(10);
        myMovie.showRateInfo();
        myMovie.showData();
        myMovie.calcMedia();

        //Série
        Serie mySeries = new Serie("Lost",3,10,40);

        //Filtragem
        RateFilter rateFilter = new RateFilter();
        rateFilter.filter(myMovie);

        //Calculo de tempo
        TimeCalc calculator = new TimeCalc();
        calculator.addMedia(myMovie);
        calculator.addMedia(mySeries);
        System.out.println("Soma de minutos: "  + calculator.getTotalTimeMinutes());

    }
}
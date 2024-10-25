package br.com.alura.screenmatch.models;
import br.com.alura.screenmatch.calc.Classify;

public class Movie extends Title implements Classify {

    public Movie(String name, int minutes){
        this.name = name;
        this.minutes = minutes;
    }

    @Override
    public int getRate() {
        return (int) calcMedia();
    }
}

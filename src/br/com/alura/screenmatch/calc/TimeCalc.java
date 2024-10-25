package br.com.alura.screenmatch.calc;
import br.com.alura.screenmatch.models.Title;

public class TimeCalc {
    private int totalTimeMinutes;

    public int getTotalTimeMinutes() {
        return totalTimeMinutes;
    }

    public void addMedia(Title title){
        this.totalTimeMinutes += title.getMinutes();
    }
}

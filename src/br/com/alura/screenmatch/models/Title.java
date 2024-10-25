package br.com.alura.screenmatch.models;

public class Title {

    String name;
    public int releaseYear;
    private double totalRate;
    private int  rateNumber;
    protected int minutes;


    public void showData(){
        System.out.println("Nome do Título: " + name);
        System.out.println("Data de Lançamento: " + releaseYear);
    }

    public void rate(double rate){
        rateNumber ++;
        totalRate += rate;
    }

    public double calcMedia(){
        return totalRate / rateNumber;
    }

    public void showRateInfo(){
        System.out.println("Soma total de avaliações: " + getTotalRate() + "\n"
                + "Número de avaliações: " + getRateNumber() + "!\n"
                + "Avaliação Final: " + calcMedia());
    }

    public double getTotalRate(){
        return totalRate;
    }

    public int getRateNumber() {
        return rateNumber;
    }

    public int getMinutes() {
        return minutes;
    }
}
package br.com.alura.screenmatch.models;

public class Serie extends Title {
    private int seasons;
    private int episodesPerSeason;
    private int minutesPerEpisode;

    public Serie(String name, int seasons, int episodesPerSeason, int minutesPerEpisode) {
        this.name = name;
        this.seasons = seasons;
        this.episodesPerSeason = episodesPerSeason;
        this.minutesPerEpisode = minutesPerEpisode;
    }

    @Override
    public int getMinutes() {
        return seasons * episodesPerSeason * minutesPerEpisode;
    }

}
package ch.iet_gibb.media.model;

import java.util.List;

public class Film extends Media {
    protected List<String> actors;
    protected String duration;

    public Film(String title,
                String year,
                List<String> genres,
                List<String> creators,
                boolean available,
                List<String> actors,
                String duration) {
        super(title, year, genres, creators, available);
        this.actors = actors;
        this.duration = duration;
    }

    public List<String> getActors() {
        return actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }
}

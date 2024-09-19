package ch.iet_gibb.media.model;

import java.util.List;

/**
 * Represents a film.
 *
 * @author Marjan Tomev
 * @version 1.0
 * @since 1.0
 */
public class Film extends Media {
    protected List<String> actors;
    protected String duration;

    /**
     * Creates a new film.
     *
     * @param title     the title of the film
     * @param year      the year of the film
     * @param genres    the genres of the film
     * @param creators  the creators of the film
     * @param available the availability of the film
     * @param actors    the actors of the film
     * @param duration  the duration of the film
     */
    public Film(String title,
                String year,
                List<String> genres,
                List<String> creators,
                boolean available,
                List<String> actors,
                String duration) {
        super(title, year, genres, creators);
        this.actors = actors;
        this.duration = duration;
    }

    /**
     * Returns the duration of the film.
     */
    public List<String> getActors() {
        return actors;
    }

    /**
     * Sets the duration of the film.
     */
    public void setActors(List<String> actors) {
        this.actors = actors;
    }
}

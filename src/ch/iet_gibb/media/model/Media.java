package ch.iet_gibb.media.model;

import java.util.ArrayList;
import java.util.List;

/**
 * The abstract Media class represents a generalized form of media content.
 * This class serves as the base for all specific types of media (e.g., books, movies, music),
 * providing common attributes and validation methods such as title, year of release, genres, creators,
 * and availability status.
 *
 * @author Cool Team
 * @version 0.1
 * @since 2024-09-05
 */
public abstract class Media {
    // General attributes shared by all media types
    private String title;
    private String year;
    private List<String> genres;
    private List<String> creators;
    private List<RentHistoryItem> rentHistory;
    private final String uuid;

    /**
     * Constructor to initialize the common attributes of media.
     *
     * @param title     The title of the media.
     * @param year      The year the media was released or published.
     * @param genres    A list of genres associated with the media.
     * @param creators  A list of creators (e.g., authors, directors).
     */
    public Media(String title, String year, List<String> genres, List<String> creators) {
        this.title = title;
        this.year = year;
        this.genres = genres;
        this.creators = creators;
        this.rentHistory = new ArrayList<RentHistoryItem>();
        this.uuid = java.util.UUID.randomUUID().toString();
    }

    /**
     * Validates and sets the title of the media.
     *
     * @param title The title to set (cannot be null or empty).
     * @throws IllegalArgumentException if the title is null or empty.
     */
    protected void checkTitle(String title) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("The title cannot be null or empty");
        }
    }

    public void setTitle(String title) {
        this.checkTitle(title);
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    /**
     * Validates and sets the year of release for the media.
     *
     * @param year The year to set (cannot be null or empty).
     * @throws IllegalArgumentException if the year is null or empty.
     */
    protected void checkYear(String year) {
        if (year == null || year.isEmpty()) {
            throw new IllegalArgumentException("The year cannot be null or empty");
        }
    }

    public void setYear(String year) {
        this.checkYear(year);
        this.year = year;
    }

    public String getYear() {
        return this.year;
    }

    /**
     * Validates and sets the genres associated with the media.
     *
     * @param genres A list of genres to set (cannot be null or empty).
     * @throws IllegalArgumentException if the genres list is null or empty.
     */
    protected void checkGenres(List<String> genres) {
        if (genres == null || genres.isEmpty()) {
            throw new IllegalArgumentException("The genres list cannot be null or empty");
        }
    }

    public void setGenres(List<String> genres) {
        this.checkGenres(genres);
        this.genres = genres;
    }

    public List<String> getGenres() {
        return this.genres;
    }

    /**
     * Validates and sets the creators of the media.
     *
     * @param creators A list of creators to set (cannot be null or empty).
     * @throws IllegalArgumentException if the creators list is null or empty.
     */
    protected void checkCreators(List<String> creators) {
        if (creators == null || creators.isEmpty()) {
            throw new IllegalArgumentException("The creators list cannot be null or empty");
        }
    }

    public void setCreators(List<String> creators) {
        this.checkCreators(creators);
        this.creators = creators;
    }

    public List<String> getCreators() {
        return this.creators;
    }

    /**
     * Returns a string representation of the media object.
     *
     * @return A string representation of the media object.
     */
    @Override
    public String toString() {
        return "Title: " + title + "\nYear: " + year + "\nGenres: " + genres + "\nCreators: " + creators + "\nAvailable: " + IsAvailable();
    }

    /**
     * Adds a new item to the history. Only works if there is no open rent.
     * @param item The new rent item to add.
     */
    public void addToRentHistory(RentHistoryItem item) {
        if (getCurrentRentFromHistory() == null) {
            rentHistory.add(item);
        }
    }

    /**
     * Gets the current rent from the history.
     * @return The current rent. If no open rent, returns null.
     */
    public RentHistoryItem getCurrentRentFromHistory() {
        if (rentHistory.isEmpty()) {
            return null;
        }
        RentHistoryItem lastItem = rentHistory.getLast();
        if (lastItem.GetGivenBackAt() == null) {
            return lastItem;
        }
        return null;
    }

    /**
     * Checks if the media is available from the history.
     * @return Boolean if it is available.
     */
    public boolean IsAvailable() {
        return getCurrentRentFromHistory() == null;
    }

    /**
     * Gets the uuid of the object.
     * @return The UUID as a string.
     */
    public String GetUuid() {
        return uuid;
    }
}

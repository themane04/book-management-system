package ch.iet_gibb.media.model;

import java.util.List;

public abstract class Media {
    private String title;
    private String year;
    private List<String> genres;
    private List<String> creators;
    private List<RentHistoryItem> rentHistory;
    private boolean available;

    public Media(String title, String year, List<String> genres, List<String> creators, boolean available) {
        this.title = title;
        this.year = year;
        this.genres = genres;
        this.creators = creators;
        this.available = available;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nYear: " + year + "\nGenres: " + genres + "\nCreators: " + creators + "\nAvailable: " + available;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setCreators(List<String> creators) {
        this.creators = creators;
    }

    public List<String> getCreators() {
        return creators;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }

    public void addToRentHistory(RentHistoryItem item) {
        if (getCurrentRentFromHistory() == null) {
            rentHistory.add(item);
        }
    }

    public RentHistoryItem getCurrentRentFromHistory() {
        RentHistoryItem lastItem = rentHistory.getLast();
        if (lastItem.GetGivenBackAt() == null) {
            return lastItem;
        }
        return null;
    }

    public boolean IsAvailable() {
        return getCurrentRentFromHistory() == null;
    }
}

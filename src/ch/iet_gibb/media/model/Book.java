package ch.iet_gibb.media.model;

import java.util.List;

/**
 * The Book class represents a specific type of media with additional attributes
 * relevant to books, such as ISBN and the number of pages.
 * It extends the Media class, inheriting general media attributes like title,
 * year of publication, genres, and creators.
 *
 * @author Cool Team
 * @version 0.1
 * @since 2024-09-19
 */

public class Book extends Media {
    private String isbn;
    private int pages;

    /**
     * Constructor to create a Book object.
     *
     * @param title     The title of the book.
     * @param year      The year the book was published.
     * @param genres    A list of genres the book belongs to.
     * @param creators  A list of creators (e.g., authors) of the book.
     * @param isbn      The ISBN of the book (must be 13 characters long).
     * @param pages     The number of pages in the book (must be greater than 0).
     */
    public Book(String title, String year, List<String> genres, List<String> creators, String isbn, int pages) {
        super(title, year, genres, creators); // Calling the superclass constructor (Media)
        this.setIsbn(isbn);  // Set the ISBN using a setter with validation
        this.setPages(pages);  // Set the page count using a setter with validation
    }

    /**
     * Validates the given ISBN.
     *
     * @param isbn The ISBN to check.
     * @throws IllegalArgumentException if the ISBN is not 13 characters long.
     */
    protected void checkIsbn(String isbn) {
        if (isbn.length() != 13) {
            throw new IllegalArgumentException("The ISBN must be 13 characters long");
        }
    }

    /**
     * Sets the ISBN for the book after validating it.
     *
     * @param isbn The ISBN to set (must be 13 characters long).
     */
    public void setIsbn(String isbn) {
        this.checkIsbn(isbn);
        this.isbn = isbn;
    }

    /**
     * Returns the ISBN of the book.
     *
     * @return The ISBN.
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Validates the number of pages.
     *
     * @param pages The number of pages to check.
     * @throws IllegalArgumentException if the number of pages is less than or equal to 0.
     */
    protected void checkPages(int pages) {
        if (pages <= 0) {
            throw new IllegalArgumentException("The number of pages cannot be 0 or less");
        }
    }

    /**
     * Sets the number of pages for the book after validation.
     *
     * @param pages The number of pages to set (must be greater than 0).
     */
    public void setPages(int pages) {
        this.checkPages(pages);
        this.pages = pages;
    }

    /**
     * Returns the number of pages in the book.
     *
     * @return The number of pages.
     */
    public int getPages() {
        return pages;
    }

    /**
     * Overrides the toString method to return a formatted string representation of the book,
     * including the ISBN and page count, in addition to the media information.
     *
     * @return The string representation of the book.
     */
    @Override
    public String toString() {
        String book = String.format("\nISBN: %s\nPages Count: %s", this.isbn, this.pages);
        return super.toString() + book;
    }
}

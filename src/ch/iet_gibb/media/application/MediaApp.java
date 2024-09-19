package ch.iet_gibb.media.application;

import ch.iet_gibb.media.model.Book;
import ch.iet_gibb.media.model.Film;

import java.util.List;

public class MediaApp {
    public static void main(String[] args) {
        Book book = new Book("The Lord of the Rings", "1955", List.of("Fantasy"), List.of("J.R.R. Tolkien"),  "978-3-86680-1", 1178);
        Film film = new Film("The Lord of the Rings: The Fellowship of the Ring", "2001", List.of("Fantasy"), List.of("Peter Jackson"), true, List.of("Elijah Wood", "Ian McKellen", "Viggo Mortensen"), "178 min");
        System.out.println();
        System.out.println("Book");
        System.out.println(book);
        System.out.println();
        System.out.println("Film");
        System.out.println(film);
    }
}
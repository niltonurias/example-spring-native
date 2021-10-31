package io.github.niltonurias.examplespringnative.book;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Repository
public class BookRepository {
    private static List<Book> books = Arrays.asList(new Book(UUID.randomUUID(), "Harry Potter and the Philosopher's Stone", "J. K. Rowling"),
                                                    new Book(UUID.randomUUID(), "The Wonderful Wizard of Oz", "L. Frank Baum"),
                                                    new Book(UUID.randomUUID(), "Assassin's Creed The Secret Crusade", "Oliver Bowden, Christie Golden, Matthew Kirby and Gordon Doherty"));


    public List<Book> findAll() {
        return books;
    }
}

package com.graphqljava.tutorial.bookDetails;

import java.util.Arrays;
import java.util.List;

public class Book {

    private final String id;
    private final String authorId;
    private final String name;
    private final int pageCount;

    public Book(String id, String name, int pageCount, String authorId) {
        this.id = id;
        this.authorId = authorId;
        this.name = name;
        this.pageCount = pageCount;
    }

//    hard coded list
    private static List<Book> books = Arrays.asList(
            new Book("book-1", "Harry Potter and the Philosopher's Stone", 223, "author-1"),
            new Book("book-2", "Moby Dick", 635, "author-2"),
            new Book("book-3", "Interview with the vampire", 371, "author-3")
    );

    public static Book getById(String id) {
        return books.stream().filter(book -> book.getId().equals(id)).findFirst().orElse(null);
    }

    public String getId() {
        return id;
    }

    public String getAuthorId() {
        return authorId;
    }
}

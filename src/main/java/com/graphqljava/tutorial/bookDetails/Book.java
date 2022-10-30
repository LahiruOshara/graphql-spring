package com.graphqljava.tutorial.bookDetails;

import java.util.Arrays;
import java.util.List;

public class Book {

    private final String id;
    private final String authorId;

    public Book(String id, String authorId) {
        this.id = id;
        this.authorId = authorId;
    }

//  hard coded list of books
    private static final List<Book> books = Arrays.asList(
            new Book("book-1", "author-1"),
            new Book("book-2", "author-2"),
            new Book("book-3", "author-3")
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

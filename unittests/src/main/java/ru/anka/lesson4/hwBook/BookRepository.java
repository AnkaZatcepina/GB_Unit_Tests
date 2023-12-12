package ru.anka.lesson4.hwBook;

import java.util.List;

public interface BookRepository {
    Book findById(String id);
    List<Book> findAll();
}

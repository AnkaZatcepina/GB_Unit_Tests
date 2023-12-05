package ru.anka.lesson4.hwBook;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

import java.util.List;

public class BookServiceTest {
    @Test
    void testFindBookByIdWithMock() {
        // Создаем имитацию (мок) для интерфейса BookRepository
        BookRepository bookRepository = mock(InMemoryBookRepository.class);

        // Создаем экземпляр BookService с имитацией BookRepository
        BookService bookService = new BookService(bookRepository);

        // Задаем ожидаемый результат
        String id = "2";
        String id2 = "5";

        // Вызываем метод findBookById
        Book book = bookService.findBookById(id);
        Book book2 = bookService.findBookById(id2);
        
        // Проверяем, что метод findById был вызван с правильными аргументами
        verify(bookRepository).findById(id);

        // Проверяем, что метод findById был вызван 2 раза
        Mockito.verify(bookRepository, Mockito.times(2)).findById(Mockito.any());
    }    


    @Test
    void testfindAllBooksWithMock() {
        // Создаем имитацию (мок) для интерфейса BookRepository
        BookRepository bookRepository = mock(InMemoryBookRepository.class);

        // Создаем экземпляр BookService с имитацией BookRepository
        BookService bookService = new BookService(bookRepository);

        // Вызываем метод findAllBooks
        List<Book> books = bookService.findAllBooks();
        
        // Проверяем, что метод findAll был вызван
        verify(bookRepository).findAll();

        // Проверяем, что метод findById не вызывался
        verify(bookRepository, never()).findById(Mockito.any());

    }    
}

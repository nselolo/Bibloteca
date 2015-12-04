package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.*;

public class BookTest {

    Book book;

    @Before
    public void setUp() throws Exception {
        book = new Book("Maru","ML.Semoni","2001");
    }

    @Test
    public void shouldPrintBookTitleAuthorYearPublished() throws Exception {
    assertTrue(Objects.equals(book.toString(), "Maru ML.Semoni 2001"));
    }

    @Test
    public void shouldReturntTitleOfThebook() throws Exception {
    assertEquals(book.getTitle().equals("Maru"),true);
    }

    @Test
    public void shouldReturnAuthorName() throws Exception {
        assertEquals(book.getAuthorName().equals("ML.Semoni"),true);
    }

    @Test
    public void shouldReturnYearPublished() throws Exception {
        assertEquals(book.getYear().equals("2001"),true);
    }
}
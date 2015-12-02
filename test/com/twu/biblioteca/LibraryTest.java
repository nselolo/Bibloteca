package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class LibraryTest {

    Library library;
    Book book;

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();


    @Before
    public void setUp() throws Exception {
        library = new Library(new Menu());

        book = new Book("Romeo and Juliet", "MLSihle", "2000");

        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    public void shouldContainABookTittledRomeoAndJuliet() throws Exception {
        library.checkOutBook(1);
        assertTrue(library.getCheckedBook().contains(book));
    }

    @Test
    public void shouldNotContainABookTittledRomeoAndJuliet() throws Exception {
        library.checkOutBook(1);
        assertFalse(library.getAllBooks().contains(book));
    }


    @Test
    public void testPrintWelcomeMessage() throws Exception {
        assertEquals(library.printWelcomeMessage(), "Welcome to Library, the system is now available");
    }

    @Test
    public void shouldCheckTheSizeOfAllBooks() throws Exception {
        assertTrue("All books are more than 0", library.getAllBooks().size() > 0);
    }

    @Test
    public void testReturnBooks() throws Exception {
        library.checkOutBook(1);
        library.ReturnBook(1);
        assertTrue(library.getAllBooks().contains(book));
    }


    @Test
    public void shouldNotContainReturnedBook() throws Exception {
        library.checkOutBook(1);
        library.ReturnBook(1);
        assertFalse(library.getCheckedBook().contains(book));
    }

    @Test
    public void testPrintBooks() throws Exception {

        String Output = " List of All Books ****************\n\n" +
                "Title |Author |Year published\n" +
                 "1. Romeo and Juliet MLSihle 2000\n" +
                "2. Maru MLSithole 2013\n" +
                "3. Ditau tsa teng MLLekau 1999\n";

        library.PrintBooks(library.getAllBooks());
        assertEquals(outContent.toString(), Output);
    }
}
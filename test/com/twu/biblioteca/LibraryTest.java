package com.twu.biblioteca;

import com.sun.tools.javac.code.Attribute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class LibraryTest {

    Library library;
    LibraryItem book;
    LibraryItem movie;

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();


    @Before
    public void setUp() throws Exception {
        library = new Library(new Menu());

        book = new Book("Romeo and Juliet", "MLSihle", "2000");
        movie = new Movie("Skeem Sam","2010","Lehlokwa");

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
        library.checkOutItem(1);
        assertTrue(library.getCheckedItem().contains(book));
    }

    @Test
    public void shouldNotContainABookTittledRomeoAndJuliet() throws Exception {
        library.checkOutItem(1);
        assertFalse(library.getLibraryItems().contains(book));
    }


    @Test
    public void testPrintWelcomeMessage() throws Exception {
        assertEquals(library.printWelcomeMessage(), "Welcome to Library, the system is now available");
    }

    @Test
    public void shouldCheckTheSizeOfAllBooks() throws Exception {
        assertTrue("All books are more than 0", library.getLibraryItems().size() > 0);
    }

    @Test
    public void testReturnBooks() throws Exception {
        library.checkOutItem(1);
        library.ReturnItem(1);
        assertTrue(library.getLibraryItems().contains(book));
    }


    @Test
    public void shouldNotContainReturnedBook() throws Exception {
        library.checkOutItem(1);
        library.ReturnItem(1);
        assertFalse(library.getCheckedItem().contains(book));
    }

    @Test
    public void testPrintBooks() throws Exception {

        String Output = " Available Books ****************\n\n" +
                "Title |Author |Year published\n" +
                 "1. Romeo and Juliet MLSihle 2000\n" +
                "2. Maru MLSithole 2013\n" +
                "3. Ditau tsa teng MLLekau 1999\n";

        library.PrintBooks(library.getLibraryItems());
        assertEquals(outContent.toString(), Output);
    }

    @Test
    public void shouldCheckoutMovieFromLibraryItems() throws Exception {
        library.checkOutItem(5);
        library.ReturnItem(1);
        assertFalse(library.getCheckedItem().contains(movie));
    }


    @Test
    public void testPrintMovies() throws Exception {

        String Output = " Available Movies ****************\n\n" +
                "Title | Director | Year Released\n" +
                "1. World war Z 2013 Jeff\n" +
                "2. Majaneng 2009 Thabiso\n" +
                "3. Skeem Sam 2010 Lehlokwa\n";

        library.PrintMovies(library.getLibraryItems());
        assertEquals(outContent.toString(), Output);
    }
}
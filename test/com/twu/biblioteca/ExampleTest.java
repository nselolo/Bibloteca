package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;


public class ExampleTest {

    @Test
    public void test() {
        assertEquals(1, 1);
    }

    @Test
    public void testWelcomeScreen()
    {
        Biblioteca library = new Biblioteca();
        assertEquals(library.printWelcomeMessage(),"Welcome to Biblioteca, the system is now available");
    }

   @Test
    public void testAvailableBookList()
    {
        Biblioteca library = new Biblioteca();
        assertTrue(library.getAllBooks().get(0).getBookTitle().equals("Romeo and Juliet"));
        assertTrue(library.getAllBooks().get(1).getAuthorName().equals("MLSithole"));
        assertTrue(library.getAllBooks().get(2).getYearPublished().equals("1999"));
    }

    @Test
    public void shouldHaveAuthourNameMLSihleAndYearPublished2000() throws Exception
    {
        Biblioteca library = new Biblioteca();
        assertEquals(library.getAllBooks().get(1).getAuthorName(),"MLSihle");
        assertEquals(library.getAllBooks().get(1).getYearPublished(),"2000");
    }


}

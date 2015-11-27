package com.twu.biblioteca;

public class Book
{
    @Override
    public String toString() {
       return this.bookTitle +" "+this.authorName+" "+this.YearPublished;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (!bookTitle.equals(book.bookTitle)) return false;
        if (!authorName.equals(book.authorName)) return false;
        return YearPublished.equals(book.YearPublished);

    }

    @Override
    public int hashCode() {
        int result = bookTitle.hashCode();
        result = 31 * result + authorName.hashCode();
        result = 31 * result + YearPublished.hashCode();
        return result;
    }

    private String bookTitle;
    private String authorName;
    private String YearPublished;

    public Book(String bookTitle, String authorName, String yearPublished) {
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        YearPublished = yearPublished;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getYearPublished() {
        return YearPublished;
    }
}

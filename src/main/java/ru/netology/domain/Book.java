package ru.netology.domain;

import java.util.Objects;

public class Book extends Product {
    private String author;
    private String bookTitle;

    public Book() {
        super();
    }

    public Book(int id, String name, int price, String author, String bookTitle) {
        super(id, name, price);
        this.author = author;
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookTitle() {return bookTitle; }

        public void setBookTitle(String bookTitle){
            this.bookTitle = bookTitle;
        }
        @Override
        public boolean equals (Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            Book book = (Book) o;
            return  bookTitle == book.getBookTitle()&&
                    Objects.equals(author, book.bookTitle);
        }

        @Override
        public int hashCode () {
            return Objects.hash(super.hashCode(), author, bookTitle);
        }

        @Override
        public String toString () {
            return "Book{" +
                    "author='" + author + '\'' +
                    ", bookTitle=" + bookTitle +
                    '}';
        }
    }


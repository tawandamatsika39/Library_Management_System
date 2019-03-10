/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.sql.Date;

/**
 *
 * @author tmatsika39
 */
public class Book {
    
    private String barcode;
    private String isbn;
    private String title;
    private String author;
    private int edition;
    private String subject;
    private byte [] pic;
    private String status;
    private String borrowerID;
    private Date due_date;

    public Book(String barcode, String isbn, String title, String author, int edition, String subject, byte[] pic, String status, String borrowerID, Date due_date) {
        this.barcode = barcode;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.edition = edition;
        this.subject = subject;
        this.pic = pic;
        this.status = status;
        this.borrowerID = borrowerID;
        this.due_date = due_date;
    }

    public Book(String barcode, String isbn, String title, String author, int edition, String subject, byte[] pic, String status) {
        this.barcode = barcode;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.edition = edition;
        this.subject = subject;
        this.pic = pic;
        this.status = status;
    }

    public Book(String barcode, String isbn, String title, String author, int edition, String subject, String status, String borrowerID) {
        this.barcode = barcode;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.edition = edition;
        this.subject = subject;
        this.status = status;
        this.borrowerID = borrowerID;
    }

    public Book(String barcode, String isbn, String title, String author, int edition, String subject, byte[] pic, String status, String borrowerID) {
        this.barcode = barcode;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.edition = edition;
        this.subject = subject;
        this.pic = pic;
        this.status = status;
        this.borrowerID = borrowerID;
    }

    
    
    //GETTERS
    public String getBarcode() {
        return barcode;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getEdition() {
        return edition;
    }

    public String getSubject() {
        return subject;
    }

    public byte[] getPic() {
        return pic;
    }

    public String getStatus() {
        return status;
    }

    public String getBorrowerID() {
        return borrowerID;
    }
    //SETTERS
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setPic(byte[] pic) {
        this.pic = pic;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setBorrowerID(String borrowerID) {
        this.borrowerID = borrowerID;
    }

    @Override
    public String toString() {
        return "Book{" + "barcode=" + barcode + ", isbn=" + isbn + ", title=" + title + ", author=" + author + ", edition=" + edition + ", subject=" + subject + ", status=" + status + '}';
    }
    
    
    
    
}

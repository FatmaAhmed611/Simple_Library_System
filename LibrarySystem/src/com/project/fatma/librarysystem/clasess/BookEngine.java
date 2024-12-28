/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.fatma.librarysystem.clasess;

/**
 *
 * @author fatma
 */
public class BookEngine {
    private String bookName;
    private String bookNumber;
    private String bookAuthor;
    private boolean bookAvailability;

    public String getBookName() {
        return bookName;
    }

    public String getBookNumber() {
        return bookNumber;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public boolean isBookAvailabelity() {
        return bookAvailability;
    }
    
    public BookEngine(String bookName,String bookAuthor,String bookNumber,boolean bookAvaailabelity){
        this.bookName=bookName;
        this.bookNumber=bookNumber;
        this.bookAuthor=bookAuthor;
        this.bookAvailability=bookAvailability;
    }
    public BookEngine(String bookName,String bookAuthor,String bookNumber){
        this.bookName=bookName;
        this.bookNumber=bookNumber;
        this.bookAuthor=bookAuthor;
        this.bookAvailability=true;
    }
    public boolean isAvailable(){
        return bookAvailability;
    }
    public void borrowBook(){
        if(bookAvailability==true){
            bookAvailability=false;
            System.out.println("This book is available to you Mr.");
        }else{
            System.out.println("Sorry, this book is currently not available.");
        }
    }
    public void returnBook(){
        bookAvailability=true;
        System.out.println("This book return succesfully.");
    }
    
}

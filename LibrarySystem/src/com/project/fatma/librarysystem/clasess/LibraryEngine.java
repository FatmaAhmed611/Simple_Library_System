/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.fatma.librarysystem.clasess;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fatma
 */
public class LibraryEngine {
    private List<BookEngine>books;
    private List<MemberEngine>members;
   
    public LibraryEngine(){
        books=new ArrayList<>();
        members=new ArrayList<>();
    }
    public void addBook(BookEngine book){
        books.add(book);
    }
    public void addMember(MemberEngine member){
        members.add(member);
    }
    
    public BookEngine findBookByTitle(String title){
        for(BookEngine book:books){
            if(book.getBookName().equalsIgnoreCase(title)){
                return book;
            }
        }
        return null;
    }
    
    public BookEngine findBookByName(String number){
        for(BookEngine book:books){
            if(book.getBookName().equalsIgnoreCase(number)){
                return book;
            }
        }
        return null;
    }
    
    public MemberEngine findMember(String name){
        for(MemberEngine member:members){
            if(member.getMemberName().equalsIgnoreCase(name)){
                return member;
            }
        }
        return null;
    }
    
    public List<BookEngine> listAvailableBooks() {
        List<BookEngine> availableBooks = new ArrayList<>();
        for (BookEngine book : books) {
            if (book.isAvailable()) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }
    
}

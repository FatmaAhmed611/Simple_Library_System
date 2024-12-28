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
public class MemberEngine {
    
    private String memberName;
    private String memberID;
    private List<BookEngine>borrowBooks;
    private static int numberOfBorrowBooks=0;
    public MemberEngine(String memberName,String memberID){
        this.memberName=memberName;
        this.memberID=memberID;
        this.borrowBooks=new ArrayList<>();
    }

    public String getMemberName() {
        return memberName;
    }
    
    public void borrowBook(BookEngine book){
        if(book.isAvailable()){
            book.borrowBook();
            borrowBooks.add(book);
        } else {
            System.out.println("Book is currently not available.");
        }
            
            
    }
    public void returnBook(BookEngine book){
        
       if(borrowBooks.contains(book)){
           borrowBooks.remove(book);
           book.returnBook();
       }else {
            System.out.println("This book is not borrowed by you.");
        }
    }
}

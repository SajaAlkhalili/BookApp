package edu.birzeit.students.bookapp;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private ArrayList<Book>books=new ArrayList<>();
    public DataBase(){
        books.add(new Book("software Engineering","Iyan Sommervile","software engineering"));
        books.add(new Book("Professional Android","Jhon","Programming"));
        books.add(new Book("Java Book","Ali","java"));
        books.add(new Book("os","Iad","Programming"));


    }
    public List<Book>getBook(String cat){
        ArrayList<Book>result=new ArrayList<>();
        for(Book b:books){
            if(b.getCategory().equals(cat)){
                result.add(b);
            }
        }
        return result;
    }

}

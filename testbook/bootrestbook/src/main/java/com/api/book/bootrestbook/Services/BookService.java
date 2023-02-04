package com.api.book.bootrestbook.Services;

import java.util.*;

import org.springframework.stereotype.Component;

import com.api.book.bootrestbook.dao.BookRepository;
import com.api.book.bootrestbook.entities.*;

@Component
public class BookService {
    // private static List<Book> list=new ArrayList<>();

    // static{
    //     list.add(new Book(12,"java","abc"));
    //     list.add(new Book(13,"python","xyz"));
    //     list.add(new Book(14,"php","pqr"));
    // }
    private BookRepository bookrepository;

    //get all book
    public List<Book> getAllBook()
    {
        List<Book> list=(List<Book>)this.bookrepository.findAll();
        return list;
    }

    //get single book by id
    public Book getBookById(int id)
    {
            Book book=null;
            try
            {
                book=this.bookrepository.findById(id);
            }catch(Exception e){
                e.printStackTrace();
            }
            return book;
            // book=list.stream().filter(e->e.getId()==id).findFirst().get();
            // return book;
    }

    public Book addBook(Book b)
    {
        Book result=bookrepository.save(b);
        return result;
    }

    public void deleteBook(int bid)
    {
        bookrepository.deleteById(bid);
    }

    public void updateBook(Book book,int bookid)
    {
        book.setId(bookid);
        bookrepository.save(book);
    }

}

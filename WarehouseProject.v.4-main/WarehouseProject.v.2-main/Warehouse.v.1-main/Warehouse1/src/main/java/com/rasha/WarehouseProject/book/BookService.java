package com.rasha.WarehouseProject.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;


   protected Book saveBook(Book book) {
        return bookRepository.save(book);
    }
   public Book delitBook(Long id){
     bookRepository.deleteById(id);
       return null;
}
  public Book editeBook(Book book){
        return bookRepository.save(book);

 }
  public Iterable<Book>getAllBooks(){
     return  bookRepository.findAll();

}
    public Book getBookById(Long id) {
        return bookRepository.findById(id).get();
    }


//    public Book findByName(String name){
//      return bookRepository.findByName(name);
//
//    }
}



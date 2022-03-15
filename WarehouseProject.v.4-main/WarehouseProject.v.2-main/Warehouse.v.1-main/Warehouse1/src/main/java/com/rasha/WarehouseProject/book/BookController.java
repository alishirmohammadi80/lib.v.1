package com.rasha.WarehouseProject.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/book")
    public String listBook (Model model){
        model.addAttribute("book",bookService.getAllBooks());
        return "book";
    }

    @GetMapping("/book/new")
    public String addBookForm(Model model){
        Book book=new Book();
        model.addAttribute("book",book);
        return "add_book";

    }
   @PostMapping("/book")
 public String addBook( @ModelAttribute("book") Book book){
    bookService.saveBook(book);
    return "redirect:/book";
 }
 @GetMapping("/book/edit/{id}")
    public String editBookForm(@PathVariable Long id ,Model model){
        model.addAttribute("book", bookService.getBookById(id));
        return "edite_book";
    }
@PostMapping("/book/{id}")
    public String editBook(@PathVariable Long id, @ModelAttribute("book")Book book){
Book editebook=bookService.getBookById(id);
editebook.setId(id);
editebook.setBookName(book.getBookName());
editebook.setNumberOfPage(book.getNumberOfPage());
 editebook.setAuthorName(book.getAuthorName());
editebook.setPublisher(book.getPublisher());
bookService.editeBook(editebook);
return "redirect:/book";

}
@GetMapping("/book/{id}")
public String delitBook( @PathVariable Long id){
     bookService.delitBook(id);
     return "redirect:/book";
}
   // @GetMapping("/book/{name}")
   // public String serchBook( @PathVariable String name) {
   //     bookService.findByName(name);
   //     return "redirect:/book";

   // }
}

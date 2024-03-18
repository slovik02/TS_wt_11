package ib.ts_2.controller;

import ib.ts_2.entity.Book;
import ib.ts_2.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/book")
public class BookController {

    private final BookRepository bookRepository;

    @Autowired
    public BookController(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }
    @PostMapping("/add")
    public @ResponseBody Book addBook(@RequestBody Book book){
        return bookRepository.save(book);
    }

    @GetMapping("/getAll")
    public @ResponseBody Iterable<Book> getAllBooks(){
        return bookRepository.findAll();
    }

}

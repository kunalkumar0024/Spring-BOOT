package com.kunal.jpaMap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kunal.jpaMap.entity.Book1Entity;
import com.kunal.jpaMap.entity.Book1POJO;
import com.kunal.jpaMap.service.BookService;

@RestController
@RequestMapping(value = "/book")
public class BookController {


	@Autowired
    private BookService bookService;
	
    @PostMapping("/savebook")
    @ResponseBody
    public Book1POJO saveBook1(@RequestBody Book1Entity book1) {
        Book1Entity book1Response = bookService.saveBook1(book1);
        System.out.println(book1Response.toString());
        Book1POJO book= EntityConvertToPOJO(book1Response);
        
        return book;
    }
    
    
    private Book1POJO EntityConvertToPOJO(Book1Entity book1Response) {
		Book1POJO book=new Book1POJO();
		book.setBook1Id(book1Response.getBook1Id());
		book.setBook1Name(book1Response.getBook1Name());
		book.setStory(book1Response.getStory());
		return book;
	}


	@GetMapping("/get-id/{book1Id}")
    @ResponseBody
    public Book1Entity getBook1Details(@PathVariable("book1Id") @RequestBody int book1Id) {
        Book1Entity book1Response = bookService.findByBook1Id(book1Id);
        return book1Response;
    }
//    @PostMapping("/save")
//    
//    public String saveBook2(@RequestBody Book1 book) {
//    	bookService.saveBook1(book);
//    	return "Book Saved";
//    }
}

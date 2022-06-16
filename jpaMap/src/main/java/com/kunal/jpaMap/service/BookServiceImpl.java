package com.kunal.jpaMap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kunal.jpaMap.entity.Book1Entity;
import com.kunal.jpaMap.entity.Story;
import com.kunal.jpaMap.repository.BookRepository;
@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
    private BookRepository bookRepository;

	
	public Book1Entity saveBook1(Book1Entity book1) {
		Story story = book1.getStory();
		
  System.out.println(book1.getStory());    
  story.setBook(book1);
        book1 = bookRepository.save(book1);
        return book1;
	}

	public Book1Entity findByBook1Id(int book1Id) {
		Book1Entity book1 = bookRepository.findByBook1Id(book1Id);
        return book1;
	}

}

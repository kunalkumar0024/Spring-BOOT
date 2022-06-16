package com.kunal.jpaMap.service;

import org.springframework.stereotype.Service;

import com.kunal.jpaMap.entity.Book1Entity;

@Service
public interface BookService {
	
	public Book1Entity saveBook1(Book1Entity book1);
    public Book1Entity findByBook1Id(int book1Id);

}

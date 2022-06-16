package com.kunal.jpaMap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kunal.jpaMap.entity.Book1Entity;
@Repository
public interface BookRepository extends JpaRepository<Book1Entity, String> {
	
	public Book1Entity findByBook1Id(int book1Id);


}

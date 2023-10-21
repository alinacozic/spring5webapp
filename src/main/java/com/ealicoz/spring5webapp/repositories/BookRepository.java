package com.ealicoz.spring5webapp.repositories;

import com.ealicoz.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}

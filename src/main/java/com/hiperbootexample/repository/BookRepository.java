package com.hiperbootexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hiperboot.db.repository.HiperBootRepository;
import com.hiperbootexample.entity.Book;

public interface BookRepository extends HiperBootRepository<Book>, JpaRepository<Book, Long> {
}

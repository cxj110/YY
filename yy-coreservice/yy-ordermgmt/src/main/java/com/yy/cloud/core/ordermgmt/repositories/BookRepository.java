package com.yy.cloud.core.ordermgmt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.yy.cloud.core.ordermgmt.data.domain.Book;

import java.util.List;

//@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface BookRepository extends JpaRepository<Book, Long> {
    // TODO: Replace with @Param("name") when Spring Data Neo4j supports names vs. positional arguments
    List<Book> findByStoreName(@Param("0") String name);
    List<Book> findByCreatorId(@Param("0") Long id);
    List<Book> findAll();
}

package com.yy.cloud.core.ordermgmt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.yy.cloud.core.ordermgmt.data.domain.Book;
import com.yy.cloud.core.ordermgmt.data.domain.Bookdetail;

import java.util.List;

//@RepositoryRestResource(collectionResourceRel = "content", path = "content")
public interface BookDetailRepository extends JpaRepository<Bookdetail, Long> {
    List<Bookdetail> findByBook(@Param("0") Book book);
}

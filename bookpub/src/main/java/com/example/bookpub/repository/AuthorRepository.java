package com.example.bookpub.repository;

import com.example.bookpub.entity.Author;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by hongtao on 16/4/26.
 */
@RepositoryRestResource
public interface AuthorRepository extends PagingAndSortingRepository<Author, Long> {
}

package com.example.bookpub.repository;

import com.example.bookpub.entity.Publisher;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by hongtao on 16/4/26.
 */
public interface PublisherRepository extends PagingAndSortingRepository<Publisher, Long> {
}

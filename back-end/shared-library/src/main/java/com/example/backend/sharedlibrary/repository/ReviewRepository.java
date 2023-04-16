package com.example.backend.sharedlibrary.repository;

import com.example.backend.sharedlibrary.model.Review;
import com.example.backend.sharedlibrary.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findAllByISBN(String ISBN);
    List<Review> findAllByUser(User user);

}

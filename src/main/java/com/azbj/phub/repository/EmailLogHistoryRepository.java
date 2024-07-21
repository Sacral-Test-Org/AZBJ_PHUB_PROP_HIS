package com.azbj.phub.repository;

import com.azbj.phub.model.EmailLogHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailLogHistoryRepository extends JpaRepository<EmailLogHistory, Long> {
    // No additional methods required as JpaRepository provides all necessary CRUD operations
}
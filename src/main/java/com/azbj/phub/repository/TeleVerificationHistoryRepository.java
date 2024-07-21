package com.azbj.phub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.azbj.phub.model.TeleVerificationHistory;

public interface TeleVerificationHistoryRepository extends JpaRepository<TeleVerificationHistory, Long> {
}

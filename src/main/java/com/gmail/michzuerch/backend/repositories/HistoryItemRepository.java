package com.gmail.michzuerch.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gmail.michzuerch.backend.data.entity.HistoryItem;

public interface HistoryItemRepository extends JpaRepository<HistoryItem, Long> {
}

// File: com.lostfound.backend.repository.LostItemRepository.java

package com.lostfound.backend.repository;

import com.lostfound.backend.model.LostItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LostItemRepository extends JpaRepository<LostItem, Long> {
}

package com.ministry;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface PrayerRepository extends JpaRepository<Prayer, Long> {
    List<Prayer> findAllByOrderByCreatedAtDesc();
}

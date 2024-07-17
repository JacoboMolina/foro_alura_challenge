package com.example.foroalura.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.foroalura.model.Topic;

public interface TopicRepository extends JpaRepository<Topic, Long> {
}

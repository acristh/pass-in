package com.arawebdigital.passin.repositories;

import com.arawebdigital.passin.domain.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, String> {
}

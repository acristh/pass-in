package com.arawebdigital.passin.repositories;

import com.arawebdigital.passin.domain.checkin.Checkin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckinRepository extends JpaRepository<Checkin, Integer> {
}

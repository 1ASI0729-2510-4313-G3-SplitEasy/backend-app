package com.example.spliteasybackend.bill.infrastructure.persistance.jpa.repositories;

import com.example.spliteasybackend.bill.domain.models.aggregates.Bill;
import com.example.spliteasybackend.bill.domain.models.repositories.BillRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaBillRepository extends JpaRepository<Bill, Long>, BillRepository {
}

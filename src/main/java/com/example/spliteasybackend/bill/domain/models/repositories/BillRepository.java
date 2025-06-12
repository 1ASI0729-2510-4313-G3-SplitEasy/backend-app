package com.example.spliteasybackend.bill.domain.models.repositories;

import com.example.spliteasybackend.bill.domain.models.aggregates.Bill;

import java.util.List;

public interface BillRepository {
    Bill save(Bill bill);
    List<Bill> findAll();
}

package com.example.spliteasybackend.bill.application.dto;

import com.example.spliteasybackend.bill.domain.models.aggregates.Bill;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
public class BillResponse {
    private Long id;
    private Long householdId;
    private String description;
    private BigDecimal monto;
    private Long createdBy;
    private LocalDate fecha;

    public BillResponse(Bill bill) {
        this.id = bill.getId();
        this.householdId = bill.getHouseholdId();
        this.description = bill.getDescripcion();
        this.monto = bill.getMonto();
        this.createdBy = bill.getCreatedBy();
        this.fecha = bill.getFecha();
    }
}

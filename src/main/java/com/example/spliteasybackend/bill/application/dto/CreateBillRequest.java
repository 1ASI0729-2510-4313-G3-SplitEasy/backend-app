package com.example.spliteasybackend.bill.application.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class CreateBillRequest {
    private Long id;
    private Long householdId;
    private String description;
    private BigDecimal monto;
    private Long createdBy;
    private LocalDate fecha;
}

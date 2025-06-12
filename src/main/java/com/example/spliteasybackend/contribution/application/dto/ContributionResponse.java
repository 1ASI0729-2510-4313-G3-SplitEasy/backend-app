package com.example.spliteasybackend.contribution.application.dto;

import com.example.spliteasybackend.contribution.domain.models.aggregates.Contribution;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class ContributionResponse {
    private Long id;
    private Long billId;
    private Long householdId;
    private String description;
    private LocalDate fechaLimite;
    private Contribution.Strategy strategy;

    public ContributionResponse(Contribution contribution) {
        this.id = contribution.getId();
        this.billId = contribution.getBillId();
        this.householdId = contribution.getHouseholdId();
        this.description = contribution.getDescripcion();
        this.fechaLimite = contribution.getFechaLimite();
        this.strategy = contribution.getStrategy();
    }
}

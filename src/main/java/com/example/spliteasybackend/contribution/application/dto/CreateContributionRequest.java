package com.example.spliteasybackend.contribution.application.dto;

import com.example.spliteasybackend.contribution.domain.models.aggregates.Contribution;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class CreateContributionRequest {
    private Long id;
    private Long billId;
    private Long householdId;
    private String description;
    private LocalDate fechaLimite;
    private Contribution.Strategy strategy;
}

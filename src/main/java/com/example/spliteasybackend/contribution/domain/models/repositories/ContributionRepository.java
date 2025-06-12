package com.example.spliteasybackend.contribution.domain.models.repositories;

import com.example.spliteasybackend.contribution.domain.models.aggregates.Contribution;

import java.util.List;

public interface ContributionRepository {
    Contribution save(Contribution contribution);
    List<Contribution> findAll();
}

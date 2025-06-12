package com.example.spliteasybackend.contribution.infrastructure.persistance.jpa.repositories;

import com.example.spliteasybackend.contribution.domain.models.aggregates.Contribution;
import com.example.spliteasybackend.contribution.domain.models.repositories.ContributionRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaContributionRepository extends JpaRepository<Contribution, Long>, ContributionRepository {
}

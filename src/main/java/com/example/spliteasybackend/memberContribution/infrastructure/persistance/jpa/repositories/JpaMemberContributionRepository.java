package com.example.spliteasybackend.memberContribution.infrastructure.persistance.jpa.repositories;

import com.example.spliteasybackend.memberContribution.application.dto.MemberContributionResponse;
import com.example.spliteasybackend.memberContribution.domain.models.aggregates.MemberContribution;
import com.example.spliteasybackend.memberContribution.domain.models.repositories.MemberContributionRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaMemberContributionRepository extends JpaRepository<MemberContribution, Long>, MemberContributionRepository {
}

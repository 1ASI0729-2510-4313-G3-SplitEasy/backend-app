package com.example.spliteasybackend.memberContribution.domain.models.repositories;

import com.example.spliteasybackend.memberContribution.domain.models.aggregates.MemberContribution;

import java.util.List;
import java.util.Optional;

public interface MemberContributionRepository {
    MemberContribution save(MemberContribution memberContribution);
    List<MemberContribution> findAll();
    Optional<MemberContribution> findById(Long id);
    boolean existsById(Long id);
    void deleteById(Long id);
}

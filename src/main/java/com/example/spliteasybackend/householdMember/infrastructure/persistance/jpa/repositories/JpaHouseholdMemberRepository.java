package com.example.spliteasybackend.householdMember.infrastructure.persistance.jpa.repositories;

import com.example.spliteasybackend.householdMember.domain.models.aggregates.HouseholdMember;
import com.example.spliteasybackend.householdMember.domain.models.repositories.HouseholdMemberRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaHouseholdMemberRepository extends JpaRepository<HouseholdMember, Long>, HouseholdMemberRepository {
}

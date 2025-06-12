package com.example.spliteasybackend.householdMember.domain.models.repositories;

import com.example.spliteasybackend.householdMember.domain.models.aggregates.HouseholdMember;

import java.util.List;

public interface HouseholdMemberRepository {
    HouseholdMember save(HouseholdMember householdMember);
    List<HouseholdMember> findAll();
}

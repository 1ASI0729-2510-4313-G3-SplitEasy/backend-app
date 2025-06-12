package com.example.spliteasybackend.householdMember.application.dto;

import com.example.spliteasybackend.householdMember.domain.models.aggregates.HouseholdMember;
import lombok.Getter;

@Getter
public class HouseholdMemberResponse {
    private Long id;
    private Long userId;
    private Long householdId;

    public HouseholdMemberResponse(HouseholdMember householdMember) {
        this.id = householdMember.getId();
        this.userId = householdMember.getUserId();
        this.householdId = householdMember.getHouseholdId();
    }
}

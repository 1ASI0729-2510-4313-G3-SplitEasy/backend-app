package com.example.spliteasybackend.householdMember.application.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateHouseholdMemberRequest {
    private Long id;
    private Long userId;
    private Long householdId;
}

package com.example.spliteasybackend.householdMember.application.services;


import com.example.spliteasybackend.household.application.dto.HouseholdResponse;
import com.example.spliteasybackend.householdMember.application.dto.CreateHouseholdMemberRequest;
import com.example.spliteasybackend.householdMember.application.dto.HouseholdMemberResponse;
import com.example.spliteasybackend.householdMember.domain.models.aggregates.HouseholdMember;
import com.example.spliteasybackend.householdMember.domain.models.repositories.HouseholdMemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class HouseholdMemberService {

    private final HouseholdMemberRepository householdMemberRepository;

    public HouseholdMemberResponse createHouseholdMember(CreateHouseholdMemberRequest request) {
        HouseholdMember householdMember = new HouseholdMember(
                request.getId(),
                request.getUserId(),
                request.getHouseholdId()
        );
        HouseholdMember saved = householdMemberRepository.save(householdMember);
        return new HouseholdMemberResponse(saved);
    }

    public List<HouseholdMemberResponse> getAllHouseholdMembers() {
        return householdMemberRepository.findAll()
                .stream()
                .map(HouseholdMemberResponse::new)
                .collect(Collectors.toList());
    }
}

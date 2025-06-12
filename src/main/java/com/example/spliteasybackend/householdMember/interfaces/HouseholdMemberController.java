package com.example.spliteasybackend.householdMember.interfaces;

import com.example.spliteasybackend.householdMember.application.dto.CreateHouseholdMemberRequest;
import com.example.spliteasybackend.householdMember.application.dto.HouseholdMemberResponse;
import com.example.spliteasybackend.householdMember.application.services.HouseholdMemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/householdsmembers")
@RequiredArgsConstructor
public class HouseholdMemberController {

    private final HouseholdMemberService householdMemberService;

    @PostMapping
    public ResponseEntity<HouseholdMemberResponse> create(@RequestBody CreateHouseholdMemberRequest request) {
        HouseholdMemberResponse householdMember = householdMemberService.createHouseholdMember(request);
        return new ResponseEntity<>(householdMember, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<HouseholdMemberResponse>> findAll() {
        List<HouseholdMemberResponse> householdMembers = householdMemberService.getAllHouseholdMembers();
        return ResponseEntity.ok(householdMembers);
    }
}

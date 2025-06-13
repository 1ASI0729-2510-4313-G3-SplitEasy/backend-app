package com.example.spliteasybackend.memberContribution.interfaces;

import com.example.spliteasybackend.memberContribution.application.dto.CreateMemberContributionRequest;
import com.example.spliteasybackend.memberContribution.application.dto.MemberContributionResponse;
import com.example.spliteasybackend.memberContribution.application.services.MemberContributionService;
import com.example.spliteasybackend.memberContribution.domain.models.aggregates.MemberContribution;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/membercontributions")
@RequiredArgsConstructor
public class MemberContributionController {

    private final MemberContributionService memberContributionService;

    @PostMapping
    public ResponseEntity<MemberContributionResponse> create(@RequestBody CreateMemberContributionRequest request) {
        MemberContributionResponse memberContribution = memberContributionService.createMemberContribution(request);
        return new ResponseEntity<>(memberContribution, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<MemberContributionResponse>> findAll() {
        List<MemberContributionResponse> memberContributions = memberContributionService.getAllMemberContributions();
        return ResponseEntity.ok(memberContributions);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MemberContribution> getById(@PathVariable Long id) {
        return memberContributionService.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<MemberContribution> update(@PathVariable Long id, @RequestBody MemberContribution request) {
        return memberContributionService.update(id, request)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        boolean deleted = memberContributionService.deleteById(id);
        return deleted ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}

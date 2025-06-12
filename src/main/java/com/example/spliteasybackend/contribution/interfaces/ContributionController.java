package com.example.spliteasybackend.contribution.interfaces;

import com.example.spliteasybackend.contribution.application.dto.ContributionResponse;
import com.example.spliteasybackend.contribution.application.dto.CreateContributionRequest;
import com.example.spliteasybackend.contribution.application.services.ContributionService;
import com.example.spliteasybackend.contribution.domain.models.aggregates.Contribution;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/contributions")
@RequiredArgsConstructor
public class ContributionController {

    private final ContributionService contributionService;

    @PostMapping
    public ResponseEntity<ContributionResponse> create(@RequestBody CreateContributionRequest request) {
        ContributionResponse contribution = contributionService.createContribution(request);
        return new ResponseEntity<>(contribution, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ContributionResponse>> getAll() {
        List<ContributionResponse> contributions = contributionService.getAllContributions();
        return ResponseEntity.ok(contributions);
    }
}

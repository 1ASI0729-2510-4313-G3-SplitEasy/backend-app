package com.example.spliteasybackend.contribution.application.services;

import com.example.spliteasybackend.contribution.application.dto.ContributionResponse;
import com.example.spliteasybackend.contribution.application.dto.CreateContributionRequest;
import com.example.spliteasybackend.contribution.domain.models.aggregates.Contribution;
import com.example.spliteasybackend.contribution.domain.models.repositories.ContributionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ContributionService {

    private final ContributionRepository contributionRepository;

    public ContributionResponse createContribution(CreateContributionRequest request) {
        Contribution contribution = new Contribution(
                request.getId(),
                request.getBillId(),
                request.getHouseholdId(),
                request.getDescription(),
                request.getFechaLimite(),
                request.getStrategy()
        );
        Contribution saved = contributionRepository.save(contribution);
        return new ContributionResponse(saved);
    }

    public List<ContributionResponse> getAllContributions() {
        return contributionRepository.findAll()
                .stream()
                .map(ContributionResponse::new)
                .collect(Collectors.toList());
    }
}

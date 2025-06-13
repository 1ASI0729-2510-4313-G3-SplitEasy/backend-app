package com.example.spliteasybackend.memberContribution.application.services;

import com.example.spliteasybackend.memberContribution.application.dto.CreateMemberContributionRequest;
import com.example.spliteasybackend.memberContribution.application.dto.MemberContributionResponse;
import com.example.spliteasybackend.memberContribution.domain.models.aggregates.MemberContribution;
import com.example.spliteasybackend.memberContribution.domain.models.repositories.MemberContributionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MemberContributionService {

    private final MemberContributionRepository memberContributionRepository;

    public MemberContributionResponse createMemberContribution(CreateMemberContributionRequest request) {
        MemberContribution memberContribution = new MemberContribution(
                request.getId(),
                request.getContributionId(),
                request.getMemberId(),
                request.getMonto(),
                request.getStatus(),
                request.getPagadoEn()
        );
        MemberContribution saved = memberContributionRepository.save(memberContribution);
        return new MemberContributionResponse(saved);
    }

    public List<MemberContributionResponse> getAllMemberContributions() {
        return memberContributionRepository.findAll()
                .stream()
                .map(MemberContributionResponse::new)
                .collect(Collectors.toList());
    }

    public Optional<MemberContribution> getById(Long id) {
        return memberContributionRepository.findById(id);
    }

    public boolean deleteById(Long id) {
        if (memberContributionRepository.existsById(id)) {
            memberContributionRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Optional<MemberContribution> update(Long id, MemberContribution input) {
        return memberContributionRepository.findById(id).map(existing -> {
            existing.setMonto(input.getMonto());
            existing.setStatus(input.getStatus());
            existing.setPagadoEn(input.getPagadoEn());
            return memberContributionRepository.save(existing);
        });
    }

}

package com.example.spliteasybackend.memberContribution.application.dto;

import com.example.spliteasybackend.memberContribution.domain.models.aggregates.MemberContribution;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
public class MemberContributionResponse {
    private Long id;
    private Long contributionId;
    private Long memberId;
    private BigDecimal monto;
    private MemberContribution.Status status;
    private LocalDateTime pagadoEn;

    public MemberContributionResponse(MemberContribution memberContribution) {
        this.id = memberContribution.getId();
        this.contributionId = memberContribution.getContributionId();
        this.memberId = memberContribution.getMemberId();
        this.monto = memberContribution.getMonto();
        this.status = memberContribution.getStatus();
        this.pagadoEn = memberContribution.getPagadoEn();
    }
}

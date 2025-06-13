package com.example.spliteasybackend.memberContribution.application.dto;

import com.example.spliteasybackend.memberContribution.domain.models.aggregates.MemberContribution;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
public class CreateMemberContributionRequest {
    private Long id;
    private Long contributionId;
    private Long memberId;
    private BigDecimal monto;
    private MemberContribution.Status status;
    private LocalDateTime pagadoEn;
}

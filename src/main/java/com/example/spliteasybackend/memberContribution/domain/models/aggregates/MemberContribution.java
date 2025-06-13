package com.example.spliteasybackend.memberContribution.domain.models.aggregates;

import com.example.spliteasybackend.shared.domain.model.aggregates.AuditableAbstractAggregateRoot;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "member_contributions")
public class MemberContribution extends AuditableAbstractAggregateRoot<MemberContribution> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "contribution_id", nullable = false)
    private Long contributionId;

    @Column(name = "member_id", nullable = false)
    private Long memberId;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal monto;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private Status status = Status.PENDIENTE;

    @Column(name = "pagado_en")
    private LocalDateTime pagadoEn;

    public enum Status {
        PENDIENTE,
        PAGADO
    }

    public MemberContribution(Long id, Long contributionId, Long memberId, BigDecimal monto, Status status, LocalDateTime pagadoEn) {
        this.id = id;
        this.contributionId = contributionId;
        this.memberId = memberId;
        this.monto = monto;
        this.status = status;
        this.pagadoEn = pagadoEn;
    }
}

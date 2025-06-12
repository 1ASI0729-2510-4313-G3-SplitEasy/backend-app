package com.example.spliteasybackend.contribution.domain.models.aggregates;

import com.example.spliteasybackend.shared.domain.model.aggregates.AuditableAbstractAggregateRoot;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "contributions")
public class Contribution extends AuditableAbstractAggregateRoot<Contribution> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "bill_id", nullable = false)
    private Long billId;

    @Column(name = "household_id", nullable = false)
    private Long householdId;

    @Column
    private String descripcion;

    @Column(name = "fecha_limite", nullable = false)
    private LocalDate fechaLimite;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Strategy strategy = Strategy.INCOME_BASED;

    public Contribution(Long id, Long billId, Long householdId, String descripcion, LocalDate fechaLimite, Strategy strategy) {
        this.id = id;
        this.billId = billId;
        this.householdId = householdId;
        this.descripcion = descripcion;
        this.fechaLimite = fechaLimite;
        this.strategy = strategy;
    }

    public enum Strategy {
        EQUAL,
        INCOME_BASED
    }
}

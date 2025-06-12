package com.example.spliteasybackend.bill.domain.models.aggregates;

import com.example.spliteasybackend.shared.domain.model.aggregates.AuditableAbstractAggregateRoot;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "bills")
public class Bill extends AuditableAbstractAggregateRoot<Bill> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "household_id", nullable = false)
    private Long householdId;

    @Column(nullable = false)
    private String descripcion;

    @Column(nullable = false)
    private BigDecimal monto;

    @Column(name = "created_by", nullable = false)
    private Long createdBy;

    @Column(nullable = false)
    private LocalDate fecha;

    public Bill(Long id, Long householdId, String descripcion, BigDecimal monto, Long createdBy, LocalDate fecha) {
        this.id = id;
        this.householdId = householdId;
        this.descripcion = descripcion;
        this.monto = monto;
        this.createdBy = createdBy;
        this.fecha = fecha;
    }
}

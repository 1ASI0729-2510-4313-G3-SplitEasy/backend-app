package com.example.spliteasybackend.householdMember.domain.models.aggregates;

import com.example.spliteasybackend.shared.domain.model.aggregates.AuditableAbstractAggregateRoot;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "household_members")
public class HouseholdMember extends AuditableAbstractAggregateRoot<HouseholdMember> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "household_id", nullable = false)
    private Long householdId;

    public HouseholdMember(Long id, Long userId, Long householdId) {
        this.id = id;
        this.userId = userId;
        this.householdId = householdId;
    }
}

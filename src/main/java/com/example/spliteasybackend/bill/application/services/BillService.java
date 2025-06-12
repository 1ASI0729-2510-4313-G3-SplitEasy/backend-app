package com.example.spliteasybackend.bill.application.services;

import com.example.spliteasybackend.bill.application.dto.BillResponse;
import com.example.spliteasybackend.bill.application.dto.CreateBillRequest;
import com.example.spliteasybackend.bill.domain.models.aggregates.Bill;
import com.example.spliteasybackend.bill.domain.models.repositories.BillRepository;
import jdk.dynalink.linker.LinkerServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BillService {
    private final BillRepository billRepository;

    public BillResponse createBill(CreateBillRequest request) {
        Bill bill = new Bill(
                request.getId(),
                request.getHouseholdId(),
                request.getDescription(),
                request.getMonto(),
                request.getCreatedBy(),
                request.getFecha()
        );
        Bill saved = billRepository.save(bill);
        return new BillResponse(saved);
    }

    public List<BillResponse> getAllBills() {
        return billRepository.findAll()
                .stream()
                .map(BillResponse::new)
                .collect(Collectors.toList());
    }
}

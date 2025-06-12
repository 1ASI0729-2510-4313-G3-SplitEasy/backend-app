package com.example.spliteasybackend.bill.interfaces;

import com.example.spliteasybackend.bill.application.dto.BillResponse;
import com.example.spliteasybackend.bill.application.dto.CreateBillRequest;
import com.example.spliteasybackend.bill.application.services.BillService;
import com.example.spliteasybackend.bill.domain.models.aggregates.Bill;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bills")
@RequiredArgsConstructor
public class BillController {

    private final BillService billService;

    @PostMapping
    public ResponseEntity<BillResponse> create(@RequestBody CreateBillRequest request) {
        BillResponse bill = billService.createBill(request);
        return new ResponseEntity<>(bill, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<BillResponse>> findAll() {
        List<BillResponse> bill = billService.getAllBills();
        return ResponseEntity.ok(bill);
    }
}

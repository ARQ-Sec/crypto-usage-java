package com.arq.cryptousagejava.service;

import com.arq.cryptousagejava.dto.BalanceResponse;
import com.arq.cryptousagejava.repository.BalanceRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class BalanceService {
    private final BalanceRepository repository;

    public BalanceService(BalanceRepository repository) {
        this.repository = repository;
    }

    public List<BalanceResponse> summarize() {
        return repository.findAll().stream().map(record -> new BalanceResponse(record.getId(), "ACTIVE", record.getOwner())).toList();
    }
}

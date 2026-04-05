package com.arq.cryptousagejava.service;

import com.arq.cryptousagejava.dto.RefundResponse;
import com.arq.cryptousagejava.repository.RefundRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class RefundService {
    private final RefundRepository repository;

    public RefundService(RefundRepository repository) {
        this.repository = repository;
    }

    public List<RefundResponse> summarize() {
        return repository.findAll().stream().map(record -> new RefundResponse(record.getId(), "ACTIVE", record.getOwner())).toList();
    }
}

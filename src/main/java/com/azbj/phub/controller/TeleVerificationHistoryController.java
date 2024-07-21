package com.azbj.phub.controller;

import com.azbj.phub.dto.TeleVerificationHistoryDTO;
import com.azbj.phub.service.TeleVerificationHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tele-verification-history")
public class TeleVerificationHistoryController {

    @Autowired
    private TeleVerificationHistoryService teleVerificationHistoryService;

    @PostMapping("/save")
    public ResponseEntity<TeleVerificationHistoryDTO> saveTeleVerificationHistory(@RequestBody TeleVerificationHistoryDTO teleVerificationHistoryDTO) {
        TeleVerificationHistoryDTO savedHistory = teleVerificationHistoryService.saveTeleVerificationHistory(teleVerificationHistoryDTO);
        return ResponseEntity.ok(savedHistory);
    }

    @GetMapping("/fetch")
    public ResponseEntity<List<TeleVerificationHistoryDTO>> fetchTeleVerificationHistory() {
        List<TeleVerificationHistoryDTO> historyList = teleVerificationHistoryService.fetchTeleVerificationHistory();
        return ResponseEntity.ok(historyList);
    }
}

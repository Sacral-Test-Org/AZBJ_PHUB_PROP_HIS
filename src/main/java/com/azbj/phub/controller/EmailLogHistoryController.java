package com.azbj.phub.controller;

import com.azbj.phub.dto.EmailLogHistoryDTO;
import com.azbj.phub.service.EmailLogHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/email-log-history")
public class EmailLogHistoryController {

    @Autowired
    private EmailLogHistoryService emailLogHistoryService;

    @GetMapping
    public ResponseEntity<List<EmailLogHistoryDTO>> getEmailLogs() {
        List<EmailLogHistoryDTO> emailLogs = emailLogHistoryService.getEmailLogs();
        return ResponseEntity.ok(emailLogs);
    }

    @PutMapping("/update-status")
    public ResponseEntity<EmailLogHistoryDTO> updateEmailStatus(@RequestBody EmailLogHistoryDTO emailLogDTO) {
        EmailLogHistoryDTO updatedEmailLog = emailLogHistoryService.updateEmailStatus(emailLogDTO);
        return ResponseEntity.ok(updatedEmailLog);
    }
}

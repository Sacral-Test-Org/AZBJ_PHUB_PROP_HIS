package com.azbj.phub.service;

import com.azbj.phub.repository.EmailLogHistoryRepository;
import com.azbj.phub.dto.EmailLogHistoryDTO;
import com.azbj.phub.models.EmailLogHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmailLogHistoryService {

    @Autowired
    private EmailLogHistoryRepository emailLogHistoryRepository;

    public List<EmailLogHistoryDTO> getEmailLogs() {
        List<EmailLogHistory> emailLogs = emailLogHistoryRepository.findAll();
        return emailLogs.stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public EmailLogHistoryDTO updateEmailStatus(EmailLogHistoryDTO emailLogDTO) {
        EmailLogHistory emailLog = emailLogHistoryRepository.findById(emailLogDTO.getId()).orElseThrow(() -> new RuntimeException("Email log not found"));
        emailLog.setEmailStatus(emailLogDTO.getEmailStatus());
        EmailLogHistory updatedEmailLog = emailLogHistoryRepository.save(emailLog);
        return convertToDTO(updatedEmailLog);
    }

    private EmailLogHistoryDTO convertToDTO(EmailLogHistory emailLog) {
        return new EmailLogHistoryDTO(
                emailLog.getId(),
                emailLog.getEmailStatus(),
                emailLog.getDateTimeSent(),
                emailLog.getRegisteredEmailId(),
                emailLog.getTypeOfLetter(),
                emailLog.getNumberOfSuccessfulMails()
        );
    }
}

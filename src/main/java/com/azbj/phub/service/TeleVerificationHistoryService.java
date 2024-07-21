package com.azbj.phub.service;

import com.azbj.phub.repository.TeleVerificationHistoryRepository;
import com.azbj.phub.model.TeleVerificationHistory;
import com.azbj.phub.dto.TeleVerificationHistoryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TeleVerificationHistoryService {

    @Autowired
    private TeleVerificationHistoryRepository repository;

    public TeleVerificationHistoryDTO saveTeleVerificationHistory(TeleVerificationHistoryDTO teleVerificationHistoryDTO) {
        TeleVerificationHistory entity = new TeleVerificationHistory();
        entity.setUserId(teleVerificationHistoryDTO.getUserId());
        entity.setVerificationDateTime(teleVerificationHistoryDTO.getVerificationDateTime());
        entity.setTeleVerificationComments(teleVerificationHistoryDTO.getTeleVerificationComments());
        entity.setTeleVerificationStatus(teleVerificationHistoryDTO.getTeleVerificationStatus());
        entity.setUserComments(teleVerificationHistoryDTO.getUserComments());

        TeleVerificationHistory savedEntity = repository.save(entity);

        TeleVerificationHistoryDTO savedDTO = new TeleVerificationHistoryDTO();
        savedDTO.setId(savedEntity.getId());
        savedDTO.setUserId(savedEntity.getUserId());
        savedDTO.setVerificationDateTime(savedEntity.getVerificationDateTime());
        savedDTO.setTeleVerificationComments(savedEntity.getTeleVerificationComments());
        savedDTO.setTeleVerificationStatus(savedEntity.getTeleVerificationStatus());
        savedDTO.setUserComments(savedEntity.getUserComments());

        return savedDTO;
    }

    public List<TeleVerificationHistoryDTO> fetchTeleVerificationHistory() {
        List<TeleVerificationHistory> entities = repository.findAll();
        return entities.stream().map(entity -> {
            TeleVerificationHistoryDTO dto = new TeleVerificationHistoryDTO();
            dto.setId(entity.getId());
            dto.setUserId(entity.getUserId());
            dto.setVerificationDateTime(entity.getVerificationDateTime());
            dto.setTeleVerificationComments(entity.getTeleVerificationComments());
            dto.setTeleVerificationStatus(entity.getTeleVerificationStatus());
            dto.setUserComments(entity.getUserComments());
            return dto;
        }).collect(Collectors.toList());
    }
}

package com.azbj.phub;

import com.azbj.phub.service.ControlService;
import com.azbj.phub.dto.ControlDTO;
import com.azbj.phub.dto.SearchCriteriaDTO;
import com.azbj.phub.dto.ApplicationDetailsDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class ControlServiceTest {

    @Mock
    private ControlService controlService;

    @InjectMocks
    private ControlServiceTest controlServiceTest;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetApplicationData() {
        String applicationNo = "1234567890";
        ControlDTO expectedControlDTO = new ControlDTO();
        // Set expected values in expectedControlDTO

        when(controlService.getApplicationData(applicationNo)).thenReturn(expectedControlDTO);

        ControlDTO actualControlDTO = controlService.getApplicationData(applicationNo);

        assertEquals(expectedControlDTO, actualControlDTO);
        verify(controlService, times(1)).getApplicationData(applicationNo);
    }

    @Test
    public void testClearFormService() {
        // Assuming clearFormService is a void method
        doNothing().when(controlService).clearFormService();

        controlService.clearFormService();

        verify(controlService, times(1)).clearFormService();
    }

    @Test
    public void testFetchCommentsAndRemarks() {
        String applicationNo = "AG1234567890";
        String propNo = "PROP123456";
        // Assuming fetchCommentsAndRemarks returns a list of comments and remarks
        List<String> expectedCommentsAndRemarks = Arrays.asList("Remark1", "Remark2");

        when(controlService.fetchCommentsAndRemarks(applicationNo, propNo)).thenReturn(expectedCommentsAndRemarks);

        List<String> actualCommentsAndRemarks = controlService.fetchCommentsAndRemarks(applicationNo, propNo);

        assertEquals(expectedCommentsAndRemarks, actualCommentsAndRemarks);
        verify(controlService, times(1)).fetchCommentsAndRemarks(applicationNo, propNo);
    }

    @Test
    public void testGetApplicationNumberByBiNumber() {
        String biNumber = "BI123456";
        String expectedApplicationNo = "APP123456";

        when(controlService.getApplicationNumberByBiNumber(biNumber)).thenReturn(expectedApplicationNo);

        String actualApplicationNo = controlService.getApplicationNumberByBiNumber(biNumber);

        assertEquals(expectedApplicationNo, actualApplicationNo);
        verify(controlService, times(1)).getApplicationNumberByBiNumber(biNumber);

        // Test with invalid BI Number
        when(controlService.getApplicationNumberByBiNumber("INVALID_BI")).thenReturn(null);

        String actualApplicationNoInvalid = controlService.getApplicationNumberByBiNumber("INVALID_BI");

        assertNull(actualApplicationNoInvalid);
        verify(controlService, times(1)).getApplicationNumberByBiNumber("INVALID_BI");
    }

    @Test
    public void testSearchApplications() {
        SearchCriteriaDTO searchCriteria = new SearchCriteriaDTO();
        // Set search criteria values

        ApplicationDetailsDTO expectedApplicationDetails = new ApplicationDetailsDTO();
        // Set expected application details

        when(controlService.searchApplications(searchCriteria)).thenReturn(expectedApplicationDetails);

        ApplicationDetailsDTO actualApplicationDetails = controlService.searchApplications(searchCriteria);

        assertEquals(expectedApplicationDetails, actualApplicationDetails);
        verify(controlService, times(1)).searchApplications(searchCriteria);
    }
}

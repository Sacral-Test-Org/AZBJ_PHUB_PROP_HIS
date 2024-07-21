package com.azbj.phub.util;

import com.azbj.phub.dto.ActivityTrackerDTO;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

public class ExcelUtil {

    public static byte[] createExcelFile(List<ActivityTrackerDTO> activityTrackerData) throws IOException {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Activity Tracker");

        // Create header row
        Row headerRow = sheet.createRow(0);
        String[] headers = {"Activity", "ActivityUser", "ActivityDate"};
        for (int i = 0; i < headers.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(headers[i]);
        }

        // Create data rows
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
        int rowNum = 1;
        for (ActivityTrackerDTO activity : activityTrackerData) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(activity.getStatus());
            row.createCell(1).setCellValue(activity.getUser());
            row.createCell(2).setCellValue(dateFormat.format(activity.getDate()));
        }

        // Write the output to a byte array
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        workbook.write(bos);
        workbook.close();

        // Save the file to local path 'c:\'
        String filePath = "c:\\ActivityTracker_" + System.currentTimeMillis() + ".xlsx";
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            fos.write(bos.toByteArray());
        }

        // Notify the user with the file path
        System.out.println("File saved to: " + filePath);

        // Open the saved Excel file automatically
        java.awt.Desktop.getDesktop().open(new java.io.File(filePath));

        return bos.toByteArray();
    }
}

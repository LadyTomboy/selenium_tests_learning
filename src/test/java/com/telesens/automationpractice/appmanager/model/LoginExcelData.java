package com.telesens.automationpractice.appmanager.model;

import org.apache.poi.xssf.usermodel.*;
import java.io.*;

public class LoginExcelData {
//    private static final int COUNT_COLUMNS = 6;

    public Object[][] getCredentials() {
        Object[][] credsData = null;
        File file = new File("D:\\Programming\\selenium_test\\Credentials.xlsx");
        try(XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(file))) {

        XSSFSheet sheet = workbook.getSheet("Sheet1");
        credsData = new Object[sheet.getLastRowNum()][3];
        for (int r = 0; r < sheet.getLastRowNum(); r++) {

            XSSFRow row = sheet.getRow(r);
            String email = row.getCell(0).getStringCellValue();
            String pass = row.getCell(1).getStringCellValue();
            String error = row.getCell(2).getStringCellValue();

            Object[] creds= {email, pass, error};
            credsData[r] =  creds;
        }

    } catch (Exception e) {

        e.printStackTrace();

    }
    return credsData;
    }
}

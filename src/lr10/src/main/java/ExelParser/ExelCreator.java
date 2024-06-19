package ExelParser;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class ExelCreator {
    public static void main(String[] args) throws  IOException{

        XSSFWorkbook workbook = new XSSFWorkbook();

        XSSFSheet sheet = workbook.createSheet("Список товаров");

        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("Товар");
        headerRow.createCell(1).setCellValue("Описание");
        headerRow.createCell(2).setCellValue("Стоимость");

        Row dataRow1 = sheet.createRow(1);
        dataRow1.createCell(0).setCellValue("Медвед");
        dataRow1.createCell(1).setCellValue("Большой и мягкий");
        dataRow1.createCell(2).setCellValue((5000.0));

        Row dataRow2 = sheet.createRow(2);
        dataRow2.createCell(0).setCellValue("Вафля");
        dataRow2.createCell(1).setCellValue("300 гр");
        dataRow2.createCell(2).setCellValue((250));

        FileOutputStream outputStream = new FileOutputStream("src/lr10/src/main/java/ExelParser/myExel.xlsx");
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

        System.out.println("Xlsx file was created!");

    }
}

/*
 * Dieses Programm ist für Thyssen Schachtbau GmbH entwickelt.
 *  lepeschko.dmitri@ts-gruppe.com  +7 912 4848071
 * Редактирование и улучшение программы допускается на бесплатной основе
 */
package excelanforderung0;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;


/**
 *
 * @author lepeschko
 */
public class Druckform  {
     String skNummer = "";
        String abtNummer = "";
        String filePath = "";
        boolean noch = true;
        int pos = 1;
        int count = 5;
        String beschreibung = "";
        String mengeEinh= "";
        String spezifik= "";
        String psp = "";
        String termin = "";
         // FileOutputStream fos = new FileOutputStream(filePath);
         Workbook wb = new HSSFWorkbook();
         
    public Druckform() {
       
       // this.filePath = filePath;
         this.count = count;
         
          sheet0.addMergedRegion(new CellRangeAddress(0,0,0,5));// создали поле из клеток 
      sheet0.setColumnWidth(0, 3000);
      sheet0.setColumnWidth(1, 9000);
      sheet0.setColumnWidth(2, 3000);
      sheet0.setColumnWidth(3, 5000);
      sheet0.setColumnWidth(4, 1800);
      sheet0.setColumnWidth(5, 2500);
      sheet0.setColumnWidth(6, 3000);
      sheet0.setColumnWidth(7, 3000);
      sheet0.setColumnWidth(8, 2000);
      sheet0.setColumnWidth(9, 3000);
      
       font0.setFontName("Times New Roman");
        font0.setFontHeightInPoints((short)12);
        font0.setBold(true); 
        
        font1.setFontName("Times New Roman");
        font1.setFontHeightInPoints((short)8);
        font1.setBold(true);
        font2.setFontHeightInPoints((short)9);
        font2.setBold(false);
        font3.setFontHeightInPoints((short)9);
        font3.setBold(true);
        
        
        style0.setFont(font0);
       // style0.setAlignment(HorizontalAlignment.CENTER);
         
        style1.setFont(font0);
        style1.setBorderBottom(BorderStyle.THICK);
        style1.setBorderTop(BorderStyle.THICK);
        style1.setBorderLeft(BorderStyle.THICK);
        style1.setBorderRight(BorderStyle.THICK);
        style1.setBottomBorderColor(IndexedColors.BLACK.getIndex());
        style1.setLeftBorderColor(IndexedColors.BLACK.getIndex());
        style1.setRightBorderColor(IndexedColors.BLACK.getIndex());
        style1.setTopBorderColor(IndexedColors.BLACK.getIndex());
        style1.setWrapText(true);
        //style1.setAlignment(HorizontalAlignment.RIGHT);
        
        style2.setFont(font1);
        style2.setBorderBottom(BorderStyle.THICK);
        style2.setBorderTop(BorderStyle.THICK);
        style2.setBorderLeft(BorderStyle.THICK);
        style2.setBorderRight(BorderStyle.THICK);
        style2.setBottomBorderColor(IndexedColors.BLACK.getIndex());
        style2.setLeftBorderColor(IndexedColors.BLACK.getIndex());
        style2.setRightBorderColor(IndexedColors.BLACK.getIndex());
        style2.setTopBorderColor(IndexedColors.BLACK.getIndex());
       // style2.setAlignment(HorizontalAlignment.CENTER);
        style2.setWrapText(true);
       // style2.setVerticalAlignment(VerticalAlignment.CENTER);
        
        style3.setFont(font2);
        style3.setBorderBottom(BorderStyle.THIN);
        style3.setBorderTop(BorderStyle.THIN);
        style3.setBorderLeft(BorderStyle.THIN);
        style3.setBorderRight(BorderStyle.THIN);
        style3.setBottomBorderColor(IndexedColors.BLACK.getIndex());
        style3.setLeftBorderColor(IndexedColors.BLACK.getIndex());
        style3.setRightBorderColor(IndexedColors.BLACK.getIndex());
        style3.setTopBorderColor(IndexedColors.BLACK.getIndex());
       // style3.setAlignment(HorizontalAlignment.CENTER);
        style3.setWrapText(true);
       // style3.setVerticalAlignment(VerticalAlignment.CENTER);
        
        style4.setFont(font3);
        style4.setBorderBottom(BorderStyle.THICK);
        style4.setBorderTop(BorderStyle.THICK);
        style4.setBorderLeft(BorderStyle.THICK);
        style4.setBorderRight(BorderStyle.THICK);
        style4.setBottomBorderColor(IndexedColors.BLACK.getIndex());
        style4.setLeftBorderColor(IndexedColors.BLACK.getIndex());
        style4.setRightBorderColor(IndexedColors.BLACK.getIndex());
        style4.setTopBorderColor(IndexedColors.BLACK.getIndex());
        //style4.setAlignment(HorizontalAlignment.CENTER);
        style4.setWrapText(true);
       // style4.setVerticalAlignment(VerticalAlignment.CENTER);
        
        cell00.setCellValue("Anforderung für Ware bzw. Material für Baustelle «Thyssen Schachtbau», SKRU-2 in Solikamsk ");
         cell00.setCellStyle(style0);
         
         cell06.setCellValue("№ ");
         cell06.setCellStyle(style1);
         
          cell07.setCellValue(abtNummer);// здесь заканчивается создание первой строки
         cell07.setCellStyle(style1);
         
          sheet0.addMergedRegion(new CellRangeAddress(1,1,0,5));// создали поле из клеток 
           
         cell10.setCellValue("Заявка на приобретение товарно-материальных ценностей для СКРУ-2, г.Соликамск");
         cell10.setCellStyle(style0);
         
         cell16.setCellValue("SK-№ ");
         cell16.setCellStyle(style1);
         
          cell17.setCellValue(skNummer);
          cell17.setCellStyle(style1);// здесь заканчивается написание второй строки
         
            cell30.setCellStyle(style2);
          cell31.setCellStyle(style2);
           cell32.setCellStyle(style2);
            cell33.setCellStyle(style2);
             cell34.setCellStyle(style2);
              cell35.setCellStyle(style2);
               cell36.setCellStyle(style2);
                cell37.setCellStyle(style2);
         sheet0.addMergedRegion(new CellRangeAddress(3,4,0,0));// нумерация
         sheet0.addMergedRegion(new CellRangeAddress(3,4,1,1));// наименование товаров
         sheet0.addMergedRegion(new CellRangeAddress(3,4,2,2));// количество
         sheet0.addMergedRegion(new CellRangeAddress(3,4,3,3));// спецификация
         sheet0.addMergedRegion(new CellRangeAddress(3,4,4,4));// псп элемент
         sheet0.addMergedRegion(new CellRangeAddress(3,4,5,5));// срок поставки
         sheet0.addMergedRegion(new CellRangeAddress(3,3,6,7));// входной контроль
               
                cell30.setCellValue("Nr.Pos./ \n № поз.");
                cell31.setCellValue("WARE /\n НАИМЕНОВАНИЕ ТОВАРА");
                cell32.setCellValue("Menge, Einheit/ \n Количество, ед.  Измерения");
                cell33.setCellValue("SPEZIFIKATION  (Projekt, Katalog, Lieferant)/Спецификация");
                cell34.setCellValue("Für Objekt/ \n Для объекта");
                cell35.setCellValue("Liefertermin (Datum)/\nСрок поставки (Дата)");
                cell36.setCellValue("Eingangskontrolle/ \n Входной контроль");
          row3.setHeightInPoints((2*sheet0.getDefaultRowHeightInPoints()));
           row4.setHeightInPoints((2*sheet0.getDefaultRowHeightInPoints()));
           
           cell46.setCellValue("Unterschrift/\n подпись");
         cell47.setCellValue("Datum/дата");
          cell40.setCellStyle(style2);
          cell41.setCellStyle(style2);
           cell42.setCellStyle(style2);
            cell43.setCellStyle(style2);
             cell44.setCellStyle(style2);
              cell45.setCellStyle(style2);
               cell46.setCellStyle(style2);
                cell47.setCellStyle(style2);
    }
         
      Sheet sheet0 = wb.createSheet("Anforderung" );
      
    Row row0 = sheet0.createRow(0);// первая строка
         Cell cell00 = row0.createCell(0);
         CellStyle style0 = wb.createCellStyle(); //жирный шрифт заголовков без границы
         CellStyle style1 = wb.createCellStyle();// жирный шрифт  в рамочке прижатый к правой стенке
        CellStyle style2 = wb.createCellStyle(); // мелкий шрифт в рамке для заголовков граф заявки
        CellStyle style3 = wb.createCellStyle();// мелкий шрифт в рамке нежирный для описания товара
        CellStyle style4 = wb.createCellStyle(); // мелкий шрифт в жирной рамке для подписей внизу заявки
       Font font0 = wb.createFont();// жирный шрифт Calibri
       Font font1 = wb.createFont();// мелкий шрифт заголовков жирный
       Font font2 = wb.createFont();// мелкий шрифт для описания товаров нежирный
       Font font3 = wb.createFont();// чуть больший шрифт жирный для заголовков в подписях
            Cell cell06 = row0.createCell(6);   
            Cell cell07 = row0.createCell(7);
        
    Row row1 = sheet0.createRow(1);// строка 2
          Cell cell10 = row1.createCell(0);
          Cell cell16 = row1.createCell(6);
          Cell cell17 = row1.createCell(7);
    Row row3 = sheet0.createRow(3);
    Row row4 = sheet0.createRow(4);
         Cell cell30 = row3.createCell(0);
         Cell cell31 = row3.createCell(1);
         Cell cell32 = row3.createCell(2);
         Cell cell33 = row3.createCell(3);
         Cell cell34 = row3.createCell(4);
         Cell cell35 = row3.createCell(5);
         Cell cell36 = row3.createCell(6);
         Cell cell37 = row3.createCell(7);
      


         Cell cell40 = row4.createCell(0);
         Cell cell41 = row4.createCell(1);
         Cell cell42 = row4.createCell(2);
         Cell cell43 = row4.createCell(3);
         Cell cell44 = row4.createCell(4);
         Cell cell45 = row4.createCell(5);
         Cell cell46 = row4.createCell(6);
         Cell cell47 = row4.createCell(7);
         
        public void newLine(){
          Row rowT =  sheet0.createRow(count);
       Cell cell0 = rowT.createCell(0); // создаем клетку с номером
         cell0.setCellValue(Integer.toString(pos));
         cell0.setCellStyle(style3);
       Cell cell1 = rowT.createCell(1);// создаем клетку с описанием товара
         cell1.setCellValue(beschreibung);
         cell1.setCellStyle(style3);
       Cell cell2 = rowT.createCell(2);// пишем количество товара
         cell2.setCellValue(mengeEinh);
         cell2.setCellStyle(style3); 
       Cell cell3 = rowT.createCell(3);
         cell3.setCellValue(spezifik);
         cell3.setCellStyle(style3);
       Cell cell4 = rowT.createCell(4);
         cell4.setCellValue(psp);
         cell4.setCellStyle(style3);
       Cell cell5 = rowT.createCell(5);
         cell5.setCellValue(termin);
         cell5.setCellStyle(style3);
       Cell cell6 = rowT.createCell(6);
         cell6.setCellStyle(style3);
       Cell cell7 = rowT.createCell(7);
         cell7.setCellStyle(style3);
         pos++; // переходим к следующей позиции заказа
         count++;// задаем новую строку в таблице, следующую за уже записанной
        }
        
        public void unterSrifften(String name){
            Row rowU1 = sheet0.createRow(count);// первая строка- заголовки столбцов
            Cell cell10 = rowU1.createCell(0);
            cell10.setCellStyle(style4);
            cell10.setCellValue("Vorgang/ \n Действие");
            Cell cell11 = rowU1.createCell(1);
            cell11.setCellValue("Position vom Mitarbeiter /\n  Должность сотрудника");
            cell11.setCellStyle(style4);
            Cell cell12 = rowU1.createCell(2);
            cell12.setCellValue("Name, Unterschrifft/ Фамилия И.О., Подпись");
            cell12.setCellStyle(style4);
            Cell cell13 = rowU1.createCell(3);
            cell13.setCellStyle(style4);
            Cell cell14 = rowU1.createCell(4);
            cell14.setCellStyle(style4);
            Cell cell15 = rowU1.createCell(5);
            cell15.setCellStyle(style4);
            Cell cell16 = rowU1.createCell(6);
            cell16.setCellStyle(style4);
            sheet0.addMergedRegion(new CellRangeAddress(count,count ,2, 6));
            
            Cell cell17 = rowU1.createCell(7);
            cell17.setCellValue("Datum/ \n Дата");
            cell17.setCellStyle(style4);
            count++;
            Row rowU2 = sheet0.createRow(count);
          Cell cell20 = rowU2.createCell(0);
            cell20.setCellStyle(style2);
            cell20.setCellValue("Anforderung/ \n Заявлено");
          Cell cell21 = rowU2.createCell(1);
            cell21.setCellStyle(style2);
            cell21.setCellValue("Mitarbeiter/  Сотрудник");
          Cell cell22= rowU2.createCell(2);
            cell22.setCellStyle(style2);
            cell22.setCellValue(name + "/____________________________");
          Cell cell23 = rowU2.createCell(3);
            cell23.setCellStyle(style2);
          Cell cell24 = rowU2.createCell(4);
            cell24.setCellStyle(style2);
          Cell cell25 = rowU2.createCell(5);
            cell25.setCellStyle(style2);
          Cell cell26 = rowU2.createCell(6);
            cell26.setCellStyle(style2);
            sheet0.addMergedRegion(new CellRangeAddress(count,count ,2, 6));
            
          Cell cell27 = rowU2.createCell(7);
            cell27.setCellStyle(style2);
            
             count++;
            Row rowU3 = sheet0.createRow(count);
          Cell cell30 = rowU3.createCell(0);
            cell30.setCellStyle(style2);
            cell30.setCellValue("Abgestimmt/ \n Согласовано");
          Cell cell31 = rowU3.createCell(1);
            cell31.setCellStyle(style2);
            cell31.setCellValue("Abteilungsleiter/  Руководитель отдела");
          Cell cell32= rowU3.createCell(2);
            cell32.setCellStyle(style2);
            cell32.setCellValue( "___________________________/____________________________");
          Cell cell33 = rowU3.createCell(3);
            cell33.setCellStyle(style2);
          Cell cell34 = rowU3.createCell(4);
            cell34.setCellStyle(style2);
          Cell cell35 = rowU3.createCell(5);
            cell35.setCellStyle(style2);
          Cell cell36 = rowU3.createCell(6);
            cell36.setCellStyle(style2);
            sheet0.addMergedRegion(new CellRangeAddress(count,count ,2, 6));
            
          Cell cell37 = rowU3.createCell(7);
            cell37.setCellStyle(style2);
            
            count++;
            Row rowU4 = sheet0.createRow(count);
          Cell cell40 = rowU4.createCell(0);
            cell40.setCellStyle(style2);
            cell40.setCellValue("Geprüft/ \n Проверено");
          Cell cell41 = rowU4.createCell(1);
            cell41.setCellStyle(style2);
            cell41.setCellValue("Buchhaltung / Бухгалтерия");
          Cell cell42= rowU4.createCell(2);
            cell42.setCellStyle(style2);
            cell42.setCellValue( "___________________________/____________________________");
          Cell cell43 = rowU4.createCell(3);
            cell43.setCellStyle(style2);
          Cell cell44 = rowU4.createCell(4);
            cell44.setCellStyle(style2);
          Cell cell45 = rowU4.createCell(5);
            cell45.setCellStyle(style2);
          Cell cell46 = rowU4.createCell(6);
            cell46.setCellStyle(style2);
            sheet0.addMergedRegion(new CellRangeAddress(count,count ,2, 6));
            
          Cell cell47 = rowU4.createCell(7);
            cell47.setCellStyle(style2);
            
             count++;
            Row rowU5 = sheet0.createRow(count);
          Cell cell50 = rowU5.createCell(0);
            cell50.setCellStyle(style2);
            cell50.setCellValue("In Bearbeitung/ \n Принято в заказ");
          Cell cell51 = rowU5.createCell(1);
            cell51.setCellStyle(style2);
            cell51.setCellValue("MA vom Einkauf / Сотрудник ОМТС");
          Cell cell52= rowU5.createCell(2);
            cell52.setCellStyle(style2);
            cell52.setCellValue( "___________________________/____________________________");
          Cell cell53 = rowU5.createCell(3);
            cell53.setCellStyle(style2);
          Cell cell54 = rowU5.createCell(4);
            cell54.setCellStyle(style2);
          Cell cell55 = rowU5.createCell(5);
            cell55.setCellStyle(style2);
          Cell cell56 = rowU5.createCell(6);
            cell56.setCellStyle(style2);
            sheet0.addMergedRegion(new CellRangeAddress(count,count ,2, 6));
            
          Cell cell57 = rowU5.createCell(7);
            cell57.setCellStyle(style2);
            
            count++;
            Row rowU6 = sheet0.createRow(count);
          Cell cell60 = rowU6.createCell(0);
            cell60.setCellStyle(style2);
            cell60.setCellValue("Genehmigt  / \n Утверждено       ");
          Cell cell61 = rowU6.createCell(1);
            cell61.setCellStyle(style2);
            cell61.setCellValue("Baustellenleiter(Projektleiter) / \n Руководитель стройплощадки (проекта)");
          Cell cell62= rowU6.createCell(2);
            cell62.setCellStyle(style2);
            cell62.setCellValue( "___________________________/____________________________");
          Cell cell63 = rowU6.createCell(3);
            cell63.setCellStyle(style2);
          Cell cell64 = rowU6.createCell(4);
            cell64.setCellStyle(style2);
          Cell cell65 = rowU6.createCell(5);
            cell65.setCellStyle(style2);
          Cell cell66 = rowU6.createCell(6);
            cell66.setCellStyle(style2);
            sheet0.addMergedRegion(new CellRangeAddress(count,count ,2, 6));
            
          Cell cell67 = rowU6.createCell(7);
            cell67.setCellStyle(style2);
            
        }
       
    
    
   
    
    
    
}

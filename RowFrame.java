/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excelanforderung0;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import org.apache.poi.hssf.usermodel.HSSFHeader;
import org.apache.poi.hssf.usermodel.HeaderFooter;
import org.apache.poi.ss.usermodel.Footer;
import org.apache.poi.ss.usermodel.Header;



/**
 *
 * @author lepeschko
 */
public class RowFrame extends JFrame {
    String psp = "";
    String fertigText = "";
    String row ="";
    String abteilung = "";
    String abtNr = "";
    String skNr = "";
     String SKNum = "";
     String name = "";
    
    int count= 1;
  String text = "";
  JLabel kopf = new JLabel("<html><p><font size = +2 color = green>Thyssen Schachtbau GmbH\n  SKRU-2, Solikamsk</p> </font></html>");
  JLabel lblWare = new JLabel("Наименование товара");
  JLabel lblZahl = new JLabel("Кол-во");
  JLabel lblEinheit = new JLabel("Единицы");
  JLabel lblZusatzInfo = new JLabel("Дополнительная информация о заказе");
  JLabel lblTermin = new JLabel("Срок поставки");
   JTextArea gesammt = new  JTextArea("");
    JTextArea ware = new JTextArea("");
    
    JTextArea zahl = new JTextArea("");
     JTextArea einheit = new JTextArea();
      JTextArea zusatzInfo = new JTextArea();
       JTextArea wunschTermin = new JTextArea();
       JButton weiter = new JButton(" Внести товар в заявку");
       JButton fertig = new JButton("<html><font color = red>готово</font></html>");
       JPanel rowPanel = new JPanel();
       //JPanel anzeige = new JPanel();
      JScrollPane feld = new JScrollPane(gesammt,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED); 
        String lineSeparator = System.getProperty("line.separator");
   
        Druckform df = new Druckform();
        
        
       
              AbtFrame af = new AbtFrame();
               PSPFrame pf = new PSPFrame();
         
            
       
      
    public RowFrame( ) throws FileNotFoundException, InterruptedException{
      super("Thyssen Schachtbau GmbH");
        this.setSize(1300, 600);
        this.setLocation(50, 50);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
       
        setContentPane(rowPanel);
       lblWare.setLocation(15, 150);
       lblWare.setSize(150, 10);
       lblZahl.setSize(50, 10);
       lblZahl.setLocation(310, 73);
       lblEinheit.setSize(80, 10);
       lblEinheit.setLocation(370, 73);
       lblZusatzInfo.setSize(230, 10);
       lblZusatzInfo.setLocation(435, 150);
       lblTermin.setSize(100, 10);
       lblTermin.setLocation(735, 73);
       kopf.setSize(400, 100);
       kopf.setLocation(950, 30);
        rowPanel.setLayout(null);
       rowPanel.setBackground(Color.LIGHT_GRAY);
        fertig.setSize(80, 30);// кнопка завершения работы с заявкой
        fertig.setLocation(5, 5);
        weiter.setSize(200, 30);// кнопка записи и перехода к следующей позиции
        weiter.setLocation(90, 5);
       ware.setSize(300, 100);
       ware.setLocation(5, 40);
       ware.setLineWrap(true);
       ware.setToolTipText("<html><font size = +2 color = blue>здесь пишем название и другие характеристики товара</font></html>");
        zahl.setSize(50, 50);
        zahl.setLocation(310, 90);
        zahl.setToolTipText("<html><font size = +2 color = blue>здесь указываем количество единиц товара в заказе</font></html>");
       einheit.setSize(50, 50);
       einheit.setLocation(370, 90);
       einheit.setToolTipText("<html><font size = +2 color = blue>здесь пишем название единиц измерения</font></html>");
        zusatzInfo.setSize(300, 100);
        zusatzInfo.setLocation(425, 40);
        zusatzInfo.setLineWrap(true);
        zusatzInfo.setToolTipText("<html><font size = +2 color = blue>здесь пишем дополнительную информацию о позиции в заказе, например номер чертежа</font></html>");
       wunschTermin.setSize(150, 50);
       wunschTermin.setLocation(730, 90);
       wunschTermin.setToolTipText("<html><font size = +2 color = blue>когда товар должен поступить на стройку?(календарная неделя- КН)</font></html>");
      feld.setSize(1275, 400);// поле прокрутки, на котором размещаем текстовую область
      feld.setLocation(5, 170);
       gesammt.setSize(1275, 450);
       gesammt.setLineWrap(true);
       gesammt.setEditable(false);
    
           weiter.addActionListener(new WeiterButtonEventListener());
           fertig.addActionListener(new FertigButtonEventListener());
      rowPanel.add(ware);// добавляем элементы на панель
       rowPanel.add(zahl);
        rowPanel.add(einheit);
         rowPanel.add(zusatzInfo);
          rowPanel.add(wunschTermin);
           rowPanel.add(weiter);
            rowPanel.add(fertig);
              rowPanel.add(feld);
              rowPanel.add(lblWare);
              rowPanel.add(lblZahl);
              rowPanel.add(lblEinheit);
              rowPanel.add(lblZusatzInfo);
              rowPanel.add(lblTermin);
              rowPanel.add(kopf);
             
            af.setVisible(true);
          pf.setVisible(true); 
          abteilung = af.abt;
    }           
          
          
          
    
 class WeiterButtonEventListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           
          
            df.psp = pf.psp;
           df.pos = count ;
           df.beschreibung = ware.getText();
           df.mengeEinh = zahl.getText() +" "+ einheit.getText();
           df.spezifik = zusatzInfo.getText();
           df.termin = wunschTermin.getText();
            df.newLine();
             // здесь происходит запись товара в новую строку заявки
            
                          
             if(ware.getText().equals("")){JOptionPane.showMessageDialog(null,"Не указано наименование товара!", "Описание товара",JOptionPane.PLAIN_MESSAGE);
             }else if(zahl.getText().equals("")){JOptionPane.showMessageDialog(null,"Не указано количество в заказе!", "Количество единиц",JOptionPane.PLAIN_MESSAGE);
             }else if(einheit.getText().equals("")){JOptionPane.showMessageDialog(null,"Не указаны единицы измерения( шт., кг., т., и т.д.)!", "Единыцы измерения",JOptionPane.PLAIN_MESSAGE);
             }else{
            
            text =  text + "pos." + count+  "|--|"+ ware.getText()+ "|--|"+ zahl.getText()+" "+ einheit.getText()+ "|--|"+ zusatzInfo.getText()+"|--|"+ wunschTermin.getText()+ "|--|" +  System.lineSeparator();
          gesammt.setText(text);
           count++;
            ware.setText("");
            zahl.setText("");
            einheit.setText("");
            zusatzInfo.setText("");
            wunschTermin.setText("");
          
        }
    }
 }
     class FertigButtonEventListener implements ActionListener {
         
                 
     
        @Override
        public void actionPerformed(ActionEvent e) {
          String  abtNR = "";
          String  skNR = "";
         
            
            try {
                 abtNR = getAbtNr();
                   df.cell07.setCellValue(abtNR);
               
                 skNR = getSK();
               df.cell17.setCellValue(skNR);
                
                File filePath = new File("\\\\192.168.1.240\\Public\\0OMTC\\", skNR+ ".xls");
                File filePath1 = new File(skNR + ".xls");
                
                try {
                
                BufferedReader reader = new BufferedReader(new FileReader("name.txt"));
                name = reader.readLine();
                    reader.close();
            } catch (IOException ex) {
                name = "____________________";
                Logger.getLogger(RowFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
                df.abtNummer = abtNR;
                df.skNummer = skNR;
                df.unterSrifften(name);
               FileOutputStream fos = new FileOutputStream(filePath);
               FileOutputStream fos1 = new FileOutputStream(filePath1);
                //for(int i =0; i < 20; i++){
                //   df.newLine(bezeichnung, menge,spez, psp , date);
                Header header = df.sheet0.getHeader();
                header.setCenter("Suedbergwerk SKRU-2/ Южный рудник СКРУ-2");
                header.setLeft("Thyssen Schachtbau GmbH");
                header.setRight(abtNR + "\n SK № "+ skNR );
                HSSFHeader.fontSize((short) 8);
                Footer footer = df.sheet0.getFooter();
                footer.setRight( "Страница " + HeaderFooter.page() + " из " + HeaderFooter.numPages() );
              
                df.wb.write(fos); 
                df.wb.write(fos1);
                df.wb.close();
                df.wb.close();
                
            } catch (FileNotFoundException ex) {
                abtNR = "";
                Logger.getLogger(RowFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                 abtNR = "";
                Logger.getLogger(RowFrame.class.getName()).log(Level.SEVERE, null, ex);
            } 
                
           
               
            
             
            if(text.equals("")){JOptionPane.showMessageDialog(null,"Вы не добавили ни одной позиции в заказ!", "Позиции заказа",JOptionPane.PLAIN_MESSAGE);
             }else{
          
           
           
          
             
           
            
               SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yy");
               String date = sdf.format(new Date());
            
          
              String appendText = abtNR + " ###  SK-Nr. "+ skNR +"   "+ date + "   " +lineSeparator;
    
          String filePro = "\\\\192.168.1.240\\Public\\111Anforderungen\\protokol.txt";
          //String filePro = "protokol.txt";//  блок записи в протокол 
        String text = appendText;

        try {
            Files.write(Paths.get(filePro), text.getBytes(), StandardOpenOption.APPEND);
        }
        catch (IOException xe) {
            System.out.println(xe);
        }
         fertig.setVisible(false);
         weiter.setVisible(false);
        
        }
        }
        
       
    }
    
  
   public String getAbtNr() throws FileNotFoundException, IOException {
       Date date = new Date();
     String abtStr = af.abt;  // получаем шифр отдела из данных формы выбора отдела
   
     
           int nrAbt = 0;
     
 //BufferedReader reader1 = new BufferedReader(new FileReader("\\\\192.168.1.240\\Public\\0OMTC\\abteilungen\\"+ abtStr + ".txt"));
  BufferedReader reader1 = new BufferedReader(new FileReader("\\\\192.168.1.240\\Public\\111Anforderungen\\abteilungen\\" + abtStr+ ".txt"));
  String tmp = reader1.readLine();
 
 tmp = tmp.trim();
 
      String[] abtString = tmp.split(" | \\s ");
     
      nrAbt = Integer.parseInt(abtString[0]) + 1; // получаем новый номер по отделу добавляя единицу

 String ss= Integer.toString(nrAbt);
      ss = " "+ ss + " letzte Anforderung erstellt " + date.toString();
      FileWriter fw = new FileWriter("\\\\192.168.1.240\\Public\\111Anforderungen\\abteilungen\\" + abtStr+ ".txt");
     //  FileWriter fw = new FileWriter("\\\\192.168.1.240\\Public\\0OMTC\\abteilungen\\" + abtStr+ ".txt");
             fw.write(ss);
         
         fw.close(); // записали в файл информацию о крайней заявке по отделу.
 
  
 reader1.close();
      return abtStr+ " " + nrAbt;// получаем номер по отделу
   }
   public String getSK() throws FileNotFoundException, IOException{
        String tempSK = "";
        int skNummer = 0;
        BufferedReader readerSK = new BufferedReader ( new FileReader ("\\\\192.168.1.240\\Public\\111Anforderungen\\skNR.txt"));
      
            
                        
                          tempSK = readerSK.readLine();
                          tempSK = tempSK.trim();
                          String[] abtBasicFile = tempSK.split(" | \\s");
                          skNummer = Integer.parseInt(abtBasicFile[0])+1;// обновленный номер SK
                     readerSK.close();
   
   
     SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yy");
               String dateSK = sdf.format(new Date());
   
         FileWriter fwSK = null;
        try {
           fwSK = new FileWriter("\\\\192.168.1.240\\Public\\111Anforderungen\\skNR.txt");
            // fwSK = new FileWriter("skNR.txt");
        } catch (IOException ex) {
            Logger.getLogger(RowFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
                 try (BufferedWriter ffSK = new BufferedWriter(fwSK)) {
            
              tempSK = Integer.toString(skNummer);
                
                ffSK.write(" " +tempSK + " letzte Anforderung erstellt "+dateSK); // записали в главный файл отдела текущий номер заявки
                ffSK.close();
                 
            }catch(FileNotFoundException eee){} catch (IOException ex) {
                tempSK = "";
            Logger.getLogger(RowFrame.class.getName()).log(Level.SEVERE, null, ex);
        } 
       return tempSK;
   }
}
   
   
  
   


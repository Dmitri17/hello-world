/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excelanforderung0;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 * в этом классе создаем и наполняем окно для записи ПСП-элементов
 * По мере изменения картины работы на стройке нужно менять и состав класса.
 * вариант для получения заявки в Excel
 * @author lepeschko
 */
public class PSPFrame extends JFrame { 
    
  public  String psp= "";
String tlt = "Thyssen Schachtbau GmbH";
    JCheckBox box1 = new JCheckBox("110- Площадка для стволов Временные здания и сооружения", false);
      JCheckBox box2 = new JCheckBox("230- Заморозка Ствол 1 и 2", false);
        JCheckBox box3 = new JCheckBox("310- Строительство вспомог. объектов(склад, насосная пожаротушения",false);
         JCheckBox box4 = new JCheckBox("405- Монтаж копра и проходч. оборудования Ствол 1", false);
          JCheckBox box5 = new JCheckBox("410- Проходка техотхода Ствол 1", false);
           JCheckBox box6 = new JCheckBox("415- Проходка в зоне замораживания Ствол 1", false);
            JCheckBox box7 = new JCheckBox("420- Проходка в соляной части ствола Ствол 1", false);
             JCheckBox box8 = new JCheckBox("430- Армировка ствола Ствол 1", false);
              JCheckBox box9 = new JCheckBox("440- Монтаж копра и проходч. оборудования Ствол 2", false);
               JCheckBox box10 = new JCheckBox("445- Проходка техотхода Ствол 2", false);
                JCheckBox box11 = new JCheckBox("450- Проходка в зоне замораживания пород Ствол 2", false);
      JLabel labPSP = new JLabel();
      
      JLabel pspLab = new JLabel();
      JPanel panPSP = new JPanel();
      JButton okButton = new JButton("Сохранить ПСП-элементы");
  public  PSPFrame() throws InterruptedException {// в конструкторе создаем строки  и коробочки для выбора ПСП-элементов
        super("Thyssen Schachtbau GmbH");
       labPSP.setText("<html> <l> <font size = +1 color = green> Выберите ПСП-элементы, для которых будут использованы материалы</font></l></html>");
      
       panPSP.add(labPSP);
       panPSP.add(box1);
       panPSP.add(box2);
       panPSP.add(box3);
       panPSP.add(box4);
       panPSP.add(box5);
       panPSP.add(box6);
       panPSP.add(box7);
       panPSP.add(box8);
       panPSP.add(box9);
       panPSP.add(box10);
       panPSP.add(box11);
       panPSP.add(pspLab);
       panPSP.add(pspLab);
       pspLab.setText("");// резервное инфо.
        okButton.addActionListener(new ButtonEventListener());
       panPSP.add(okButton);
      setContentPane(panPSP); 
      Container panPSP = this.getContentPane(); 
      panPSP.setLayout(new GridLayout(14, 1, 1, 1));
      this.setSize(800, 600);
      this.setLocation(50, 50);
      this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      this.setBounds(50, 50, 800, 600);// определяем расположение окна 50,50 и размер 800,600
      
       Thread th = new Thread(){
         public  void run(){
             
               
           }
           
       };
       th.sleep(0);
  
  }
 class ButtonEventListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           String message = "";
           if(box1.isSelected())message += box1.getText().substring(0,3) + "--";
            if(box2.isSelected())message += box2.getText().substring(0,3) + "--";
             if(box3.isSelected())message += box3.getText().substring(0,3) + "--";
              if(box4.isSelected())message += box4.getText().substring(0,3) + "--";
               if(box5.isSelected())message += box5.getText().substring(0,3) + "--";
                if(box6.isSelected())message += box6.getText().substring(0,3) + "--";
                 if(box7.isSelected())message += box7.getText().substring(0,3) + "--";
                  if(box8.isSelected())message += box8.getText().substring(0,3) + "--";
                   if(box9.isSelected())message += box9.getText().substring(0,3) + "--";
                    if(box10.isSelected())message += box10.getText().substring(0,3) + "--";
                     if(box11.isSelected())message += box11.getText().substring(0,3) + "--";
             
                          
             if(message.equals("")){JOptionPane.showMessageDialog(null,"Выберите ПСП- Элемент!!!", "Выбор ПСП-элемента",JOptionPane.PLAIN_MESSAGE);
             }
             else { labPSP.setText("<html> <l> <font size = +1 color = green>вы выбрали следующие ПСП-элементы: " + message + "</font></l></html>");
             okButton.setVisible(false);
             psp = message;
               try {
                   //File dir = new File("");
                   File file = new File("pspErgebnis.txt");
                   
                   FileWriter   pspOut = new FileWriter(file);// записывает во временный файл на компе текущее значение псп
                   pspOut.write(message);
                   pspOut.close();
                   
               } catch (IOException ex) {
                   Logger.getLogger(PSPFrame.class.getName()).log(Level.SEVERE, null, ex);
               }
             }
            
        }
     
 }
 public String getPSP(){
     return psp;
 }
      
                                           
  
 

 
  
}

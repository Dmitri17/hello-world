/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excelanforderung0;

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
 *
 * @author lepeschko
 */
public class AbtFrame extends JFrame {
   String abt = "";
     JLabel lbl = new JLabel("<html><l><font size = +1 color = blue>Выберите свой отдел</font></l></html>");
        JButton amButton = new JButton("AM- Автотранспортный отдел");
        JButton bButton = new JButton("B-Отдел строительства наземного комплекса");
        JButton buchButton = new JButton("BH-Бухгалтерия");
        JButton bmaButton = new JButton("BMA- Бетонно- растворный узел");
        JButton dButton = new JButton("D- Диспетчеры");
        JButton eButton = new JButton("E- Отдел главного энергетика");
        JButton gButton = new JButton("G- Отдел заморозки");
        JButton mtoButton = new JButton("MTO- Отдел снабжения");
        JButton hseButton = new JButton("HSE- Отдел охранв труда и промбезопасности");
        JButton itButton = new JButton("IT- Отдел информационных технологий");
        JButton lButton = new JButton("L- Руководство стройплощадки");
        JButton mButton = new JButton("M- Механический отдел (D. Schilling)");
        JButton ogmButton = new JButton("OGM- Отдел главного механика");
        JButton ptoButton = new JButton("PTO- Производственно-технический отдел");
        JButton ut1Button = new JButton("UT1- Участок подземных работ № 1");
        JButton ut2Button = new JButton("UT2- Участок подземных работ №2");
        JButton vButton = new JButton("V- Маркшейдерский отдел");
        JButton vwButton = new JButton("VW- Завхоз");
        JButton okButton = new JButton("<html><font size = +1 color = blue>Продолжить</font></html>");
        JPanel panAbt = new JPanel();
    public AbtFrame() throws InterruptedException{
        super("Thyssen Schachtbau GmbH");
        panAbt.add(lbl);
        panAbt.add(amButton);
        panAbt.add(bButton);
        panAbt.add(buchButton);
         panAbt.add(bmaButton);
          panAbt.add(dButton);
           panAbt.add(eButton);
            panAbt.add(gButton);
             panAbt.add(mtoButton);
              panAbt.add(hseButton);
               panAbt.add(itButton);
                panAbt.add(lButton);
                 panAbt.add(mButton);
                  panAbt.add(ogmButton);
                   panAbt.add(ptoButton);
                    panAbt.add(ut1Button);
                     panAbt.add(ut2Button);
                      panAbt.add(vButton);
                       panAbt.add(vwButton);
                         panAbt.add(okButton);
        setContentPane(panAbt);
        panAbt.setLayout(new GridLayout(20,1,1,1));
        this.setSize(500, 600);
        this.setLocation(850, 50);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        amButton.addActionListener(new AmButtonEventlistener());
        bButton.addActionListener(new BButtonEventlistener());
        buchButton.addActionListener(new BhButtonEventlistener());
        bmaButton.addActionListener(new BmaButtonEventlistener());
        dButton.addActionListener(new DButtonEventlistener());
        eButton.addActionListener(new EButtonEventlistener());
        gButton.addActionListener(new GButtonEventlistener());
        mtoButton.addActionListener(new MtoButtonEventlistener());
        hseButton.addActionListener(new HseButtonEventlistener());
        itButton.addActionListener(new ItButtonEventlistener());
        lButton.addActionListener(new LButtonEventlistener());
        mButton.addActionListener(new MButtonEventlistener());
        ogmButton.addActionListener(new OgmButtonEventlistener());
        ptoButton.addActionListener(new PtoButtonEventlistener());
        ut1Button.addActionListener(new Ut1ButtonEventlistener());
        ut2Button.addActionListener(new Ut2ButtonEventlistener());
        vButton.addActionListener(new VButtonEventlistener());
        vwButton.addActionListener(new VwButtonEventlistener());
        okButton.addActionListener(new OkButtonEventlistener());
         Thread th = new Thread(){
         public  void run(){
             
               
           }
           
       };
       th.sleep(0);
       
    }
    
    
         

    private  class AmButtonEventlistener implements ActionListener {

                       @Override
        public void actionPerformed(ActionEvent e) { 
            abt = "AM-";
            lbl.setText("<html><l><font size = +1  color = blue>выбран автотранспортный отдел - AM</font></l></html>");
            
                 }
    }
   private  class BButtonEventlistener implements ActionListener {
                       @Override
        public void actionPerformed(ActionEvent e) { 
            abt = "B-";
            lbl.setText("<html><l><font size = +1 color = blue>выбран отдел наземного строительства- B</font></l></html>");
                   }
    }
    private  class BhButtonEventlistener implements ActionListener {
                       @Override
        public void actionPerformed(ActionEvent e) { 
            abt = "BH-";
            lbl.setText("<html><l ><font size = +1 color = blue>выбрана бухгалтерия - BH</font></l></html>");
                  }
    }
     private  class BmaButtonEventlistener implements ActionListener {
                       @Override
        public void actionPerformed(ActionEvent e) { 
            abt = "BMA-";
            lbl.setText("<html><l><font size = +1 color = blue>выбран бетонно-растворный узел - BMA</font></l></html>");
              }
    }
      private  class DButtonEventlistener implements ActionListener {
                       @Override
        public void actionPerformed(ActionEvent e) { 
            abt = "D-";
            lbl.setText("<html><l><font size = +1 color = blue>выбраны диспетчеры - D</font></l></html>");
              }
    }
       private  class EButtonEventlistener implements ActionListener {
                       @Override
        public void actionPerformed(ActionEvent e) { 
            abt = "E-";
            lbl.setText("<html><l><font size = +1 color = blue>выбран отдел главного энергетика - E</font></l></html>");
               }
    }
        private  class GButtonEventlistener implements ActionListener {
                       @Override
        public void actionPerformed(ActionEvent e) { 
            abt = "G-";
            lbl.setText("<html><l><font size = +1 color = blue>выбран отдел заморозки - G</font></l></html>");
               }
    }
         private  class MtoButtonEventlistener implements ActionListener {
                       @Override
        public void actionPerformed(ActionEvent e) { 
            abt = "MTO-";
            lbl.setText("<html><l><font size = +1 color = blue>выбран отдел снабжения - MTO</font></l></html>");
                 }
    }
          private  class HseButtonEventlistener implements ActionListener {
                       @Override
        public void actionPerformed(ActionEvent e) { 
            abt = "HSE-";
            lbl.setText("<html><l><font size = +1 color = blue>выбран отдел охраны труда - HSE</font></l></html>");
               }
    }
           private  class ItButtonEventlistener implements ActionListener {
                       @Override
        public void actionPerformed(ActionEvent e) { 
            abt = "IT-";
            lbl.setText("<html><l><font size = +1 color = blue>выбран отдел информационных технологий - IT</font></l></html>");
             }
    }
            private  class LButtonEventlistener implements ActionListener {
                       @Override
        public void actionPerformed(ActionEvent e) { 
            abt = "L-";
            lbl.setText("<html><l><font size = +1 color = blue>заявка от имени руководства  - L</font></l></html>");
            }
    }
             private  class MButtonEventlistener implements ActionListener {
                       @Override
        public void actionPerformed(ActionEvent e) { 
            abt = "M-";
            lbl.setText("<html><l><font size = +1 color = blue>выбран механический отдел( D.Schilling) - M</font></l></html>");
              }
    }
              private  class OgmButtonEventlistener implements ActionListener {
                       @Override
        public void actionPerformed(ActionEvent e) { 
            abt = "OGM-";
            lbl.setText("<html><l><font size = +1 color = blue>выбран отдел главного механика- OGM</font></l></html>");
               }
    }
               private  class PtoButtonEventlistener implements ActionListener {
                       @Override
        public void actionPerformed(ActionEvent e) { 
            abt = "PTO-";
            lbl.setText("<html><l><font size = +1 color = blue>выбран производственно- технический отдел - PTO</font></l></html>");
                 }
    }
                private  class Ut1ButtonEventlistener implements ActionListener {
                       @Override
        public void actionPerformed(ActionEvent e) { 
            abt = "UT1-";
            lbl.setText("<html><l><font size = +1 color = blue>выбран участок подземных работ №1 - UT1</font></l></html>");
               }
    }
                 private  class Ut2ButtonEventlistener implements ActionListener {
                       @Override
        public void actionPerformed(ActionEvent e) { 
            abt = "UT2-";
            lbl.setText("<html><l><font size = +1 color = blue>выбран участок подземных работ №2 - UT2</font></l></html>");
              }
    }
                 private  class VButtonEventlistener implements ActionListener {
                       @Override
        public void actionPerformed(ActionEvent e) { 
            abt = "V-";
            lbl.setText("<html><l><font size = +1 color = blue>выбран маркщейдерский отдел - V</font></l></html>");
                 }
    }
                 private  class VwButtonEventlistener implements ActionListener {
                       @Override
        public void actionPerformed(ActionEvent e) { 
            abt = "VW-";
            lbl.setText("<html><l><font size = +1 color = blue>выбран хозяйственный отдел - VW</font></l></html>");
                 }
    }
                 private  class OkButtonEventlistener implements ActionListener {
                       @Override
        public void actionPerformed(ActionEvent e) { 
            if(abt.equals("")){JOptionPane.showMessageDialog(null,"Выберите свой отдел!!!", "Выбор отдела",JOptionPane.PLAIN_MESSAGE);}
            else{  File file = new File("abt.txt");
                           try {
                               FileWriter fw = new FileWriter(file);
                               fw.write(abt);
                               fw.close();
        amButton.setVisible(false);
        bButton.setVisible(false);
        buchButton.setVisible(false);
        bmaButton.setVisible(false);
        dButton.setVisible(false);
        eButton.setVisible(false);
        gButton.setVisible(false);
        mtoButton.setVisible(false);
        hseButton.setVisible(false);
        itButton.setVisible(false);
        lButton.setVisible(false);
        mButton.setVisible(false);
        ogmButton.setVisible(false);
        ptoButton.setVisible(false);
        ut1Button.setVisible(false);
        ut2Button.setVisible(false);
        vButton.setVisible(false);
        vwButton.setVisible(false);
        okButton.setVisible(false);
        
                           } catch (IOException ex) {
                              
                               Logger.getLogger(AbtFrame.class.getName()).log(Level.SEVERE, null, ex);
                              
                           }
                    }
                 }
    }
   
}

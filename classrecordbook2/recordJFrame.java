
package classrecordbook2;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import javax.swing.plaf.basic.BasicTabbedPaneUI;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter; 
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Cecilio Manguilimotan Jr.
 */
public class recordJFrame extends javax.swing.JFrame {


    double percentprelim;
    double percentmidterm;
    double percentsemifinal;
    double percentfinal10;
    
    double prelim;
    double midterm;
    double semifinal;
    double final10;
    double average;
    double rankgrade;
    double average1;
    double percenttotal;
    
    int xx;
    int colcount;
    int linecount;
    int pstate = 0;
    
    public recordJFrame() {
        initComponents();
      
      jPanel4.setVisible(false);

        jTabbedPane1.setUI(new BasicTabbedPaneUI() {
        @Override  
        protected int calculateTabAreaHeight(int tab_placement, int run_count, int max_tab_height) {  
        if (jTabbedPane1.getTabCount() > 7)
        return super.calculateTabAreaHeight(tab_placement, run_count, max_tab_height);  
        else  
            return 0;  
    }  
    }); 
   
    LocalDateTime myDateObj = LocalDateTime.now();
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    String formattedDate = myDateObj.format(myFormatObj);
    dateTimejLabel11.setText(formattedDate); 
    comDateTimejLabel23.setText(formattedDate);
    
    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        importjLabel12 = new javax.swing.JLabel();
        exportjLabel13 = new javax.swing.JLabel();
        mainMenujLabel15 = new javax.swing.JLabel();
        helpjLabel11 = new javax.swing.JLabel();
        aboutjLabel19 = new javax.swing.JLabel();
        powerbuttonjLabel20 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        frameMaxMinjLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        importjPanel7 = new javax.swing.JPanel();
        importjTextField = new javax.swing.JTextField();
        importjButton3 = new javax.swing.JButton();
        buildTablejButton3 = new javax.swing.JButton();
        exportjPanel9 = new javax.swing.JPanel();
        exportjTextField1 = new javax.swing.JTextField();
        exportjButton1 = new javax.swing.JButton();
        exportjButton2 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        navigationjPanel5 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        commulativejLabel2 = new javax.swing.JLabel();
        attendancejLabel1 = new javax.swing.JLabel();
        gradecalcjLabel3 = new javax.swing.JLabel();
        weightingFactorjLabel4 = new javax.swing.JLabel();
        attendancejPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        addcolumnjButton1 = new javax.swing.JButton();
        addrowjButton1 = new javax.swing.JButton();
        attendIDjLabel1 = new javax.swing.JLabel();
        attendNamejLabel2 = new javax.swing.JLabel();
        totalDaysjLabel3 = new javax.swing.JLabel();
        daysPresentjLabel9 = new javax.swing.JLabel();
        attenddownjButton1 = new javax.swing.JButton();
        attendupjButton2 = new javax.swing.JButton();
        absentjButton3 = new javax.swing.JButton();
        presentjButton4 = new javax.swing.JButton();
        dateTimejLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        attendSearchjTextField111 = new javax.swing.JTextField();
        attendSearchjButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        attendjTable1 = new javax.swing.JTable();
        CommulativejPanel = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        comPlusColumnjButton3 = new javax.swing.JButton();
        comPlusRowjButton4 = new javax.swing.JButton();
        comIDjLabel14 = new javax.swing.JLabel();
        comNamejLabel15 = new javax.swing.JLabel();
        comTotalScorejLabel16 = new javax.swing.JLabel();
        comEarnedScorejLabel17 = new javax.swing.JLabel();
        comUpjButton5 = new javax.swing.JButton();
        comDownjButton6 = new javax.swing.JButton();
        comScorejTextField1 = new javax.swing.JTextField();
        comCopyToTbljButton7 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        comDateTimejLabel23 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        comjTextField109 = new javax.swing.JTextField();
        comSearchjButton109 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        commulativejTable1 = new javax.swing.JTable();
        Grade = new javax.swing.JPanel();
        namejLabel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        earnedScoreTextField = new javax.swing.JTextField();
        totalScoreTextField = new javax.swing.JTextField();
        computeButton1 = new javax.swing.JButton();
        lockButton2 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        gradeNamejLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        classjLabel = new javax.swing.JLabel();
        gradejLabel = new javax.swing.JLabel();
        rankjLabel = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        gradeCalcCopyTbljButton6 = new javax.swing.JButton();
        searchjTextField12 = new javax.swing.JTextField();
        percentScoreJLabel = new javax.swing.JLabel();
        searchjButton5 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        gradejTable = new javax.swing.JTable();
        weightingFactorjPanel9 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        percentPrelimjTextField2 = new javax.swing.JTextField();
        gradePrelimjTextField6 = new javax.swing.JTextField();
        percentMidTermjTextField3 = new javax.swing.JTextField();
        gradeMidTermjTextField7 = new javax.swing.JTextField();
        percentSemiFinaljTextField4 = new javax.swing.JTextField();
        gradeSemiFinaljTextField8 = new javax.swing.JTextField();
        percentFinaljTextField5 = new javax.swing.JTextField();
        gradeFinaljTextField9 = new javax.swing.JTextField();
        gradejTextField10 = new javax.swing.JTextField();
        rankGradejTextField11 = new javax.swing.JTextField();
        weightPlusRowjButton8 = new javax.swing.JButton();
        wFactorjButton8 = new javax.swing.JButton();
        computejButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        wSearchjTextField2 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        idnumber2jLabel19 = new javax.swing.JLabel();
        name2jLabel20 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        wFactorjTable2 = new javax.swing.JTable();
        helpjPanel10 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        AboutjPanel11 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBackground(new java.awt.Color(0, 18, 54));

        importjLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fileIimport8b.jpg"))); // NOI18N
        importjLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                importjLabel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                importjLabel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                importjLabel12MouseExited(evt);
            }
        });

        exportjLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fileIconexport3.jpg"))); // NOI18N
        exportjLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exportjLabel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exportjLabel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exportjLabel13MouseExited(evt);
            }
        });

        mainMenujLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homeicon7.png"))); // NOI18N
        mainMenujLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainMenujLabel15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mainMenujLabel15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mainMenujLabel15MouseExited(evt);
            }
        });

        helpjLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/helpbutton5.png"))); // NOI18N
        helpjLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helpjLabel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                helpjLabel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                helpjLabel11MouseExited(evt);
            }
        });

        aboutjLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/About7.png"))); // NOI18N
        aboutjLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutjLabel19MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aboutjLabel19MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aboutjLabel19MouseExited(evt);
            }
        });

        powerbuttonjLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/powerbutton6.png"))); // NOI18N
        powerbuttonjLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                powerbuttonjLabel20MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                powerbuttonjLabel20MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                powerbuttonjLabel20MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(helpjLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(importjLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exportjLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(powerbuttonjLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aboutjLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainMenujLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(powerbuttonjLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainMenujLabel15)
                .addGap(18, 18, 18)
                .addComponent(exportjLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(importjLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(helpjLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aboutjLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel21.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 102, 0));
        jLabel21.setText("For comments and suggestions of this free software please e-mail to cdmanguilimotan@gmail.com ");

        jLabel17.setForeground(new java.awt.Color(255, 51, 51));
        jLabel17.setText("Bluebook beta version 1.0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel17))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addGap(0, 42, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/appName8.jpg"))); // NOI18N

        frameMaxMinjLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        frameMaxMinjLabel11.setForeground(new java.awt.Color(255, 255, 255));
        frameMaxMinjLabel11.setText("MAXview");
        frameMaxMinjLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                frameMaxMinjLabel11MouseClicked(evt);
            }
        });

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("minimum resolution 1366 x 768");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(frameMaxMinjLabel11)
                .addGap(55, 55, 55)
                .addComponent(jLabel16)
                .addGap(38, 38, 38)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 53, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(frameMaxMinjLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(120, 164, 201));

        importjPanel7.setBackground(new java.awt.Color(120, 164, 201));
        importjPanel7.setForeground(new java.awt.Color(120, 164, 201));

        importjButton3.setText("Browse File to Import");
        importjButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importjButton3ActionPerformed(evt);
            }
        });

        buildTablejButton3.setText("Import File");
        buildTablejButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buildTablejButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout importjPanel7Layout = new javax.swing.GroupLayout(importjPanel7);
        importjPanel7.setLayout(importjPanel7Layout);
        importjPanel7Layout.setHorizontalGroup(
            importjPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(importjPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(importjPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(importjTextField)
                    .addComponent(importjButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(buildTablejButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        importjPanel7Layout.setVerticalGroup(
            importjPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(importjPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(importjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(importjButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buildTablejButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        exportjPanel9.setBackground(new java.awt.Color(120, 164, 201));
        exportjPanel9.setForeground(new java.awt.Color(120, 164, 201));

        exportjButton1.setText("Browse file to Export");
        exportjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportjButton1ActionPerformed(evt);
            }
        });

        exportjButton2.setText("Export File");
        exportjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportjButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout exportjPanel9Layout = new javax.swing.GroupLayout(exportjPanel9);
        exportjPanel9.setLayout(exportjPanel9Layout);
        exportjPanel9Layout.setHorizontalGroup(
            exportjPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exportjPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(exportjPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exportjTextField1)
                    .addComponent(exportjButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(exportjButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        exportjPanel9Layout.setVerticalGroup(
            exportjPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exportjPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exportjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exportjButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exportjButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(importjPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exportjPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(importjPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exportjPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        navigationjPanel5.setBackground(new java.awt.Color(30, 49, 92));

        jPanel12.setBackground(new java.awt.Color(30, 49, 92));
        jPanel12.setPreferredSize(new java.awt.Dimension(220, 220));

        commulativejLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/recordbook2.png"))); // NOI18N
        commulativejLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                commulativejLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                commulativejLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                commulativejLabel2MouseExited(evt);
            }
        });

        attendancejLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Calendar3.png"))); // NOI18N
        attendancejLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                attendancejLabel1MouseMoved(evt);
            }
        });
        attendancejLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                attendancejLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                attendancejLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                attendancejLabel1MouseExited(evt);
            }
        });
        attendancejLabel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                attendancejLabel1KeyPressed(evt);
            }
        });

        gradecalcjLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Calculator3.png"))); // NOI18N
        gradecalcjLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gradecalcjLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gradecalcjLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gradecalcjLabel3MouseExited(evt);
            }
        });

        weightingFactorjLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/weightingscale2.png"))); // NOI18N
        weightingFactorjLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                weightingFactorjLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                weightingFactorjLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                weightingFactorjLabel4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(attendancejLabel1)
                .addGap(77, 77, 77)
                .addComponent(commulativejLabel2)
                .addGap(70, 70, 70)
                .addComponent(gradecalcjLabel3)
                .addGap(49, 49, 49)
                .addComponent(weightingFactorjLabel4)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(attendancejLabel1)
                    .addComponent(commulativejLabel2)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(weightingFactorjLabel4)
                            .addComponent(gradecalcjLabel3))))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout navigationjPanel5Layout = new javax.swing.GroupLayout(navigationjPanel5);
        navigationjPanel5.setLayout(navigationjPanel5Layout);
        navigationjPanel5Layout.setHorizontalGroup(
            navigationjPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navigationjPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 1134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(379, Short.MAX_VALUE))
        );
        navigationjPanel5Layout.setVerticalGroup(
            navigationjPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navigationjPanel5Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(254, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Navigation", navigationjPanel5);

        jPanel5.setBackground(new java.awt.Color(120, 164, 201));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 153));
        jLabel5.setText("Attendance");

        addcolumnjButton1.setText("+Column");
        addcolumnjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcolumnjButton1ActionPerformed(evt);
            }
        });

        addrowjButton1.setText("+Row");
        addrowjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addrowjButton1ActionPerformed(evt);
            }
        });

        attendIDjLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        attendIDjLabel1.setText("ID");

        attendNamejLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        attendNamejLabel2.setText("Name");

        totalDaysjLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        totalDaysjLabel3.setText("Total days");

        daysPresentjLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        daysPresentjLabel9.setText("Days present");

        attenddownjButton1.setText("down");
        attenddownjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attenddownjButton1ActionPerformed(evt);
            }
        });

        attendupjButton2.setText("up");
        attendupjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendupjButton2ActionPerformed(evt);
            }
        });

        absentjButton3.setText("Absent");
        absentjButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                absentjButton3ActionPerformed(evt);
            }
        });

        presentjButton4.setText("Present");
        presentjButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presentjButton4ActionPerformed(evt);
            }
        });
        presentjButton4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                presentjButton4KeyPressed(evt);
            }
        });

        dateTimejLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dateTimejLabel11.setText("Date and Time");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("NAME");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 153));
        jLabel3.setText("TOTAL DAYS");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 153));
        jLabel9.setText("DAYS PRESENT");

        attendSearchjTextField111.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                attendSearchjTextField111KeyPressed(evt);
            }
        });

        attendSearchjButton1.setText("Search ID");
        attendSearchjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendSearchjButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(attendIDjLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(attendNamejLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1))
                                .addGap(26, 26, 26))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(237, 237, 237)
                                .addComponent(jLabel3)
                                .addGap(45, 45, 45)
                                .addComponent(totalDaysjLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(addcolumnjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addrowjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(attenddownjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(attendupjButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(absentjButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(29, 29, 29)
                                .addComponent(daysPresentjLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(presentjButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateTimejLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(attendSearchjTextField111, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(attendSearchjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(264, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 3, Short.MAX_VALUE)
                        .addComponent(dateTimejLabel11)
                        .addGap(41, 41, 41))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(attendIDjLabel1)
                                    .addComponent(jLabel1))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(attendNamejLabel2)
                                    .addComponent(jLabel2)))
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalDaysjLabel3)
                            .addComponent(daysPresentjLabel9)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addrowjButton1)
                    .addComponent(addcolumnjButton1)
                    .addComponent(attenddownjButton1)
                    .addComponent(attendupjButton2)
                    .addComponent(absentjButton3)
                    .addComponent(presentjButton4)
                    .addComponent(attendSearchjTextField111, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(attendSearchjButton1))
                .addContainerGap())
        );

        attendjTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"123", "Model Student", "0", "0"}
            },
            new String [] {
                "ID", "Name", "Total days", "Days present"
            }
        ));
        attendjTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        attendjTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                attendjTable1MouseClicked(evt);
            }
        });
        attendjTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                attendjTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(attendjTable1);

        javax.swing.GroupLayout attendancejPanel6Layout = new javax.swing.GroupLayout(attendancejPanel6);
        attendancejPanel6.setLayout(attendancejPanel6Layout);
        attendancejPanel6Layout.setHorizontalGroup(
            attendancejPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(attendancejPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        attendancejPanel6Layout.setVerticalGroup(
            attendancejPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(attendancejPanel6Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Attendance", attendancejPanel6);

        jPanel6.setBackground(new java.awt.Color(120, 164, 201));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 153));
        jLabel6.setText("Commulative");

        comPlusColumnjButton3.setText("+Column");
        comPlusColumnjButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comPlusColumnjButton3ActionPerformed(evt);
            }
        });

        comPlusRowjButton4.setText("+Row");
        comPlusRowjButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comPlusRowjButton4ActionPerformed(evt);
            }
        });

        comIDjLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comIDjLabel14.setText("ID");

        comNamejLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comNamejLabel15.setText("Name");

        comTotalScorejLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comTotalScorejLabel16.setText("Total Score");

        comEarnedScorejLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comEarnedScorejLabel17.setText("Earned Score");

        comUpjButton5.setText("Up");
        comUpjButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comUpjButton5ActionPerformed(evt);
            }
        });

        comDownjButton6.setText("Down");
        comDownjButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comDownjButton6ActionPerformed(evt);
            }
        });

        comScorejTextField1.setText("0");
        comScorejTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comScorejTextField1KeyPressed(evt);
            }
        });

        comCopyToTbljButton7.setText("copy toTable");
        comCopyToTbljButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comCopyToTbljButton7ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 51, 153));
        jLabel18.setText("Score");

        comDateTimejLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comDateTimejLabel23.setText("Date and Time");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 15, 153));
        jLabel11.setText("ID:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 15, 153));
        jLabel12.setText("Name:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 15, 153));
        jLabel13.setText("Total Score:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 15, 153));
        jLabel14.setText("Earned Score:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 15, 153));
        jLabel15.setText("Date and Time:");

        comjTextField109.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comjTextField109KeyPressed(evt);
            }
        });

        comSearchjButton109.setText("Search");
        comSearchjButton109.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comSearchjButton109ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(comPlusColumnjButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comPlusRowjButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comUpjButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(comIDjLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jLabel12))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comDownjButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comDateTimejLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(comSearchjButton109, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(comjTextField109, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comNamejLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(comCopyToTbljButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comScorejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(143, 143, 143)))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comEarnedScorejLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comTotalScorejLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(277, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(comIDjLabel14)
                    .addComponent(comNamejLabel15)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(comTotalScorejLabel16)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(comDateTimejLabel23)
                    .addComponent(jLabel15)
                    .addComponent(comEarnedScorejLabel17)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comPlusColumnjButton3)
                    .addComponent(comPlusRowjButton4)
                    .addComponent(comUpjButton5)
                    .addComponent(comDownjButton6)
                    .addComponent(comCopyToTbljButton7)
                    .addComponent(comScorejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comjTextField109, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comSearchjButton109))
                .addContainerGap())
        );

        commulativejTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"123", "Model Student", "0", "0"}
            },
            new String [] {
                "ID", "NAME", "TOTAL SCORE", "EARNED SCORE"
            }
        ));
        commulativejTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        commulativejTable1.setName(""); // NOI18N
        commulativejTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                commulativejTable1MouseClicked(evt);
            }
        });
        commulativejTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                commulativejTable1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                commulativejTable1KeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(commulativejTable1);

        javax.swing.GroupLayout CommulativejPanelLayout = new javax.swing.GroupLayout(CommulativejPanel);
        CommulativejPanel.setLayout(CommulativejPanelLayout);
        CommulativejPanelLayout.setHorizontalGroup(
            CommulativejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CommulativejPanelLayout.createSequentialGroup()
                .addGroup(CommulativejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        CommulativejPanelLayout.setVerticalGroup(
            CommulativejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CommulativejPanelLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Commulative", CommulativejPanel);

        namejLabel.setBackground(new java.awt.Color(28, 36, 117));
        namejLabel.setForeground(new java.awt.Color(76, 76, 76));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("GradeCalculator");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("EARNED SCORE");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("TOTAL SCORE");

        earnedScoreTextField.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        earnedScoreTextField.setForeground(new java.awt.Color(153, 0, 51));
        earnedScoreTextField.setText("100");
        earnedScoreTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                earnedScoreTextFieldMouseClicked(evt);
            }
        });
        earnedScoreTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                earnedScoreTextFieldKeyPressed(evt);
            }
        });

        totalScoreTextField.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        totalScoreTextField.setForeground(new java.awt.Color(153, 0, 51));
        totalScoreTextField.setText("100");

        computeButton1.setText("COMPUTE");
        computeButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computeButton1ActionPerformed(evt);
            }
        });

        lockButton2.setText("LOCK");
        lockButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lockButton2ActionPerformed(evt);
            }
        });

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Calibration");

        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("MAX = 100% : 95 : 1        MIN = 75% : 75 : 3       BELOW 70% = GRADE 70   RANK 5");

        gradeNamejLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gradeNamejLabel28.setForeground(new java.awt.Color(152, 0, 51));
        gradeNamejLabel28.setText("ID FirstName FamilyName");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("% SCORE");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("LETTER");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("GRADE");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("RANK");

        classjLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        classjLabel.setForeground(new java.awt.Color(153, 0, 51));
        classjLabel.setText("A+");

        gradejLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        gradejLabel.setForeground(new java.awt.Color(153, 0, 51));
        gradejLabel.setText("95");

        rankjLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        rankjLabel.setForeground(new java.awt.Color(153, 0, 51));
        rankjLabel.setText("1");

        jButton5.setText("+ ROW");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        gradeCalcCopyTbljButton6.setText("COPY TO TABLE");
        gradeCalcCopyTbljButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradeCalcCopyTbljButton6ActionPerformed(evt);
            }
        });

        percentScoreJLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        percentScoreJLabel.setForeground(new java.awt.Color(153, 0, 51));
        percentScoreJLabel.setText("100");

        searchjButton5.setText("SEARCH ID");
        searchjButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchjButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout namejLabelLayout = new javax.swing.GroupLayout(namejLabel);
        namejLabel.setLayout(namejLabelLayout);
        namejLabelLayout.setHorizontalGroup(
            namejLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(namejLabelLayout.createSequentialGroup()
                .addGroup(namejLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(namejLabelLayout.createSequentialGroup()
                        .addGroup(namejLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(namejLabelLayout.createSequentialGroup()
                                .addGroup(namejLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(namejLabelLayout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(earnedScoreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(namejLabelLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(namejLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24)
                                    .addComponent(totalScoreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(91, 91, 91)
                                .addGroup(namejLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gradeNamejLabel28)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, namejLabelLayout.createSequentialGroup()
                                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(namejLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(classjLabel)
                                            .addComponent(jLabel30)))))
                            .addGroup(namejLabelLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(namejLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(namejLabelLayout.createSequentialGroup()
                                        .addComponent(computeButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lockButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(namejLabelLayout.createSequentialGroup()
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(gradeCalcCopyTbljButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(91, 91, 91)
                                .addGroup(namejLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(searchjButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(percentScoreJLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchjTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(namejLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(namejLabelLayout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addGroup(namejLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gradejLabel))
                                .addGap(66, 66, 66)
                                .addGroup(namejLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rankjLabel)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(namejLabelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(namejLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 298, Short.MAX_VALUE))
        );
        namejLabelLayout.setVerticalGroup(
            namejLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(namejLabelLayout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(namejLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(gradeNamejLabel28))
                .addGap(11, 11, 11)
                .addGroup(namejLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(namejLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(totalScoreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(earnedScoreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel31)
                        .addComponent(jLabel32)
                        .addComponent(jLabel30)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(namejLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(namejLabelLayout.createSequentialGroup()
                        .addGroup(namejLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(computeButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lockButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(namejLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gradeCalcCopyTbljButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(namejLabelLayout.createSequentialGroup()
                        .addGroup(namejLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(percentScoreJLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(namejLabelLayout.createSequentialGroup()
                                .addGroup(namejLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rankjLabel)
                                    .addComponent(classjLabel)
                                    .addComponent(gradejLabel))
                                .addGap(8, 8, 8)))
                        .addGroup(namejLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(namejLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(searchjButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(searchjTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(namejLabelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel26)
                                .addContainerGap())))))
        );

        gradejTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"123", "MODEL", "100", "100", "100", "A+", "95", "1"}
            },
            new String [] {
                "ID", "NAME", "MAX SCORE", "EARNED SCORE", "% SCORE", "CLASS", "GRADE", "RANK"
            }
        ));
        gradejTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gradejTableMouseClicked(evt);
            }
        });
        gradejTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                gradejTableKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                gradejTableKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(gradejTable);

        javax.swing.GroupLayout GradeLayout = new javax.swing.GroupLayout(Grade);
        Grade.setLayout(GradeLayout);
        GradeLayout.setHorizontalGroup(
            GradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(namejLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(GradeLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        GradeLayout.setVerticalGroup(
            GradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GradeLayout.createSequentialGroup()
                .addComponent(namejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("GradeCalc", Grade);

        weightingFactorjPanel9.setBackground(new java.awt.Color(28, 36, 117));

        jPanel8.setBackground(new java.awt.Color(28, 36, 117));
        jPanel8.setForeground(new java.awt.Color(76, 76, 76));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("WeightingFactor");

        percentPrelimjTextField2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        percentPrelimjTextField2.setText("25");

        gradePrelimjTextField6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        gradePrelimjTextField6.setText("95");

        percentMidTermjTextField3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        percentMidTermjTextField3.setText("25");

        gradeMidTermjTextField7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        gradeMidTermjTextField7.setText("95");

        percentSemiFinaljTextField4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        percentSemiFinaljTextField4.setText("25");

        gradeSemiFinaljTextField8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        gradeSemiFinaljTextField8.setText("95");

        percentFinaljTextField5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        percentFinaljTextField5.setText("25");

        gradeFinaljTextField9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        gradeFinaljTextField9.setText("95");
        gradeFinaljTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                gradeFinaljTextField9KeyPressed(evt);
            }
        });

        weightPlusRowjButton8.setText("+ ROW");
        weightPlusRowjButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightPlusRowjButton8ActionPerformed(evt);
            }
        });

        wFactorjButton8.setText("% LOCK");
        wFactorjButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wFactorjButton8ActionPerformed(evt);
            }
        });

        computejButton5.setText("COMPUTE");
        computejButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computejButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("COPY TO TABLE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton12.setText("SEARCH ID");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("%");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("%");

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("%");

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("%");

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("PRELIM");

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("MIDTERM");

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("SEMIFINAL");

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("FINAL");

        idnumber2jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        idnumber2jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        idnumber2jLabel19.setText("ID NUMBER");

        name2jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        name2jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        name2jLabel20.setText("NAME");

        wFactorjTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"123", "Model Student", "95", "25", "95", "25", "95", "25", "95", "25", "95", "1"}
            },
            new String [] {
                "ID", "NAME", "PRELIM", "% PRELIM", "MIDTERM", "% MIDTERM", "SEMIFINAL", "%SEMIFINAL", "FINAL", "%SEMIFINAL", "GRADE", "RANKGRADE"
            }
        ));
        wFactorjTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wFactorjTable2MouseClicked(evt);
            }
        });
        wFactorjTable2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                wFactorjTable2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                wFactorjTable2KeyReleased(evt);
            }
        });
        jScrollPane4.setViewportView(wFactorjTable2);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gradePrelimjTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(percentPrelimjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel38))
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(weightPlusRowjButton8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gradeMidTermjTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(percentMidTermjTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel39))
                                    .addComponent(jLabel42))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel43)
                                    .addComponent(gradeSemiFinaljTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(percentSemiFinaljTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel40))))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8)))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(percentFinaljTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel33))
                                    .addComponent(gradeFinaljTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel44))
                                .addGap(49, 49, 49)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(gradejTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(computejButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rankGradejTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(wSearchjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(idnumber2jLabel19)))
                            .addComponent(wFactorjButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(760, 760, 760)
                        .addComponent(name2jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4))
                .addGap(0, 320, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wFactorjButton8)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(percentPrelimjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(percentMidTermjTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(percentSemiFinaljTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(percentFinaljTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gradejTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rankGradejTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39)
                    .addComponent(jLabel40)
                    .addComponent(jLabel33))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(wSearchjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton12))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(gradePrelimjTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(gradeMidTermjTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(gradeSemiFinaljTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(gradeFinaljTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(computejButton5)
                        .addComponent(jButton6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42)
                    .addComponent(jLabel43)
                    .addComponent(jLabel44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(weightPlusRowjButton8)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(idnumber2jLabel19)
                        .addComponent(name2jLabel20)))
                .addGap(0, 0, 0)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout weightingFactorjPanel9Layout = new javax.swing.GroupLayout(weightingFactorjPanel9);
        weightingFactorjPanel9.setLayout(weightingFactorjPanel9Layout);
        weightingFactorjPanel9Layout.setHorizontalGroup(
            weightingFactorjPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        weightingFactorjPanel9Layout.setVerticalGroup(
            weightingFactorjPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(weightingFactorjPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 663, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("WeightingFactor", weightingFactorjPanel9);

        helpjPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Help");

        jScrollPane5.setBorder(null);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("\n\t- Input to table from button or textField is not possible without selecting a row in table.\n\t- Import and export to file will fail if you have an empty cell.\n\t- Table navigation is possible with arrow keys if table is selected.\n\t- Enter key in table cell is a shortcut of compute and copy to table buttons except in attendance.\n\t- If attendance table cell is seleted, TAB key is shorcut for absent and CTRL key is shortcut for present.\n\t- Enter and arrow up/down keys will work in Earned Score textfield provided a row in table is selected.\n\t- For weigting factor, only Final textfield have Enter and arrow down/up keys features. If textfield is selected you can use key shortcuts.\n\t- Math functions will fail if you have wrong direct input in table cells.\n\t- No undo for excess rows and columns, you can void it by filling the cells with 0.\n\t- Import and export file format is comma separated. You can put .csv extension for export and easier loading to other spreadsheet software.\n\t- Bug in second row and first added column. When data is added to table the display panel is not updated, move arrow key down and up to see the update.\n\t- Direct input to table in Score column and grade column has enter key shortcut to compute row values and add necessary data to table, eg. date and percentage.\n\t- To make sure everything is displayed on screen always click Maxview.");
        jTextArea1.setBorder(null);
        jScrollPane5.setViewportView(jTextArea1);

        javax.swing.GroupLayout helpjPanel10Layout = new javax.swing.GroupLayout(helpjPanel10);
        helpjPanel10.setLayout(helpjPanel10Layout);
        helpjPanel10Layout.setHorizontalGroup(
            helpjPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpjPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(helpjPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1503, Short.MAX_VALUE)
                    .addGroup(helpjPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        helpjPanel10Layout.setVerticalGroup(
            helpjPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpjPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Help", helpjPanel10);

        AboutjPanel11.setBackground(new java.awt.Color(28, 36, 117));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("About");

        jScrollPane6.setBorder(null);

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(28, 36, 117));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea2.setRows(5);
        jTextArea2.setText("\nThis free software will not assume any responsibility of its outcome. Design is not based on\nany Academic standard, it is inspired through observation and information shared by Teachers.\n\nUse at your own risk. Beta version 1.0\n\n\nProgram design by: Cecilio Manguilimotan Jr.");
        jTextArea2.setBorder(null);
        jScrollPane6.setViewportView(jTextArea2);

        javax.swing.GroupLayout AboutjPanel11Layout = new javax.swing.GroupLayout(AboutjPanel11);
        AboutjPanel11.setLayout(AboutjPanel11Layout);
        AboutjPanel11Layout.setHorizontalGroup(
            AboutjPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboutjPanel11Layout.createSequentialGroup()
                .addGroup(AboutjPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AboutjPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10))
                    .addGroup(AboutjPanel11Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1054, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(442, Short.MAX_VALUE))
        );
        AboutjPanel11Layout.setVerticalGroup(
            AboutjPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboutjPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(193, 193, 193)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("About", AboutjPanel11);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1528, Short.MAX_VALUE)))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void attendancejLabel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_attendancejLabel1KeyPressed
        
    }//GEN-LAST:event_attendancejLabel1KeyPressed

    private void attendancejLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendancejLabel1MouseClicked
       
        
      jTabbedPane1.setSelectedIndex(1);
      pstate = 1;
    }//GEN-LAST:event_attendancejLabel1MouseClicked

    private void commulativejLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_commulativejLabel2MouseClicked
        
        jTabbedPane1.setSelectedIndex(2);
        pstate = 2;
    }//GEN-LAST:event_commulativejLabel2MouseClicked

    private void gradecalcjLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gradecalcjLabel3MouseClicked
       
        jTabbedPane1.setSelectedIndex(3);
        pstate = 3;
    }//GEN-LAST:event_gradecalcjLabel3MouseClicked

    private void weightingFactorjLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_weightingFactorjLabel4MouseClicked
       
        jTabbedPane1.setSelectedIndex(4);
        pstate = 4;
        
        gradejTextField10.setEnabled(false);
        rankGradejTextField11.setEnabled(false);
    }//GEN-LAST:event_weightingFactorjLabel4MouseClicked

    private void addcolumnjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcolumnjButton1ActionPerformed

       DefaultTableModel model = (DefaultTableModel)attendjTable1.getModel();
       model.addColumn("Date");
       model.addColumn("Attendance");
       
                 if (attendjTable1.getValueAt(0,3) == "[2]"){ attendjTable1.setValueAt("2",0,2);
                     try {
                                  Robot r = new Robot();
                                  r.keyPress(KeyEvent.VK_ENTER);
                                  r.keyRelease(KeyEvent.VK_ENTER);
                              } catch (AWTException aWTException) {
                              }
         
                           }else{}
    }//GEN-LAST:event_addcolumnjButton1ActionPerformed

    private void addrowjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addrowjButton1ActionPerformed
      
        String[] colNames = {"Title 1", "Title 2", "Title 3", "Title4"};
        DefaultTableModel model = (DefaultTableModel)attendjTable1.getModel();
        Object[] row ={null};
        model.addRow(row);
    }//GEN-LAST:event_addrowjButton1ActionPerformed

    private void presentjButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presentjButton4ActionPerformed

try {
            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            
            String formattedDate = myDateObj.format(myFormatObj);
            dateTimejLabel11.setText(formattedDate);            
            int colCount = attendjTable1.getColumnCount();           
            int rowsel = attendjTable1.getSelectedRow();
            
            attendjTable1.setValueAt(formattedDate, rowsel, colCount - 2);
            attendjTable1.setValueAt("1", rowsel, colCount - 1);
            
            for (int i = colCount; i > 4; i -= 2) {
                String str = (String) attendjTable1.getModel().getValueAt(attendjTable1.getSelectedRow(), i - 1);
                System.out.println("i is" + i);                
                
                Integer attendcount2 = Integer.parseInt(str);
                
                xx = xx + attendcount2;
                
            }
            String value4 = (String) attendjTable1.getModel().getValueAt(0, 3);
            
            System.out.println(xx);
            String att3 = Integer.toString(xx);
            attendjTable1.setValueAt(att3, attendjTable1.getSelectedRow(), 3);
            attendjTable1.setValueAt(value4, attendjTable1.getSelectedRow(), 2);
            totalDaysjLabel3.setText(value4);
            daysPresentjLabel9.setText(att3);
            
            xx = 0;
            
            if (attendjTable1.getSelectedRow() == 0) {
                attendjTable1.setValueAt(att3, 0, 2);
                try {
                    Robot r = new Robot();
                    r.keyPress(KeyEvent.VK_ENTER);
                    r.keyRelease(KeyEvent.VK_ENTER);
                    
                } catch (AWTException aWTException) {
                }
                
            } else {
            }
        } catch (NumberFormatException numberFormatException) {
        }

    }//GEN-LAST:event_presentjButton4ActionPerformed

    private void absentjButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_absentjButton3ActionPerformed
       
    LocalDateTime myDateObj = LocalDateTime.now();
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    String formattedDate = myDateObj.format(myFormatObj);
    dateTimejLabel11.setText(formattedDate);   
        int colCount = attendjTable1.getColumnCount();      
        
        int rowsel = attendjTable1.getSelectedRow();
        attendjTable1.setValueAt(formattedDate, rowsel, colCount - 2);
        attendjTable1.setValueAt("0", rowsel, colCount - 1);
        
        
        for (int i = colCount; i > 4; i-=2){
      String str = (String) attendjTable1.getModel().getValueAt(attendjTable1.getSelectedRow(), i-1);
            System.out.println("i is"+i);        
       
        Integer attendcount2 = Integer.parseInt(str);
      
        xx = xx + attendcount2;
  
        }
        String[] value4 = new String[]{(String) attendjTable1.getValueAt(0, 3)};
        String attend2 = Arrays.toString(value4);
         System.out.println(xx);
         String att3 = Integer.toString(xx);
         attendjTable1.setValueAt(att3, attendjTable1.getSelectedRow(), 3);
         attendjTable1.setValueAt(attend2, attendjTable1.getSelectedRow(), 2);
         totalDaysjLabel3.setText(attend2);
         daysPresentjLabel9.setText(att3);
         xx=0;
    }//GEN-LAST:event_absentjButton3ActionPerformed

    private void buildTablejButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buildTablejButton3ActionPerformed

        
        switch(pstate){
        
            case 1:
                
                
                try {

                    
                            BufferedReader reader = null;

                                int charCount = 0;
                                int wordCount = 0;
                                int lineCount = 0;
                                int wordCount2 = 0;

                              try
                                {

                                    reader = new BufferedReader(new FileReader(importjTextField.getText()));
                                    String currentLine = reader.readLine();
                                        String[] words2 = currentLine.split(",");
                                        wordCount2 = wordCount2 + words2.length;
                                        System.out.println("Number Of column: "+wordCount2);
                                        colcount = wordCount2;

                                    while (currentLine != null)
                                    {
                                        lineCount++;
                                        String[] words = currentLine.split(" ");
                                        wordCount = wordCount + words.length;
                                        for (String word : words)
                                        {
                                            charCount = charCount + word.length();
                                        }
                                        currentLine = reader.readLine();
                                    }
                                    System.out.println("Number Of Chars In A File : "+charCount);
                                    System.out.println("Number Of Words In A File : "+wordCount);
                                    System.out.println("Number Of Lines In A File : "+lineCount);
                                    linecount = lineCount;
                                } 
                                catch (IOException e) 
                                {
                                }
                                        for(int i=4; i < colcount; i+=2){

                                               DefaultTableModel model = (DefaultTableModel)attendjTable1.getModel();
                                               model.addColumn("Date");
                                               model.addColumn("Attendance");

                                         if (attendjTable1.getValueAt(0,3) == "[2]"){ attendjTable1.setValueAt("2",0,2);
                                             try {
                                                          Robot r = new Robot();
                                                          r.keyPress(KeyEvent.VK_ENTER);
                                                          r.keyRelease(KeyEvent.VK_ENTER);
                                                      } catch (AWTException aWTException) {
                                                      }

                                                   }else{}
                                        }

                                   try {
                                        FileReader fr = new FileReader(importjTextField.getText());
                                        BufferedReader br = new BufferedReader(fr);

                                        DefaultTableModel model = (DefaultTableModel)attendjTable1.getModel();            
                                        Object[] lines = br.lines().toArray();
                                        model.removeRow(0);
                                                    for (Object line : lines) {
                                                        String[] row = line.toString().split(",");
                                                        model.addRow(row);
                                                    }
                                jPanel4.setVisible(false);
                                } catch (FileNotFoundException ex) {
                                    Logger.getLogger(recordJFrame.class.getName()).log(Level.SEVERE, null, ex);
                                }                     
                    break;
                } catch (Exception e) {
                }
 
        
            case 2:
                
                try{
                                BufferedReader reader = null;
                                int charCount = 0;
                                int wordCount = 0;
                                int lineCount = 0;
                                int wordCount2 = 0;

                              try
                                {
                                    reader = new BufferedReader(new FileReader(importjTextField.getText()));
                                    String currentLine = reader.readLine();
                                    String[] words2 = currentLine.split(",");
                                    wordCount2 = wordCount2 + words2.length;
                                    System.out.println("Number Of column: "+wordCount2);
                                    colcount = wordCount2;

                                    while (currentLine != null)
                                    {
                                        lineCount++;
                                        String[] words = currentLine.split(" ");
                                        wordCount = wordCount + words.length;
                                        for (String word : words)
                                        {
                                            charCount = charCount + word.length();
                                        }
                                        currentLine = reader.readLine();
                                    }

                                    System.out.println("Number Of Chars In A File : "+charCount);
                                    System.out.println("Number Of Words In A File : "+wordCount);
                                    System.out.println("Number Of Lines In A File : "+lineCount);
                                    linecount = lineCount;
                                } 
                                catch (IOException e) 
                                {

                                }

                                        for(int i=4; i < colcount; i+=2){

                                               DefaultTableModel model = (DefaultTableModel)commulativejTable1.getModel();
                                               model.addColumn("Date");
                                               model.addColumn("Score");

                                        if (commulativejTable1.getValueAt(0,3) == "[2]"){commulativejTable1.setValueAt("2",0,2);
                                             try {
                                                          Robot r = new Robot();
                                                          r.keyPress(KeyEvent.VK_ENTER);
                                                          r.keyRelease(KeyEvent.VK_ENTER);
                                                      } catch (AWTException aWTException) {
                                                      }

                                                   }else{}
                                        }

                                   try {
                                        FileReader fr = new FileReader(importjTextField.getText());
                                        BufferedReader br = new BufferedReader(fr);

                                        DefaultTableModel model = (DefaultTableModel)commulativejTable1.getModel();            
                                        Object[] lines = br.lines().toArray();
                                        model.removeRow(0);
                                                    for (Object line : lines) {
                                                        String[] row = line.toString().split(",");
                                                        model.addRow(row);
                                                    }
                                jPanel4.setVisible(false);
                                } catch (FileNotFoundException ex) {
                                    Logger.getLogger(recordJFrame.class.getName()).log(Level.SEVERE, null, ex);
                                } 
                
                
                                   break;
                
                    }catch(Exception e2){}
                
            case 3:
                
                try{
                                BufferedReader reader = null;
                                int charCount = 0;
                                int wordCount = 0;
                                int lineCount = 0;
                                int wordCount2 = 0;
                              try
                                {
                                    reader = new BufferedReader(new FileReader(importjTextField.getText()));
                                    String currentLine = reader.readLine();
                                        String[] words2 = currentLine.split(",");
                                        wordCount2 = wordCount2 + words2.length;
                                        System.out.println("Number Of column: "+wordCount2);
                                        colcount = wordCount2;
                                    while (currentLine != null)
                                    {
                                        lineCount++;
                                        String[] words = currentLine.split(" ");
                                        wordCount = wordCount + words.length;
                                        for (String word : words)
                                        {
                                            charCount = charCount + word.length();
                                        }
                                        currentLine = reader.readLine();
                                    }
                                    linecount = lineCount;
                                } 
                                catch (IOException e) 
                                {
                                }
                              
                                   try {
                                        FileReader fr = new FileReader(importjTextField.getText());
                                        BufferedReader br = new BufferedReader(fr);

                                        DefaultTableModel model = (DefaultTableModel)gradejTable.getModel();            
                                        Object[] lines = br.lines().toArray();
                                        model.removeRow(0);
                                                    for (Object line : lines) {
                                                        String[] row = line.toString().split(",");
                                                        model.addRow(row);
                                                    }
                                jPanel4.setVisible(false);
                                } catch (FileNotFoundException ex) {
                                    Logger.getLogger(recordJFrame.class.getName()).log(Level.SEVERE, null, ex);
                                }                   
                                   break;
                                   
                   }catch(Exception e3){}
                
            case 4:
                           try{
                
                                BufferedReader reader = null;
                                int charCount = 0;
                                int wordCount = 0;
                                int lineCount = 0;
                                int wordCount2 = 0;
                                
                              try
                                {
                                    reader = new BufferedReader(new FileReader(importjTextField.getText()));
                                    String currentLine = reader.readLine();
                                    String[] words2 = currentLine.split(",");

                                        wordCount2 = wordCount2 + words2.length;
                                        System.out.println("Number Of column: "+wordCount2);
                                        colcount = wordCount2;

                                    while (currentLine != null)
                                    {
                                        lineCount++;
                                        String[] words = currentLine.split(" ");
                                        wordCount = wordCount + words.length;
                                        for (String word : words)
                                        {
                                            charCount = charCount + word.length();
                                        }
                                        currentLine = reader.readLine();
                                    }

                                    linecount = lineCount;
                                } 
                                catch (IOException e) 
                                {
     
                                }

                                   try {
                                        FileReader fr = new FileReader(importjTextField.getText());
                                        BufferedReader br = new BufferedReader(fr);

                                        DefaultTableModel model = (DefaultTableModel)wFactorjTable2.getModel();            
                                        Object[] lines = br.lines().toArray();
                                        model.removeRow(0);
                                        
                                                    for (Object line : lines) {
                                                        String[] row = line.toString().split(",");
                                                        model.addRow(row);
                                                    }
                                jPanel4.setVisible(false);
                                } catch (FileNotFoundException ex) {
                                    Logger.getLogger(recordJFrame.class.getName()).log(Level.SEVERE, null, ex);
                                }                   
                                   break;
                                   
                   }catch(Exception e3){}
        }
        
    }//GEN-LAST:event_buildTablejButton3ActionPerformed

    private void attendancejLabel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendancejLabel1MouseMoved

    }//GEN-LAST:event_attendancejLabel1MouseMoved

    private void importjButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importjButton3ActionPerformed

        JFileChooser chooser = new JFileChooser();
        chooser.setApproveButtonText("Attach selected file to Path");
        chooser.setApproveButtonMnemonic('x');
        chooser.setApproveButtonToolTipText("New approve tool tip");
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename= f.getAbsolutePath();
        importjTextField.setText(filename);
        
    }//GEN-LAST:event_importjButton3ActionPerformed

    private void gradecalcjLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gradecalcjLabel3MouseEntered

       gradecalcjLabel3.setIcon(new ImageIcon(getClass().getResource("/images/Calculator5.png")));
        
    }//GEN-LAST:event_gradecalcjLabel3MouseEntered

    private void gradecalcjLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gradecalcjLabel3MouseExited

       gradecalcjLabel3.setIcon(new ImageIcon(getClass().getResource("/images/Calculator3.png"))); 
       
    }//GEN-LAST:event_gradecalcjLabel3MouseExited

    private void mainMenujLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainMenujLabel15MouseClicked

        jTabbedPane1.setSelectedIndex(0);
        jPanel4.setVisible(false);
        exportjPanel9.setVisible(false);   
        pstate = 0;
    }//GEN-LAST:event_mainMenujLabel15MouseClicked

    private void comPlusColumnjButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comPlusColumnjButton3ActionPerformed

       DefaultTableModel model = (DefaultTableModel)commulativejTable1.getModel();
       model.addColumn("Date");
       model.addColumn("Score");
      
    }//GEN-LAST:event_comPlusColumnjButton3ActionPerformed

    private void comPlusRowjButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comPlusRowjButton4ActionPerformed

       DefaultTableModel model = (DefaultTableModel)commulativejTable1.getModel();
       Object[] row ={null};
       model.addRow(row);
       
    }//GEN-LAST:event_comPlusRowjButton4ActionPerformed

    private void comCopyToTbljButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comCopyToTbljButton7ActionPerformed

    LocalDateTime myDateObj = LocalDateTime.now();
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    
    String formattedDate = myDateObj.format(myFormatObj);
    comDateTimejLabel23.setText(formattedDate);   
        int colCount = commulativejTable1.getColumnCount();
        int rowsel = commulativejTable1.getSelectedRow();

        commulativejTable1.setValueAt(formattedDate, rowsel, colCount - 2);
        commulativejTable1.setValueAt(comScorejTextField1.getText(), rowsel, colCount - 1); 
        
          for (int i = colCount; i > 4; i-=2){
          String str = (String) commulativejTable1.getModel().getValueAt(commulativejTable1.getSelectedRow(), i-1);     
       
        Integer attendcount2 = Integer.parseInt(str);
        xx = xx + attendcount2;
  
        }
        String value4 = (String) commulativejTable1.getModel().getValueAt(0, 3);
      
         System.out.println(xx);
         String att3 = Integer.toString(xx);
         commulativejTable1.setValueAt(att3, commulativejTable1.getSelectedRow(), 3);
         commulativejTable1.setValueAt(value4, commulativejTable1.getSelectedRow(), 2);
         xx=0;
         if (commulativejTable1.getSelectedRow() == 0){commulativejTable1.setValueAt(att3,0,2);
                     try {
                                  Robot r = new Robot();
                                  r.keyPress(KeyEvent.VK_ENTER);
                                  r.keyRelease(KeyEvent.VK_ENTER);
                              } catch (AWTException aWTException) {
                              }         
                           }else{}

    }//GEN-LAST:event_comCopyToTbljButton7ActionPerformed

    private void attendancejLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendancejLabel1MouseEntered
       
        attendancejLabel1.setIcon(new ImageIcon(getClass().getResource("/images/Calendar4f.jpg")));
    }//GEN-LAST:event_attendancejLabel1MouseEntered

    private void attendancejLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendancejLabel1MouseExited
        
        attendancejLabel1.setIcon(new ImageIcon(getClass().getResource("/images/Calendar3.png")));
    }//GEN-LAST:event_attendancejLabel1MouseExited

    private void commulativejLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_commulativejLabel2MouseEntered
       
        commulativejLabel2.setIcon(new ImageIcon(getClass().getResource("/images/recordbook2f.jpg")));
    }//GEN-LAST:event_commulativejLabel2MouseEntered

    private void commulativejLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_commulativejLabel2MouseExited
       
        commulativejLabel2.setIcon(new ImageIcon(getClass().getResource("/images/recordbook2.png")));
    }//GEN-LAST:event_commulativejLabel2MouseExited

    private void weightingFactorjLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_weightingFactorjLabel4MouseEntered
     
        weightingFactorjLabel4.setIcon(new ImageIcon(getClass().getResource("/images/weightingscale2f.jpg")));
    }//GEN-LAST:event_weightingFactorjLabel4MouseEntered

    private void weightingFactorjLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_weightingFactorjLabel4MouseExited
        
        weightingFactorjLabel4.setIcon(new ImageIcon(getClass().getResource("/images/weightingscale2.png")));
    }//GEN-LAST:event_weightingFactorjLabel4MouseExited

    private void mainMenujLabel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainMenujLabel15MouseEntered
       
        mainMenujLabel15.setIcon(new ImageIcon(getClass().getResource("/images/homeicon7f.jpg")));
    }//GEN-LAST:event_mainMenujLabel15MouseEntered

    private void mainMenujLabel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainMenujLabel15MouseExited
       
         mainMenujLabel15.setIcon(new ImageIcon(getClass().getResource("/images/homeicon7.png")));
    }//GEN-LAST:event_mainMenujLabel15MouseExited

    private void exportjLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportjLabel13MouseEntered
       
        exportjLabel13.setIcon(new ImageIcon(getClass().getResource("/images/fileIconexport3f.jpg")));
    }//GEN-LAST:event_exportjLabel13MouseEntered

    private void exportjLabel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportjLabel13MouseExited
     
         exportjLabel13.setIcon(new ImageIcon(getClass().getResource("/images/fileIconexport3.jpg")));
    }//GEN-LAST:event_exportjLabel13MouseExited

    private void importjLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_importjLabel12MouseEntered
       
        importjLabel12.setIcon(new ImageIcon(getClass().getResource("/images/fileIimport8bf.jpg")));
    }//GEN-LAST:event_importjLabel12MouseEntered

    private void importjLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_importjLabel12MouseExited
        
        importjLabel12.setIcon(new ImageIcon(getClass().getResource("/images/fileIimport8b.jpg")));
    }//GEN-LAST:event_importjLabel12MouseExited

    private void helpjLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpjLabel11MouseEntered
      
       helpjLabel11.setIcon(new ImageIcon(getClass().getResource("/images/helpbutton5f.jpg")));
    }//GEN-LAST:event_helpjLabel11MouseEntered

    private void helpjLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpjLabel11MouseExited
        
        helpjLabel11.setIcon(new ImageIcon(getClass().getResource("/images/helpbutton5.png")));
    }//GEN-LAST:event_helpjLabel11MouseExited

    private void aboutjLabel19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutjLabel19MouseEntered
        
        aboutjLabel19.setIcon(new ImageIcon(getClass().getResource("/images/About7f_1.jpg")));
    }//GEN-LAST:event_aboutjLabel19MouseEntered

    private void aboutjLabel19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutjLabel19MouseExited
       
        aboutjLabel19.setIcon(new ImageIcon(getClass().getResource("/images/About7.png")));
    }//GEN-LAST:event_aboutjLabel19MouseExited

    private void powerbuttonjLabel20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_powerbuttonjLabel20MouseEntered
       
        powerbuttonjLabel20.setIcon(new ImageIcon(getClass().getResource("/images/powerbutton6f.jpg")));
    }//GEN-LAST:event_powerbuttonjLabel20MouseEntered

    private void powerbuttonjLabel20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_powerbuttonjLabel20MouseExited
        
        powerbuttonjLabel20.setIcon(new ImageIcon(getClass().getResource("/images/powerbutton6.png")));
    }//GEN-LAST:event_powerbuttonjLabel20MouseExited

    private void attenddownjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attenddownjButton1ActionPerformed
      
        int currentSelectedRow = attendjTable1.getSelectedRow();
        attendjTable1.getSelectionModel().setSelectionInterval(currentSelectedRow + 1, currentSelectedRow + 1);
        
                 DefaultTableModel model = (DefaultTableModel) attendjTable1.getModel();
                 String textField = (String) model.getValueAt(attendjTable1.getSelectedRow(),0);
                 String textField2 = (String) model.getValueAt(attendjTable1.getSelectedRow(),1);
                 String textField3 = (String) model.getValueAt(attendjTable1.getSelectedRow(),2);
                 String textField4 = (String) model.getValueAt(attendjTable1.getSelectedRow(),3);
                 
                 attendIDjLabel1.setText(textField);
                 attendNamejLabel2.setText(textField2);
                 totalDaysjLabel3.setText(textField3);
                 daysPresentjLabel9.setText(textField4);
        
        
    }//GEN-LAST:event_attenddownjButton1ActionPerformed

    private void attendupjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendupjButton2ActionPerformed
       
        int currentSelectedRow = attendjTable1.getSelectedRow();
        attendjTable1.getSelectionModel().setSelectionInterval(currentSelectedRow - 1, currentSelectedRow - 1);
        
                 DefaultTableModel model3 = (DefaultTableModel) attendjTable1.getModel();
                 String textFieldb = (String) model3.getValueAt(attendjTable1.getSelectedRow(),0);
                 String textField2b = (String) model3.getValueAt(attendjTable1.getSelectedRow(),1);
                 String textField3b = (String) model3.getValueAt(attendjTable1.getSelectedRow(),2);
                 String textField4b = (String) model3.getValueAt(attendjTable1.getSelectedRow(),3);
                 
                 attendIDjLabel1.setText(textFieldb);
                 attendNamejLabel2.setText(textField2b);
                 totalDaysjLabel3.setText(textField3b);
                 daysPresentjLabel9.setText(textField4b);
    }//GEN-LAST:event_attendupjButton2ActionPerformed

    private void attendjTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendjTable1MouseClicked
      
        int currentSelectedRow = attendjTable1.getSelectedRow();
        attendjTable1.getSelectionModel().setSelectionInterval(currentSelectedRow, currentSelectedRow);
        
        DefaultTableModel model3a = (DefaultTableModel) attendjTable1.getModel();
        String cell1 = (String) model3a.getValueAt(attendjTable1.getSelectedRow(), 0);
        String cell2 = (String) model3a.getValueAt(attendjTable1.getSelectedRow(), 1);
        String cell3 = (String) model3a.getValueAt(attendjTable1.getSelectedRow(), 2);
        String cell4 = (String) model3a.getValueAt(attendjTable1.getSelectedRow(), 3);
        
         attendIDjLabel1.setText(cell1);
         attendNamejLabel2.setText(cell2);
         totalDaysjLabel3.setText(cell3);
         daysPresentjLabel9.setText(cell4);
        
        
        
        
    }//GEN-LAST:event_attendjTable1MouseClicked

    private void attendjTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_attendjTable1KeyPressed
       if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
           
              int currentSelectedRow = attendjTable1.getSelectedRow();
              attendjTable1.getSelectionModel().setSelectionInterval(currentSelectedRow, currentSelectedRow);
        
                 DefaultTableModel model = (DefaultTableModel) attendjTable1.getModel();

                 String textField = (String) model.getValueAt(currentSelectedRow + 1,0);
                 String textField2 = (String) model.getValueAt(currentSelectedRow + 1,1);
                 String textField3 = (String) model.getValueAt(currentSelectedRow +1,2);
                 String textField4 = (String) model.getValueAt(currentSelectedRow + 1,3);
                 
                 attendIDjLabel1.setText(textField);
                 attendNamejLabel2.setText(textField2);
                 totalDaysjLabel3.setText(textField3);
                 daysPresentjLabel9.setText(textField4);
        
       
       }else{}
       
              if (evt.getKeyCode() == KeyEvent.VK_UP) {
           
              int currentSelectedRow = attendjTable1.getSelectedRow();
              attendjTable1.getSelectionModel().setSelectionInterval(currentSelectedRow, currentSelectedRow);
        
                 DefaultTableModel model = (DefaultTableModel) attendjTable1.getModel();

                 String textField = (String) model.getValueAt(currentSelectedRow - 1,0);
                 String textField2 = (String) model.getValueAt(currentSelectedRow - 1,1);
                 String textField3 = (String) model.getValueAt(currentSelectedRow - 1,2);
                 String textField4 = (String) model.getValueAt(currentSelectedRow - 1,3);
                 
                 attendIDjLabel1.setText(textField);
                 attendNamejLabel2.setText(textField2);
                 totalDaysjLabel3.setText(textField3);
                 daysPresentjLabel9.setText(textField4);
        
       
       }else{}
              
     if (evt.getKeyCode() == KeyEvent.VK_CONTROL) {
             
    LocalDateTime myDateObj = LocalDateTime.now();
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    String formattedDate = myDateObj.format(myFormatObj);
    dateTimejLabel11.setText(formattedDate);   
        int colCount = attendjTable1.getColumnCount();      
        int rowsel = attendjTable1.getSelectedRow();
        
        attendjTable1.setValueAt(formattedDate, rowsel, colCount - 2);
        attendjTable1.setValueAt("1", rowsel, colCount - 1);
             
        for (int i = colCount; i > 4; i-=2){
            String str = (String) attendjTable1.getModel().getValueAt(attendjTable1.getSelectedRow(), i-1);       
            Integer attendcount2 = Integer.parseInt(str);
            xx = xx + attendcount2;
           }
             String value4 = (String) attendjTable1.getModel().getValueAt(0, 3);
             String att3 = Integer.toString(xx);
             attendjTable1.setValueAt(att3, attendjTable1.getSelectedRow(), 3);
             attendjTable1.setValueAt(value4, attendjTable1.getSelectedRow(), 2);
             totalDaysjLabel3.setText(value4);
             daysPresentjLabel9.setText(att3);
             xx=0;
          if (attendjTable1.getSelectedRow() == 0){attendjTable1.setValueAt(att3,0,2);
                     try {
                                  Robot r = new Robot();
                                  r.keyPress(KeyEvent.VK_ENTER);
                                  r.keyRelease(KeyEvent.VK_ENTER);
                                  evt.consume();
                              } catch (AWTException aWTException) {
                              }
         
                           }else{}             
              }else{}
     
     if (evt.getKeyCode() == KeyEvent.VK_TAB) {
        evt.consume();
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);
        dateTimejLabel11.setText(formattedDate);   
        int colCount = attendjTable1.getColumnCount();
        int rowsel = attendjTable1.getSelectedRow();

        attendjTable1.setValueAt(formattedDate, rowsel, colCount - 2);
        attendjTable1.setValueAt("0", rowsel, colCount - 1);
        
        
        for (int i = colCount; i > 4; i-=2){
        String str = (String) attendjTable1.getModel().getValueAt(attendjTable1.getSelectedRow(), i-1);      
        Integer attendcount2 = Integer.parseInt(str);
        xx = xx + attendcount2;
        }
        String[] value4 = new String[]{(String) attendjTable1.getValueAt(0, 3)};
        String attend2 = Arrays.toString(value4);
         System.out.println(xx);
         String att3 = Integer.toString(xx);
         attendjTable1.setValueAt(att3, attendjTable1.getSelectedRow(), 3);
         attendjTable1.setValueAt(attend2, attendjTable1.getSelectedRow(), 2);
         totalDaysjLabel3.setText(attend2);
         daysPresentjLabel9.setText(att3);
         xx=0;                                                
                                                }else{}
        
    }//GEN-LAST:event_attendjTable1KeyPressed

    private void presentjButton4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_presentjButton4KeyPressed

               if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
           
                 int currentSelectedRow = attendjTable1.getSelectedRow();
                 attendjTable1.getSelectionModel().setSelectionInterval(currentSelectedRow, currentSelectedRow);
        
                 DefaultTableModel model = (DefaultTableModel) attendjTable1.getModel();

                 String textField = (String) model.getValueAt(currentSelectedRow + 1,0);
                 String textField2 = (String) model.getValueAt(currentSelectedRow + 1,1);
                 String textField3 = (String) model.getValueAt(currentSelectedRow + 1,2);
                 String textField4 = (String) model.getValueAt(currentSelectedRow + 1,3);
                 
                 attendIDjLabel1.setText(textField);
                 attendNamejLabel2.setText(textField2);
                 totalDaysjLabel3.setText(textField3);
                 daysPresentjLabel9.setText(textField4);
        
       
       }else{}
       
              if (evt.getKeyCode() == KeyEvent.VK_UP) {
           
              int currentSelectedRow = attendjTable1.getSelectedRow();
              attendjTable1.getSelectionModel().setSelectionInterval(currentSelectedRow, currentSelectedRow);
        
                 DefaultTableModel model = (DefaultTableModel) attendjTable1.getModel();

                 String textField = (String) model.getValueAt(currentSelectedRow - 1,0);
                 String textField2 = (String) model.getValueAt(currentSelectedRow - 1,1);
                 String textField3 = (String) model.getValueAt(currentSelectedRow - 1,2);
                 String textField4 = (String) model.getValueAt(currentSelectedRow - 1,3);
                 
                 attendIDjLabel1.setText(textField);
                 attendNamejLabel2.setText(textField2);
                 totalDaysjLabel3.setText(textField3);
                 daysPresentjLabel9.setText(textField4);
        
       
       }else{}
      
    }//GEN-LAST:event_presentjButton4KeyPressed

    private void exportjLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportjLabel13MouseClicked

     switch(pstate){
         
        case 0:
       
        jPanel4.setVisible(false);
        exportjPanel9.setVisible(false);   
        JOptionPane.showMessageDialog(null,"No active table on display");
        break;
        
         case 1:
        importjTextField.setText("");
        jPanel4.setVisible(true);
        importjPanel7.setVisible(false);
        exportjPanel9.setVisible(true);
        break;
        
        case 2:
        importjTextField.setText("");
        jPanel4.setVisible(true);
        importjPanel7.setVisible(false);
        exportjPanel9.setVisible(true);
        break;
        
        case 3:
        importjTextField.setText("");
        jPanel4.setVisible(true);
        importjPanel7.setVisible(false);
        exportjPanel9.setVisible(true);
        break;
        
        case 4:
        importjTextField.setText("");
        jPanel4.setVisible(true);
        importjPanel7.setVisible(false);
        exportjPanel9.setVisible(true);
        break;
        }
        
    }//GEN-LAST:event_exportjLabel13MouseClicked

    private void importjLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_importjLabel12MouseClicked

     switch(pstate){
        
        case 0:
       
        jPanel4.setVisible(false);
        exportjPanel9.setVisible(false); 
        JOptionPane.showMessageDialog(null,"No active table on display");
        break;
        
        case 1:
        importjTextField.setText("");
        jPanel4.setVisible(true);
        importjPanel7.setVisible(true);
        exportjPanel9.setVisible(false);
        break;
        
        case 2:
        importjTextField.setText("");
        jPanel4.setVisible(true);
        importjPanel7.setVisible(true);
        exportjPanel9.setVisible(false);
        break;
        
        case 3:
        importjTextField.setText("");
        jPanel4.setVisible(true);
        importjPanel7.setVisible(true);
        exportjPanel9.setVisible(false);
        break;
        
        case 4:
        importjTextField.setText("");
        jPanel4.setVisible(true);
        importjPanel7.setVisible(true);
        exportjPanel9.setVisible(false);
        break;
        }
    }//GEN-LAST:event_importjLabel12MouseClicked

    private void comUpjButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comUpjButton5ActionPerformed

        int currentSelectedRow = commulativejTable1.getSelectedRow();
        commulativejTable1.getSelectionModel().setSelectionInterval(currentSelectedRow - 1, currentSelectedRow - 1);
        
                 DefaultTableModel model7 = (DefaultTableModel) commulativejTable1.getModel();
                 String textFieldc = (String) model7.getValueAt(commulativejTable1.getSelectedRow(),0);
                 String textField2c = (String) model7.getValueAt(commulativejTable1.getSelectedRow(),1);
                 String textField3c = (String) model7.getValueAt(commulativejTable1.getSelectedRow(),2);
                 String textField4c = (String) model7.getValueAt(commulativejTable1.getSelectedRow(),3);
                 
                 comIDjLabel14.setText(textFieldc);
                 comNamejLabel15.setText(textField2c);
                 comTotalScorejLabel16.setText(textField3c);
                 comEarnedScorejLabel17.setText(textField4c);
        
    }//GEN-LAST:event_comUpjButton5ActionPerformed

    private void comDownjButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comDownjButton6ActionPerformed

        int currentSelectedRow = commulativejTable1.getSelectedRow();
        commulativejTable1.getSelectionModel().setSelectionInterval(currentSelectedRow + 1, currentSelectedRow + 1);
        
                 DefaultTableModel model77 = (DefaultTableModel) commulativejTable1.getModel();
                 String textField1c = (String) model77.getValueAt(commulativejTable1.getSelectedRow(),0);
                 String textField2c = (String) model77.getValueAt(commulativejTable1.getSelectedRow(),1);
                 String textField3c = (String) model77.getValueAt(commulativejTable1.getSelectedRow(),2);
                 String textField4c = (String) model77.getValueAt(commulativejTable1.getSelectedRow(),3);
                 
                 comIDjLabel14.setText(textField1c);
                 comNamejLabel15.setText(textField2c);
                 comTotalScorejLabel16.setText(textField3c);
                 comEarnedScorejLabel17.setText(textField4c);
    }//GEN-LAST:event_comDownjButton6ActionPerformed

    private void commulativejTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_commulativejTable1MouseClicked

        int currentSelectedRow = commulativejTable1.getSelectedRow();
        commulativejTable1.getSelectionModel().setSelectionInterval(currentSelectedRow, currentSelectedRow);
        
        DefaultTableModel model5a = (DefaultTableModel) commulativejTable1.getModel();
        String cell1a = (String) model5a.getValueAt(commulativejTable1.getSelectedRow(), 0);
        String cell2a = (String) model5a.getValueAt(commulativejTable1.getSelectedRow(), 1);
        String cell3a = (String) model5a.getValueAt(commulativejTable1.getSelectedRow(), 2);
        String cell4a = (String) model5a.getValueAt(commulativejTable1.getSelectedRow(), 3);
        
         comIDjLabel14.setText(cell1a);
         comNamejLabel15.setText(cell2a);
         comTotalScorejLabel16.setText(cell3a);
         comEarnedScorejLabel17.setText(cell4a);
    }//GEN-LAST:event_commulativejTable1MouseClicked

    private void commulativejTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_commulativejTable1KeyPressed
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            
           try {
                    Robot robot = new Robot();
                    robot.keyPress(KeyEvent.VK_LEFT); 
                    robot.keyRelease(KeyEvent.VK_LEFT);
                    
                    robot.keyPress(KeyEvent.VK_RIGHT); 
                    robot.keyRelease(KeyEvent.VK_RIGHT); 
             
                } catch (AWTException ex) {
                    Logger.getLogger(recordJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
        
            try{
   
                int colCount = commulativejTable1.getColumnCount();   
                int rowsel = commulativejTable1.getSelectedRow();
                String value23 = (String) commulativejTable1.getValueAt(rowsel, (colCount -1 ));
                comScorejTextField1.setText(value23);                            
                }
            
                catch(Exception e){}               
                evt.consume();
                }

               if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
           
                 int currentSelectedRow = commulativejTable1.getSelectedRow();
                 commulativejTable1.getSelectionModel().setSelectionInterval(currentSelectedRow, currentSelectedRow);
        
                 DefaultTableModel model21a = (DefaultTableModel) commulativejTable1.getModel();

                 String textFieldx8 = (String) model21a.getValueAt(currentSelectedRow + 1,0);
                 String textFieldx28 = (String) model21a.getValueAt(currentSelectedRow + 1,1);
                 String textFieldx38 = (String) model21a.getValueAt(currentSelectedRow +1,2);
                 String textFieldx48 = (String) model21a.getValueAt(currentSelectedRow + 1,3);
                 
                 comIDjLabel14.setText(textFieldx8);
                 comNamejLabel15.setText(textFieldx28);
                 comTotalScorejLabel16.setText(textFieldx38);
                 comEarnedScorejLabel17.setText(textFieldx48);
 
       }else{}
        
          if (evt.getKeyCode() == KeyEvent.VK_UP) {
           
              int currentSelectedRow = commulativejTable1.getSelectedRow();
              commulativejTable1.getSelectionModel().setSelectionInterval(currentSelectedRow, currentSelectedRow);
        
                 DefaultTableModel model21b = (DefaultTableModel) commulativejTable1.getModel();

                 String textFieldx9 = (String) model21b.getValueAt(currentSelectedRow - 1,0);
                 String textFieldx29 = (String) model21b.getValueAt(currentSelectedRow - 1,1);
                 String textFieldx39 = (String) model21b.getValueAt(currentSelectedRow - 1,2);
                 String textFieldx49 = (String) model21b.getValueAt(currentSelectedRow - 1,3);
                 
                 comIDjLabel14.setText(textFieldx9);
                 comNamejLabel15.setText(textFieldx29);
                 comTotalScorejLabel16.setText(textFieldx39);
                 comEarnedScorejLabel17.setText(textFieldx49);       
       }else{}
                                            
    }//GEN-LAST:event_commulativejTable1KeyPressed

    private void comScorejTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comScorejTextField1KeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            String formattedDate = myDateObj.format(myFormatObj);
            comDateTimejLabel23.setText(formattedDate);   
            int colCount = commulativejTable1.getColumnCount();             
            int rowsel = commulativejTable1.getSelectedRow();       

        commulativejTable1.setValueAt(formattedDate, rowsel, colCount - 2);
        commulativejTable1.setValueAt(comScorejTextField1.getText(), rowsel, colCount - 1); 
        
      for (int i = colCount; i > 4; i-=2){
        String str = (String) commulativejTable1.getModel().getValueAt(commulativejTable1.getSelectedRow(), i-1);            
        Integer attendcount2 = Integer.parseInt(str);     
        xx = xx + attendcount2;
        }
        String value4 = (String) commulativejTable1.getModel().getValueAt(0, 3);       
         System.out.println(xx);
         String att3 = Integer.toString(xx);
         commulativejTable1.setValueAt(att3, commulativejTable1.getSelectedRow(), 3);
         commulativejTable1.setValueAt(value4, commulativejTable1.getSelectedRow(), 2);
         xx=0;
          if (commulativejTable1.getSelectedRow() == 0){commulativejTable1.setValueAt(att3,0,2);
                     try {
                                  Robot r = new Robot();
                                  r.keyPress(KeyEvent.VK_ENTER);
                                  r.keyRelease(KeyEvent.VK_ENTER);
                              } catch (AWTException aWTException) {
                              }
         
                           }else{}
        
        }else{}
        
        try {
            if (evt.getKeyCode() == KeyEvent.VK_DOWN) {               
                int currentSelectedRow = commulativejTable1.getSelectedRow();
                commulativejTable1.getSelectionModel().setSelectionInterval(currentSelectedRow + 1, currentSelectedRow + 1);
                
                DefaultTableModel model21 = (DefaultTableModel) commulativejTable1.getModel();
                
                String textFieldx = (String) model21.getValueAt(currentSelectedRow + 1, 0);
                String textFieldx2 = (String) model21.getValueAt(currentSelectedRow + 1, 1);
                String textFieldx3 = (String) model21.getValueAt(currentSelectedRow + 1, 2);
                String textFieldx4 = (String) model21.getValueAt(currentSelectedRow + 1, 3);
                
                comIDjLabel14.setText(textFieldx);
                comNamejLabel15.setText(textFieldx2);
                comTotalScorejLabel16.setText(textFieldx3);
                comEarnedScorejLabel17.setText(textFieldx4);
                
            } else {
            }
        } catch (Exception e) {
        }
        
             if (evt.getKeyCode() == KeyEvent.VK_UP) {
           
              int currentSelectedRow = commulativejTable1.getSelectedRow();
              commulativejTable1.getSelectionModel().setSelectionInterval(currentSelectedRow - 1, currentSelectedRow - 1);
        
                 DefaultTableModel model21 = (DefaultTableModel) commulativejTable1.getModel();

                 String textFieldx = (String) model21.getValueAt(currentSelectedRow - 1,0);
                 String textFieldx2 = (String) model21.getValueAt(currentSelectedRow - 1,1);
                 String textFieldx3 = (String) model21.getValueAt(currentSelectedRow - 1,2);
                 String textFieldx4 = (String) model21.getValueAt(currentSelectedRow - 1,3);
                 
                 comIDjLabel14.setText(textFieldx);
                 comNamejLabel15.setText(textFieldx2);
                 comTotalScorejLabel16.setText(textFieldx3);
                 comEarnedScorejLabel17.setText(textFieldx4);
        
       
       }else{}
        
    }//GEN-LAST:event_comScorejTextField1KeyPressed

    private void powerbuttonjLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_powerbuttonjLabel20MouseClicked

    JDialog.setDefaultLookAndFeelDecorated(true);           
    int response = JOptionPane.showConfirmDialog(null, "Dont forget to export your tables. Click Yes to close the program", "Confirm",
    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        switch (response) {
            case JOptionPane.NO_OPTION:
                System.out.println("No button clicked");
                break;
            case JOptionPane.YES_OPTION:
                System.out.println("Yes button clicked");
                System.exit(0);
            case JOptionPane.CLOSED_OPTION:
                System.out.println("JOptionPane closed");
                break;
            default:
                break;
        }
        
    }//GEN-LAST:event_powerbuttonjLabel20MouseClicked

    private void computeButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computeButton1ActionPerformed

       totalScoreTextField.setEnabled(true);
        
        double wl = 55;
        double xl = 40;
        double yl = -4;
        double zl = 5;
        double zm = 80; 
        double zn = 15;
        double b=0;
        double c=0;
        double e;
        double f=0;
        double g;
        double h;
        double i;
        double j;

       String answer2; 
       String answer3;
       String answer5;
       
        double escore = 0;
        double tscore = 0;
        try {
            escore = Double.parseDouble(earnedScoreTextField.getText());
            tscore = Double.parseDouble(totalScoreTextField.getText());
        } catch (NumberFormatException numberFormatException) {
             JOptionPane.showMessageDialog(recordJFrame.this,"numberFormatException");
        }
       
    try{  
   
        b = escore / tscore;
        c = b * 100;
        e = b * zm;
        f = e + zn;
        g = f - wl;
        h = g / xl;
        i =  yl * h;
        j = i + zl;
   
        answer2 = String.format("%.4f",c);
        percentScoreJLabel.setText(answer2);

        answer3 = String.format("%.4f",f);
        gradejLabel.setText(answer3);
        
        answer5 = String.format("%.4f",j);
        rankjLabel.setText(answer5);
        totalScoreTextField.setEnabled(false);
        }
        catch(IllegalArgumentException ff){
        JOptionPane.showMessageDialog(recordJFrame.this,"Invalid input");  
        }
        if(f>=95){rankjLabel.setText("1.0000");}
        if(c<70) {rankjLabel.setText("5.0000");}
        if(c<70)gradejLabel.setText("70.0000");
        if(c>100){
                   gradejLabel.setText("95.0000"); 
                   JOptionPane.showMessageDialog(recordJFrame.this,"Input more than total score");
                 }
        if (c>=97){classjLabel.setText("A+");}
        if (c<97 && c>=94){classjLabel.setText("A");}
        if (c<94 && c>=90){classjLabel.setText("A-");}
        if (c<90 && c>=80){classjLabel.setText("B");}
        if (c<80 && c>=70){classjLabel.setText("C");}
        if (c<70 && c>=60){classjLabel.setText("D");}
        if (c<60){classjLabel.setText("F");}
        if (escore<0){JOptionPane.showMessageDialog(recordJFrame.this,"Input is less than zero");}
        
        
        else{}
        
    }//GEN-LAST:event_computeButton1ActionPerformed

    private void lockButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lockButton2ActionPerformed
       
        String a = lockButton2.getText();
        
        if ("LOCK".equals(a)){
        totalScoreTextField.setEnabled(false);
        lockButton2.setText("UNLOCK");
        }
        
        else{
        totalScoreTextField.setEnabled(true);
        lockButton2.setText("LOCK");
        }    
        
    }//GEN-LAST:event_lockButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        DefaultTableModel model = (DefaultTableModel) gradejTable.getModel();
        Object[] row = {"xxx","xxx",totalScoreTextField.getText(),"100","xxx","xxx","xxx","xxx"};
        model.addRow(row);
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void gradeCalcCopyTbljButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeCalcCopyTbljButton6ActionPerformed

       try {
            String data2 = totalScoreTextField.getText();
            String data3 = earnedScoreTextField.getText();            
            String data5 = percentScoreJLabel.getText();
            String data6 = classjLabel.getText();
            String data7 = gradejLabel.getText();
            String data8 = rankjLabel.getText();                        
            
            DefaultTableModel model = (DefaultTableModel) gradejTable.getModel();
            
            int i = gradejTable.getSelectedRow();
            model.setValueAt(data2, i, 2);
            model.setValueAt(data3, i, 3);
            model.setValueAt(data5, i, 4);
            model.setValueAt(data6, i, 5);
            model.setValueAt(data7, i, 6);
            model.setValueAt(data8, i, 7);
                       
        } catch (Exception e) {
          JOptionPane.showMessageDialog(recordJFrame.this,"Check if row in Table is selected");
        }    
                percentScoreJLabel.setForeground(Color.BLACK);
                classjLabel.setForeground(Color.BLACK);
                gradejLabel.setForeground(Color.BLACK);
                rankjLabel.setForeground(Color.BLACK);
                gradeNamejLabel28.setForeground(Color.BLACK);
                
    }//GEN-LAST:event_gradeCalcCopyTbljButton6ActionPerformed

    private void gradejTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gradejTableKeyPressed

        try {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
               try {
                    Robot robot = new Robot();
                    robot.keyPress(KeyEvent.VK_LEFT); 
                    robot.keyRelease(KeyEvent.VK_LEFT);
                    
                    robot.keyPress(KeyEvent.VK_RIGHT); 
                    robot.keyRelease(KeyEvent.VK_RIGHT); 
                 
                } catch (AWTException ex) {
                    Logger.getLogger(recordJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
              
                evt.consume();
            
            } else {
            }
        } catch (Exception e) {
        }
      
        try {
            if (evt.getKeyCode() == KeyEvent.VK_DOWN) {                
                try {
                    
                    int currentSelectedRow = gradejTable.getSelectedRow();         
                    gradejTable.getSelectionModel().setSelectionInterval(currentSelectedRow, currentSelectedRow);
                    
                    DefaultTableModel model = (DefaultTableModel) gradejTable.getModel();
                    String textField = (String) model.getValueAt(gradejTable.getSelectedRow()+1, 0);
                    String textField2 = (String) model.getValueAt(gradejTable.getSelectedRow()+1, 1);
                    String textField3 = (String) model.getValueAt(gradejTable.getSelectedRow()+1, 3);
                    String textField4 = (String) model.getValueAt(gradejTable.getSelectedRow()+1, 4);
                    String textField5 = (String) model.getValueAt(gradejTable.getSelectedRow()+1, 5);
                    String textField6 = (String) model.getValueAt(gradejTable.getSelectedRow()+1, 6);
                    String textField7 = (String) model.getValueAt(gradejTable.getSelectedRow()+1, 7);
                    
                    gradeNamejLabel28.setText(textField + " " + textField2);
                    earnedScoreTextField.setText(textField3);
                    percentScoreJLabel.setText(textField4);
                    classjLabel.setText(textField5);
                    gradejLabel.setText(textField6);
                    rankjLabel.setText(textField7);
                    
                    percentScoreJLabel.setForeground(new Color(153, 0, 51));
                    classjLabel.setForeground(new Color(153, 0, 51));
                    gradejLabel.setForeground(new Color(153, 0, 51));
                    rankjLabel.setForeground(new Color(153, 0, 51));
                    gradeNamejLabel28.setForeground(new Color(153, 0, 51));
                    
                } catch (Exception e) {
                }
                
            } else {
            }
        } catch (Exception e) {
        }
        
        try {
            if (evt.getKeyCode() == KeyEvent.VK_UP) {                
                try {
                    
                    int currentSelectedRow = gradejTable.getSelectedRow();
                    gradejTable.getSelectionModel().setSelectionInterval(currentSelectedRow, currentSelectedRow);                    
                    
                    DefaultTableModel model = (DefaultTableModel) gradejTable.getModel();
                    String textField = (String) model.getValueAt(gradejTable.getSelectedRow()-1, 0);
                    String textField2 = (String) model.getValueAt(gradejTable.getSelectedRow()-1, 1);
                    String textField3 = (String) model.getValueAt(gradejTable.getSelectedRow()-1, 3);
                    String textField4 = (String) model.getValueAt(gradejTable.getSelectedRow()-1, 4);
                    String textField5 = (String) model.getValueAt(gradejTable.getSelectedRow()-1, 5);
                    String textField6 = (String) model.getValueAt(gradejTable.getSelectedRow()-1, 6);
                    String textField7 = (String) model.getValueAt(gradejTable.getSelectedRow()-1, 7);
                    
                    gradeNamejLabel28.setText(textField + " " + textField2);
                    earnedScoreTextField.setText(textField3);
                    percentScoreJLabel.setText(textField4);
                    classjLabel.setText(textField5);
                    gradejLabel.setText(textField6);
                    rankjLabel.setText(textField7);
                    
                    percentScoreJLabel.setForeground(new Color(153, 0, 51));
                    classjLabel.setForeground(new Color(153, 0, 51));
                    gradejLabel.setForeground(new Color(153, 0, 51));
                    rankjLabel.setForeground(new Color(153, 0, 51));
                    gradeNamejLabel28.setForeground(new Color(153, 0, 51));
                } catch (Exception e) {
                }
                
            } else {
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_gradejTableKeyPressed

    private void exportjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportjButton2ActionPerformed
        switch(pstate){       
        
            case 1:       
                       try {
                            FileWriter fw;
                            fw = new FileWriter(exportjTextField1.getText());
                            try (BufferedWriter bw = new BufferedWriter(fw)) {                                
                                    for (int i = 0; i <attendjTable1.getRowCount(); i++){
                                            for(int j = 0; j <attendjTable1.getColumnCount(); j++){
                                            bw.write(attendjTable1.getValueAt(i,j).toString()+","); 
                                            }
                                            bw.newLine();
                                        }
                                }
                            
                            fw.close();
                            JOptionPane.showMessageDialog(null,"saved");
                            } catch (IOException ex) {
                                Logger.getLogger(recordJFrame.class.getName()).log(Level.SEVERE, null, ex);
                                JOptionPane.showMessageDialog(recordJFrame.this,"Please check the following: save path, filename and empty cells in table");
                            }
                       
                       exportjTextField1.setText("");
                       break;
                       
            case 2:
                       
                        try {
                                try (FileWriter fw = new FileWriter(exportjTextField1.getText()); BufferedWriter bw = new BufferedWriter(fw)) {
                
                                for (int i = 0; i <commulativejTable1.getRowCount(); i++){
                                    for(int j = 0; j <commulativejTable1.getColumnCount(); j++){
                                        bw.write(commulativejTable1.getValueAt(i,j).toString()+",");

                                        }
                                        bw.newLine();
                                    }
                                }
                                JOptionPane.showMessageDialog(null,"saved");
                            } catch (IOException ex) {
                                Logger.getLogger(recordJFrame.class.getName()).log(Level.SEVERE, null, ex);
                                JOptionPane.showMessageDialog(recordJFrame.this,"Please check the following: save path, filename and empty cells in table");
                            }
                        
                       exportjTextField1.setText(""); 
                       break;
                       
            case 3:
                       try {
                            try (FileWriter fw = new FileWriter(exportjTextField1.getText()); BufferedWriter bw = new BufferedWriter(fw)) {
                
                            for (int i = 0; i <gradejTable.getRowCount(); i++){
                                for(int j = 0; j <gradejTable.getColumnCount(); j++){
                                    bw.write(gradejTable.getValueAt(i,j).toString()+",");                        
                                    }
                                    bw.newLine();
                                }
                            }
                            JOptionPane.showMessageDialog(null,"saved");
                            } catch (IOException ex) {
                            Logger.getLogger(recordJFrame.class.getName()).log(Level.SEVERE, null, ex);
                            JOptionPane.showMessageDialog(recordJFrame.this,"Please check the following: save path, filename and empty cells in table");
                            }
                       
                       exportjTextField1.setText(""); 
                       break;
                
            case 4:
                   try {
                            FileWriter fw = new FileWriter(exportjTextField1.getText());
                            BufferedWriter bw = new BufferedWriter(fw);

                            for (int i = 0; i <wFactorjTable2.getRowCount(); i++){
                                for(int j = 0; j <wFactorjTable2.getColumnCount(); j++){
                                bw.write(wFactorjTable2.getValueAt(i,j).toString()+",");

                                }
                        bw.newLine();
                        }
                            bw.close();
                            fw.close();
                            JOptionPane.showMessageDialog(null,"saved");
                        } catch (IOException ex) {
                            Logger.getLogger(recordJFrame.class.getName()).log(Level.SEVERE, null, ex);
                            JOptionPane.showMessageDialog(recordJFrame.this,"Please check the following: save path, filename and empty cells in table");
                        }
                   
                       exportjTextField1.setText(""); 
                       break;
                        
                       }
        
     
    }//GEN-LAST:event_exportjButton2ActionPerformed

    private void searchjButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchjButton5ActionPerformed

        String search1 = searchjTextField12.getText();
        int i=0;
        DefaultTableModel model = (DefaultTableModel) gradejTable.getModel();        
        String text4 = "r";
        
        try {
            while (!text4.equals(search1)) {
                               
                gradejTable.getSelectionModel().setSelectionInterval(i, i);
                String text3 = (String) model.getValueAt(i,0);
                text4 = text3;
                       
                try {
                    if (text4.equals(search1)) {
                        System.out.println(text3);
                        System.out.println(i);
                        String textField = (String) model.getValueAt(i,0);
                        String textField2 = (String) model.getValueAt(i,1);
                        String textField4 = (String) model.getValueAt(gradejTable.getSelectedRow(),4);
                        String textField5 = (String) model.getValueAt(gradejTable.getSelectedRow(),5);
                        String textField6 = (String) model.getValueAt(gradejTable.getSelectedRow(),6);
                        String textField7 = (String) model.getValueAt(gradejTable.getSelectedRow(),7);
                        
                        gradeNamejLabel28.setText(textField+" "+textField2);
                        percentScoreJLabel.setText(textField4);
                        classjLabel.setText(textField5);
                        gradejLabel.setText(textField6);
                        rankjLabel.setText(textField7);
                        
                        break;
                    } else {
                    }
                                        
                    } catch (Exception e) {
                    }
                ++i;
            } 

        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_searchjButton5ActionPerformed

    private void gradejTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gradejTableKeyReleased

           try {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                
                try {
                    Robot robot = new Robot();
                    robot.keyPress(KeyEvent.VK_LEFT); 
                    robot.keyRelease(KeyEvent.VK_LEFT);
                    
                    robot.keyPress(KeyEvent.VK_RIGHT); 
                    robot.keyRelease(KeyEvent.VK_RIGHT); 
               
                } catch (AWTException ex) {
                    Logger.getLogger(recordJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
      
                    int currentSelectedRow9 = gradejTable.getSelectedRow();             
                    gradejTable.getSelectionModel().setSelectionInterval(currentSelectedRow9, currentSelectedRow9);
                    
                    DefaultTableModel model9 = (DefaultTableModel) gradejTable.getModel();
                    String textField39 = (String) model9.getValueAt(gradejTable.getSelectedRow(), 3);
                
                try {
                    totalScoreTextField.setEnabled(true);
                    
                    double wl = 55;
                    double xl = 40;
                    double yl = -4;
                    double zl = 5;
                    double zm = 80; 
                    double zn = 15;
                    double b = 0;
                    double c = 0;
                    double e;
                    double f = 0;
                    double g;
                    double h;
                    double i;
                    double j;
                    
                    String answer2;                    
                    String answer3;
                    String answer5;
                    
                    double escore = 0;
                    double tscore = 0;
                    try {
                        escore = Double.parseDouble(textField39);
                        tscore = Double.parseDouble(totalScoreTextField.getText());                        
                        
                        try {                            
                            
                            b = escore / tscore;
                            c = b * 100;
                            e = b * zm;
                            f = e + zn;
                            g = f - wl;
                            h = g / xl;
                            i = yl * h;
                            j = i + zl;
                            
                            answer2 = String.format("%.4f", c);
                            percentScoreJLabel.setText(answer2);
                            
                            answer3 = String.format("%.4f", f);
                            gradejLabel.setText(answer3);
                            
                            answer5 = String.format("%.4f", j);
                            rankjLabel.setText(answer5);
                            totalScoreTextField.setEnabled(false);
                            
                            if (f >= 95) {
                                rankjLabel.setText("1.0000");
                            }
                            if (c < 70) {
                                rankjLabel.setText("5.0000");
                            }
                            if (c < 70) {
                                gradejLabel.setText("70.0000");
                            }
                            if (c > 100) {
                                gradejLabel.setText("95.0000");                                
                                JOptionPane.showMessageDialog(recordJFrame.this, "Input more than total score");
                            }
                            if (c >= 97) {
                                classjLabel.setText("A+");
                            }
                            if (c < 97 && c >= 94) {
                                classjLabel.setText("A");
                            }
                            if (c < 94 && c >= 90) {
                                classjLabel.setText("A-");
                            }
                            if (c < 90 && c >= 80) {
                                classjLabel.setText("B");
                            }
                            if (c < 80 && c >= 70) {
                                classjLabel.setText("C");
                            }
                            if (c < 70 && c >= 60) {
                                classjLabel.setText("D");
                            }
                            if (c < 60) {
                                classjLabel.setText("F");
                            }
                            if (escore < 0) {
                                JOptionPane.showMessageDialog(recordJFrame.this, "Input is less than zero");
                            } else {
                            }
                            
                            try {
                                String data1 = null;
                                String data2 = totalScoreTextField.getText();                               
                                String data5 = percentScoreJLabel.getText();
                                String data6 = classjLabel.getText();
                                String data7 = gradejLabel.getText();
                                String data8 = rankjLabel.getText();
                                String data3 =Double.toString(escore);
                                earnedScoreTextField.setText(data3);                                
                                
                                DefaultTableModel model = (DefaultTableModel) gradejTable.getModel();
                                int i2 = gradejTable.getSelectedRow();
                                model.setValueAt(data2, i2, 2);
                                model.setValueAt(data3, i2, 3);
                                model.setValueAt(data5, i2, 4);
                                model.setValueAt(data6, i2, 5);
                                model.setValueAt(data7, i2, 6);
                                model.setValueAt(data8, i2, 7);
                                
                                percentScoreJLabel.setForeground(Color.GREEN);
                                classjLabel.setForeground(Color.GREEN);
                                gradejLabel.setForeground(Color.GREEN);
                                rankjLabel.setForeground(Color.GREEN);
                                namejLabel.setForeground(Color.GREEN);
                                
                                DefaultTableModel model4 = (DefaultTableModel) gradejTable.getModel();                                
                                String textField = (String) model4.getValueAt(gradejTable.getSelectedRow(), 0);
                                String textField2 = (String) model4.getValueAt(gradejTable.getSelectedRow(), 1);
                                
                                gradeNamejLabel28.setText(textField + " " + textField2);

                            } catch (Exception e2) {
                            }
                            
                        } catch (IllegalArgumentException ff) {
                            JOptionPane.showMessageDialog(recordJFrame.this, "Invalid input Score");
                            
                        }
                        
                    } catch (NumberFormatException numberFormatException) {
                        JOptionPane.showMessageDialog(recordJFrame.this, "numberFormatException");
                        JOptionPane.showMessageDialog(recordJFrame.this, "double check entered value in table use compute button");
                    }
                    
                } catch (HeadlessException headlessException) {
                    JOptionPane.showMessageDialog(recordJFrame.this, "Check if row in Table is selected");
                }
                

            }

            evt.consume();
        } catch (HeadlessException headlessException) {
            
        }
        
    }//GEN-LAST:event_gradejTableKeyReleased

    private void earnedScoreTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_earnedScoreTextFieldMouseClicked

        DefaultTableModel model = (DefaultTableModel) gradejTable.getModel();
        String textField = (String) model.getValueAt(gradejTable.getSelectedRow(),0);
        String textField2 = (String) model.getValueAt(gradejTable.getSelectedRow(),1); 
        String textField4 = (String) model.getValueAt(gradejTable.getSelectedRow(),4);
        String textField5 = (String) model.getValueAt(gradejTable.getSelectedRow(),5);
        String textField6 = (String) model.getValueAt(gradejTable.getSelectedRow(),6);
        String textField7 = (String) model.getValueAt(gradejTable.getSelectedRow(),7);
        gradeNamejLabel28.setText(textField+" "+textField2);
        percentScoreJLabel.setText(textField4);
        classjLabel.setText(textField5);
        gradejLabel.setText(textField6);
        rankjLabel.setText(textField7);
        
                percentScoreJLabel.setForeground(new Color(153,0,51));
                classjLabel.setForeground(new Color(153,0,51));
                gradejLabel.setForeground(new Color(153,0,51));
                rankjLabel.setForeground(new Color(153,0,51));
                gradeNamejLabel28.setForeground(new Color(153,0,51));
    }//GEN-LAST:event_earnedScoreTextFieldMouseClicked

    private void earnedScoreTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_earnedScoreTextFieldKeyPressed
        
      if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            
            try {
                totalScoreTextField.setEnabled(true);
                
                double wl = 55;
                double xl = 40;
                double yl = -4;
                double zl = 5;
                double zm = 80; 
                double zn = 15; 
                double b = 0;
                double c = 0;
                double e;
                double f = 0;
                double g;
                double h;
                double i;
                double j;
                
                String answer2;                
                String answer3;
                String answer5;
                
                double escore = 0;
                double tscore = 0;
                try {
                    escore = Double.parseDouble(earnedScoreTextField.getText());
                    tscore = Double.parseDouble(totalScoreTextField.getText());                   
                    
              try {                    
                    
                    b = escore / tscore;
                    c = b * 100;
                    e = b * zm;
                    f = e + zn;
                    g = f - wl;
                    h = g / xl;
                    i = yl * h;
                    j = i + zl;
                    
                    answer2 = String.format("%.4f", c);
                    percentScoreJLabel.setText(answer2);
                    
                    answer3 = String.format("%.4f", f);
                    gradejLabel.setText(answer3);
                    
                    answer5 = String.format("%.4f", j);
                    rankjLabel.setText(answer5);
                    totalScoreTextField.setEnabled(false);
                    
                if (f >= 95) {
                    rankjLabel.setText("1.0000");
                }
                if (c < 70) {
                    rankjLabel.setText("5.0000");
                }
                if (c < 70) {
                    gradejLabel.setText("70.0000");
                }
                if (c > 100) {
                    gradejLabel.setText("95.0000");                    
                    JOptionPane.showMessageDialog(recordJFrame.this, "Input more than total score");
                }
                if (c >= 97) {
                    classjLabel.setText("A+");
                }
                if (c < 97 && c >= 94) {
                    classjLabel.setText("A");
                }
                if (c < 94 && c >= 90) {
                    classjLabel.setText("A-");
                }
                if (c < 90 && c >= 80) {
                    classjLabel.setText("B");
                }
                if (c < 80 && c >= 70) {
                    classjLabel.setText("C");
                }
                if (c < 70 && c >= 60) {
                    classjLabel.setText("D");
                }
                if (c < 60) {
                    classjLabel.setText("F");
                }
                if (escore < 0) {
                    JOptionPane.showMessageDialog(recordJFrame.this, "Input is less than zero");
                } else {
                }
                
                try {
                    
                String data2 = totalScoreTextField.getText();
                String data3 = earnedScoreTextField.getText();                
                String data5 = percentScoreJLabel.getText();
                String data6 = classjLabel.getText();
                String data7 = gradejLabel.getText();
                String data8 = rankjLabel.getText();                
                
                DefaultTableModel model = (DefaultTableModel) gradejTable.getModel();
                
                int i2 = gradejTable.getSelectedRow();
                model.setValueAt(data2, i2, 2);
                model.setValueAt(data3, i2, 3);
                model.setValueAt(data5, i2, 4);
                model.setValueAt(data6, i2, 5);
                model.setValueAt(data7, i2, 6);
                model.setValueAt(data8, i2, 7);
                
                percentScoreJLabel.setForeground(Color.BLACK);
                classjLabel.setForeground(Color.BLACK);
                gradejLabel.setForeground(Color.BLACK);
                rankjLabel.setForeground(Color.BLACK);
                gradeNamejLabel28.setForeground(Color.BLACK);
                
                DefaultTableModel model4 = (DefaultTableModel) gradejTable.getModel();       
                String textField = (String) model4.getValueAt(gradejTable.getSelectedRow(),0);
                String textField2 = (String) model4.getValueAt(gradejTable.getSelectedRow(),1);
                
                gradeNamejLabel28.setText(textField+" "+textField2);
                
            } catch (Exception e2) {
            }                
                } catch (IllegalArgumentException ff) {
                    JOptionPane.showMessageDialog(recordJFrame.this, "Invalid input Score");              
                }
              
                } catch (NumberFormatException numberFormatException) {
                    JOptionPane.showMessageDialog(recordJFrame.this, "numberFormatException");
                }

            } catch (HeadlessException headlessException) {
                JOptionPane.showMessageDialog(recordJFrame.this,"Check if row in Table is selected");
            }

        }if(evt.getKeyCode()== KeyEvent.VK_DELETE){ earnedScoreTextField.setText("");}
        else{}
    

        if(evt.getKeyCode()== KeyEvent.VK_DOWN){ 
            try {
                
                int currentSelectedRow = gradejTable.getSelectedRow();          
                gradejTable.getSelectionModel().setSelectionInterval(currentSelectedRow + 1, currentSelectedRow + 1);
                
                 DefaultTableModel model = (DefaultTableModel) gradejTable.getModel();
                 String textField = (String) model.getValueAt(gradejTable.getSelectedRow(),0);
                 String textField2 = (String) model.getValueAt(gradejTable.getSelectedRow(),1);
                 String textField3 = (String) model.getValueAt(gradejTable.getSelectedRow(),3);
                 String textField4 = (String) model.getValueAt(gradejTable.getSelectedRow(),4);
                 String textField5 = (String) model.getValueAt(gradejTable.getSelectedRow(),5);
                 String textField6 = (String) model.getValueAt(gradejTable.getSelectedRow(),6);
                 String textField7 = (String) model.getValueAt(gradejTable.getSelectedRow(),7);
                 
                 
                gradeNamejLabel28.setText(textField+" "+textField2);
                earnedScoreTextField.setText(textField3);
                percentScoreJLabel.setText(textField4);
                classjLabel.setText(textField5);
                gradejLabel.setText(textField6);
                rankjLabel.setText(textField7);
                
                percentScoreJLabel.setForeground(new Color(153,0,51));
                classjLabel.setForeground(new Color(153,0,51));
                gradejLabel.setForeground(new Color(153,0,51));
                rankjLabel.setForeground(new Color(153,0,51));
                gradeNamejLabel28.setForeground(new Color(153,0,51));
              
            } catch (Exception e) {
            }
        
        }
        else{}
        
                if(evt.getKeyCode()== KeyEvent.VK_UP){ 
            try {
                
                int currentSelectedRow = gradejTable.getSelectedRow();
                 gradejTable.getSelectionModel().setSelectionInterval(currentSelectedRow - 1, currentSelectedRow - 1);  
                 
                 DefaultTableModel model = (DefaultTableModel) gradejTable.getModel();
                 String textField = (String) model.getValueAt(gradejTable.getSelectedRow(),0);
                 String textField2 = (String) model.getValueAt(gradejTable.getSelectedRow(),1);
                 String textField3 = (String) model.getValueAt(gradejTable.getSelectedRow(),3);
                 String textField4 = (String) model.getValueAt(gradejTable.getSelectedRow(),4);
                 String textField5 = (String) model.getValueAt(gradejTable.getSelectedRow(),5);
                 String textField6 = (String) model.getValueAt(gradejTable.getSelectedRow(),6);
                 String textField7 = (String) model.getValueAt(gradejTable.getSelectedRow(),7);

                gradeNamejLabel28.setText(textField+" "+textField2);
                earnedScoreTextField.setText(textField3);
                percentScoreJLabel.setText(textField4);
                classjLabel.setText(textField5);
                gradejLabel.setText(textField6);
                rankjLabel.setText(textField7);
                    
                percentScoreJLabel.setForeground(new Color(153,0,51));
                classjLabel.setForeground(new Color(153,0,51));
                gradejLabel.setForeground(new Color(153,0,51));
                rankjLabel.setForeground(new Color(153,0,51));
                gradeNamejLabel28.setForeground(new Color(153,0,51));
            } catch (Exception e) {
            }
        
        }
        else{}
        
    }//GEN-LAST:event_earnedScoreTextFieldKeyPressed

    private void exportjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportjButton1ActionPerformed

        JFileChooser chooser = new JFileChooser();
        chooser.setApproveButtonText("Attach file name to Path");      
        chooser.setApproveButtonMnemonic('x');        
        chooser.setApproveButtonToolTipText("New approve tool tip");       
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename= f.getAbsolutePath();
        exportjTextField1.setText(filename);
        
    }//GEN-LAST:event_exportjButton1ActionPerformed

    private void frameMaxMinjLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameMaxMinjLabel11MouseClicked

        if(getExtendedState()==NORMAL)
        {
             setExtendedState(MAXIMIZED_BOTH);
             frameMaxMinjLabel11.setText("MINview");
        }
        else
        {
            setExtendedState(NORMAL);
            frameMaxMinjLabel11.setText("MAXview");
        }
        
    }//GEN-LAST:event_frameMaxMinjLabel11MouseClicked

    private void weightPlusRowjButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightPlusRowjButton8ActionPerformed

        try {
            DefaultTableModel model = (DefaultTableModel) wFactorjTable2.getModel();
            Object[] row = {"xxx", "xxx", "70", percentPrelimjTextField2.getText(), "70", percentMidTermjTextField3.getText(), "70", percentSemiFinaljTextField4.getText(), "70", percentFinaljTextField5.getText(), "xxx", "xxx"};
            model.addRow(row);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(recordJFrame.this, " Check for empty fields");
        }
        
    }//GEN-LAST:event_weightPlusRowjButton8ActionPerformed

    private void wFactorjButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wFactorjButton8ActionPerformed

       String a = wFactorjButton8.getText();
        
        if ("LOCK".equals(a)){
        percentPrelimjTextField2.setEnabled(false);
        percentMidTermjTextField3.setEnabled(false);
        percentSemiFinaljTextField4.setEnabled(false);
        percentFinaljTextField5.setEnabled(false);
        wFactorjButton8.setText("UNLOCK");
        }
        
        else{
        percentPrelimjTextField2.setEnabled(true);
        percentMidTermjTextField3.setEnabled(true);
        percentSemiFinaljTextField4.setEnabled(true);
        percentFinaljTextField5.setEnabled(true);
        wFactorjButton8.setText("LOCK");
        } 
        
    }//GEN-LAST:event_wFactorjButton8ActionPerformed

    private void computejButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computejButton5ActionPerformed

   double w1 = 55;
   double x1 = 40;
   double y1 = -4;
   double z1= 5;
   double b;
   double c;
   double e;
   double f;
   double g;
   double h;
   double i;
   double j;
   double k;
   double l1;
   double m;
   double n;
   double o;
   String answer2; 
   String answer3;
        
        
                try {
                            String percentprelim = percentPrelimjTextField2.getText();
                            if (percentprelim.isEmpty()) {
                                throw new IllegalArgumentException("Percent Value 1 cannot be empty");
                            }
                        } catch (IllegalArgumentException ee) {
                            JOptionPane.showMessageDialog(recordJFrame.this, "percent value 1 cannot be empty");
                        }
                                
                                   try { 
                                        percentprelim = Double.parseDouble(percentPrelimjTextField2.getText());
                                        if(percentprelim >100 || percentprelim < 0)
                                        throw new IllegalArgumentException("percent value 1 should be between 0 to 100");
                                        }
                                        catch(IllegalArgumentException ff){
                                        JOptionPane.showMessageDialog(recordJFrame.this, " percent value 1 should be between 0 to 100");  
                                        }     
                                
                
                try {
                            String gradeprelim = gradePrelimjTextField6.getText();
                            if (gradeprelim.isEmpty()) {
                                throw new IllegalArgumentException("Grade Value 1 cannot be empty");
                            }
                        } catch (IllegalArgumentException ee) {
                            JOptionPane.showMessageDialog(recordJFrame.this, "Grade value 1 cannot be empty");
                        }
                
                                try {
                                        prelim = Double.parseDouble(gradePrelimjTextField6.getText());
                                        if(prelim <55 || prelim > 95)
                                        throw new IllegalArgumentException("Grade value 1 should be between 55 to 95");
                                        }
                                        catch(IllegalArgumentException ff){
                                        JOptionPane.showMessageDialog(recordJFrame.this, " Grade value 1 should be between 55 to 95");  
                                        }   
                
                
                try {
                            String percentmidterm = percentMidTermjTextField3.getText();
                            if (percentmidterm.isEmpty()) {
                                throw new IllegalArgumentException("Percent Value 2 cannot be empty");
                            }
                        } catch (IllegalArgumentException ee) {
                            JOptionPane.showMessageDialog(recordJFrame.this, "Percent value 2 cannot be empty");
                        }
                
                
                                   try { 
                                       percentmidterm = Double.parseDouble(percentMidTermjTextField3.getText());
                                        if(percentmidterm >100 || percentmidterm < 0)
                                        throw new IllegalArgumentException("Percent value 2 should be between 0 to 100");
                                        }
                                        catch(IllegalArgumentException ff){
                                        JOptionPane.showMessageDialog(recordJFrame.this, " percent value 2 should be between 0 to 100");  
                                        } 
                                   
                                   try { 
                                        midterm = Double.parseDouble(gradeMidTermjTextField7.getText());
                                        if(midterm < 55 || midterm > 95)
                                        throw new IllegalArgumentException("Grade value 2 should be between 55 to 95");
                                        }
                                        catch(IllegalArgumentException ff){
                                        JOptionPane.showMessageDialog(recordJFrame.this, " Grade value 2 should be between 55 to 95");  
                                        } 
                
                try {
                            String grademidterm = gradeMidTermjTextField7.getText();
                            if (grademidterm.isEmpty()) {
                                throw new IllegalArgumentException("Grade Value 2 cannot be empty");
                            }
                        } catch (IllegalArgumentException ee) {
                            JOptionPane.showMessageDialog(recordJFrame.this, "Grade value 2 cannot be empty");
                        }
    
                try {
                            String percentsemifinal = percentSemiFinaljTextField4.getText();
                            if (percentsemifinal.isEmpty()) {
                                throw new IllegalArgumentException("Percent Value 3 cannot be empty");
                            }
                        } catch (IllegalArgumentException ee) {
                            JOptionPane.showMessageDialog(recordJFrame.this, "Percent value 3 cannot be empty");
                        }
                
                try {
                            String gradesemifinal = gradeSemiFinaljTextField8.getText();
                            if (gradesemifinal.isEmpty()) {
                                throw new IllegalArgumentException("Grade Value 3 cannot be empty");
                            }
                        } catch (IllegalArgumentException ee) {
                            JOptionPane.showMessageDialog(recordJFrame.this, "Grade value 3 cannot be empty");
                        }
                
                                                
                                   try {
                                       percentsemifinal = Double.parseDouble(percentSemiFinaljTextField4.getText());
                                        if(percentsemifinal >100 || percentsemifinal < 0)
                                        throw new IllegalArgumentException("Percent value 3 should be between 0 to 100");
                                        }
                                        catch(IllegalArgumentException ff){
                                        JOptionPane.showMessageDialog(recordJFrame.this, " percent value 3 should be between 0 to 100");  
                                        } 
                                   
                                   try { 
                                       semifinal = Double.parseDouble(gradeSemiFinaljTextField8.getText());
                                        if(semifinal < 55 || semifinal > 95)
                                        throw new IllegalArgumentException("Grade value 3 should be between 55 to 95");
                                        }
                                        catch(IllegalArgumentException ff){
                                        JOptionPane.showMessageDialog(recordJFrame.this, " Grade value 3 should be between 55 to 95");  
                                        } 
                
                try {
                            String percentfinal = percentFinaljTextField5.getText();
                            if (percentfinal.isEmpty()) {
                                throw new IllegalArgumentException("Percent Value 4 cannot be empty");
                            }
                        } catch (IllegalArgumentException ee) {
                            JOptionPane.showMessageDialog(recordJFrame.this, "Percent value 4 cannot be empty");
                        }
                
                try {
                            String gradefinal = gradeFinaljTextField9.getText();
                            if (gradefinal.isEmpty()) {
                                throw new IllegalArgumentException("Percent Value 4 cannot be empty");
                            }
                        } catch (IllegalArgumentException ee) {
                            JOptionPane.showMessageDialog(recordJFrame.this, "Percent value 4 cannot be empty");
                        }
                
                                  try {
                                        percentfinal10 = Double.parseDouble(percentFinaljTextField5.getText());
                                        if(percentfinal10 >100 || percentfinal10 < 0)
                                        throw new IllegalArgumentException("Percent value 4 should be between 0 to 100");
                                        }
                                        catch(IllegalArgumentException ff){
                                        JOptionPane.showMessageDialog(recordJFrame.this, " Percent value 4 should be between 0 to 100");  
                                        } 
                                   
                                   try { 
                                        final10 = Double.parseDouble(gradeFinaljTextField9.getText());
                                        if(final10 < 55 || final10 > 95)
                                        throw new IllegalArgumentException("Grade value 4 should be between 55 to 95");
                                        }
                                        catch(IllegalArgumentException ff){
                                        JOptionPane.showMessageDialog(recordJFrame.this, " Grade value 4 should be between 55 to 95");  
                                        } 
          
    percenttotal = percentprelim + percentmidterm + percentsemifinal + percentfinal10;
     

    if(percenttotal == 100)
    {
      
    b = percentprelim / 100;  
    c = prelim * b;   
    e = percentmidterm / 100;   
    f = midterm * e;        
    g = percentsemifinal / 100;   
    h = semifinal * g;       
    i = percentfinal10 / 100;        
    j = final10 * i;       
    k = c + f + h + j;       
    l1 = k - w1;       
    m = l1 / x1;       
    n = y1 * m;        
    o = n + z1;
    
      answer2 = String.format("%.4f",k);
      gradejTextField10.setText(answer2);
      
      answer3 = String.format("%.4f",o);
      rankGradejTextField11.setText(answer3);
    
    }
    else if (percenttotal != 100)
    {
    JOptionPane.showMessageDialog(recordJFrame.this,"percentage total not equal to 100");
    gradejTextField10.setText("");
    rankGradejTextField11.setText("");
    
    }
        
    }//GEN-LAST:event_computejButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        try {
            String percentnum1 = percentPrelimjTextField2.getText();
            String percentnum2 = percentMidTermjTextField3.getText();
            String percentnum3 = percentSemiFinaljTextField4.getText();
            String percentnum4 = percentFinaljTextField5.getText();
            
            String gradenum1 = gradePrelimjTextField6.getText();
            String gradenum2 = gradeMidTermjTextField7.getText();
            String gradenum3 = gradeSemiFinaljTextField8.getText();
            String gradenum4 = gradeFinaljTextField9.getText();
            
            String gradefinal = gradejTextField10.getText();
            String rankfinal = rankGradejTextField11.getText();
            
            DefaultTableModel model3 = (DefaultTableModel) wFactorjTable2.getModel();
            int t = wFactorjTable2.getSelectedRow();
            model3.setValueAt(gradenum1, t, 2);
            model3.setValueAt(percentnum1, t, 3);
            model3.setValueAt(gradenum2, t, 4);
            model3.setValueAt(percentnum2, t, 5);
            model3.setValueAt(gradenum3, t, 6);
            model3.setValueAt(percentnum3, t, 7);
            model3.setValueAt(gradenum4, t, 8);
            model3.setValueAt(percentnum4, t, 9);
            model3.setValueAt(gradefinal, t, 10);
            model3.setValueAt(rankfinal, t, 11);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(recordJFrame.this,"Check if row in Table is selected");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

       String Search2 = wSearchjTextField2.getText();
        int u=0;
        DefaultTableModel model4 = (DefaultTableModel) wFactorjTable2.getModel();
        
        String text5 = "r";
        try {
                while (!text5.equals(Search2)){
                    
                wFactorjTable2.getSelectionModel().setSelectionInterval(u, u);
                String text6 = (String) model4.getValueAt(u, 0);
                text5 = new String(text6);
                    try {
                        
                        if (text5.equals(Search2)) {
                            System.out.println(text6);
                            System.out.println(u);
                            
                            String input1 = (String) model4.getValueAt(u, 0);
                            String input2 = (String) model4.getValueAt(u, 1);
                            
                            String input3 = (String) model4.getValueAt(wFactorjTable2.getSelectedRow(), 2);
                            String input4 = (String) model4.getValueAt(wFactorjTable2.getSelectedRow(), 3);
                            String input5 = (String) model4.getValueAt(wFactorjTable2.getSelectedRow(), 4);
                            String input6 = (String) model4.getValueAt(wFactorjTable2.getSelectedRow(), 5);
                            String input7 = (String) model4.getValueAt(wFactorjTable2.getSelectedRow(), 6);
                            String input8 = (String) model4.getValueAt(wFactorjTable2.getSelectedRow(), 7);
                            String input9 = (String) model4.getValueAt(wFactorjTable2.getSelectedRow(), 8);
                            String input10 = (String) model4.getValueAt(wFactorjTable2.getSelectedRow(), 9);
                            String input11 = (String) model4.getValueAt(wFactorjTable2.getSelectedRow(), 10);
                            String input12 = (String) model4.getValueAt(wFactorjTable2.getSelectedRow(), 11);
                            
                            idnumber2jLabel19.setText(input1);
                            name2jLabel20.setText(input2);
                            percentPrelimjTextField2.setText(input4);
                            gradePrelimjTextField6.setText(input3);
                            percentMidTermjTextField3.setText(input6);
                            gradeMidTermjTextField7.setText(input5);
                            percentSemiFinaljTextField4.setText(input8);
                            gradeSemiFinaljTextField8.setText(input7);
                            percentFinaljTextField5.setText(input10);
                            gradeFinaljTextField9.setText(input9);
                            gradejTextField10.setText(input11);
                            rankGradejTextField11.setText(input12);
                            
                            break;
                            
                        } else {
                        }
                    } catch (Exception e) {
                    }
                
                ++u;
                }                       
        
            }
        catch(Exception e){}
    }//GEN-LAST:event_jButton12ActionPerformed

    private void gradeFinaljTextField9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gradeFinaljTextField9KeyPressed

              if(evt.getKeyCode()== KeyEvent.VK_ENTER){
               double w1 = 55;
               double x1 = 40;
               double y1 = -4;
               double z1= 5;
               double b;
               double c;
               double e;
               double f;
               double g;
               double h;
               double i;
               double j;
               double k;
               double l1;
               double m;
               double n;
               double o;
               String answer2; 
               String answer3;
    
                try {
                    String percentprelim = percentPrelimjTextField2.getText();
                    if (percentprelim.isEmpty()) {
                                throw new IllegalArgumentException("Percent Value 1 cannot be empty");
                            }
                        } catch (IllegalArgumentException ee) {
                            JOptionPane.showMessageDialog(recordJFrame.this, "percent value 1 cannot be empty");
                        }
                                
                                   try { 
                                        percentprelim = Double.parseDouble(percentPrelimjTextField2.getText());
                                        if(percentprelim >100 || percentprelim < 0)
                                        throw new IllegalArgumentException("percent value 1 should be between 0 to 100");
                                        }
                                        catch(IllegalArgumentException ff){
                                        JOptionPane.showMessageDialog(recordJFrame.this, " percent value 1 should be between 0 to 100");  
                                        }     
                                               
                try {
                            String gradeprelim = gradePrelimjTextField6.getText();
                            if (gradeprelim.isEmpty()) {
                                throw new IllegalArgumentException("Grade Value 1 cannot be empty");
                            }
                        } catch (IllegalArgumentException ee) {
                            JOptionPane.showMessageDialog(recordJFrame.this, "Grade value 1 cannot be empty");
                        }
                
                                try {
                                        prelim = Double.parseDouble(gradePrelimjTextField6.getText());
                                        if(prelim <55 || prelim > 95)
                                        throw new IllegalArgumentException("Grade value 1 should be between 55 to 95");
                                        }
                                        catch(IllegalArgumentException ff){
                                        JOptionPane.showMessageDialog(recordJFrame.this, " Grade value 1 should be between 55 to 95");  
                                        }   
                
                
                try {
                            String percentmidterm = percentMidTermjTextField3.getText();
                            if (percentmidterm.isEmpty()) {
                                throw new IllegalArgumentException("Percent Value 2 cannot be empty");
                            }
                        } catch (IllegalArgumentException ee) {
                            JOptionPane.showMessageDialog(recordJFrame.this, "Percent value 2 cannot be empty");
                        }
                
                
                                   try { 
                                       percentmidterm = Double.parseDouble(percentMidTermjTextField3.getText());
                                        if(percentmidterm >100 || percentmidterm < 0)
                                        throw new IllegalArgumentException("Percent value 2 should be between 0 to 100");
                                        }
                                        catch(IllegalArgumentException ff){
                                        JOptionPane.showMessageDialog(recordJFrame.this, " percent value 2 should be between 0 to 100");  
                                        } 
                                   
                                   try { 
                                        midterm = Double.parseDouble(gradeMidTermjTextField7.getText());
                                        if(midterm < 55 || midterm > 95)
                                        throw new IllegalArgumentException("Grade value 2 should be between 55 to 95");
                                        }
                                        catch(IllegalArgumentException ff){
                                        JOptionPane.showMessageDialog(recordJFrame.this, " Grade value 2 should be between 55 to 95");  
                                        } 
                
                try {
                            String grademidterm = gradeMidTermjTextField7.getText();
                            if (grademidterm.isEmpty()) {
                                throw new IllegalArgumentException("Grade Value 2 cannot be empty");
                            }
                        } catch (IllegalArgumentException ee) {
                            JOptionPane.showMessageDialog(recordJFrame.this, "Grade value 2 cannot be empty");
                        }
                
                                       
                
                try {
                            String percentsemifinal = percentSemiFinaljTextField4.getText();
                            if (percentsemifinal.isEmpty()) {
                                throw new IllegalArgumentException("Percent Value 3 cannot be empty");
                            }
                        } catch (IllegalArgumentException ee) {
                            JOptionPane.showMessageDialog(recordJFrame.this, "Percent value 3 cannot be empty");
                        }
                
                try {
                            String gradesemifinal = gradeSemiFinaljTextField8.getText();
                            if (gradesemifinal.isEmpty()) {
                                throw new IllegalArgumentException("Grade Value 3 cannot be empty");
                            }
                        } catch (IllegalArgumentException ee) {
                            JOptionPane.showMessageDialog(recordJFrame.this, "Grade value 3 cannot be empty");
                        }
                
                                                
                                   try {
                                       percentsemifinal = Double.parseDouble(percentSemiFinaljTextField4.getText());
                                        if(percentsemifinal >100 || percentsemifinal < 0)
                                        throw new IllegalArgumentException("Percent value 3 should be between 0 to 100");
                                        }
                                        catch(IllegalArgumentException ff){
                                        JOptionPane.showMessageDialog(recordJFrame.this, " percent value 3 should be between 0 to 100");  
                                        } 
                                   
                                   try { 
                                       semifinal = Double.parseDouble(gradeSemiFinaljTextField8.getText());
                                        if(semifinal < 55 || semifinal > 95)
                                        throw new IllegalArgumentException("Grade value 3 should be between 55 to 95");
                                        }
                                        catch(IllegalArgumentException ff){
                                        JOptionPane.showMessageDialog(recordJFrame.this, " Grade value 3 should be between 55 to 95");  
                                        } 
                
                try {
                            String percentfinal = percentFinaljTextField5.getText();
                            if (percentfinal.isEmpty()) {
                                throw new IllegalArgumentException("Percent Value 4 cannot be empty");
                            }
                        } catch (IllegalArgumentException ee) {
                            JOptionPane.showMessageDialog(recordJFrame.this, "Percent value 4 cannot be empty");
                        }
                
                try {
                            String gradefinal = gradeFinaljTextField9.getText();
                            if (gradefinal.isEmpty()) {
                                throw new IllegalArgumentException("Percent Value 4 cannot be empty");
                            }
                        } catch (IllegalArgumentException ee) {
                            JOptionPane.showMessageDialog(recordJFrame.this, "Percent value 4 cannot be empty");
                        }
                
                                  try {
                                        percentfinal10 = Double.parseDouble(percentFinaljTextField5.getText());
                                        if(percentfinal10 >100 || percentfinal10 < 0)
                                        throw new IllegalArgumentException("Percent value 4 should be between 0 to 100");
                                        }
                                        catch(IllegalArgumentException ff){
                                        JOptionPane.showMessageDialog(recordJFrame.this, " Percent value 4 should be between 0 to 100");  
                                        } 
                                   
                                   try { 
                                        final10 = Double.parseDouble(gradeFinaljTextField9.getText());
                                        if(final10 < 55 || final10 > 95)
                                        throw new IllegalArgumentException("Grade value 4 should be between 55 to 95");
                                        }
                                        catch(IllegalArgumentException ff){
                                        JOptionPane.showMessageDialog(recordJFrame.this, " Grade value 4 should be between 55 to 95");  
                                        } 
          
 percenttotal = percentprelim + percentmidterm + percentsemifinal + percentfinal10;
     

  if(percenttotal == 100)
    {       
        b = percentprelim / 100;   
        c = prelim * b;   
        e = percentmidterm / 100;    
        f = midterm * e;    
        g = percentsemifinal / 100;    
        h = semifinal * g;   
        i = percentfinal10 / 100;   
        j = final10 * i;   
        k = c + f + h + j;  
        l1 = k - w1;   
        m = l1 / x1;   
        n = y1 * m;    
        o = n + z1;
          answer2 = String.format("%.4f",k);
          gradejTextField10.setText(answer2);

          answer3 = String.format("%.4f",o);
          rankGradejTextField11.setText(answer3);
    
    }
    else if (percenttotal != 100)
    {
    JOptionPane.showMessageDialog(recordJFrame.this,"percentage total not equal to 100");
    gradejTextField10.setText("");
    rankGradejTextField11.setText("");
    
    }
    
    try {
            String percentnum1 = percentPrelimjTextField2.getText();
            String percentnum2 = percentMidTermjTextField3.getText();
            String percentnum3 = percentSemiFinaljTextField4.getText();
            String percentnum4 = percentFinaljTextField5.getText();
            
            String gradenum1 = gradePrelimjTextField6.getText();
            String gradenum2 = gradeMidTermjTextField7.getText();
            String gradenum3 = gradeSemiFinaljTextField8.getText();
            String gradenum4 = gradeFinaljTextField9.getText();
            
            String gradefinal = gradejTextField10.getText();
            String rankfinal = rankGradejTextField11.getText();
            
            DefaultTableModel model3 = (DefaultTableModel) wFactorjTable2.getModel();
            int t = wFactorjTable2.getSelectedRow();
            model3.setValueAt(gradenum1, t, 2);
            model3.setValueAt(percentnum1, t, 3);
            model3.setValueAt(gradenum2, t, 4);
            model3.setValueAt(percentnum2, t, 5);
            model3.setValueAt(gradenum3, t, 6);
            model3.setValueAt(percentnum3, t, 7);
            model3.setValueAt(gradenum4, t, 8);
            model3.setValueAt(percentnum4, t, 9);
            model3.setValueAt(gradefinal, t, 10);
            model3.setValueAt(rankfinal, t, 11);
            
        } catch (Exception e6) {
            JOptionPane.showMessageDialog(recordJFrame.this,"Check if row in Table is selected");
        }
        
        }
        try {
            if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
                
                DefaultTableModel model3 = (DefaultTableModel) wFactorjTable2.getModel();
                int t = wFactorjTable2.getSelectedRow();
                wFactorjTable2.getSelectionModel().setSelectionInterval(t + 1, t + 1);
                String textFielda = (String) model3.getValueAt(wFactorjTable2.getSelectedRow(), 0);
                String textField1a = (String) model3.getValueAt(wFactorjTable2.getSelectedRow(), 1);
                String textField2a = (String) model3.getValueAt(wFactorjTable2.getSelectedRow(), 2);
                String textField3a = (String) model3.getValueAt(wFactorjTable2.getSelectedRow(), 3);
                String textField4a = (String) model3.getValueAt(wFactorjTable2.getSelectedRow(), 4);
                String textField5a = (String) model3.getValueAt(wFactorjTable2.getSelectedRow(), 5);
                String textField6a = (String) model3.getValueAt(wFactorjTable2.getSelectedRow(), 6);
                String textField7a = (String) model3.getValueAt(wFactorjTable2.getSelectedRow(), 7);
                String textField8a = (String) model3.getValueAt(wFactorjTable2.getSelectedRow(), 8);
                String textField9a = (String) model3.getValueAt(wFactorjTable2.getSelectedRow(), 9);
                String textField10a = (String) model3.getValueAt(wFactorjTable2.getSelectedRow(), 10);
                String textField11a = (String) model3.getValueAt(wFactorjTable2.getSelectedRow(), 11);
                
                idnumber2jLabel19.setText(textFielda);
                name2jLabel20.setText(textField1a);
                
                gradePrelimjTextField6.setText(textField2a);
                percentPrelimjTextField2.setText(textField3a);
                gradeMidTermjTextField7.setText(textField4a);
                percentMidTermjTextField3.setText(textField5a);
                percentSemiFinaljTextField4.setText(textField7a);
                gradeSemiFinaljTextField8.setText(textField6a);
                percentFinaljTextField5.setText(textField9a);
                gradeFinaljTextField9.setText(textField8a);
                
                gradejTextField10.setText(textField10a);
                rankGradejTextField11.setText(textField11a);
                
            } else {
            }
        } catch (Exception e) {
        }
        
        try {
            if (evt.getKeyCode() == KeyEvent.VK_UP) {
                
                DefaultTableModel model3 = (DefaultTableModel) wFactorjTable2.getModel();
                int t = wFactorjTable2.getSelectedRow();
                wFactorjTable2.getSelectionModel().setSelectionInterval(t - 1, t - 1);
                String textFielda = (String) model3.getValueAt(wFactorjTable2.getSelectedRow(), 0);
                String textField1a = (String) model3.getValueAt(wFactorjTable2.getSelectedRow(), 1);
                String textField2a = (String) model3.getValueAt(wFactorjTable2.getSelectedRow(), 2);
                String textField3a = (String) model3.getValueAt(wFactorjTable2.getSelectedRow(), 3);
                String textField4a = (String) model3.getValueAt(wFactorjTable2.getSelectedRow(), 4);
                String textField5a = (String) model3.getValueAt(wFactorjTable2.getSelectedRow(), 5);
                String textField6a = (String) model3.getValueAt(wFactorjTable2.getSelectedRow(), 6);
                String textField7a = (String) model3.getValueAt(wFactorjTable2.getSelectedRow(), 7);
                String textField8a = (String) model3.getValueAt(wFactorjTable2.getSelectedRow(), 8);
                String textField9a = (String) model3.getValueAt(wFactorjTable2.getSelectedRow(), 9);
                String textField10a = (String) model3.getValueAt(wFactorjTable2.getSelectedRow(), 10);
                String textField11a = (String) model3.getValueAt(wFactorjTable2.getSelectedRow(), 11);
                
                idnumber2jLabel19.setText(textFielda);
                name2jLabel20.setText(textField1a);
                
                gradePrelimjTextField6.setText(textField2a);
                percentPrelimjTextField2.setText(textField3a);
                gradeMidTermjTextField7.setText(textField4a);
                percentMidTermjTextField3.setText(textField5a);
                percentSemiFinaljTextField4.setText(textField7a);
                gradeSemiFinaljTextField8.setText(textField6a);
                percentFinaljTextField5.setText(textField9a);
                gradeFinaljTextField9.setText(textField8a);
                
                gradejTextField10.setText(textField10a);
                rankGradejTextField11.setText(textField11a);
                
            } else {
            }
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_gradeFinaljTextField9KeyPressed

    private void wFactorjTable2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wFactorjTable2KeyPressed

          try {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {                           
                try {
                    Robot robot = new Robot();
                    robot.keyPress(KeyEvent.VK_RIGHT); 
                    robot.keyRelease(KeyEvent.VK_RIGHT);
                    
                    robot.keyPress(KeyEvent.VK_LEFT); 
                    robot.keyRelease(KeyEvent.VK_LEFT); 
                    
                int currentSelectedRow = wFactorjTable2.getSelectedRow();
                wFactorjTable2.getSelectionModel().setSelectionInterval(currentSelectedRow, currentSelectedRow);
                    DefaultTableModel model3 = (DefaultTableModel) wFactorjTable2.getModel();
 
                    String num3 = (String) model3.getValueAt(wFactorjTable2.getSelectedRow(), 2);
                    String num4 = (String) model3.getValueAt(wFactorjTable2.getSelectedRow(), 3);
                    String num5 = (String) model3.getValueAt(wFactorjTable2.getSelectedRow(), 4);
                    String num6 = (String) model3.getValueAt(wFactorjTable2.getSelectedRow(), 5);
                    String num7 = (String) model3.getValueAt(wFactorjTable2.getSelectedRow(), 6);
                    String num8 = (String) model3.getValueAt(wFactorjTable2.getSelectedRow(), 7);
                    String num9 = (String) model3.getValueAt(wFactorjTable2.getSelectedRow(), 8);
		    String num10 = (String) model3.getValueAt(wFactorjTable2.getSelectedRow(), 9);
                    
                    gradePrelimjTextField6.setText(num3);
                    percentPrelimjTextField2.setText(num4);
                    gradeMidTermjTextField7.setText(num5 );
                    percentMidTermjTextField3.setText(num6);
                    percentSemiFinaljTextField4.setText(num8);
                    gradeSemiFinaljTextField8.setText(num7);
                    percentFinaljTextField5.setText(num10);
                    gradeFinaljTextField9.setText(num9);
                   
                } catch (AWTException ex) {
                    Logger.getLogger(recordJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }

                
                evt.consume();
                
            } else {
            }
        } catch (Exception e) {
        }   
        
        
try {
            if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
                gradeFinaljTextField9.setText("");
            } else {
            }
        } catch (Exception e) {
        }
        
        try {
            if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
                int currentSelectedRow = wFactorjTable2.getSelectedRow();
                wFactorjTable2.getSelectionModel().setSelectionInterval(currentSelectedRow, currentSelectedRow);
                
                DefaultTableModel model4 = (DefaultTableModel) wFactorjTable2.getModel();
                String textFielda = (String) model4.getValueAt(wFactorjTable2.getSelectedRow() + 1, 0);
                String textField1a = (String) model4.getValueAt(wFactorjTable2.getSelectedRow() + 1, 1);
                String textField2a = (String) model4.getValueAt(wFactorjTable2.getSelectedRow() + 1, 2);
                String textField3a = (String) model4.getValueAt(wFactorjTable2.getSelectedRow() + 1, 3);
                String textField4a = (String) model4.getValueAt(wFactorjTable2.getSelectedRow() + 1, 4);
                String textField5a = (String) model4.getValueAt(wFactorjTable2.getSelectedRow() + 1, 5);
                String textField6a = (String) model4.getValueAt(wFactorjTable2.getSelectedRow() + 1, 6);
                String textField7a = (String) model4.getValueAt(wFactorjTable2.getSelectedRow() + 1, 7);
                String textField8a = (String) model4.getValueAt(wFactorjTable2.getSelectedRow() + 1, 8);
                String textField9a = (String) model4.getValueAt(wFactorjTable2.getSelectedRow() + 1, 9);
                String textField10a = (String) model4.getValueAt(wFactorjTable2.getSelectedRow() + 1, 10);
                String textField11a = (String) model4.getValueAt(wFactorjTable2.getSelectedRow() + 1, 11);
                
                idnumber2jLabel19.setText(textFielda);
                name2jLabel20.setText(textField1a);
                
                gradePrelimjTextField6.setText(textField2a);
                percentPrelimjTextField2.setText(textField3a);
                gradeMidTermjTextField7.setText(textField4a);
                percentMidTermjTextField3.setText(textField5a);
                percentSemiFinaljTextField4.setText(textField7a);
                gradeSemiFinaljTextField8.setText(textField6a);
                percentFinaljTextField5.setText(textField9a);
                gradeFinaljTextField9.setText(textField8a);
                
                gradejTextField10.setText(textField10a);
                rankGradejTextField11.setText(textField11a);                
                
            } else {
            }
        } catch (Exception e) {
        }
        
       try {
            if (evt.getKeyCode() == KeyEvent.VK_UP) {
                
                DefaultTableModel model3 = (DefaultTableModel) wFactorjTable2.getModel();
                int t = wFactorjTable2.getSelectedRow();
                wFactorjTable2.getSelectionModel().setSelectionInterval(t - 1, t - 1);
                String textFielda = (String) model3.getValueAt(wFactorjTable2.getSelectedRow() - 1, 0);
                String textField1a = (String) model3.getValueAt(wFactorjTable2.getSelectedRow() - 1, 1);
                String textField2a = (String) model3.getValueAt(wFactorjTable2.getSelectedRow() - 1, 2);
                String textField3a = (String) model3.getValueAt(wFactorjTable2.getSelectedRow() - 1, 3);
                String textField4a = (String) model3.getValueAt(wFactorjTable2.getSelectedRow() - 1, 4);
                String textField5a = (String) model3.getValueAt(wFactorjTable2.getSelectedRow() - 1, 5);
                String textField6a = (String) model3.getValueAt(wFactorjTable2.getSelectedRow() - 1, 6);
                String textField7a = (String) model3.getValueAt(wFactorjTable2.getSelectedRow() - 1, 7);
                String textField8a = (String) model3.getValueAt(wFactorjTable2.getSelectedRow() - 1, 8);
                String textField9a = (String) model3.getValueAt(wFactorjTable2.getSelectedRow() - 1, 9);
                String textField10a = (String) model3.getValueAt(wFactorjTable2.getSelectedRow() - 1, 10);
                String textField11a = (String) model3.getValueAt(wFactorjTable2.getSelectedRow() - 1, 11);
                
                idnumber2jLabel19.setText(textFielda);
                name2jLabel20.setText(textField1a);
                
                gradePrelimjTextField6.setText(textField2a);
                percentPrelimjTextField2.setText(textField3a);
                gradeMidTermjTextField7.setText(textField4a);
                percentMidTermjTextField3.setText(textField5a);
                percentSemiFinaljTextField4.setText(textField7a);
                gradeSemiFinaljTextField8.setText(textField6a);
                percentFinaljTextField5.setText(textField9a);
                gradeFinaljTextField9.setText(textField8a);
                
                gradejTextField10.setText(textField10a);
                rankGradejTextField11.setText(textField11a);
                
            } else {
            }
        } catch (Exception e) {
        }  
        
    }//GEN-LAST:event_wFactorjTable2KeyPressed

    private void wFactorjTable2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wFactorjTable2KeyReleased

        
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
    try {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                                try {
                    Robot robot = new Robot();
                    
                    robot.keyPress(KeyEvent.VK_TAB); 
                    robot.keyRelease(KeyEvent.VK_TAB);
                    robot.keyPress(KeyEvent.VK_LEFT); 
                    robot.keyRelease(KeyEvent.VK_LEFT);
                    
                   int currentSelectedRow = wFactorjTable2.getSelectedRow();
                    wFactorjTable2.getSelectionModel().setSelectionInterval(currentSelectedRow, currentSelectedRow);
                    DefaultTableModel model3 = (DefaultTableModel) wFactorjTable2.getModel();
                    
                    String id1 = (String) model3.getValueAt(wFactorjTable2.getSelectedRow(),0);
                    String name1 = (String) model3.getValueAt(wFactorjTable2.getSelectedRow(),1);
                    String num3 = (String) model3.getValueAt(wFactorjTable2.getSelectedRow(), 2);
                    String num4 = (String) model3.getValueAt(wFactorjTable2.getSelectedRow(), 3);
                    String num5 = (String) model3.getValueAt(wFactorjTable2.getSelectedRow(), 4);
                    String num6 = (String) model3.getValueAt(wFactorjTable2.getSelectedRow(), 5);
                    String num7 = (String) model3.getValueAt(wFactorjTable2.getSelectedRow(), 6);
                    String num8 = (String) model3.getValueAt(wFactorjTable2.getSelectedRow(), 7);
                    String num9 = (String) model3.getValueAt(wFactorjTable2.getSelectedRow(), 8);
		    String num10 = (String) model3.getValueAt(wFactorjTable2.getSelectedRow(), 9);
                    
                idnumber2jLabel19.setText(id1);
                name2jLabel20.setText(name1);
                gradePrelimjTextField6.setText(num3);
                percentPrelimjTextField2.setText(num4);
                gradeMidTermjTextField7.setText(num5 );
                percentMidTermjTextField3.setText(num6);
                percentSemiFinaljTextField4.setText(num8);
                gradeSemiFinaljTextField8.setText(num7);
                percentFinaljTextField5.setText(num10);
                gradeFinaljTextField9.setText(num9);
                                   
                    
                } catch (AWTException ex) {
                    Logger.getLogger(recordJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }

                
                evt.consume();
                
            } else {
            }
        } catch (Exception e) {
            
        }
    try {
        
        double w1 = 55;
        double x1 = 40;
        double y1 = -4;
        double z1 = 5;
        double b;
        double c;
        double e;
        double f;
        double g;
        double h;
        double i;
        double j;
        double k;
        double l1;
        double m;
        double n;
        double o;
        String answer2;        
        String answer3;
        
        try {
            String percentprelim = percentPrelimjTextField2.getText();
            if (percentprelim.isEmpty()) {
                throw new IllegalArgumentException("Percent Value 1 cannot be empty");
            }
        } catch (IllegalArgumentException ee) {
            JOptionPane.showMessageDialog(recordJFrame.this, "percent value 1 cannot be empty");
        }
        
        try {            
            percentprelim = Double.parseDouble(percentPrelimjTextField2.getText());
            if (percentprelim > 100 || percentprelim < 0) {
                throw new IllegalArgumentException("percent value 1 should be between 0 to 100");
            }
        } catch (IllegalArgumentException ff) {
            JOptionPane.showMessageDialog(recordJFrame.this, " percent value 1 should be between 0 to 100");            
        }        
        
        try {
            String gradeprelim = gradePrelimjTextField6.getText();
            if (gradeprelim.isEmpty()) {
                throw new IllegalArgumentException("Grade Value 1 cannot be empty");
            }
        } catch (IllegalArgumentException ee) {
            JOptionPane.showMessageDialog(recordJFrame.this, "Grade value 1 cannot be empty");
        }
        
        try {
            prelim = Double.parseDouble(gradePrelimjTextField6.getText());
            if (prelim < 55 || prelim > 95) {
                throw new IllegalArgumentException("Grade value 1 should be between 55 to 95");
            }
        } catch (IllegalArgumentException ff) {
            JOptionPane.showMessageDialog(recordJFrame.this, " Grade value 1 should be between 55 to 95");            
        }        
        
        try {
            String percentmidterm = percentMidTermjTextField3.getText();
            if (percentmidterm.isEmpty()) {
                throw new IllegalArgumentException("Percent Value 2 cannot be empty");
            }
        } catch (IllegalArgumentException ee) {
            JOptionPane.showMessageDialog(recordJFrame.this, "Percent value 2 cannot be empty");
        }
        
        try {            
            percentmidterm = Double.parseDouble(percentMidTermjTextField3.getText());
            if (percentmidterm > 100 || percentmidterm < 0) {
                throw new IllegalArgumentException("Percent value 2 should be between 0 to 100");
            }
        } catch (IllegalArgumentException ff) {
            JOptionPane.showMessageDialog(recordJFrame.this, " percent value 2 should be between 0 to 100");            
        }        
        
        try {            
            midterm = Double.parseDouble(gradeMidTermjTextField7.getText());
            if (midterm < 55 || midterm > 95) {
                throw new IllegalArgumentException("Grade value 2 should be between 55 to 95");
            }
        } catch (IllegalArgumentException ff) {
            JOptionPane.showMessageDialog(recordJFrame.this, " Grade value 2 should be between 55 to 95");            
        }        
        
        try {
            String grademidterm = gradeMidTermjTextField7.getText();
            if (grademidterm.isEmpty()) {
                throw new IllegalArgumentException("Grade Value 2 cannot be empty");
            }
        } catch (IllegalArgumentException ee) {
            JOptionPane.showMessageDialog(recordJFrame.this, "Grade value 2 cannot be empty");
        }
        
        try {
            String percentsemifinal = percentSemiFinaljTextField4.getText();
            if (percentsemifinal.isEmpty()) {
                throw new IllegalArgumentException("Percent Value 3 cannot be empty");
            }
        } catch (IllegalArgumentException ee) {
            JOptionPane.showMessageDialog(recordJFrame.this, "Percent value 3 cannot be empty");
        }
        
        try {
            String gradesemifinal = gradeSemiFinaljTextField8.getText();
            if (gradesemifinal.isEmpty()) {
                throw new IllegalArgumentException("Grade Value 3 cannot be empty");

            }
        } catch (IllegalArgumentException ee) {
            JOptionPane.showMessageDialog(recordJFrame.this, "Grade value 3 cannot be empty");

        }
        
        try {
            percentsemifinal = Double.parseDouble(percentSemiFinaljTextField4.getText());
            if (percentsemifinal > 100 || percentsemifinal < 0) {
                throw new IllegalArgumentException("Percent value 3 should be between 0 to 100");

            }
        } catch (IllegalArgumentException ff) {
            JOptionPane.showMessageDialog(recordJFrame.this, " percent value 3 should be between 0 to 100"); 
              rankGradejTextField11.setText("");
              gradejTextField10.setText("");
        }        
        
        try {            
            semifinal = Double.parseDouble(gradeSemiFinaljTextField8.getText());
            if (semifinal < 55 || semifinal > 95) {
                throw new IllegalArgumentException("Grade value 3 should be between 55 to 95");
 
            }
        } catch (IllegalArgumentException ff) {
            JOptionPane.showMessageDialog(recordJFrame.this, " Grade value 3 should be between 55 to 95");
              rankGradejTextField11.setText("");
              gradejTextField10.setText("");
        }        
        
        try {
            String percentfinal = percentFinaljTextField5.getText();
            if (percentfinal.isEmpty()) {
                throw new IllegalArgumentException("Percent Value 4 cannot be empty");

            }
        } catch (IllegalArgumentException ee) {
            JOptionPane.showMessageDialog(recordJFrame.this, "Percent value 4 cannot be empty");
              rankGradejTextField11.setText("");
              gradejTextField10.setText("");
        }
        
        try {
            String gradefinal = gradeFinaljTextField9.getText();
            if (gradefinal.isEmpty()) {
                throw new IllegalArgumentException("Percent Value 4 cannot be empty");

            }
        } catch (IllegalArgumentException ee) {
            JOptionPane.showMessageDialog(recordJFrame.this, "Percent value 4 cannot be empty");
              rankGradejTextField11.setText("");
              gradejTextField10.setText("");
        }
        
        try {
            percentfinal10 = Double.parseDouble(percentFinaljTextField5.getText());
            if (percentfinal10 > 100 || percentfinal10 < 0) {
                throw new IllegalArgumentException("Percent value 4 should be between 0 to 100");

            }
        } catch (IllegalArgumentException ff) {
            JOptionPane.showMessageDialog(recordJFrame.this, " Percent value 4 should be between 0 to 100"); 
                          rankGradejTextField11.setText("");
                           gradejTextField10.setText("");
        }        
        
        try {            
            final10 = Double.parseDouble(gradeFinaljTextField9.getText());
            if (final10 < 55 || final10 > 95) {
                throw new IllegalArgumentException("Grade value 4 should be between 55 to 95");

            }
        } catch (IllegalArgumentException ff) {
            JOptionPane.showMessageDialog(recordJFrame.this, " Grade value 4 should be between 55 to 95");
              rankGradejTextField11.setText("");
              gradejTextField10.setText("");
        }        
        
        percenttotal = percentprelim + percentmidterm + percentsemifinal + percentfinal10;
        
        if (percenttotal == 100) {            
            b = percentprelim / 100;            
            c = prelim * b;            
            e = percentmidterm / 100;           
            f = midterm * e;           
            g = percentsemifinal / 100;            
            h = semifinal * g;            
            i = percentfinal10 / 100;            
            j = final10 * i;            
            k = c + f + h + j;            
            l1 = k - w1;            
            m = l1 / x1;            
            n = y1 * m;            
            o = n + z1;
            
            answer2 = String.format("%.4f", k);
            gradejTextField10.setText(answer2);
            
            answer3 = String.format("%.4f", o);
            rankGradejTextField11.setText(answer3);
            
        } else if (percenttotal != 100) {
            JOptionPane.showMessageDialog(recordJFrame.this, "percentage total not equal to 100");
            gradejTextField10.setText("");
            rankGradejTextField11.setText("");
            
        }
        
        try {
            String percentnum1 = percentPrelimjTextField2.getText();
            String percentnum2 = percentMidTermjTextField3.getText();
            String percentnum3 = percentSemiFinaljTextField4.getText();
            String percentnum4 = percentFinaljTextField5.getText();
            
            String gradenum1 = gradePrelimjTextField6.getText();
            String gradenum2 = gradeMidTermjTextField7.getText();
            String gradenum3 = gradeSemiFinaljTextField8.getText();
            String gradenum4 = gradeFinaljTextField9.getText();
            
            String gradefinal = gradejTextField10.getText();
            String rankfinal = rankGradejTextField11.getText();
            
            DefaultTableModel model3 = (DefaultTableModel) wFactorjTable2.getModel();
            int t = wFactorjTable2.getSelectedRow();
            model3.setValueAt(gradenum1, t, 2);
            model3.setValueAt(percentnum1, t, 3);
            model3.setValueAt(gradenum2, t, 4);
            model3.setValueAt(percentnum2, t, 5);
            model3.setValueAt(gradenum3, t, 6);
            model3.setValueAt(percentnum3, t, 7);
            model3.setValueAt(gradenum4, t, 8);
            model3.setValueAt(percentnum4, t, 9);
            model3.setValueAt(gradefinal, t, 10);
            model3.setValueAt(rankfinal, t, 11);
            
        } catch (Exception e6) {
            JOptionPane.showMessageDialog(recordJFrame.this, "Check if row in Table is selected");
              rankGradejTextField11.setText("");
              gradejTextField10.setText("");
        }
    } catch (HeadlessException headlessException) {
              rankGradejTextField11.setText("");
              gradejTextField10.setText("");
    }
        
        }
        
    }//GEN-LAST:event_wFactorjTable2KeyReleased

    private void wFactorjTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wFactorjTable2MouseClicked
        
                int currentSelectedRow = wFactorjTable2.getSelectedRow();
                wFactorjTable2.getSelectionModel().setSelectionInterval(currentSelectedRow, currentSelectedRow);
                
                DefaultTableModel model4 = (DefaultTableModel) wFactorjTable2.getModel();
                String textFielda = (String) model4.getValueAt(wFactorjTable2.getSelectedRow(), 0);
                String textField1a = (String) model4.getValueAt(wFactorjTable2.getSelectedRow(), 1);
                String textField2a = (String) model4.getValueAt(wFactorjTable2.getSelectedRow(), 2);
                String textField3a = (String) model4.getValueAt(wFactorjTable2.getSelectedRow(), 3);
                String textField4a = (String) model4.getValueAt(wFactorjTable2.getSelectedRow(), 4);
                String textField5a = (String) model4.getValueAt(wFactorjTable2.getSelectedRow(), 5);
                String textField6a = (String) model4.getValueAt(wFactorjTable2.getSelectedRow(), 6);
                String textField7a = (String) model4.getValueAt(wFactorjTable2.getSelectedRow(), 7);
                String textField8a = (String) model4.getValueAt(wFactorjTable2.getSelectedRow(), 8);
                String textField9a = (String) model4.getValueAt(wFactorjTable2.getSelectedRow(), 9);
                String textField10a = (String) model4.getValueAt(wFactorjTable2.getSelectedRow(), 10);
                String textField11a = (String) model4.getValueAt(wFactorjTable2.getSelectedRow(), 11);
                
                idnumber2jLabel19.setText(textFielda);
                name2jLabel20.setText(textField1a);
                
                gradePrelimjTextField6.setText(textField2a);
                percentPrelimjTextField2.setText(textField3a);
                gradeMidTermjTextField7.setText(textField4a);
                percentMidTermjTextField3.setText(textField5a);
                percentSemiFinaljTextField4.setText(textField7a);
                gradeSemiFinaljTextField8.setText(textField6a);
                percentFinaljTextField5.setText(textField9a);
                gradeFinaljTextField9.setText(textField8a);
                
                gradejTextField10.setText(textField10a);
                rankGradejTextField11.setText(textField11a);   
        
    }//GEN-LAST:event_wFactorjTable2MouseClicked

    private void gradejTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gradejTableMouseClicked

                DefaultTableModel model = (DefaultTableModel) gradejTable.getModel();

                String textField = (String) model.getValueAt(gradejTable.getSelectedRow(),0);
                String textField2 = (String) model.getValueAt(gradejTable.getSelectedRow(),1);
                String textField4 = (String) model.getValueAt(gradejTable.getSelectedRow(),4);
                String textField5 = (String) model.getValueAt(gradejTable.getSelectedRow(),5);
                String textField6 = (String) model.getValueAt(gradejTable.getSelectedRow(),6);
                String textField7 = (String) model.getValueAt(gradejTable.getSelectedRow(),7);
                String textField8 = (String) model.getValueAt(gradejTable.getSelectedRow(),3);


                gradeNamejLabel28.setText(textField+" "+textField2);
                percentScoreJLabel.setText(textField4);
                classjLabel.setText(textField5);
                gradejLabel.setText(textField6);
                rankjLabel.setText(textField7);


                percentScoreJLabel.setForeground(new Color(153,0,51));
                classjLabel.setForeground(new Color(153,0,51));
                gradejLabel.setForeground(new Color(153,0,51));
                rankjLabel.setForeground(new Color(153,0,51));
                gradeNamejLabel28.setForeground(new Color(153,0,51));

                earnedScoreTextField.setText(textField8);
    }//GEN-LAST:event_gradejTableMouseClicked

    private void commulativejTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_commulativejTable1KeyReleased

          if (evt.getKeyCode() == KeyEvent.VK_ENTER) {      
            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            String formattedDate = myDateObj.format(myFormatObj);
            comDateTimejLabel23.setText(formattedDate);   
            int colCount = commulativejTable1.getColumnCount();          
            int rowsel = commulativejTable1.getSelectedRow();        
            commulativejTable1.setValueAt(formattedDate, rowsel, colCount - 2);
               
              for (int i = colCount; i > 4; i-=2){
              String str = (String) commulativejTable1.getModel().getValueAt(commulativejTable1.getSelectedRow(), i-1);      

                Integer attendcount2 = Integer.parseInt(str);
                xx = xx + attendcount2;

                }
                String value4 = (String) commulativejTable1.getModel().getValueAt(0, 3);

                 String att3 = Integer.toString(xx);
                 commulativejTable1.setValueAt(att3, commulativejTable1.getSelectedRow(), 3);
                 commulativejTable1.setValueAt(value4, commulativejTable1.getSelectedRow(), 2);
                 xx=0;
         
                              try {
                                  Robot r = new Robot();
                                  r.keyPress(KeyEvent.VK_ENTER);
                                  r.keyRelease(KeyEvent.VK_ENTER);
                                  evt.consume();
                              } catch (AWTException aWTException) {
                              }
                evt.consume();
                }else{}

                int currentSelectedRow = commulativejTable1.getSelectedRow();
                commulativejTable1.getSelectionModel().setSelectionInterval(currentSelectedRow, currentSelectedRow);

                DefaultTableModel model5a = (DefaultTableModel) commulativejTable1.getModel();
                String cell1a = (String) model5a.getValueAt(commulativejTable1.getSelectedRow(), 0);
                String cell2a = (String) model5a.getValueAt(commulativejTable1.getSelectedRow(), 1);
                String cell3a = (String) model5a.getValueAt(commulativejTable1.getSelectedRow(), 2);
                String cell4a = (String) model5a.getValueAt(commulativejTable1.getSelectedRow(), 3);

                 comIDjLabel14.setText(cell1a);
                 comNamejLabel15.setText(cell2a);
                 comTotalScorejLabel16.setText(cell3a);
                 comEarnedScorejLabel17.setText(cell4a);
    }//GEN-LAST:event_commulativejTable1KeyReleased

    private void attendSearchjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendSearchjButton1ActionPerformed

        String search1 = attendSearchjTextField111.getText();
        int i=0;
        DefaultTableModel model787 = (DefaultTableModel) attendjTable1.getModel();  
       
        String text4 = "r";
    
        try {
            while (!text4.equals(search1)) {
                               
                attendjTable1.getSelectionModel().setSelectionInterval(i, i);
                String text3 = (String) model787.getValueAt(i,0);
                text4 = new String(text3);
                       
                try {
                    if (text4.equals(search1)) {                       
                        
                                int currentSelectedRow = attendjTable1.getSelectedRow();
                                attendjTable1.getSelectionModel().setSelectionInterval(currentSelectedRow, currentSelectedRow);

                                DefaultTableModel model3a = (DefaultTableModel) attendjTable1.getModel();
                                String cell1 = (String) model3a.getValueAt(attendjTable1.getSelectedRow(), 0);
                                String cell2 = (String) model3a.getValueAt(attendjTable1.getSelectedRow(), 1);
                                String cell3 = (String) model3a.getValueAt(attendjTable1.getSelectedRow(), 2);
                                String cell4 = (String) model3a.getValueAt(attendjTable1.getSelectedRow(), 3);

                                 attendIDjLabel1.setText(cell1);
                                 attendNamejLabel2.setText(cell2);
                                 totalDaysjLabel3.setText(cell3);
                                 daysPresentjLabel9.setText(cell4);
                     
                        break;
                        
                    } else {
                    }
                                        
                } catch (Exception e) {
                }
                ++i;
            } 

        } catch (Exception e) {
            JOptionPane.showMessageDialog(recordJFrame.this, "not found");
        }
    }//GEN-LAST:event_attendSearchjButton1ActionPerformed

    private void attendSearchjTextField111KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_attendSearchjTextField111KeyPressed

    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {     
        String search1 = attendSearchjTextField111.getText();
        int i=0;
        DefaultTableModel model787 = (DefaultTableModel) attendjTable1.getModel();  
       
        String text4 = "r";

        try {
            while (!text4.equals(search1)) {
                               
                attendjTable1.getSelectionModel().setSelectionInterval(i, i);
                String text3 = (String) model787.getValueAt(i,0);
                text4 = text3;
                       
                try {
                    if (text4.equals(search1)) {                       
                        
                                int currentSelectedRow = attendjTable1.getSelectedRow();
                                attendjTable1.getSelectionModel().setSelectionInterval(currentSelectedRow, currentSelectedRow);

                                DefaultTableModel model3a = (DefaultTableModel) attendjTable1.getModel();
                                String cell1 = (String) model3a.getValueAt(attendjTable1.getSelectedRow(), 0);
                                String cell2 = (String) model3a.getValueAt(attendjTable1.getSelectedRow(), 1);
                                String cell3 = (String) model3a.getValueAt(attendjTable1.getSelectedRow(), 2);
                                String cell4 = (String) model3a.getValueAt(attendjTable1.getSelectedRow(), 3);

                                 attendIDjLabel1.setText(cell1);
                                 attendNamejLabel2.setText(cell2);
                                 totalDaysjLabel3.setText(cell3);
                                 daysPresentjLabel9.setText(cell4);
                     
                        break;
                        
                    } else {
                    }
                                        
                } catch (Exception e) {
                }
                ++i;
            } 

        } catch (Exception e) {
            JOptionPane.showMessageDialog(recordJFrame.this, "not found");
        }
    
        }else{}

    }//GEN-LAST:event_attendSearchjTextField111KeyPressed

    private void helpjLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpjLabel11MouseClicked

        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_helpjLabel11MouseClicked

    private void comSearchjButton109ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comSearchjButton109ActionPerformed

        String search1 = comjTextField109.getText();
        int i=0;
        DefaultTableModel model787 = (DefaultTableModel) commulativejTable1.getModel();  
       
        String text4 = "r";    
        try {
            while (!text4.equals(search1)) {
                               
                commulativejTable1.getSelectionModel().setSelectionInterval(i, i);
                String text3 = (String) model787.getValueAt(i,0);
                text4 = text3;
                       
                try {
                    if (text4.equals(search1)) {                       
                        
                                int currentSelectedRow = commulativejTable1.getSelectedRow();
                                commulativejTable1.getSelectionModel().setSelectionInterval(currentSelectedRow, currentSelectedRow);

                                DefaultTableModel model3a = (DefaultTableModel) commulativejTable1.getModel();
                                String cell1 = (String) model3a.getValueAt(commulativejTable1.getSelectedRow(), 0);
                                String cell2 = (String) model3a.getValueAt(commulativejTable1.getSelectedRow(), 1);
                                String cell3 = (String) model3a.getValueAt(commulativejTable1.getSelectedRow(), 2);
                                String cell4 = (String) model3a.getValueAt(commulativejTable1.getSelectedRow(), 3);

                                 comIDjLabel14.setText(cell1);
                                 comNamejLabel15.setText(cell2);
                                 comTotalScorejLabel16.setText(cell3);
                                 comEarnedScorejLabel17.setText(cell4);
                     
                        break;
                        
                    } else {
                    }
                                        
                } catch (Exception e) {
                }
                ++i;
            } 

        } catch (Exception e) {
            JOptionPane.showMessageDialog(recordJFrame.this, "not found");
        }
    }//GEN-LAST:event_comSearchjButton109ActionPerformed

    private void comjTextField109KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comjTextField109KeyPressed

     if (evt.getKeyCode() == KeyEvent.VK_ENTER) {     
        String search1 = comjTextField109.getText();
        int i=0;
        DefaultTableModel model787 = (DefaultTableModel) commulativejTable1.getModel();  
       
        String text4 = "r";

        try {
            while (!text4.equals(search1)) {                               
                commulativejTable1.getSelectionModel().setSelectionInterval(i, i);
                String text3 = (String) model787.getValueAt(i,0);
                text4 = text3;
                       
                try {
                    if (text4.equals(search1)) {                       
                        
                                int currentSelectedRow = commulativejTable1.getSelectedRow();
                                commulativejTable1.getSelectionModel().setSelectionInterval(currentSelectedRow, currentSelectedRow);

                                DefaultTableModel model3a = (DefaultTableModel) commulativejTable1.getModel();
                                String cell1 = (String) model3a.getValueAt(commulativejTable1.getSelectedRow(), 0);
                                String cell2 = (String) model3a.getValueAt(commulativejTable1.getSelectedRow(), 1);
                                String cell3 = (String) model3a.getValueAt(commulativejTable1.getSelectedRow(), 2);
                                String cell4 = (String) model3a.getValueAt(commulativejTable1.getSelectedRow(), 3);

                                 comIDjLabel14.setText(cell1);
                                 comNamejLabel15.setText(cell2);
                                 comTotalScorejLabel16.setText(cell3);
                                 comEarnedScorejLabel17.setText(cell4);
                     
                        break;
                        
                    } else {
                    }
                                        
                } catch (Exception e) {
                }
                ++i;
            } 

        } catch (Exception e) {
            JOptionPane.showMessageDialog(recordJFrame.this, "not found");
        }
     
        }else{}
    }//GEN-LAST:event_comjTextField109KeyPressed

    private void aboutjLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutjLabel19MouseClicked
      
        jTabbedPane1.setSelectedIndex(6);
    }//GEN-LAST:event_aboutjLabel19MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(recordJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(recordJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(recordJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(recordJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new recordJFrame().setVisible(true);
               
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AboutjPanel11;
    private javax.swing.JPanel CommulativejPanel;
    private javax.swing.JPanel Grade;
    private javax.swing.JLabel aboutjLabel19;
    private javax.swing.JButton absentjButton3;
    private javax.swing.JButton addcolumnjButton1;
    private javax.swing.JButton addrowjButton1;
    private javax.swing.JLabel attendIDjLabel1;
    private javax.swing.JLabel attendNamejLabel2;
    private javax.swing.JButton attendSearchjButton1;
    private javax.swing.JTextField attendSearchjTextField111;
    private javax.swing.JLabel attendancejLabel1;
    private javax.swing.JPanel attendancejPanel6;
    private javax.swing.JButton attenddownjButton1;
    private javax.swing.JTable attendjTable1;
    private javax.swing.JButton attendupjButton2;
    private javax.swing.JButton buildTablejButton3;
    private javax.swing.JLabel classjLabel;
    private javax.swing.JButton comCopyToTbljButton7;
    private javax.swing.JLabel comDateTimejLabel23;
    private javax.swing.JButton comDownjButton6;
    private javax.swing.JLabel comEarnedScorejLabel17;
    private javax.swing.JLabel comIDjLabel14;
    private javax.swing.JLabel comNamejLabel15;
    private javax.swing.JButton comPlusColumnjButton3;
    private javax.swing.JButton comPlusRowjButton4;
    private javax.swing.JTextField comScorejTextField1;
    private javax.swing.JButton comSearchjButton109;
    private javax.swing.JLabel comTotalScorejLabel16;
    private javax.swing.JButton comUpjButton5;
    private javax.swing.JTextField comjTextField109;
    private javax.swing.JLabel commulativejLabel2;
    private javax.swing.JTable commulativejTable1;
    private javax.swing.JButton computeButton1;
    private javax.swing.JButton computejButton5;
    private javax.swing.JLabel dateTimejLabel11;
    private javax.swing.JLabel daysPresentjLabel9;
    private javax.swing.JTextField earnedScoreTextField;
    private javax.swing.JButton exportjButton1;
    private javax.swing.JButton exportjButton2;
    private javax.swing.JLabel exportjLabel13;
    private javax.swing.JPanel exportjPanel9;
    private javax.swing.JTextField exportjTextField1;
    private javax.swing.JLabel frameMaxMinjLabel11;
    private javax.swing.JButton gradeCalcCopyTbljButton6;
    private javax.swing.JTextField gradeFinaljTextField9;
    private javax.swing.JTextField gradeMidTermjTextField7;
    private javax.swing.JLabel gradeNamejLabel28;
    private javax.swing.JTextField gradePrelimjTextField6;
    private javax.swing.JTextField gradeSemiFinaljTextField8;
    private javax.swing.JLabel gradecalcjLabel3;
    private javax.swing.JLabel gradejLabel;
    private javax.swing.JTable gradejTable;
    private javax.swing.JTextField gradejTextField10;
    private javax.swing.JLabel helpjLabel11;
    private javax.swing.JPanel helpjPanel10;
    private javax.swing.JLabel idnumber2jLabel19;
    private javax.swing.JButton importjButton3;
    private javax.swing.JLabel importjLabel12;
    private javax.swing.JPanel importjPanel7;
    private javax.swing.JTextField importjTextField;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JButton lockButton2;
    private javax.swing.JLabel mainMenujLabel15;
    private javax.swing.JLabel name2jLabel20;
    private javax.swing.JPanel namejLabel;
    private javax.swing.JPanel navigationjPanel5;
    private javax.swing.JTextField percentFinaljTextField5;
    private javax.swing.JTextField percentMidTermjTextField3;
    private javax.swing.JTextField percentPrelimjTextField2;
    private javax.swing.JLabel percentScoreJLabel;
    private javax.swing.JTextField percentSemiFinaljTextField4;
    private javax.swing.JLabel powerbuttonjLabel20;
    private javax.swing.JButton presentjButton4;
    private javax.swing.JTextField rankGradejTextField11;
    private javax.swing.JLabel rankjLabel;
    private javax.swing.JButton searchjButton5;
    private javax.swing.JTextField searchjTextField12;
    private javax.swing.JLabel totalDaysjLabel3;
    private javax.swing.JTextField totalScoreTextField;
    private javax.swing.JButton wFactorjButton8;
    private javax.swing.JTable wFactorjTable2;
    private javax.swing.JTextField wSearchjTextField2;
    private javax.swing.JButton weightPlusRowjButton8;
    private javax.swing.JLabel weightingFactorjLabel4;
    private javax.swing.JPanel weightingFactorjPanel9;
    // End of variables declaration//GEN-END:variables

}

package TraceAnalyzer;

import java.awt.Desktop;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SortOrder;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Console extends javax.swing.JFrame {

    public Console() {
        initComponents();
        foundList.setModel(new DefaultListModel());
        toAnalyzeList.setModel(new DefaultListModel());        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        analizadorTitle = new javax.swing.JLabel();
        path = new javax.swing.JTextField();
        traceTitle = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        separator = new javax.swing.JSeparator();
        lookup = new javax.swing.JButton();
        foundTitle = new javax.swing.JLabel();
        toAnalyzeTitle = new javax.swing.JLabel();
        rightToLeft = new javax.swing.JButton();
        leftToRight = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        analyze = new javax.swing.JButton();
        chart = new javax.swing.JButton();
        progress = new javax.swing.JProgressBar();
        resultsTitle = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        results = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        foundList = new org.jdesktop.swingx.JXList();
        jScrollPane1 = new javax.swing.JScrollPane();
        toAnalyzeList = new org.jdesktop.swingx.JXList();
        traceTitle1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        analizadorTitle.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        analizadorTitle.setForeground(new java.awt.Color(0, 0, 153));
        analizadorTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        analizadorTitle.setText("Trace Analyzer");

        path.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathActionPerformed(evt);
            }
        });

        traceTitle.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        traceTitle.setForeground(new java.awt.Color(0, 0, 153));
        traceTitle.setText("Traces File Path");

        search.setText("Search...");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        separator.setForeground(new java.awt.Color(204, 204, 255));

        lookup.setText("Look up for traces in file ...");
        lookup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lookupActionPerformed(evt);
            }
        });

        foundTitle.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        foundTitle.setForeground(new java.awt.Color(0, 0, 102));
        foundTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foundTitle.setText("Found");

        toAnalyzeTitle.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        toAnalyzeTitle.setForeground(new java.awt.Color(0, 0, 102));
        toAnalyzeTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        toAnalyzeTitle.setText("To Analyze");

        rightToLeft.setText("<");
        rightToLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightToLeftActionPerformed(evt);
            }
        });

        leftToRight.setText(">");
        leftToRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftToRightActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        analyze.setText("Analyze");
        analyze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analyzeActionPerformed(evt);
            }
        });

        chart.setText("Chart");
        chart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chartActionPerformed(evt);
            }
        });

        resultsTitle.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        resultsTitle.setForeground(new java.awt.Color(0, 0, 102));
        resultsTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultsTitle.setText("Results");

        results.setColumns(20);
        results.setRows(5);
        jScrollPane3.setViewportView(results);

        jSeparator1.setForeground(new java.awt.Color(204, 204, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        foundList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(foundList);

        toAnalyzeList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(toAnalyzeList);

        traceTitle1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        traceTitle1.setForeground(new java.awt.Color(0, 0, 153));
        traceTitle1.setText("(.zip or .txt)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(separator)
                    .addComponent(analizadorTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(traceTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(path)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(search))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(foundTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rightToLeft)
                                    .addComponent(leftToRight))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(toAnalyzeTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lookup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(analyze)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chart, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(progress, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE))
                            .addComponent(jScrollPane3)
                            .addComponent(resultsTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(traceTitle1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(analizadorTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(traceTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(path)
                    .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addComponent(traceTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lookup, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resultsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 2, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(progress, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(analyze)
                                        .addComponent(chart)
                                        .addComponent(exit))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(toAnalyzeTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(foundTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                                .addComponent(leftToRight)
                                .addGap(37, 37, 37)
                                .addComponent(rightToLeft)
                                .addGap(155, 155, 155))))
                    .addComponent(jSeparator1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        JFileChooser fileChooser = new JFileChooser(System.getProperty("user.dir"));
        int retval = fileChooser.showOpenDialog(null);
        if(retval == JFileChooser.APPROVE_OPTION) path.setText(fileChooser.getSelectedFile().toString());
        fileChooser.setVisible(false);
    }//GEN-LAST:event_searchActionPerformed

    private void lookupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lookupActionPerformed
        
        //get if zipped or not
        String ext = "";
        int pos = path.getText().toString().lastIndexOf('.');
        if(pos > 0) ext = path.getText().toString().substring(pos+1);        
        
        //read file
        try {
            BufferedReader br = null;
            if(ext.equals("txt")) br = new BufferedReader(new FileReader(new File(path.getText().toString())));
            else if(ext.equals("zip")){
                ZipFile zip = new ZipFile(path.getText().toString());
                br = new BufferedReader(new InputStreamReader(zip.getInputStream((ZipEntry) zip.entries().nextElement()), "UTF-8"));
            }
            else{
                JOptionPane.showMessageDialog(null, "Traces files must be .zip or .txt format");
                System.exit(0);
            }
            
            foundList.removeAll();
            toAnalyzeList.removeAll();
            
            DefaultListModel model = (DefaultListModel) foundList.getModel();
            String line;
            while((line = br.readLine()) != null){
                if((pos = line.indexOf('x')) != -1){
                    String trace;
                    try{
                        trace = line.substring(pos-1,pos+9);  //11 caracteres
                    }
                    catch(Exception e){
                        trace = line.substring(pos-1,pos+8);  //10 caracteres    
                    }
                    if(!model.contains(trace)) model.addElement(trace);
                }
            }
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lookupActionPerformed

    private void rightToLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightToLeftActionPerformed
        Object[] traces = toAnalyzeList.getSelectedValues();
        for(Object t:traces){
            ((DefaultListModel) toAnalyzeList.getModel()).removeElement(t);
            ((DefaultListModel) foundList.getModel()).addElement(t);
        }
        sortLists();
    }//GEN-LAST:event_rightToLeftActionPerformed

    private void leftToRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftToRightActionPerformed
        Object[] traces = foundList.getSelectedValues();
        if(toAnalyzeList.getModel().getSize() + traces.length > resultSheetsQty){
            JOptionPane.showMessageDialog(null, "You can analyze up to "+ resultSheetsQty +" traces");
        }
        else{
            for(Object t:traces){
                ((DefaultListModel) foundList.getModel()).removeElement(t);
                ((DefaultListModel) toAnalyzeList.getModel()).addElement(t);
            }
        }
        sortLists();
    }//GEN-LAST:event_leftToRightActionPerformed
    
    private void analyzeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analyzeActionPerformed
        
        //add traces to analyze
        tracesAnalyzed.clear();
        for(int i = 0; i < toAnalyzeList.getModel().getSize(); i++){
            Trace t = new Trace(toAnalyzeList.getElementAt(i).toString());
            tracesAnalyzed.put(t.nombre(), t);
        }
        long start = System.nanoTime();
        
        //get if zipped or not
        String ext = "";
        int pos = path.getText().toString().lastIndexOf('.');
        if(pos > 0) ext = path.getText().toString().substring(pos+1);        
        
        //read file
        try {
            BufferedReader br = null;
            if(ext.equals("txt")) br = new BufferedReader(new FileReader(new File(path.getText().toString())));
            else if(ext.equals("zip")){
                ZipFile zip = new ZipFile(path.getText().toString());
                br = new BufferedReader(new InputStreamReader(zip.getInputStream((ZipEntry) zip.entries().nextElement()), "UTF-8"));
            }
            else{
                JOptionPane.showMessageDialog(null, "Traces files must be .zip or .txt format");
                System.exit(0);
            }
            String line;
            while((line = br.readLine()) != null){
                if((pos = line.indexOf('x')) != -1){
                    String trace;
                    try{
                        trace = line.substring(pos-1,pos+9);  //11 caracteres
                    }
                    catch(Exception e){
                        trace = line.substring(pos-1,pos+8);  //10 caracteres    
                    }
                    Trace t;
                    ArrayList <Trace> traces = new ArrayList(tracesAnalyzed.values());
                    if((t = tracesAnalyzed.get(trace)) != null) t.addLRU();
                    Iterator <Trace> iterator = traces.iterator();
                    while(iterator.hasNext()) iterator.next().count++;
                }
            }
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
        }
        long end = System.nanoTime();
        printResults(end-start);
    }//GEN-LAST:event_analyzeActionPerformed

    private void chartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chartActionPerformed
        XSSFWorkbook workbook = null;
        try {
            workbook = new XSSFWorkbook(OPCPackage.open(new FileInputStream("model.xlsx")));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidFormatException ex) {
            Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ArrayList <Trace> traces = new ArrayList(tracesAnalyzed.values());
        
        //first sheet
        @SuppressWarnings("null")
        XSSFSheet sheet = workbook.getSheet("LRU Distance");
        if(sheet == null) sheet = workbook.createSheet();
        int maxRow = 0;
        XSSFRow row; 
        XSSFCell cell;
        sheet.createRow(0).createCell(0).setCellValue("Number of Reference");
        /***chart***
        XYSeries[] series = new XYSeries[traces.length];
        ***chart***/
         
        //export data
        for(int i = 0; i < traces.size(); i++){
            Trace t = traces.get(i);
            ArrayList<Integer> lru = t.lru();    
            int c = i + 1;
            sheet.getRow(0).createCell(c).setCellValue(t.nombre());
            /***chart***
            series[i] = new XYSeries(t.nombre());
            ***chart***/
            for(int j = 0; j < lru.size(); j++){    
                int r = j+1;
                if(r > maxRow) row = sheet.createRow(maxRow = r);
                else row = sheet.getRow(r);
                row.createCell(c).setCellValue(lru.get(j).intValue());
                /***chart***
                series[i].add(j/(1.0),(lru.get(j).intValue())/(1.0));
                ***chart***/
            }
        }
        for(int r = 1; r <= maxRow; r++) sheet.getRow(r).createCell(0).setCellValue(r);
        
        /****chart****
        XYSeriesCollection dataset = new XYSeriesCollection();
        for(XYSeries s:series) dataset.addSeries(s);
        JFreeChart chart = ChartFactory.createXYLineChart(
            "Trace Analyzer",           // chart title
            "i-times",                  // x axis label
            "LRU Distances",            // y axis label
            dataset,                    // data
            PlotOrientation.VERTICAL,   //
            true,                       // include legend
            true,                       // tooltips
            false                       // urls
        );
        chart.setBackgroundPaint(Color.white);
        
        int pictureID = 0, width = 640, height = 480;
        float quality = 1;
        ByteArrayOutputStream chartOut = new ByteArrayOutputStream();          
        
        try {
            ChartUtilities.writeChartAsJPEG(chartOut, quality, chart, width, height);
            pictureID = workbook.addPicture(chartOut.toByteArray(), Workbook.PICTURE_TYPE_JPEG);
            chartOut.close();
        } catch (IOException ex) {
            Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
        }
        XSSFDrawing drawing = sheet.createDrawingPatriarch();
        ClientAnchor anchor = new XSSFClientAnchor();
        anchor.setCol1(4);
        anchor.setRow1(5);
        XSSFPicture  picture = drawing.createPicture(anchor, pictureID);
        picture.resize();      
        *****chart*****/
        
        //second sheet - statics
        sheet = workbook.getSheet("LRU Distance Statics");
        if(sheet == null) sheet = workbook.createSheet();
        row = sheet.createRow(0);
        row.createCell(0).setCellValue("Statics");
        for(int i = 0; i < traces.size(); i++) (row.createCell(i+1)).setCellValue(traces.get(i).nombre());
        row = sheet.createRow(1);
        row.createCell(0).setCellValue("MIN");
        for(int i = 0; i < traces.size(); i++) (row.createCell(i+1)).setCellValue(traces.get(i).minLRU());
        row = sheet.createRow(2);
        row.createCell(0).setCellValue("MAX");
        for(int i = 0; i < traces.size(); i++) (row.createCell(i+1)).setCellValue(traces.get(i).maxLRU());
        row = sheet.createRow(3);
        row.createCell(0).setCellValue("SUM");
        for(int i = 0; i < traces.size(); i++) (row.createCell(i+1)).setCellValue(traces.get(i).sumLRU());
        row = sheet.createRow(4);
        row.createCell(0).setCellValue("AVG");
        for(int i = 0; i < traces.size(); i++) (row.createCell(i+1)).setCellValue(traces.get(i).avgLRU());
        
        //lasts sheets
        for(int i = 0; i < traces.size(); i++){
            sheet = workbook.getSheetAt(genericSheetsQty + i);
            Trace t = traces.get(i);
            ArrayList<Integer> lruSet = t.lruSet();
            sheet.createRow(0).createCell(0).setCellValue("LRU Distance - " + t.nombre());
            sheet.getRow(0).createCell(1).setCellValue("Times");
            for(int r = 1; r <= lruSet.size(); r++){
                sheet.createRow(r).createCell(0).setCellValue(lruSet.get(r-1).intValue());
                sheet.getRow(r).createCell(1).setCellValue(t.countLRU(lruSet.get(r-1).intValue()));
            }
        }
        for(int i = resultSheetsQty; i > traces.size(); i--) workbook.removeSheetAt(i + genericSheetsQty - 1);
        
        //SAVE DATA
        try{
            String file = "chart_"+(new Date()).getTime()+".xlsx";
            FileOutputStream stream = new FileOutputStream(file);
            workbook.write(stream);
            stream.close();
            JOptionPane.showMessageDialog(null, "Chart created successfully!");
            Desktop.getDesktop().open(new File(file));
        }catch(IOException e){
            e.printStackTrace();
        } catch (HeadlessException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_chartActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void pathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pathActionPerformed
    
    private void printResults(long time){
        double seconds = time/1000000000.0;
        String text = "";
        text +=   "Founded Traces\t" + (foundList.getModel().getSize() + toAnalyzeList.getModel().getSize());
        text += "\nAnalized Traces\t" + toAnalyzeList.getModel().getSize();
        text += "\nTime (Seconds)\t" + seconds;
        results.setText(text);
    }
    
    private int maxLRU(){
        int max = 0;
        ArrayList traces = new ArrayList(tracesAnalyzed.values());
        Iterator <Trace> iterator = traces.iterator();
        while(iterator.hasNext()){
            int lru = iterator.next().maxLRU();
            if(lru > max) max = lru;
        }
        return max;
    }
    
    private void sortLists(){
        foundList.setSortOrder(SortOrder.ASCENDING);
        toAnalyzeList.setSortOrder(SortOrder.ASCENDING);
    }
    
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Console.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Console.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Console.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Console.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Console().setVisible(true);
                /****chart*****
                excelChart = new ExcelChart();
                ****chart*****/
                tracesAnalyzed = new HashMap<String,Trace>();
                XSSFWorkbook workbook = null;
                try {
                    workbook = new XSSFWorkbook(OPCPackage.open(new FileInputStream("model.xlsx")));
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InvalidFormatException ex) {
                    Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
                }
                genericSheetsQty = workbook.getSheetIndex("LRUDT_1");
                resultSheetsQty = workbook.getNumberOfSheets() - genericSheetsQty;
            }
        });
    }
    
    private static int genericSheetsQty;
    private static int resultSheetsQty;
    private static HashMap<String,Trace> tracesAnalyzed;
    /****chart*****
    private static ExcelChart excelChart;
    *****chart*****/
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel analizadorTitle;
    private javax.swing.JButton analyze;
    private javax.swing.JButton chart;
    private javax.swing.JButton exit;
    private org.jdesktop.swingx.JXList foundList;
    private javax.swing.JLabel foundTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton leftToRight;
    private javax.swing.JButton lookup;
    private javax.swing.JTextField path;
    private javax.swing.JProgressBar progress;
    private javax.swing.JTextArea results;
    private javax.swing.JLabel resultsTitle;
    private javax.swing.JButton rightToLeft;
    private javax.swing.JButton search;
    private javax.swing.JSeparator separator;
    private org.jdesktop.swingx.JXList toAnalyzeList;
    private javax.swing.JLabel toAnalyzeTitle;
    private javax.swing.JLabel traceTitle;
    private javax.swing.JLabel traceTitle1;
    // End of variables declaration//GEN-END:variables
}

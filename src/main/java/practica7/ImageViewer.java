package practica7;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.ScrollPaneConstants;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

public class ImageViewer extends javax.swing.JFrame {

    class StatisticsListener implements AdjustmentListener{

        @Override
        public void adjustmentValueChanged(AdjustmentEvent e) {
            if(imagePath != null){
                Mat image = Imgcodecs.imread(imagePath);
                
                Point topLeftCorner = jScrollPane1.getViewport().getViewPosition();
                Dimension dimView = jScrollPane1.getViewport().getExtentSize();
                if(image.height() <  dimView.height ||  image.width() < dimView.width ){
                    dimView = new Dimension(image.width(), image.height());
                }
                
                EstadisticasImagen imageStats = new EstadisticasImagen();
                imageStats.calculaEstadisticas(image, topLeftCorner, dimView);
                changeRGBTextFields(imageStats);
            }
        }
        
    }
    
    public ImageViewer() {
        nu.pattern.OpenCV.loadShared();
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        
        initComponents();
        
        verticalBar = jScrollPane1.getVerticalScrollBar();
        horizontalBar = jScrollPane1.getHorizontalScrollBar();
        
        //jScrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        //jScrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        
        verticalBar.addAdjustmentListener(new StatisticsListener());
        horizontalBar.addAdjustmentListener(new StatisticsListener());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        statisticsPanel = new javax.swing.JPanel();
        minRedLabel = new javax.swing.JLabel();
        maxRedLabel = new javax.swing.JLabel();
        avgRedLabel = new javax.swing.JLabel();
        minRedTextField = new javax.swing.JTextField();
        maxRedTextField = new javax.swing.JTextField();
        avgRedTextField = new javax.swing.JTextField();
        minGreenLabel = new javax.swing.JLabel();
        maxGreenLabel = new javax.swing.JLabel();
        avgGreenLabel = new javax.swing.JLabel();
        minGreenTextField = new javax.swing.JTextField();
        maxGreenTextField = new javax.swing.JTextField();
        avgGreenTextField = new javax.swing.JTextField();
        minBlueLabel = new javax.swing.JLabel();
        maxBlueLabel = new javax.swing.JLabel();
        avgBlueLabel = new javax.swing.JLabel();
        minBlueTextField = new javax.swing.JTextField();
        maxBlueTextField = new javax.swing.JTextField();
        avgBlueTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        iPanel = new practica7.ImagePanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        openOption = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        exitOption = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        infoOption = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Estadistícas de imagen");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        minRedLabel.setText("rojo mínimo");

        maxRedLabel.setText("rojo máximo");

        avgRedLabel.setText("rojo promedio");

        minRedTextField.setEditable(false);

        maxRedTextField.setEditable(false);

        avgRedTextField.setEditable(false);

        minGreenLabel.setText("verde mínimo");

        maxGreenLabel.setText("verde máximo");

        avgGreenLabel.setText("verde promedio");

        minGreenTextField.setEditable(false);

        maxGreenTextField.setEditable(false);

        avgGreenTextField.setEditable(false);

        minBlueLabel.setText("azul mínimo");

        maxBlueLabel.setText("azul máximo");

        avgBlueLabel.setText("azul promedio");

        minBlueTextField.setEditable(false);

        maxBlueTextField.setEditable(false);

        avgBlueTextField.setEditable(false);

        javax.swing.GroupLayout statisticsPanelLayout = new javax.swing.GroupLayout(statisticsPanel);
        statisticsPanel.setLayout(statisticsPanelLayout);
        statisticsPanelLayout.setHorizontalGroup(
            statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(statisticsPanelLayout.createSequentialGroup()
                        .addComponent(avgRedLabel)
                        .addGap(18, 18, 18)
                        .addComponent(avgRedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statisticsPanelLayout.createSequentialGroup()
                        .addGroup(statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(maxRedLabel)
                            .addComponent(minRedLabel))
                        .addGap(25, 25, 25)
                        .addGroup(statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(maxRedTextField)
                            .addComponent(minRedTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(maxGreenLabel)
                    .addComponent(avgGreenLabel)
                    .addComponent(minGreenLabel))
                .addGap(18, 18, 18)
                .addGroup(statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(minGreenTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(maxGreenTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                        .addComponent(avgGreenTextField)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(statisticsPanelLayout.createSequentialGroup()
                        .addComponent(avgBlueLabel)
                        .addGap(18, 18, 18)
                        .addComponent(avgBlueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(statisticsPanelLayout.createSequentialGroup()
                        .addGroup(statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(maxBlueLabel)
                            .addComponent(minBlueLabel))
                        .addGap(26, 26, 26)
                        .addGroup(statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(minBlueTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                            .addComponent(maxBlueTextField))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        statisticsPanelLayout.setVerticalGroup(
            statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticsPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minRedLabel)
                    .addComponent(minRedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minGreenLabel)
                    .addComponent(minGreenTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minBlueLabel)
                    .addComponent(minBlueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maxRedLabel)
                    .addComponent(maxRedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maxGreenLabel)
                    .addComponent(maxGreenTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maxBlueLabel)
                    .addComponent(maxBlueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avgRedLabel)
                    .addComponent(avgRedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(avgGreenLabel)
                    .addComponent(avgGreenTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(avgBlueLabel)
                    .addComponent(avgBlueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout iPanelLayout = new javax.swing.GroupLayout(iPanel);
        iPanel.setLayout(iPanelLayout);
        iPanelLayout.setHorizontalGroup(
            iPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 587, Short.MAX_VALUE)
        );
        iPanelLayout.setVerticalGroup(
            iPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 262, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(iPanel);

        jMenu1.setText("Opciones");

        openOption.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        openOption.setText("abrir");
        openOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openOptionActionPerformed(evt);
            }
        });
        jMenu1.add(openOption);
        jMenu1.add(jSeparator1);

        exitOption.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        exitOption.setText("salir");
        exitOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitOptionActionPerformed(evt);
            }
        });
        jMenu1.add(exitOption);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");

        infoOption.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        infoOption.setText("Acerca de");
        infoOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoOptionActionPerformed(evt);
            }
        });
        jMenu2.add(infoOption);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(statisticsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(statisticsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void openOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openOptionActionPerformed
       int res = fileChooser.showOpenDialog(iPanel);
       if(res == JFileChooser.APPROVE_OPTION){
            try {
                File imageFile = fileChooser.getSelectedFile();
                imagePath = imageFile.getAbsolutePath();
                BufferedImage image = ImageIO.read(imageFile);  
                
                iPanel.setImage(image);
                iPanel.repaint(); 
                
                jScrollPane1.getViewport().setViewPosition(new Point(0, 0));
                Dimension dimView = jScrollPane1.getViewport().getExtentSize();
                Point topLeftCorner = jScrollPane1.getViewport().getViewPosition();
                if(image.getHeight() <  dimView.height ||  image.getWidth() < dimView.width ){
                    dimView = new Dimension(image.getWidth(), image.getHeight());
                    jScrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
                    jScrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
                }else{
                    jScrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
                    jScrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
                }
                
                EstadisticasImagen imageStats = new EstadisticasImagen();
                imageStats.calculaEstadisticas(Imgcodecs.imread(imagePath), topLeftCorner, dimView);
                changeRGBTextFields(imageStats);
            } catch (IOException ex) {
                Logger.getLogger(ImageViewer.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
    }//GEN-LAST:event_openOptionActionPerformed

    private void exitOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitOptionActionPerformed
        int confirm = JOptionPane.showConfirmDialog(rootPane, "¿Desea salir de la aplicación?", "Salir aplicación", JOptionPane.YES_NO_OPTION);
        if(confirm == JOptionPane.YES_OPTION){
            this.dispose();
        }
    }//GEN-LAST:event_exitOptionActionPerformed

    private void infoOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoOptionActionPerformed
        JOptionPane.showMessageDialog(rootPane, "La aplicación muestra estadísticas de color de la zona vizualizada.",
                "Acerca de", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_infoOptionActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int confirm = JOptionPane.showConfirmDialog(rootPane, "¿Desea salir de la aplicación?", "Salir aplicación", JOptionPane.YES_NO_OPTION);
        if(confirm == JOptionPane.YES_OPTION){
            this.dispose();
        }
    }//GEN-LAST:event_formWindowClosing
    
    private void changeRGBTextFields(EstadisticasImagen imageStats){
        int[] maximun = imageStats.getMaximo();
        int[] minimun = imageStats.getMinimo();
        int[] average = imageStats.getPromedio();
        
        int RED = imageStats.ROJO;
        int BLUE = imageStats.AZUL;
        int GREEN = imageStats.VERDE;
                
        maxRedTextField.setText(String.valueOf(maximun[RED]));
        minRedTextField.setText(String.valueOf(minimun[RED]));
        avgRedTextField.setText(String.valueOf(average[RED]));
        
        maxBlueTextField.setText(String.valueOf(maximun[BLUE]));
        minBlueTextField.setText(String.valueOf(minimun[BLUE]));
        avgBlueTextField.setText(String.valueOf(average[BLUE]));
        
        maxGreenTextField.setText(String.valueOf(maximun[GREEN]));
        minGreenTextField.setText(String.valueOf(minimun[GREEN]));
        avgGreenTextField.setText(String.valueOf(average[GREEN]));
    }
    
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
            java.util.logging.Logger.getLogger(ImageViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImageViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImageViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImageViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImageViewer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avgBlueLabel;
    private javax.swing.JTextField avgBlueTextField;
    private javax.swing.JLabel avgGreenLabel;
    private javax.swing.JTextField avgGreenTextField;
    private javax.swing.JLabel avgRedLabel;
    private javax.swing.JTextField avgRedTextField;
    private javax.swing.JMenuItem exitOption;
    private practica7.ImagePanel iPanel;
    private javax.swing.JMenuItem infoOption;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel maxBlueLabel;
    private javax.swing.JTextField maxBlueTextField;
    private javax.swing.JLabel maxGreenLabel;
    private javax.swing.JTextField maxGreenTextField;
    private javax.swing.JLabel maxRedLabel;
    private javax.swing.JTextField maxRedTextField;
    private javax.swing.JLabel minBlueLabel;
    private javax.swing.JTextField minBlueTextField;
    private javax.swing.JLabel minGreenLabel;
    private javax.swing.JTextField minGreenTextField;
    private javax.swing.JLabel minRedLabel;
    private javax.swing.JTextField minRedTextField;
    private javax.swing.JMenuItem openOption;
    private javax.swing.JPanel statisticsPanel;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JScrollBar verticalBar;
    private javax.swing.JScrollBar horizontalBar;
    private final JFileChooser fileChooser = new JFileChooser();
    private String imagePath = null;
}

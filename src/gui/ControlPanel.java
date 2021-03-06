/**
 * The control panel of the program.
 */

package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import control.Controller;
import data.FileReader;
import data.InstructionList;

public class ControlPanel extends JPanel {
   /**
    * Previous and next button.
    */
   private JButton prev, next;
   /**
    * Switch view between diagram and schematic.
    */
   private JButton switchView;
   /**
    * Load file button.
    */
   private JButton loadFile;

   /**
    * Initialize members and link with main panel.
    * 
    * @param mainPanel
    *           The main panel to link to.
    */
   public ControlPanel(MainPanel mainPanel) {
      setLayout(new FlowLayout(FlowLayout.RIGHT));
      prev = new JButton("prev");
      next = new JButton("next");
      switchView = new JButton("view");
      loadFile = new JButton("load");
      add(prev);
      add(next);
      add(switchView);
      add(loadFile);

      prev.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            InstructionList.shiftProgramCounter(-1);
            Controller.update(mainPanel.getPipelinePanel());
            mainPanel.getInstructionPanel().fetchInstructions();
            mainPanel.repaint();
         }
      });

      next.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            InstructionList.shiftProgramCounter(1);
            Controller.update(mainPanel.getPipelinePanel());
            mainPanel.getInstructionPanel().fetchInstructions();
            mainPanel.repaint();
         }
      });

      loadFile.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            FileReader.openFileChooser();
            mainPanel.getInstructionPanel().fetchInstructions();
            mainPanel.repaint();
         }
      });
   }
}

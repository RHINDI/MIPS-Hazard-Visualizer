package gui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class MainPanel extends JPanel {
   private InstructionPanel instructionPanel;
   private PipelineDiagram pipelinePanel;

   public MainPanel() {
      setLayout(new BorderLayout());
      setBackground(Color.cyan);
      instructionPanel = new InstructionPanel();
      pipelinePanel = new PipelineDiagram();
      add(instructionPanel, BorderLayout.WEST);
      add(pipelinePanel, BorderLayout.CENTER);
   }

   /**
    * @return the instructionPanel
    */
   public InstructionPanel getInstructionPanel() {
      return instructionPanel;
   }

   /**
    * @param instructionPanel
    *           the instructionPanel to set
    */
   public void setInstructionPanel(InstructionPanel instructionPanel) {
      this.instructionPanel = instructionPanel;
   }

   /**
    * @return the pipelinePanel
    */
   public PipelineDiagram getPipelinePanel() {
      return pipelinePanel;
   }

   /**
    * @param pipelinePanel
    *           the pipelinePanel to set
    */
   public void setPipelinePanel(PipelineDiagram pipelinePanel) {
      this.pipelinePanel = pipelinePanel;
   }
}

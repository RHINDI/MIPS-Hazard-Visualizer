package data;
import java.util.ArrayList;

public class InstructionList
{

   private ArrayList<Instruction> codeList;
   private int programCounter;

   public InstructionList() {
      codeList = new ArrayList<Instruction>();
      programCounter = 0;
   }

   public void addInstruction(Instruction instruction) {
      codeList.add(instruction);
   }

   public String getInstructionAtIndex(int index) {
      return codeList.get(index).getInstructionString();
   }

   public int getInstructionListLength() {
      return codeList.size();
   }


   public int getProgramCounter() {
      return programCounter;
   }

   //prints each line of code
   public void printArrayList() {
      System.out.println("*******Start of file: ********\n");
      for(Instruction x: codeList) {
         if(x.getLabel() != null)
            System.out.println(x.getLabel() + ":");
         if(x.getCmd() != null)
            System.out.print(" " + x.getCmd());
         if(x.getArg1() != null)
            System.out.print(" " + x.getArg1());
         if(x.getArg2() != null)
            System.out.print(" " + x.getArg2());
         if(x.getArg3() != null)
            System.out.print(" " + x.getArg3());
         if(x.getComment() != null)
            System.out.print(" #" + x.getComment());
         
         System.out.println("\n");
      }
      System.out.println("*******End of file: ********");

   }
}

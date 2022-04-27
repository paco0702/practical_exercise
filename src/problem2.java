//import java.io.IOException;
//
//public class problem2 {
//	public static void main(String [] args) throws Exception{
//		
////		ProcessBuilder PBuild = new ProcessBuilder("notepad", "cs_baby.txt");
////		PBuild.inheritIO();
////		Process p1 = PBuild.start();
////		
////		p1.waitFor();
//		ProcessBuilder [] PB = new ProcessBuilder [100];
//		Process [] p = new Process [100];
//		
//		for(int i=0; i<PB.length; i++) {
//			PB [i] = new ProcessBuilder();
//			PB[i].inheritIO();
//			p[i] = PB[i].start();
//		}
//		
//		for(int x=0 ; x<100; x++) {
//			p[x].waitFor();
//		}
//		
//	}
//}
  class problem2 {
	  public static void main(String [] args) throws Exception{
		  System.out.println("Helloe Baby");
     	  ProcessBuilder f1 = new ProcessBuilder("note", "cs_baby.txt");
     	  
     	  
     	  f1.inheritIO();
     	  Process p = f1.start();
     	  p.waitFor();
	  }
  }

import java.util.Date;

//import java.util.Date;
//import java.util.Random;
//
//class F1 extends Thread {
////	public static int N1 ;
////	public static int N2 ;
////	
////		public void run() {
////		double sum = 0.0;
////		
////		for (int i=N1; i<=N2; i++) {
////			sum += 1.0/ Math.sqrt(1.0/i);
////		}
////		System.out.printf("F1 = %f\n", sum);
////		}
//	
//	public void run() {
//		 GenRandom();
//		 }
//		 static void GenRandom() {
//		 int i, n;
//		 double mean=0;
//		 Random ran = new Random();
//		 for (i=1; i<=1000; i++)
//		 {
//		 n = ran.nextInt(6) + 1;
//		 mean = mean + n;
//		 }
//		 System.out.printf("Mean random value = %f\n", mean/1000); 
//		 
//		 }
//		 
//	}
//	
////	class F2 extends Thread {
////		public void run() {
////			double sum = 0.0;
////			
////			for (int i=0; i<=problem.N; i++) {
////				sum+= 1.0 / Math.pow(i, 1.0/3);
////			}
////			System.out.printf("F2 = %f\n", sum);
////			}
////		
////	}
//
//public class problem {
//	
//	
//	
//	public static void main(String []args) throws InterruptedException {
//		
//		long begTime = new Date().getTime ();
//		
//		
//		F1 [] f = new F1[100];
//		
//		for(int i=0; i<100; i++) {
//			f[i] =new F1();
//			f[i].start();
//		}
//		
//
//		for(int i=0; i<100; i++) {
//			f[i].join();
//		}
//		
////		F1 f1 = new F1();
////		F1 f2 = new F1();
////		F1 f3 = new F1();
////		F1 f4 = new F1();
////		
////		f1.start();
////		f1.N1 = 1;
////		f1.N2 = 125000000;
////		f2.start();
////		f2.N1 = 125000001;
////		f2.N2 = 250000000;
////		f3.start();
////		f3.N1 = 250000001;
////		f3.N2 = 375000000;
////		f4.start();
////		f4.N1 = 375000001;
////		f4.N2 = 500000000;
////		
////		f1.join();
////		f2.join();
////		f3.join();
////		f4.join();
////		
//		
//		
//		double timeElapsed = (new Date().getTime()-begTime)*0.001;
//		System.out.printf("Time elaspsed = %f secs\n", timeElapsed);
//	}
//}

class Mythread extends Thread {
	public  int  N1;
	public  int  N2;
	
	public void run() {
	double sum=0.0; 
	
	for(int i=N1 ; i<=N2; i++) {
		sum += 1/Math.sqrt(i);
	}
	
	System.out.printf("F1 = %f\n", sum);
	}
}

public class problem {
	
	
	public static void main(String [] args) throws InterruptedException{
		
		long begTime = new Date().getTime();
		
		Mythread f1 = new Mythread ();
		Mythread f2 = new Mythread ();
		
		Mythread f3 = new Mythread ();
		Mythread f4 = new Mythread ();
		f1.N1 = 1;
		f2.N1 = 125000001;
		f3.N1 = 250000001;
		f4.N1 = 375000001;
		f1.N2 = 125000000;
		f2.N2 = 250000000;
		f3.N2 = 375000000;
		f4.N2 = 500000000;
		f1.start();
		f2.start();
		f3.start();
		f4.start();
		f1.join();
		f2.join();
		
		f3.join();
		f4.join();
		
		
		
		double timeElapsed = (new Date().getTime() - begTime)*0.001;
		System.out.printf("Time elapsed = %f secs\n", timeElapsed);
 	}
}


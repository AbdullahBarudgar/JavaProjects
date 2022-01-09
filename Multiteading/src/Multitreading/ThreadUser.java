package Multitreading;

public class ThreadUser extends Thread {

	public static void main(String[] args) {

    FibanocciThread t1=new FibanocciThread();	
	ReverseThread t2=new ReverseThread();
	
	
	t1.start();
    try {
		t1.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	t2.start();

	}

}

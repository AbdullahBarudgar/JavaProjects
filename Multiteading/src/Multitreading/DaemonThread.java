package Multitreading;

public class DaemonThread extends Thread{
	
public void run() {

System.out.println(Thread.currentThread().isDaemon());

}
public static void main(String[] args) {

DaemonThread t1= new DaemonThread();	
DaemonThread t2= new DaemonThread();
DaemonThread t3= new DaemonThread();

t1.setDaemon(true);

t1.start();
t2.start();
t3.start();
	}

}

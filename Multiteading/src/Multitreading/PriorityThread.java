package Multitreading;

public class PriorityThread extends Thread{
	
	
public void run() {

String tname=Thread.currentThread().getName();
int pri=Thread.currentThread().getPriority();

System.out.println(tname+"priority is "+pri);

}

public static void main(String[] args) {

PriorityThread t1=new  PriorityThread ();
PriorityThread t2=new  PriorityThread()	;
PriorityThread t3=new  PriorityThread ();

t1.setPriority(MAX_PRIORITY);
t2.setPriority(MIN_PRIORITY);
t3.setPriority(NORM_PRIORITY);

t1.start();
t2.start();
t3.start();
	}

}

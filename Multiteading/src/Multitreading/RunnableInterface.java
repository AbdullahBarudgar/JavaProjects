package Multitreading;

public class RunnableInterface implements Runnable{
	
private int num ;

public RunnableInterface(int num) {
this.num=num;
}

public void run() {

try{	
for(int i=0; i<=5; i++) {
System.out.println("\nThe numner is :" +num);
Thread.sleep(1000);
}
}
catch(Exception e) {
System.out.println("Error"+e);	
}
}
public static void main(String[] args) {	
	
RunnableInterface O1= new RunnableInterface(67);	
RunnableInterface O2= new RunnableInterface(90);	

Thread t1=new Thread(O1);
Thread t2=new Thread(O2); 

t1.start();
t2.start();
}
}



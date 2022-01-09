package Multitreading;

public class Synchornization extends Thread {

public static void main(String[] args) {

Synchronization1 t1=new Synchronization1();
synchronization3 t2=new synchronization3();

t1.start();
t2.start();

}
}
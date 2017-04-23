package thread4;
public class Thread4 extends Thread {
    public void run(){
        for(int i=0;i<11;i++){
            printMsg();
        }
    }
    public void printMsg(){
        Thread t= Thread.currentThread();
        String name=t.getName();
        System.out.println("Name of thread: " +name );
    }
    public static void main(String[] args) {
       Thread4 th= new Thread4();
       th.setName("My thread: ");
       System.out.println("Right before start, is it alive?" + th.isAlive());
       th.start();
         System.out.println("Right before start, is it alive?" + th.isAlive());
         
         for(int i=0;i<11;i++)
             th.printMsg();
         System.out.println("the end");        
    }
}

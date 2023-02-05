
class Display5
{
           public  void wish(String name)
           {
        	   synchronized(this)
        	   {
                 for (int i=1;i<=10 ;i++ )
                   {
                     System.out.print("Good Morning: ");
                        try{
                           Thread.sleep(2000);
                           }
                          catch (InterruptedException e)
                           {
                           }

                         System.out.println(name);
                   }
        	   }
          }
}
class MyThread11 extends Thread
{
   Display5 d;
   String name;
   
   MyThread11(Display5 d,String name)
   {
    this.d=d;
    this.name=name;
   }
   
    @Override
    public void run()
    {
    d.wish(name);
    }
}

public class SynchronizedBlock
{
public static void main(String... args)
 {
     Display5 d=new Display5();
     MyThread11 t1= new MyThread11(d,"dhoni");
     MyThread11 t2= new MyThread11(d,"yuvi");
     t1.start();
     t2.start();
     
     
//     Display d1=new Display();
//     Display d2=new Display();
//     MyThread7 t1=new MyThread7(d1,"yuvraj");
//     MyThread7 t2=new MyThread7(d2,"dhoni");
//     t1.start();
//     t2.start();
}
}
class Display
  {
             public synchronized void wish(String name)
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
class MyThread7 extends Thread
 {
     Display d;
     String name;
     
     MyThread7(Display d,String name)
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

public class Synchronization
{
public static void main(String... args)
   {
       Display d=new Display();
       MyThread7 t1= new MyThread7(d,"dhoni");
       MyThread7 t2= new MyThread7(d,"yuvi");
       t1.start();
       t2.start();
       
       
//       Display d1=new Display();
//       Display d2=new Display();
//       MyThread7 t1=new MyThread7(d1,"yuvraj");
//       MyThread7 t2=new MyThread7(d2,"dhoni");
//       t1.start();
//       t2.start();
  }
}
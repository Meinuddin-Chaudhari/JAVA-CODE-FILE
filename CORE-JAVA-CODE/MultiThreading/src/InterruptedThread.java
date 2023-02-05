

   class MyThread6 extends Thread
   {
@Override
      public void run()
     {
          try{
                for (int i=1;i<=10;i++ )
                {
                System.out.println("I am lazy thread");
                Thread.sleep(2000);
                }
             }
         catch (InterruptedException e)
         {
         System.out.println("I got interrupted");
         }
     }
}
public class InterruptedThread 
{
public static void main(String... args)throws InterruptedException
    {
      MyThread6 t=new MyThread6();
        t.start();
        t.interrupt();//line-n1
        System.out.println("End of Main...");
    }
}
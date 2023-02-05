
//main thread is waiting till child thread is complete it execution
//class MyThread3 extends Thread
//{
//@Override
//     public void run()
//    {
//       for (int i=1;i<=10 ;i++ )
//       {
//          System.out.println("Sita Thread");
//            try{
//               Thread.sleep(2000);
//               }
//              catch (InterruptedException e)
//               {
//               }
//       }
//    }
//}
//public class JoinMethod
//{
//public static void main(String... args)throws InterruptedException
//    {
//          MyThread3 t=new MyThread3();
//          t.start();
//         // t.join(); 
//              for (int i=1;i<=10;i++ )
//              {
//               System.out.println("rama thread");
//              }
//       }
//}
//




//child thread is waiting till main thread is complete it execution
   class MyThread5 extends Thread{
          static Thread mt;
           @Override
                  public void run() 
                  {
                             try{
                               mt.join();
                                }
                                catch (InterruptedException e)
                                {
                                }
                        for (int i=1;i<=10 ;i++ )
                          {
                          System.out.println("child thread");
                          }
                  }
}
public class JoinMethod 
{
public static void main(String... args)throws InterruptedException
   {
          MyThread5.mt=Thread.currentThread();
          MyThread5 t=new MyThread5();
           t.start();
          for (int i=1;i<=10;i++ )
          {
          System.out.println("main thread");
           Thread.sleep(2000);//20sec sleep
          }
     }
}


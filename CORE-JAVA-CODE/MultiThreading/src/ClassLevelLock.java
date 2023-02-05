class Display3
{
     public static  synchronized void displayNumbers()
     {
        for (int i=1;i<=10 ;i++ )
          {
            System.out.print(i);
              try{
                 Thread.sleep(2000);
                 }
                catch (InterruptedException e)
                {
                }
           }
      }
        
       public static  synchronized void displayCharacters()
      {
           for (int i=65;i<=75 ;i++ )
            {

              System.out.print((char)i);
                 try{
                    Thread.sleep(2000);
                    } 
                   catch (InterruptedException e)
                    {
                    }
           }
      }
}
 
class MyThread8 extends Thread
{
   Display3 d;
   MyThread8(Display3 d)
   {
   this.d=d;
   }
   @Override
  public void run()
   {
   d.displayNumbers();
   }
}

  class MyThread9 extends Thread
{
    Display3 d;
    MyThread9(Display3 d){
    this.d=d;
   }
   @Override
    public void run()
   {
   d.displayCharacters();
   }
}
  public class ClassLevelLock
   {
     public static void main(String... args){
     Display3 d1=new Display3();
     Display3 d2=new Display3();
     MyThread8 t1= new MyThread8(d1);
     MyThread9 t2= new MyThread9(d2);
     t1.start();
     t2.start();
}
}
public class MyThread extends Thread{
    @Override
    public void run(){
        for (int i =10 ; i>0 ;i--){
            try {
                System.out.println("Thread #1 : " + i);
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Thread #1 is finished...");
    }
}

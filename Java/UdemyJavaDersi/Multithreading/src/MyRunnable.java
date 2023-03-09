public class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i =0 ; i<10 ;i++){
            try {
                System.out.println("Thread #2 : " + i);
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Thread #2 is finished...");
    }
}

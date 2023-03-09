import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {
	// Timer ---> Belirli görevlerin istenilen zamanda çalışmasını sağlayan ya da görevi tekrarlı bir şekilde çalışması için planlanan sınıf.Kod bloğunun ne zaman ve ne sıklıkla çalışacağını belirler.
    // TimerTask---> Timer tarafından tek seferlik ya da belirli sürelerde tanımlanmış görevler
     Timer timer = new Timer();
     TimerTask task = new TimerTask() {
         int counter=10;
         @Override
            public void run() {
             if(counter> 0){
                 System.out.println(counter+" seconds");
                 counter--;
             }
             else {
                 System.out.println("HAPPY NEW YEAR..");
             }
             }
        };
        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR,2020);
        date.set(Calendar.MONTH,Calendar.JUNE);
        date.set(Calendar.DAY_OF_MONTH,20);
        date.set(Calendar.MINUTE, 0);
        date.set(Calendar.SECOND,0);
        date.set(Calendar.MILLISECOND,0);

        //timer.schedule(task,date.getTime());
        //timer.schedule(task,time);
        timer.scheduleAtFixedRate(task,0,1000);
    }
}

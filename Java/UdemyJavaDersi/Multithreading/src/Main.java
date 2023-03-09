public class Main {

    public static void main(String[] args) {
	// Anlık bir şekilde çoklu threadler çalışırsa buna multithreading denir.Bağımsızdırlar dolayısıyla diğer threadlerin çalışmasına etki etmezler.
    // Maksimum CPU kullanımına yardımcı olurlar.
    //Diğer threadlere karışmazlar
    //Çoklu müşteri hizmetlerinde multiplayer oyunlarda kullanımı en güzel örneklerindendir.
         MyThread thread1 = new MyThread();

         MyRunnable runnable1 = new MyRunnable();
         Thread thread2 = new Thread(runnable1);
         thread1.start();
         thread2.start();
    }
}

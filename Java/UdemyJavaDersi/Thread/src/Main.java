public class Main {

    public static void main(String[] args) {
	    // Her bir işlemin altında çalışan alt işlemlere (virtual CPU gibi) thread adı verilir.
        //JVM birden fazla threadin eşzamanlı olarak çalışmasına izin verir.
        //Her thread kodtaki çeşitli parçaları ana threade göre çalıştırabilir.
        //Her threadin ibr önceliği vardır.
        //Aynı anda birden fazla işlem yapmayı sağlayan yapıya thread denir.
        //Bu yapı sayesinde işlemler birbirlerini beklemeden kendi işlemini yapar.
        //Kullanıcı bir form üzerinden web isteği başlattığında web isteği cevap verene kadar kullanıcı form üzerinde işlem yapamayacaktır.
        //Benzer şekilde ağ programlama işlemleri sırasında karşı taraftan bir cevap beklenmeye alındığında program üzerinde işlem yapılmayacaktır.
        //Bu ve bunun gibi durumlarda thread yapısının kullanımı iyi bir kullanıcı deneyimi için faydalı olacaktır.
        //Runnable ile çalışır.İçinde Runnable bir nesne almalıdır.
        //Daemon iş parçacığı, çöp toplama gibi görevleri gerçekleştirmek için arka planda çalışan düşük öncelikli bir iş parçacığıdır.
        //JVM, tüm kullanıcı iş parçacıkları (daemon olmayan iş parçacıkları) yürütmelerini tamamladığında kendini sonlandırıyor
        //System.out.println(Thread.activeCount());
        //System.out.println(Thread.currentThread().getName());
        //Thread.currentThread().setName("YARRA");
        //System.out.println(Thread.currentThread().getName());
        //Thread.currentThread().setPriority(10);
        //System.out.println(Thread.currentThread().getPriority());
        /*System.out.println(Thread.currentThread().isDaemon());
        for (int i =3; i>0 ; i--){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        */
         MyThread thread = new MyThread();
         thread.start();
        //System.out.println(thread.isAlive());
        System.out.println(thread.getName());
        thread.setName("Abuzer");
        System.out.println(thread.getName());
    }
}

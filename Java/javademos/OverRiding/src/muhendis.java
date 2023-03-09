public class muhendis extends insan{
    int maas;
    int zam(){
        maas++;
        return maas;
    }
    void yemek(){ //Sana burada diyor ki insan içinde yemek adlı bir fonksiyonum var.Bu normal şartlarda mühendis e de geçecek ama mühendiste farklı bir durumumuz var dolayısıyla aynı fonksiyon tipini ve adını kullanarak farklı işlem yaptık eğer void yerine int yazsaydık tamamen farklı bir fonksiyon olurdu ve insandaki işlem de geçeceği için sistem hata verir ve işlemimiz mantıksız olurdu.
        kilo=kilo+2;
    }
}

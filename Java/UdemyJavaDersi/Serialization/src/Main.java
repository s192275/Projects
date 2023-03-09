import java.io.*;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) throws IOException {
	/*Java tamamen nesne odaklı bir dil olduğu için kullanılan nesneler JVM de çalışırlar.
	Serialization JVM dışında da çalışmayı sağlar.Bu sayede nesnenin kopyası Java platformu dışında da depolanabilir.
	Objeyi byte stream e dönüştürme işlemi de denebilir.Programdan çıkılsa dahi kayıt edilir.Bu byte streamler dosya olarak kaydedilebilir ya da ağ üzerinden paylaşılabilir.
	Farklı makinelere gönderilebilir. Byte stream (.ser) uzantılı dosya ile kaydedilir ve platform bağımsızdır.(Oluşturulan nesnenin bilgilerinin kaydedildiğini düşün)
	 Deserialization = Byte streami objeye dönüştürme işlemidir.(Yüklenilen dosyayı açmak gibi düşün.)
	 Serialize yapma adımları
	 1.Oluşturulan nesne Serializable interface ini implement etmeli
	 2.java.io.Serializable yı import et
	 3.FileOutputStream fileOut = new FileOutputStream(dosya yolu)
	 4.ObjectOutputStream out = new ObjectOutputStream(fileOut
     5.out.writeObject(objectName)
     6.out.close()
     7.fileOut.close()
	 */
     User user = new User();
     user.name = "Bro";
     user.pass = "I <3 Pizza";
        FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close();
        System.out.println("Object info saved...");
    }
}

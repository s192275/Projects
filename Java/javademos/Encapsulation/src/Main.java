public class Main {

    public static void main(String[] args) {
	Book b1=new Book("Harry Potter",400,"J.K.Rowling","Kodlama");
    System.out.println(b1.getnumberOfPage());
    System.out.println(b1.setPageSize(400));
    Book b2=new Book("Lord of The Rings",500,"Peter Jackson","Kodlama");
    System.out.println(b2.getBookName());
    //Tek tek ad vermemek için ya da verilen adları bir arada görüp sistem içinde değiştirmek için encapsulation yaptık

    }
}

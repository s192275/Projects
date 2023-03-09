public class Book {
    private String bookName,author,publisher;
    private int numberOfPage;

    Book(String bookName,int numberOfPage,String author,String publisher){
        this.bookName=bookName;
        this.author=author;
        this.publisher=publisher;
        if(numberOfPage<1){
            this.numberOfPage=10;
        }
        else{
            this.numberOfPage=numberOfPage;
        }
    }
    public int getnumberOfPage(){
        return this.numberOfPage;
    }
    public int setPageSize(int size){
        if(size<0){
            System.out.println("Sayfa sayısı negatif olamaz.");
        }
        else{
            this.numberOfPage=size;
        }
        return this.numberOfPage;
    }
    public String getBookName(){
        return this.bookName;
    }
    public void setBookName(String bookName){
        this.bookName=bookName;
    }
    public String getAuthor(){
        return this.author;
    }
    public void setAuthor(String bookName){
        this.bookName=author;
    }
    public String getPublisher(String publisher){
        return this.publisher;
    }
    public void setPublisher(String publisher){
        this.bookName=publisher;
    }
}

public abstract class GameCalculator {
    public abstract void Calculate();
    public void gameOver(){
        System.out.println("Game Over!");
    }
}
//Bu yaptığımızın anlamı kim gameOver fonksiyonunu kullanıyorsa değiştirmeden kullanmak zorunda ama kim Calculate fonksiyonunu kullanıyorsa değiştirip override etmek zorundadır.
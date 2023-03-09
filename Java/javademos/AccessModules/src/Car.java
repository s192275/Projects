public class Car {
    protected int enginePower=190,model=2020;
    protected int speed=340;
    protected String color="Yellow";
    Car(){
        this.enginePower=200;
        this.model=2021;
        this.speed=400;
        this.color="Brown";
    }
    public void deneme(){
        deneme2();
    }
    private void deneme2(){
        System.out.println("Merhaba");
    }
}

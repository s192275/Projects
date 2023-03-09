enum Level{
    CAN_I_PLAY_DADDY(0), //İçerine argüman olarak bir şeyler geçebiliyoruz dolayısıyla biz bunu yapınca constructor ında bir şeyler geçmemizi bekliyor.
    DONT_HURT_ME(1),
    BRING_EM_ON(2),
    I_AM_DEATH_INCARNATE(3);
    int num;
    Level(int num){
        this.num = num;
    }
}
public class Main {
    public static void main(String[] args) {
        Level level = Level.CAN_I_PLAY_DADDY;
        level_name(level);
        Level level1 = Level.DONT_HURT_ME;
        level_name(level1);
        Level level2 = Level.BRING_EM_ON;
        level_name(level2);
        Level level3 = Level.I_AM_DEATH_INCARNATE;
        level_name(level3);
    }

    public static void level_name(Level level) {
        System.out.println("You've chosen the "+level+" level");
        System.out.println("Level Difficulty: "+level.num);
    }
}
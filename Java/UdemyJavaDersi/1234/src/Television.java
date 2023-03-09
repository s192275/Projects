import java.util.ArrayList;

public class Television{

    String tvName,tvInch;
    int sound=15;
    int favoriteChannel=1;
    ArrayList<Channel> abc=new ArrayList<>();
    Television(String tvName,String tvInch){
        this.tvName=tvName;
        this.tvInch=tvInch;
    }

    public String getTvName() {
        return tvName;
    }

    public void setTvName(String tvName) {
        this.tvName = tvName;
    }

    public String getTvInch() {
        return tvInch;
    }

    public void setTvInch(String tvInch) {
        this.tvInch = tvInch;
    }

    public int getSound() {
        return sound;
    }

    public int setSound(int sound) {
        this.sound = sound;
        return sound;
    }

    public String showTv(String tvName, String tvInch) {
        return "TV has been named and inch value has been entered   "      +    "TV: "+tvName+" Inch: "+tvInch;
    }
    public int changeFavoriteChannel(int channel){
        int tv=channel;
        channel=favoriteChannel;
        favoriteChannel=tv;
        return tv;
    }

}

public class Channel {
    int channelNo;
    String channelName;
    Channel(int channelNo,String channelName){
        this.channelNo=channelNo;
        this.channelName=channelName;
    }


    @Override
    public String toString() {
        return "Channel{" +
                "channelNo=" + channelNo +
                ", channelName='" + channelName + '\'' +
                '}';
    }
}

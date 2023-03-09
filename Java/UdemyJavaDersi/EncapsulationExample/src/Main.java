public class Main {

    public static void main(String[] args) {
	TC t1=new TC("12345678910");
    }
}

class TC{
    String Tc;
    TC(String Tc){
        this.Tc=Tc;
        setTc(Tc);
    }
    String setTc(String Tc){
        for(int i=0;i<8;i++){
            Tc.charAt(i)='*';
        }
        return Tc;
    }
}
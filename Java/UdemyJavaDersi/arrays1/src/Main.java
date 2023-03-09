import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        int [][]matris=new int[2][3];
        for(int i=0;i< matris.length;i++){
            for(int j=0;j<matris[i].length;j++){
                matris[i][j]=(int)(Math.random()*10+1);
                out.print(matris[i][j]+" ");
            }
            out.println();
        }
        out.println("******************");
        String []names={"Emre","Hasan","Ali"};
        int [][]debts={{0,100,200},{350,0,250},{150,500,0}};
        for(int i=0;i< debts.length;i++){
            for(int j=0;i<debts[i].length;j++){
                if(i==j){
                    System.out.print(" ");
                }
                if(i!=j) {
                    System.out.print(debts[i][j] + " ");
                }
                }
            System.out.println();
        }
    }
}

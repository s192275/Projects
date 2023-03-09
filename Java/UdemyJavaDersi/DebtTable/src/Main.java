public class Main {

    public static void main(String[] args) {
	int debts[][]={{0,100,200},{350,0,250},{150,500,0}};
    for(int i=0;i< debts.length;i++){
        for(int j=0;j<debts[i].length;j++){
            if(i!=j){
                System.out.print(debts[i][j]+" ");
            }
        }
        System.out.println();
    }
    System.out.println("\n*****************\n");
    String isimler[]={"Emre","Hasan","Ali"};
    for(int i=0;i< debts.length;i++){
        for(int j=0;j<debts[i].length;j++){
            int alacak=debts[i][j]-debts[j][i];
            if(alacak<0){
                System.out.println(isimler[i]+" nin"+isimler[j]+" den alacağı "+(-alacak));
            }
        }
    }
    }
}

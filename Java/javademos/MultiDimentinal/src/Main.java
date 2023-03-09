public class Main {

    public static void main(String[] args) {
	String[][] sehirler=new String [3][3];
    sehirler[0][0]="Ankara";
    sehirler[0][1]="İzmir";
    sehirler[0][2]="Trabzon";
    sehirler[1][0]="Adana";
    sehirler[1][1]="Antalya";
    sehirler[1][2]="Muğla";
    sehirler[2][0]="Edirne";
    sehirler[2][1]="Manisa";
    sehirler[2][2]="Ardahan";
        for(int i=0;i<3;i++){
            System.out.println("---------------------");
            for (int j = 0; j < 3; j++) {
                System.out.println(sehirler[i][j]);
            }
        }
    }

}

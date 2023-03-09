public class Main {

    public static void main(String[] args) {
        Computer c1 = new Computer(28, 16, new String[]{"HP", "Fujitsu", "Casper", "MSI", "Monster", "Dell"});
      showComputer(c1);
      String[] producters=c1.getProductorFirms();
      producters[0]="Apple";
      showComputer(c1);
    }
    public static void showComputer(Computer c1){
        System.out.println("Core number of PC: "+c1.getCoreNumber()+" RAM size: "+ c1.getRamSize()+" Productor Firm: "+ c1.getProductorFirms()[0]);
    }
}
class Computer{
        private int coreNumber;
        private int ramSize;
        private String productorFirms[];
     Computer(int coreNumber,int ramSize,String productorFirms[]){
         this.coreNumber=coreNumber;
         this.ramSize=ramSize;
         this.productorFirms=productorFirms;
     }
    public int getCoreNumber() {
        return coreNumber;
    }

    public int getRamSize() {
        return ramSize;
    }

    public String[] getProductorFirms() {
         String []copyFirmNames=new String[productorFirms.length];
         for(int i=0;i< productorFirms.length;i++){
        copyFirmNames[i]=productorFirms[i];
         }
        return copyFirmNames;
    }
}


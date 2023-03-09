public class Television {
    private boolean acik;
    private int kanal;
    private int ses;
    Television(boolean acik,int kanal,int ses){
        setAcik(acik);
        setKanal(kanal);
        setSes(ses);

    }

    public void setKanal(int kanal){
        if(kanal>0 && acik==true) {
            this.kanal = kanal;
            System.out.println("Kanal: "+kanal);
        }
    }
    public int getKanal(){
        return kanal;
    }
    public void setAcik(boolean acik){
        this.acik=acik;
        if(acik==true){
            System.out.println("Televizyon açık");
        }
        else{
            System.out.println("Televizyon kapalı.");
        }
    }
    public boolean getAcik() {
        return acik;
    }
    public void setSes(int ses){
        if(ses>0 && acik==true) {
            this.ses = ses;
            System.out.println("Ses: "+ses);
        }
    }
    public int getSes(){
        return ses;
    }

}

package jb3;

public class Motor {
    private int kecepatan=0;
    private boolean kontakOn=false;
    
    public void nyalakanMesin(){
        kontakOn=true;
    }
    public void matikanMesin(){
        kontakOn=false;
        kecepatan=0;
    }
    public void tambahKecepatan(){
        if(kontakOn==true){
            if(kecepatan<100){
                kecepatan+=5;
            }
            else{
                System.out.println("Tidak bisa menambah kecepatan");
                System.out.println("sudah mencapai kecepatan maksimal \n");
            }
        }
        else{
            System.out.println("Kecepatan tidak bisa ditambah karena mesin off \n");
        }
    }
    public void kurangiKecepatan(){
        if(kontakOn==true){
            kecepatan-=5;
        }
        else{
            System.out.println("Kecepatan tidak bisa dikurangi karena mesin off \n");
        }
    }
    public void printStatus(){
        if(kontakOn==true){
            System.out.println("Kontak On");
        }
        else{
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan "+kecepatan+" \n");
    }

}

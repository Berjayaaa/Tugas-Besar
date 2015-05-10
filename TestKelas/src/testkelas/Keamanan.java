
package testkelas;


public class Keamanan extends ControlKelas{
    @Override
    void input25(){
        System.out.print("Masukkan kekokohan (1. kokoh\n2. tidak kokoh): ");
        super.setKekokohan(in.nextInt());
    }
    
    @Override
    String analisisKekokohan(){
        if(super.getKekokohan()==2){
            totSesuai++;
            return ("Kekokohan: SESUIA");
        }
        else{
            return ("Kekokohan: TIDAK SESUIA");
        }
    }
    
    @Override
    void input26(){
        System.out.print("Masukkan kunci pintu(1. ada\n2. tidak ada): ");
        super.setKunciPintu(in.nextInt());        
    }
    
    @Override
    String analisisKunciPintu(){
        if(super.getKunciPintu()==1){
            totSesuai++;
            return ("Kunci pintu: SESUIA");
        }
        else{
            return ("Kunci pintu: TIDAK SESUIA");
        }
    }
    
    void input27(){
        System.out.print("Masukkan kunci jendela (1. ada\n2. tidak ada): ");
        super.setKunciJendela(in.nextInt());
    }
    
    @Override
    String analisisKunciJendela(){
        if(super.getKunciJendela()==1){
            totSesuai++;
            return ("Kunci jendela: SESUIA");
        }
        else{
            return ("Kunci jendela: TIDAK SESUIA");
        }
    }
    
    @Override
    void input28(){
        System.out.print("Masukkan bahaya (1. aman\n2. tidak aman): ");
        super.setBahaya(in.nextInt());
    }
    
    @Override
    String analisisKeamanan(){
        if(super.getBahaya()==1){
            totSesuai++;
            return ("Keamanan: SESUAI");
        }
        else{
            return ("Keamanan: TIDAK SESUAI");
        }
    }
    @Override
    void cetakKeamanan(){
       /* System.out.println("Kekokohan: "+super.getKekokohan());
        System.out.println("Kunci pintu: "+super.getKunciPintu());
        System.out.println("Kunci jendela: "+super.getKunciJendela());
        System.out.println("Bahaya: "+super.getBahaya());*/
        System.out.println(""+analisisKekokohan());
        System.out.println(""+analisisKunciPintu());
        System.out.println(""+analisisKunciJendela());
        System.out.println(""+analisisKeamanan());
    }
}

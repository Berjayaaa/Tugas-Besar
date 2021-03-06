
package ruangkelas;

import java.io.Serializable;


public class Keamanan extends ControlKelas implements Serializable{
    
    @Override
    void inputKekokohan(){
        System.out.print("Masukkan kekokohan (1. kokoh\n2. tidak kokoh): ");
        setKekokohan(in.nextInt());
    }
    
    @Override
    String analisisKekokohan(){
        if(getKekokohan()==2){
            totSesuai++;
            return ("Kekokohan: SESUIA");
        }
        else{
            return ("Kekokohan: TIDAK SESUIA");
        }
    }
    
    @Override
    void inputKunciPintu(){
        System.out.print("Masukkan kunci pintu(1. ada\n2. tidak ada): ");
        setKunciPintu(in.nextInt());        
    }
    
    @Override
    String analisisKunciPintu(){
        if(getKunciPintu()==1){
            totSesuai++;
            return ("Kunci pintu: SESUIA");
        }
        else{
            return ("Kunci pintu: TIDAK SESUIA");
        }
    }
    
    @Override
    void inputKunciJendela(){
        System.out.print("Masukkan kunci jendela (1. ada\n2. tidak ada): ");
        setKunciJendela(in.nextInt());
    }
    
    @Override
    String analisisKunciJendela(){
        if(getKunciJendela()==1){
            totSesuai++;
            return ("Kunci jendela: SESUIA");
        }
        else{
            return ("Kunci jendela: TIDAK SESUIA");
        }
    }
    
    @Override
    void inputKeamanan(){
        System.out.print("Masukkan bahaya (1. aman\n2. tidak aman): ");
        setBahaya(in.nextInt());
    }
    
    @Override
    String analisisKeamanan(){
        if(getBahaya()==1){
            totSesuai++;
            return ("Keamanan: SESUAI\n\n");
        }
        else{
            return ("Keamanan: TIDAK SESUAI\n\n");
        }
    }
    @Override
    void cetakKeamanan(){
        System.out.println("---HASIL ANALISIS KEAMANAN---");
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


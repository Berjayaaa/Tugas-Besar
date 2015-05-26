
package ruangkelas;

import java.io.Serializable;


public class Kenyamanan extends ControlKelas implements Serializable{
    
    @Override
    void inputKebisingan(){
        System.out.print("Masukkan kebisingan (1. bising\n2. tidak bising): ");
        setKebisingan(in.nextInt());
    }
    
    @Override
    String analisisKebisingan(){
        if(getKebisingan()==2){
            totSesuai++;
            return ("Kebisingna: SESUAI");
        }
        else{
            return ("Kebisingna: TIDAK SESUAI");
        }
    }
    
    @Override
    void inputBau(){
        
        System.out.print("Masukkan bau (1. bau\n2.  tidak bau): ");
        setBau(in.nextInt());
    }
    
    @Override
    String analisisBau(){
        if(getBau()==2){
            totSesuai++;
            return ("Bau: SESUAI");
        }
        else{
            return ("Bau: TIDAK SESUAI");
        }
    }
    
    
    @Override
    void inputKebocoran(){
        System.out.print("Masukkan kebocoran (1. bocor\n2. tidak bocor): ");
        setKebocoran(in.nextInt());
    }
    
    @Override
    String analisisKebocoran(){
        if(getKebocoran()==2){
            totSesuai++;
            return ("Kebocoran: SESUAI");
        }
        else{
            return ("Kebocoran: TIDAK SESUAI");
        }
    }
    
    @Override
    void inputKerusakan(){
        System.out.print("Masukkan kerusakan (1. rusak\n2. tidak rusak): ");
        setKerusakan(in.nextInt());
    }
    
    @Override
    String analisisKerusakan(){
        if(getKerusakan()==2){
            totSesuai++;
            return ("Kerusakan: SESUIA");
        }
        else{
            return ("Kerusakan: TIDAK SESUIA");
        }
    }
    
    @Override
    void inputKeausan(){
        System.out.print("Masukkan keausan (1. aus\n2. tidak aus): ");
        setKeausan(in.nextInt());
    }
    
    @Override
    String analisisKeausan(){
        if(getKeausan()==2){
            totSesuai++;
            return ("Keausan: SESUIA\n\n");
        }
        else{
            return ("Keausan: TIDAK SESUIA\n\n");}
    }
    @Override
    void cetakKenyamanan(){
        System.out.println("---HASIL ANALISIS KENYAMANAN---");
        /*System.out.println("Kebisingan: "+super.getKebisingan());
        System.out.println("Bau: "+super.getBau());
        System.out.println("Kebocoran: "+super.getKebocoran());
        System.out.println("Kerusakan: "+super.getKerusakan());
        System.out.println("Keausan: "+super.getKeausan());*/
        System.out.println(""+analisisKebisingan());
        System.out.println(""+analisisBau());
        System.out.println(""+analisisKebocoran());
        System.out.println(""+analisisKerusakan());
        System.out.println(""+analisisKeausan());
    }
}

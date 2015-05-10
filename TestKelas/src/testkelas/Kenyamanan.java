
package testkelas;


public class Kenyamanan extends ControlKelas{
    @Override
    void input20(){
        System.out.print("Masukkan kebisingan (1. bising\n2. tidak bising): ");
        super.setKebisingan(in.nextInt());
    }
    
    @Override
    String analisisKebisingan(){
        if(super.getKebisingan()==2){
            totSesuai++;
            return ("Kebisingna: SESUAI");
        }
        else{
            return ("Kebisingna: TIDAK SESUAI");
        }
    }
    
    @Override
    void input21(){
        
        System.out.print("Masukkan bau (1. bau\n2.  tidak bau): ");
        super.setBau(in.nextInt());
    }
    
    @Override
    String analisisBau(){
        if(super.getBau()==2){
            totSesuai++;
            return ("Bau: SESUAI");
        }
        else{
            return ("Bau: TIDAK SESUAI");
        }
    }
    
    
    @Override
    void input22(){
        System.out.print("Masukkan kebocoran (1. bocor\n2. tidak bocor): ");
        super.setKebocoran(in.nextInt());
    }
    
    @Override
    String analisisKebocoran(){
        if(super.getKebocoran()==2){
            totSesuai++;
            return ("Kebocoran: SESUAI");
        }
        else{
            return ("Kebocoran: TIDAK SESUAI");
        }
    }
    
    @Override
    void input23(){
        System.out.print("Masukkan kerusakan (1. rusak\n2. tidak rusak): ");
        super.setKerusakan(in.nextInt());
    }
    
    @Override
    String analisisKerusakan(){
        if(super.getKerusakan()==2){
            totSesuai++;
            return ("Kerusakan: SESUIA");
        }
        else{
            return ("Kerusakan: TIDAK SESUIA");
        }
    }
    
    @Override
    void input24(){
        System.out.print("Masukkan keausan (1. aus\n2. tidak aus): ");
        super.setKeausan(in.nextInt());
    }
    
    @Override
    String analisisKeausan(){
        if(super.getKeausan()==2){
            totSesuai++;
            return ("Keausan: SESUIA");
        }
        else{
            return ("Keausan: TIDAK SESUIA");}
    }
    @Override
    void cetakKenyamanan(){
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

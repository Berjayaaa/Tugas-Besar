

package testkelas;


public class Kebersihan extends ControlKelas{
    void inputKebersihan(){
        System.out.print("Masukkan kondisi lantai(1. bersih\n2. tidak bersih): ");
        super.setKonLantai(in.nextInt());
        System.out.print("Masukkan kondisi dinding (1. bersih\n2. tidak bersih): ");
        super.setKonDinding(in.nextInt());
        System.out.print("masukkan kondisi atap(1. bersih\n2. tidak bersih): ");
        super.setKonAtap(in.nextInt());
        System.out.print("Masukkan kondisi pintu (1. bersih\n2. tidak bersih): ");
        super.setKonPintu(in.nextInt());
        System.out.print("Masukkan kondisi jendela (1. bersih\n2. tidak bersih): ");
        super.setKonJendela(in.nextInt());
    }
    @Override
    String analisisKebersihan(){
        sesuai=0;
        
        if(super.getKonLantai()==1){
            System.out.println("Kondisi lantai SESUAI");
            sesuai++;
        }
        else{
            System.out.println("Kondisi lantai TIDAK SESUAI");
        }
        
        if(super.getKonDinding()==1){
            System.out.println("Kondisi dinding SESUAI");
            sesuai++;
        }
        else{
        }
        
        if(super.getKonAtap()==1){
            System.out.println("Kondisi atap SESUAI");
            sesuai++;
        }
        else{
            System.out.println("Kondisi atap TIDAK SESUAI");
        }
       
        if(super.getKonPintu()==1){
            System.out.println("Kondisi pintu SESUAI");
            sesuai++;
        }
        else{
            System.out.println("Kondisi pintu TIDAK SESUAI");
        }
        
        if(super.getKonJendela()==1){
            System.out.println("Kondisi jendela SESUAI");
            sesuai++;
        }
        
        else{
            System.out.println("Kondisi Jendela TIDAK SESUAI");
        }
        if(sesuai==5){
            totSesuai++;
            return ("Analisis Kebrsihan: SESUAI\n\n");
        }
        else{
            return ("Analisis Kebrsihan: TIDAK SESUAI\n\n");
        }
    }
    @Override
    void cetakKebersihan(){
        System.out.println("---HASIL ANALISIS KEBERSIHAN---");
        /*System.out.println("Kondisi lantai: "+super.getKonLantai());
        System.out.println("Kondisi dinding: "+super.getKonDinding());
        System.out.println("KOndisi atap: "+super.getKonAtap());
        System.out.println("Kondisi pintu: "+super.getKonPintu());
        System.out.println("Kondisi jendela: "+super.getKonJendela());*/
        System.out.println(""+analisisKebersihan());
    }
}


package ruangkelas;

import java.io.Serializable;


public class Lingkungan extends ControlKelas implements Serializable{
    @Override
    void inputSirkulasiUdara(){
        System.out.print("Masukkan kondisi sirkulasi udara (1.lancar\n2. tidak lancar): ");
        setSirkulasiUdara(in.nextInt());
    }
    
    @Override
    String analisisSirkulasiUdara(){
        if(getSirkulasiUdara()==1){
            totSesuai++;
            return ("Sirkulasi udara: SESUAI");
        }
        else{
            totSesuai++;
            return ("Sirkulasi udara: TIDAK SESUAI");
        }
    }
    
    @Override
    void inputPencahayaan(){
        System.out.print("Masukkan nilai pencahayaan (angka): ");
        setPencahayaan(in.nextInt());
    }
    
    @Override
    String analisisPencahayaan(){
        if(getPencahayaan()>=250&& getPencahayaan()<=350){
            totSesuai++;
            return ("Pencahayaan: SESUAI");
        }
        else{
            return ("Pencahayaan: TIDAK SESUAI");
        }
    }
    
    @Override
    void inputKelembapan(){
        System.out.print("Masukkan nilai kelambapan (angka): ");
        setKelembapan(in.nextDouble());
    }
    
    @Override
    String analisisKelembapan(){
        if(getKelembapan()>=70&&getKelembapan()<=80){
            totSesuai++;
            return ("kelambapan: SESUAI");
        }
        else{
            return ("kelambapan: TIDAK SESUAI");
        }
    }
    
    @Override
    void inputSuhu(){
        System.out.print("Masukkan suhu (cecius): ");
        setSuhu(in.nextDouble());
        in.nextLine();
    }
    
    @Override
    String analisisSuhu(){
        if(getSuhu()>=25&&getSuhu()<=35){
            totSesuai++;
            return ("Suhu: SESUAI\n\n");
        }
        else{
            return ("Suhu: TIDAK SESUAI\n\n");
        }
    }
    @Override
    void cetakLinkungan(){
        System.out.println("---HASIL ANALISIS LINGKUNGAN---");
        /*System.out.println("Sirkulasi udara: "+super.getSirkulasiUdara());
        System.out.println("Pencahayaan: "+super.getPencahayaan());
        System.out.println("Kelembapan: "+super.getKelembapan());
        System.out.println("Suhu: "+super.getSuhu());*/
        System.out.println(""+analisisSirkulasiUdara());
        System.out.println(""+analisisPencahayaan());
        System.out.println(""+analisisKelembapan());
        System.out.println(""+analisisSuhu());
    }
}

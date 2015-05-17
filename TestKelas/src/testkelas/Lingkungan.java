
package testkelas;


public class Lingkungan extends ControlKelas{
    @Override
    void input16(){
        System.out.print("Masukkan kondisi sirkulasi udara (1.lancar\n2. tidak lancar): ");
        super.setSirkulasiUdara(in.nextInt());
    }
    
    @Override
    String analisisSirkulasiUdara(){
        if(super.getSirkulasiUdara()==1){
            totSesuai++;
            return ("Sirkulasi udara: SESUAI");
        }
        else{
            totSesuai++;
            return ("Sirkulasi udara: TIDAK SESUAI");
        }
    }
    
    @Override
    void input17(){
        System.out.print("Masukkan nilai pencahayaan (angka): ");
        super.setPencahayaan(in.nextInt());
    }
    
    @Override
    String analisisPencahayaan(){
        if(super.getPencahayaan()>=250&& super.getPencahayaan()<=350){
            totSesuai++;
            return ("Pencahayaan: SESUAI");
        }
        else{
            return ("Pencahayaan: TIDAK SESUAI");
        }
    }
    
    @Override
    void input18(){
        System.out.print("Masukkan nilai kelambapan (angka): ");
        super.setKelembapan(in.nextDouble());
    }
    
    @Override
    String analisisKelembapan(){
        if(super.getKelembapan()>=70&&super.getKelembapan()<=80){
            totSesuai++;
            return ("kelambapan: SESUAI");
        }
        else{
            return ("kelambapan: TIDAK SESUAI");
        }
    }
    
    @Override
    void input19(){
        System.out.print("Masukkan suhu (cecius): ");
        super.setSuhu(in.nextDouble());
        in.nextLine();
    }
    
    @Override
    String analisisSuhu(){
        if(super.getSuhu()>=25&&super.getSuhu()<=35){
            totSesuai++;
            return ("Suhu: SESUAI");
        }
        else{
            return ("Suhu: TIDAK SESUAI");
        }
    }
    @Override
    void cetakLinkungan(){
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
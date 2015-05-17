package testkelas;

import java.util.Scanner;


public class ControlKelas extends RuangKelas implements Belajar{

    Scanner in = new Scanner(System.in);
    String papanTulis;
    String spidol;
    String penghapus;
    String proyektor;
    int totSesuai=0;
    int sesuai=0;
    
  
    @Override
    void data(String nama,String lokasi, String studi){
        System.out.print("Masukkan nama kelas: ");
        super.setNama(in.nextLine());
        System.out.print("Masukkan lokasi: ");
        super.setLokasi(in.nextLine());
        System.out.print("Masukkan program studi: ");
        super.setStudi(in.nextLine());
        System.out.print("Masukkan panjang kelas: ");
        super.setPanjang(in.nextDouble());
        System.out.print("Masukkan lebar kelas: ");
        super.setLebar(in.nextDouble());
    }
    /*void inputData() {
        System.out.print("Masukkan nama kelas: ");
        super.setNama(in.nextLine());
        System.out.print("Masukkan lokasi: ");
        super.setLokasi(in.nextLine());
        System.out.print("Masukkan program studi: ");
        super.setStudi(in.nextLine());
        System.out.print("Masukkan panjang kelas: ");
        super.setPanjang(in.nextDouble());
        System.out.print("Masukkan lebar kelas: ");
        super.setLebar(in.nextDouble());
        
    }*/

    double hitungLuasRuang() {
        return super.getPanjang() * super.getLebar(); //rumus luas
               
    }

    String hitungBentukRuang() {
        String bentuk;
        if(super.getLebar().equals(super.getPanjang()) ){
            bentuk = "Bukan Persegi panjang";
            System.out.println("Bentuk: " + bentuk);
            System.out.println("TIDAK SESUAI");
            return ("Bentuk Ruang: TIDAK SESUAI");
        }
        else{
            bentuk = "Persegi panjang";
            System.out.println("Bentuk: " + bentuk);
            totSesuai++;
            return("Bentuk ruang: SESUAI");   
        }
                   
    }
     void inputKursi(){
        System.out.print("Masukkan jumlah kursi: ");
        super.setJmKursi(in.nextInt());
    }

    double hitungRasioLuas() {
        double rasioluas;
        rasioluas=hitungLuasRuang() / super.getJmKursi();
        if(rasioluas>=0.5){
            totSesuai++;
            System.out.println("Rasio luas: SESUAI\n");
        }
        else{
            System.out.println("Rasio luas: TIDAK SESUAI\n");
        }
       return rasioluas;
    }
    
    void inputPintuDanJendela(){
        System.out.print("masukkan jumlah pintu: ");
        super.setJmPintu(in.nextInt());
        System.out.print("Masukkan jumlah jendela: ");
        super.setJmJendela(in.nextInt());
        
    }
    
    String analisisPintuDanJendela(){
        sesuai=0;
        if(super.getJmPintu()>=2){
            System.out.println("Jumlah pintu SESUAI");
            sesuai++;            
        }
        else{
            System.out.println("Jumalah pintu TIDAK SESUAI");
        }
        if(super.getJmJendela()>=1){
            System.out.println("Jumlah jendela SESUAI");
            sesuai++;
        }
        else{
            System.out.println("Jumlah jendela TIDAK SESUAI");
        }
        if(sesuai==2){
            totSesuai++;
            return ("Analisis pintu dan jendela: SESUAI\n");
        }
        else{
            return ("Analisis Pintu dan Jendela: TIDAK SESUAI\n");
        }
    }
    
    void inputKelistrikan(){
        
    }
    
    String analisisKelistrikan(){
        return null;
    }
    
    void inputLCD(){
       
    }
    
    String analisisLCD(){
        return null;
    }
    
    void inputLampu(){
        
    }
    
    String analisisLampu(){
        return null;
    }
    
    void inputKipasAngin(){
        
    }
    
    String analisisKipasAngin(){
        return null;
    }
    
    void inputAC(){
    }
    
    String analisisAC(){
        return null;
    }
    
    void inputInternet(){
    }
    
    String analisisInternet(){
        return null;
    }
    
    void inputCCTV(){
    }
    
    String analisisCCTV(){
        return null;
    }
    
    String analisisKebersihan(){
        return null;
    }
    
    void inputSirkulasiUdara(){
    }
    
    String analisisSirkulasiUdara(){
        return null;
    }
    
    void inputPencahayaan(){
    }
    
    String analisisPencahayaan(){
        return null;
    }
    
    void inputKelembapan(){
    }
    
    String analisisKelembapan(){
        return null;
    }
    
    void inputSuhu(){
    }
    
    String analisisSuhu(){
        return null;
    }
    
    void inputKebisingan(){
    }
    
    String analisisKebisingan(){
        return null;
    }
    
    void inputBau(){
    }
    
    String analisisBau(){
        return null;
    }
    
    
    void inputKebocoran(){
    }
    
    String analisisKebocoran(){
        return null;
    }
    
    void inputKerusakan(){
    }
    
    String analisisKerusakan(){
        return null;
    }
    
    void inputKeausan(){
    }
    
    String analisisKeausan(){
        return null;
    }
   
    void inputKekokohan(){
    }
    
    String analisisKekokohan(){
        return null;
    }
    
    void inputKunciPintu(){
    }
    
    String analisisKunciPintu(){
        return null;
    }
    
    void inputKunciJendela(){
    }
    
    String analisisKunciJendela(){
        return null;
    }
    
    void inputKeamanan(){
    }
    
    String analisisKeamanan(){
        return null;
    }
    
    
    
    /*void cetakControl(){
        System.out.println("Nama Kelas: "+super.getNama());
        System.out.println("Lokasi Kelas: "+super.getLokasi());
        System.out.println("Panjang Kelas: "+super.getPanjang());
        System.out.println("Lebar Kelas: "+super.getLebar());
        System.out.println("luas: " + hitungLuasRuang());
        System.out.println("Jumlah kursi: "+super.getJmKursi());
        System.out.println("Rasio luas: "+hitungRasioLuas());
        System.out.println("Jumlah pintu: "+super.getJmPintu());
        System.out.println("Jumlah jendelah: "+super.getJmJendela());
        
        System.out.println(""+hitungBentukRuang());
        System.out.println(""+hitungRasioLuas());
        System.out.println(""+analisisPintuDanJendela());
        System.out.println(""+analisisBelajar());
        //System.out.println("Jumlah Analisis Yang SESUAI: "+totSesuai);
    }*/
    
    void cetakSarana(){
    }
    
    void cetakKebersihan(){
    }
    
    void cetakLinkungan(){
    }
    
    void cetakKenyamanan(){
    }
    
    void cetakKeamanan(){
    }

    @Override
    public void inputBelajar() {
        in.nextLine();
        System.out.print("Apakah papan tulis ada: ");
        papanTulis=in.nextLine();
        System.out.print("Apakah spidol ada: ");
        spidol=in.nextLine();
        System.out.print("Apakah penghapus ada: ");
        penghapus=in.nextLine();
        System.out.print("Apakah proyektor ada: ");
        proyektor=in.nextLine();
    }

    @Override
    public String analisisBelajar() {
        sesuai=0;
        if(papanTulis.equals("ada")){
            sesuai++;
        }
        else{}
        if(spidol.equals("ada")){
            sesuai++;
        }
        else{}
        if(penghapus.equals("ada")){
            sesuai++;
        }
        else{}
        if(proyektor.equals("ada")){
            sesuai++;
        }
        else{}
        if(sesuai==4){
            return ("Kelas ini DAPAT DIGUNAKAN sebagai ruang belajar mengajar\n");
        }
        else{
            return ("Kelas ini TIDAK DAPAT DIGUNAKAN sebagai ruang belajar menganjar\n");
        }
    }
    
    @Override
    void cetak(){
        System.out.println("---HASIL ANALISIS CONTROL---");
        System.out.println(""+hitungBentukRuang());
        System.out.println(""+hitungRasioLuas());
        System.out.println(""+analisisPintuDanJendela());
        System.out.println(""+analisisBelajar());
    }

}

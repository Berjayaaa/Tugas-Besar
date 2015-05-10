package testkelas;

import java.util.Scanner;


public class ControlKelas extends RuangKelas{

    Scanner in = new Scanner(System.in);
    
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
    /*void input1() {
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
            System.out.println("SESUAI");
            totSesuai++;
            return("Bentuk ruang: SESUAI");   
        }
                   
    }
     void input2(){
        System.out.print("Masukkan jumlah kursi: ");
        super.setJmKursi(in.nextInt());
    }

    String hitungRasioLuas() {
        double rasioluas;
        rasioluas=hitungLuasRuang() / super.getJmKursi();
        if(rasioluas>=0.5){
            totSesuai++;
            return ("Rasio luas: SESUAI");
        }
        else{
            return ("Rasio luas: TIDAK SESUAI");
        }
    }
    
    void input3(){
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
            return ("Analisis pintu dan jendela: SESUAI");
        }
        else{
            return ("Analisis Pintu dan Jendela: TIDAK SESUAI");
        }
    }
    
    void input4(){
        System.out.print("Masukkan jumlah stop kontak/ steker: ");
        super.setJmStopKontak(in.nextInt());
        System.out.print("Masukkan jumlah stop kontak dalam kondisi BAIK: ");
        super.setKonStopKontak(in.nextInt());
        in.nextLine();
        System.out.print("masukkan posisi stop kontak (1. pojok ruang\n2. dekat dosen\n3. tmpat lain): ");
        super.setPosStopKontak(in.nextInt());               
    }
    
    String analisisKelistrikan(){
        sesuai=0;
        if(super.getJmStopKontak()>=4){
            System.out.println("jumlah stop kontak SESUAI");
            sesuai++;
        }
        else{
            System.out.println("Jumlah Stop kontak TIDAK SESUAI");
        }
        if(super.getKonStopKontak()>=4){
            System.out.println("kondisi steker BAIK");
            sesuai++;
        }
        else{
            System.out.println("Kondisi steker TIDAK BAIK");
        }
        if(super.getPosStopKontak()==1 || super.getPosStopKontak()==2){
            System.out.println("posisi steker SESUAI");
            sesuai++;
        }
        else{
            System.out.println("Posisi steker TIDAK SESUAI");
        }
        if(sesuai==3){
            totSesuai++;
            return ("Analisis Kelistrikan: SESUAI");
        }
        else{
            return ("Analisis Kelistrikan: TIDAK SESUAI");
        }
    }
    
    void input5(){
        System.out.print("Masukkan jumlah kebel LCD: ");
        super.setJmKabelLCD(in.nextInt());
        in.nextLine();
        System.out.print("Masukkan kondisi kabel LCD (1. berfungsi\n2.tidak berfungsi): ");
        super.setKonKabelLCD(in.nextInt());
        System.out.print("Masukkan posisi kabel LCD (1. dekat dosen\n2. tempat lain): ");
        super.setPosKabelLCD(in.nextInt());   
        
    }
    
    String analisisLCD(){
        sesuai=0;
        if(super.getJmKabelLCD()>=1){
            System.out.println("jumlah kabel LCD SESUAI");
            sesuai++;
        }
        else{
            System.out.println("jumlah kabel LCD TIDAK SESUAI");
        }
        if(super.getKonKabelLCD()==1){
            System.out.println("kondisi kabel LCD SESUAI");
            sesuai++;
        }
        else{
            System.out.println("kondisi kebel LCD TIDAK SESUAI");
        }
        if(super.getPosKabelLCD()==1){
            System.out.println("Posisi kabel LCD SESUAI");
            sesuai++;
        }
        else{
            System.out.println("Posisi kabel LCD TIDAK SESUAI");
        }
        if(sesuai==3){
            totSesuai++;
            return ("Analisis LCD: SESUAI");
        }
        else{
            return ("Analisis LCD: TIDAK SESUAI");
        }
    }
    
    void input6(){
        System.out.print("Masukkan jumlah lampu: ");
        super.setJmLampu(in.nextInt());
        System.out.print("Masukkan jumlah lampu dalam kondisi BAIK: ");
        super.setKonLampu(in.nextInt());
        in.nextLine();
        System.out.print("Masukkkan posisi lampu (1. atap ruangan\n2. tempat lain): ");
        super.setPosLampu(in.nextInt());
        
    }
    
    String analisisLampu(){
        sesuai=0;
        if(super.getJmLampu()>=18){
            System.out.println("Jumlah lampu SESUAI");
            sesuai++;
        }
        else{
            System.out.println("Jumlah lampu TIDAK SESUAI");
        }
        if(super.getKonLampu()>=18){
            System.out.println("Kondisi lampu SESUAI");
            sesuai++;
        }
        else{
            System.out.println("Kondisi lampu TIDAK SESUAI");
        }
        if(super.getPosLampu()==1){
            System.out.println("posisi lampu SESUAI");
            sesuai++;
        }
        else{
            System.out.println("posisi lampu TIDAK SESUAI");
        }
        if(sesuai==3){
            totSesuai++;
            return ("Analisis Lampu: SESUAI");
        }
        else{
            return ("Analisis Lampu: TIDAK SESUAI");
        }
    }
    
    void input7(){
        System.out.print("Masukkan jumlah kijpas angin: ");
        super.setJmKipas(in.nextInt());
        System.out.print("masukkan jumlah kipas angin dalam kondisi BAIK: ");
        super.setKonKipas(in.nextInt());
        in.nextLine();
        System.out.print("Masukkan posisi kipas angin (1. belakang\n2. samping\n3. tempat lain): ");
        super.setPosKipas(in.nextInt());
        
    }
    
    String analisisKipasAngin(){
        sesuai=0;
        if(super.getJmKipas()>=2){
            System.out.println("Jumlah kipas angin SESUAI");
            sesuai++;
        }
        else{
            System.out.println("Jumlah kipas angin TIDAK SESUAI");
        }
        if(super.getKonKipas()>=2){
            System.out.println("Kondisi kipas angin SESUAI");
            sesuai++;
        }
        else{
            System.out.println("KOndisi kipas angin TIDAK SESUAI");
        }
        if(super.getPosKipas()==1 || super.getPosKipas()==2){
            System.out.println("Posisi kipas angin SESUAI");
            sesuai++;
        }
        else{
            System.out.println("Posisi kipas angin TIDAK SESUAI");
        }
        if(sesuai==3){
            totSesuai++;
            return ("Analisis Kipas Angin: SESUAI");
        }
        else{
            return ("Analisis Kipas Angin: TIDAK SESUAI");
        }
    }
    
    void input8(){
        System.out.print("Masukkan jumlah AC: ");
        super.setJmAC(in.nextInt());
        in.nextLine();
        System.out.print("Masukkan kondisi AC(1. baik\n2. tidak baik): ");
        super.setKonAC(in.nextInt());
        System.out.print("Masukkan posisi AC (1. belakang\n2. samping\n3. tempat lain): ");
        super.setPosAC(in.nextInt());
        
    }
    
    String analisisAC(){
        sesuai=0;
        if(super.getJmAC()>=1){
            System.out.println("jumlah AC SESUAI");
            sesuai++;
        }
        else{
            System.out.println("jumlah AC TIDAK SESUIA");
        }
        if(super.getKonAC()==1){
            System.out.println("Kondisi AC SESUIA");
            sesuai++;
        }
        else{
            System.out.println("kondidi AC TIDAK SESUAI");
        }
        if(super.getPosAC()==1|| super.getPosAC()==2){
            System.out.println("Posisi AC SESUAI");
            sesuai++;
        }
        else{
            System.out.println("Posisi AC TIDAK SESUAI");
        }
        if(sesuai==3){
            totSesuai++;
            return ("Analisis AC: SESUAI ");
        }
        else{
            return ("Analisis AC: TIDAK SESUAI ");
        }
    }
    
    void input9(){
        System.out.print("Masukkan pilihan SSID(1/ UMMHotspot\n2. SSID lain): ");
        super.setSSID(in.nextInt());
        System.out.print("Masukkan bandwidth (1. bisa login\n2. tidak bisa login): ");
        super.setBanwidth(in.nextInt());
        
    }
    
    String analisisInternet(){
        sesuai=0;
        if(super.getSSID()==1){
            System.out.println("SSID SESUAI");
            sesuai++;
        }
        else{
            System.out.println("SSID TIDAK SESUAI");
        }
        if(super.getBanwidth()==1){
            System.out.println("bandwidth SESUAI");
            sesuai++;
        }
        else{
            System.out.println("bandwidth TIDAK SESUAI");
        }
        if(sesuai==2){
            totSesuai++;
            return ("Analisis Interner: SESUAI");
        }
        else{
            return ("Analisis Interner: TIDAK SESUAI");
        }
    }
    
    void input10(){
        System.out.print("Masukkan Jumlah CCCV: ");
        super.setJmCCTV(in.nextInt());
        System.out.print("masukkan jumlah CCV dalam kondisi baik: ");
        super.setKonCCTV(in.nextInt());
        in.nextLine();
        System.out.print("Masukkan posisi CCTV (1. depan\n2. belakang\n3. tempat lain): ");
        super.setPosCCTV(in.nextInt());
    }
    
    String analisisCCTV(){
        sesuai=0;
        if(super.getJmCCTV()==2){
            System.out.println("Jumlah CCTV SESUAI");
            sesuai++;
        }
        else{
            System.out.println("Jumlah CCTV TIDAK SESUAI");
        }
        if(super.getKonCCTV()==2){
            System.out.println("Kondisi CCTV SESUAI");
            sesuai++;
        }
        else{
            System.out.println("Kondisi CCTV TIDAK SESUAI");
        }
        if(super.getPosCCTV()==1|| super.getPosCCTV()==2){
            System.out.println("Posisi CCTV SESUIA");
            sesuai++;
        }
        else{
            System.out.println("Posisi CCTV TIDAK SESUAI");
        }
        if(sesuai==3){
            totSesuai++; 
            return ("Analisis CCTV: SESUAI");
        }
        else{
            return ("Analisis CCTV: TIDAK SESUAI");
        }
    }
    
    /*void input11(){
        System.out.print("Masukkan kondisi lantai(bersih/tidak bersih): ");
        kelas.setKonLantai(in.nextLine());                
    }
    String analisisKebersihanLantai(){
        if(kelas.getKonLantai().equals("bersih")){
            System.out.println("Kondisi lantai SESUAI");
            totSesuai++;
        }
        else{
            System.out.println("Kondisi lantai TIDAK SESUAI");
        }
        System.out.println("-------------------------------------------------");
        return null;
    }
    
    void input12(){
        System.out.print("Masukkan kondisi dinding(bersih/ tidak bersih): ");
        kelas.setKonDinding(in.nextLine());
    }*/
    
    String analisisKebersihan(){
        sesuai=0;
        System.out.print("Masukkan kondisi lantai(1. bersih\n2. tidak bersih): ");
        super.setKonLantai(in.nextInt());
        if(super.getKonLantai()==1){
            System.out.println("Kondisi lantai SESUAI");
            sesuai++;
        }
        else{
            System.out.println("Kondisi lantai TIDAK SESUAI");
        }
        System.out.println("-------------------------------------------------");
        System.out.print("Masukkan kondisi dinding (1. bersih\n2. tidak bersih): ");
        super.setKonDinding(in.nextInt());
        if(super.getKonDinding()==1){
            System.out.println("Kondisi dinding SESUAI");
            sesuai++;
        }
        else{
            System.out.println("KOndisi dinding TIDAK SESUAI");
        }
        System.out.println("-------------------------------------------------");
        System.out.print("masukkan kondisi atap(1. bersih\n2. tidak bersih): ");
        super.setKonAtap(in.nextInt());
        if(super.getKonAtap()==1){
            System.out.println("Kondisi atap SESUAI");
            sesuai++;
        }
        else{
            System.out.println("Kondisi atap TIDAK SESUAI");
        }
        System.out.println("-------------------------------------------------");
        System.out.print("Masukkan kondisi pintu (1. bersih\n2. tidak bersih): ");
        super.setKonPintu(in.nextInt());
        if(super.getKonPintu()==1){
            System.out.println("Kondisi pintu SESUAI");
            sesuai++;
        }
        else{
            System.out.println("Kondisi pintu TIDAK SESUAI");
        }
        System.out.println("-------------------------------------------------");
        System.out.print("Masukkan kondisi jendela (1. bersih\n2. tidak bersih): ");
        super.setKonJendela(in.nextInt());
        if(super.getKonJendela()==1){
            System.out.println("Kondisi jendela SESUAI");
            sesuai++;
        }
        
        else{
            System.out.println("Kondisi Jendela TIDAK SESUAI");
        }
        if(sesuai==5){
            totSesuai++;
            return ("Analisis Kebrsihan: SESUAI");
        }
        else{
            return ("Analisis Kebrsihan: TIDAK SESUAI");
        }
    }
    /*String analisisKebersihanDinding(){
        if(kelas.getKonDinding().equals("bersih")){
            System.out.println("Kondisi dinding SESUAI");
            totSesuai++;
        }
        else{
            System.out.println("KOndisi dinding TIDAK SESUAI");
        }
        System.out.println("-------------------------------------------------");
        return null;
    }
    
    void input13(){
        System.out.print("masukkan kondisi atap(bersih/ tidak bersih): ");
        kelas.setKonAtap(in.nextLine());
    }
    
    String analisisKebersihanAtap(){
        if(kelas.getKonAtap().equals("bersih")){
            System.out.println("Kondisi atap SESUAI");
            totSesuai++;
        }
        else{
            System.out.println("Kondisi atap TIDAK SESUAI");
        }
        System.out.pri  ntln("-------------------------------------------------");
        return null;
    }
    
    void input14(){
        System.out.print("Masukkan kondisi pintu(bersih/tidak bersih): ");
        kelas.setKonPintu(in.nextLine());
    }
    
    String analisisKebersihanPintu(){
        if(kelas.getKonPintu().equals("bersih")){
            System.out.println("Kondisi pintu SESUAI");
            totSesuai++;
        }
        else{
            System.out.println("Kondisi pintu TIDAK SESUAI");
        }
        System.out.println("-------------------------------------------------");
        return null;
    }
    
    void input15(){
        System.out.print("Masukkan kondisi jendela (bersih/tidak bersih: ");
        kelas.setKonJendela(in.nextLine());
    }
    
    String analisisKebersihanJendela(){
        if(kelas.getKonJendela().equals("bersih")){
            System.out.println("Kondisi jendela SESUAI");
            totSesuai++;
        }
        
        else{
            System.out.println("Kondisi Jendela TIDAK SESUAI");
        }
        System.out.println("-------------------------------------------------");
        return null;
    }*/
    
    void input16(){
        System.out.print("Masukkan kondisi sirkulasi udara (1.lancar\n2. tidak lancar): ");
        super.setSirkulasiUdara(in.nextInt());
    }
    
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
    
    void input17(){
        System.out.print("Masukkan nilai pencahayaan (angka): ");
        super.setPencahayaan(in.nextInt());
    }
    
    String analisisPencahayaan(){
        if(super.getPencahayaan()>=250&& super.getPencahayaan()<=350){
            totSesuai++;
            return ("Pencahayaan: SESUAI");
        }
        else{
            return ("Pencahayaan: TIDAK SESUAI");
        }
    }
    
    void input18(){
        System.out.print("Masukkan nilai kelambapan (angka): ");
        super.setKelembapan(in.nextDouble());
    }
    
    String analisisKelembapan(){
        if(super.getKelembapan()>=70&&super.getKelembapan()<=80){
            totSesuai++;
            return ("kelambapan: SESUAI");
        }
        else{
            return ("kelambapan: TIDAK SESUAI");
        }
    }
    
    void input19(){
        System.out.print("Masukkan suhu (cecius): ");
        super.setSuhu(in.nextDouble());
        in.nextLine();
    }
    
    String analisisSuhu(){
        if(super.getSuhu()>=25&&super.getSuhu()<=35){
            totSesuai++;
            return ("Suhu: SESUAI");
        }
        else{
            return ("Suhu: TIDAK SESUAI");
        }
    }
    
    void input20(){
        System.out.print("Masukkan kebisingan (1. bising\n2. tidak bising): ");
        super.setKebisingan(in.nextInt());
    }
    
    String analisisKebisingan(){
        if(super.getKebisingan()==2){
            totSesuai++;
            return ("Kebisingna: SESUAI");
        }
        else{
            return ("Kebisingna: TIDAK SESUAI");
        }
    }
    
    void input21(){
        
        System.out.print("Masukkan bau (1. bau\n2.  tidak bau): ");
        super.setBau(in.nextInt());
    }
    
    String analisisBau(){
        if(super.getBau()==2){
            totSesuai++;
            return ("Bau: SESUAI");
        }
        else{
            return ("Bau: TIDAK SESUAI");
        }
    }
    
    
    void input22(){
        System.out.print("Masukkan kebocoran (1. bocor\n2. tidak bocor): ");
        super.setKebocoran(in.nextInt());
    }
    
    String analisisKebocoran(){
        if(super.getKebocoran()==2){
            totSesuai++;
            return ("Kebocoran: SESUAI");
        }
        else{
            return ("Kebocoran: TIDAK SESUAI");
        }
    }
    
    void input23(){
        System.out.print("Masukkan kerusakan (1. rusak\n2. tidak rusak): ");
        super.setKerusakan(in.nextInt());
    }
    
    String analisisKerusakan(){
        if(super.getKerusakan()==2){
            totSesuai++;
            return ("Kerusakan: SESUIA");
        }
        else{
            return ("Kerusakan: TIDAK SESUIA");
        }
    }
    
    void input24(){
        System.out.print("Masukkan keausan (1. aus\n2. tidak aus): ");
        super.setKeausan(in.nextInt());
    }
    
    String analisisKeausan(){
        if(super.getKeausan()==2){
            totSesuai++;
            return ("Keausan: SESUIA");
        }
        else{
            return ("Keausan: TIDAK SESUIA");}
    }
   
    void input25(){
        System.out.print("Masukkan kekokohan (1. kokoh\n2. tidak kokoh): ");
        super.setKekokohan(in.nextInt());
    }
    
    String analisisKekokohan(){
        if(super.getKekokohan()==2){
            totSesuai++;
            return ("Kekokohan: SESUIA");
        }
        else{
            return ("Kekokohan: TIDAK SESUIA");
        }
    }
    
    void input26(){
        System.out.print("Masukkan kunci pintu(1. ada\n2. tidak ada): ");
        super.setKunciPintu(in.nextInt());        
    }
    
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
    
    String analisisKunciJendela(){
        if(super.getKunciJendela()==1){
            totSesuai++;
            return ("Kunci jendela: SESUIA");
        }
        else{
            return ("Kunci jendela: TIDAK SESUIA");
        }
    }
    
    void input28(){
        System.out.print("Masukkan bahaya (1. aman\n2. tidak aman): ");
        super.setBahaya(in.nextInt());
    }
    
    String analisisKeamanan(){
        if(super.getBahaya()==1){
            totSesuai++;
            return ("Keamanan: SESUAI");
        }
        else{
            return ("Keamanan: TIDAK SESUAI");
        }
    }
    
    void cetakControl(){
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
        //System.out.println("Jumlah Analisis Yang SESUAI: "+totSesuai);
    }
    void cetakSarana(){
        System.out.println("Jumlah stop kontak: "+super.getJmStopKontak());
        System.out.println("Kondisi stop kontak ;"+super.getKonStopKontak());
        System.out.println("Jumlah kabel LCD: "+super.getJmKabelLCD());
        System.out.println("Kondisi kabel LCD: "+super.getKonKabelLCD());
        System.out.println("Posisi kabel LCD: "+super.getPosKabelLCD());
        System.out.println("Jumlah lampu: "+super.getJmLampu());
        System.out.println("Kondisi lampu: "+super.getKonLampu());
        System.out.println("Posisi lampu: "+super.getPosLampu());
        System.out.println("Jumlah kipas angin: "+super.getJmKipas());
        System.out.println("Kondisi kipas angin: "+super.getKonKipas());
        System.out.println("Posisi kipas angin: "+super.getPosKipas());
        System.out.println("Jumalah AC: "+super.getJmAC());
        System.out.println("Kondisi AC: "+super.getKonAC());
        System.out.println("Posisi AC: "+super.getPosAC());
        System.out.println("SSID: "+super.getSSID());
        System.out.println("Bandwidth: "+super.getBanwidth());
        System.out.println("Jumlah CCTV: "+super.getJmCCTV());
        System.out.println("Kondidi CCTV: "+super.getKonCCTV());
        System.out.println("Posisi CCTV: "+super.getPosCCTV());
        System.out.println(""+analisisKelistrikan());
        System.out.println(""+analisisLCD());
        System.out.println(""+analisisLampu());
        System.out.println(""+analisisKipasAngin());
        System.out.println(""+analisisAC());
        System.out.println(""+analisisInternet());
        System.out.println(""+analisisCCTV());
    }
    void cetakKebersihan(){
        System.out.println("Kondisi lantai: "+super.getKonLantai());
        System.out.println("Kondisi dinding: "+super.getKonDinding());
        System.out.println("KOndisi atap: "+super.getKonAtap());
        System.out.println("Kondisi pintu: "+super.getKonPintu());
        System.out.println("Kondisi jendela: "+super.getKonJendela());
        System.out.println(""+analisisKebersihan());
    }
    void cetakLinkungan(){
        System.out.println("Sirkulasi udara: "+super.getSirkulasiUdara());
        System.out.println("Pencahayaan: "+super.getPencahayaan());
        System.out.println("Kelembapan: "+super.getKelembapan());
        System.out.println("Suhu: "+super.getSuhu());
        System.out.println(""+analisisSirkulasiUdara());
        System.out.println(""+analisisPencahayaan());
        System.out.println(""+analisisKelembapan());
        System.out.println(""+analisisSuhu());
    }
    void cetakKenyamanan(){
         System.out.println("Kebisingan: "+super.getKebisingan());
        System.out.println("Bau: "+super.getBau());
        System.out.println("Kebocoran: "+super.getKebocoran());
        System.out.println("Kerusakan: "+super.getKerusakan());
        System.out.println("Keausan: "+super.getKeausan());
        System.out.println(""+analisisKebisingan());
        System.out.println(""+analisisBau());
        System.out.println(""+analisisKebocoran());
        System.out.println(""+analisisKerusakan());
        System.out.println(""+analisisKeausan());
    }
    void cetakKeamanan(){
        System.out.println("Kekokohan: "+super.getKekokohan());
        System.out.println("Kunci pintu: "+super.getKunciPintu());
        System.out.println("Kunci jendela: "+super.getKunciJendela());
        System.out.println("Bahaya: "+super.getBahaya());
        System.out.println(""+analisisKekokohan());
        System.out.println(""+analisisKunciPintu());
        System.out.println(""+analisisKunciJendela());
        System.out.println(""+analisisKeamanan());
    }

    

}

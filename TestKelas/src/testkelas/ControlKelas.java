/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testkelas;

import java.util.Scanner;

/**
 *
 * @author Berjayaaa
 */
public class ControlKelas {

    Scanner in = new Scanner(System.in);
    private final RuangKelas kelas = new RuangKelas();
    
    void input1() {
        System.out.print("Masukkan nama kelas: ");
        kelas.setNama(in.nextLine());
        System.out.print("Masukkan lokasi: ");
        kelas.setLokasi(in.nextLine());
        System.out.print("Masukkan program studi: ");
        kelas.setStudi(in.nextLine());
        System.out.print("Masukkan panjang kelas: ");
        kelas.setPanjang(in.nextDouble());
        System.out.print("Masukkan lebar kelas: ");
        kelas.setLebar(in.nextDouble());
        
    }

    double hitungLuasRuang() {
        return kelas.getPanjang() * kelas.getLebar(); //rumus luas
               
    }

    String hitungBentukRuang() {
        String bentuk;
        if(kelas.getLebar().equals(kelas.getPanjang()) ){
            bentuk = "Bukan Persegi panjang";
            System.out.println("Bentuk: " + bentuk);
            System.out.println("TIDAK SESUAI");
        }
        else{
            bentuk = "Persegi panjang";
            System.out.println("Bentuk: " + bentuk);
            System.out.println("SESUAI");
        }
        System.out.println("-------------------------------------------------");
        return null;
        
    }
     void input2(){
        System.out.print("Masukkan jumlah kursi: ");
        kelas.setJmKursi(in.nextInt());
    }

    double hitungRasioLuas() {
        return hitungLuasRuang() / kelas.getJmKursi();
        
       
    }
    
    void input3(){
        System.out.print("masukkan jumlah pintu: ");
        kelas.setJmPintu(in.nextInt());
        System.out.print("Masukkan jumlah jendela: ");
        kelas.setJmJendela(in.nextInt());
        
    }
    
    void anlisisPintuDanJendela(){
        if(kelas.getJmPintu()>=2){
            System.out.println("Jumlah pintu SESUAI");
        }
        else{
            System.out.println("Jumalah pintu TIDAK SESUAI");
        }
        if(kelas.getJmJendela()>=1){
            System.out.println("Jumlah jendela SESUAI");
        }
        else{
            System.out.println("Jumlah jendela TIDAK SESUAI");
        }
        System.out.println("-------------------------------------------------");
    }
    
    void input4(){
        System.out.print("Masukkan jumlah stop kontak/ steker: ");
        kelas.setJmStopKontak(in.nextInt());
        
        System.out.print("Masukkan jumlah stop kontak dalam kondisi BAIK: ");
        kelas.setKonStopKontak(in.nextInt());
        in.nextLine();
        System.out.print("masukkan posisi stop kontak: ");
        kelas.setPosStopKontak(in.nextLine());
        
        
    }
    
    void analisisKelistrikan(){
        if(kelas.getJmStopKontak()>=4){
            System.out.println("jumlah stop kontak SESUAI");
        }
        else{
            System.out.println("Jumlah Stop kontak TIDAK SESUAI");
        }
        if(kelas.getKonStopKontak()>=4){
            System.out.println("kondisi steker BAIK");
        }
        else{
            System.out.println("Kondisi steker TIDAK BAIK");
        }
        if(kelas.getPosStopKontak().equals("dipojok ruang") && kelas.getPosStopKontak().equals("dekat dosen")){
            System.out.println("posisi steker SESUAI");
        }
        else{
            System.out.println("Posisi steker TIDAK SESUAI");
        }
        System.out.println("-------------------------------------------------");        
    }
    
    void input5(){
        System.out.print("Masukkan jumlah kebel LCD: ");
        kelas.setJmKabelLCD(in.nextInt());
        in.nextLine();
        System.out.print("Masukkan kondisi kabel LCD(berfungsi/tidak berfungsi): ");
        kelas.setKonKabelLCD(in.nextLine());
        System.out.print("Masukkan posisi kabel LCD: ");
        kelas.setPosKabelLCD(in.nextLine());   
        
    }
    
    void analisisLCD(){
        if(kelas.getJmKabelLCD()>=1){
            System.out.println("jumlah kabel LCD SESUAI");
        }
        else{
            System.out.println("jumlah kabel LCD TIDAK SESUAI");
        }
        if(kelas.getKonKabelLCD().equals("berfungsi")){
            System.out.println("kondisi kabel LCD SESUAI");
        }
        else{
            System.out.println("kondisi kebel LCD TIDAK SESUAI");
        }
        if(kelas.getPosKabelLCD().equals("dekat dosen")){
            System.out.println("Posisi kabel LCD SESUAI");
        }
        else{
            System.out.println("Posisi kabel LCD TIDAK SESUAI");
        }
        System.out.println("-------------------------------------------------");
    }
    
    void input6(){
        System.out.print("Masukkan jumlah lampu: ");
        kelas.setJmLampu(in.nextInt());
        System.out.print("Masukkan jumlah lampu dalam kondisi BAIK: ");
        kelas.setKonLampu(in.nextInt());
        in.nextLine();
        System.out.print("Masukkkan posisi lampu: ");
        kelas.setPosLampu(in.nextLine());
        
    }
    
    void analisisLampu(){
        if(kelas.getJmLampu()>=18){
            System.out.println("Jumlah lampu SESUAI");
        }
        else{
            System.out.println("Jumlah lampu TIDAK SESUAI");
        }
        if(kelas.getKonLampu()>=18){
            System.out.println("Kondisi lampu SESUAI");
        }
        else{
            System.out.println("Kondisi lampu TIDAK SESUAI");
        }
        if(kelas.getPosLampu().equals("atap ruangan")){
            System.out.println("posisi lampu SESUAI");
        }
        else{
            System.out.println("posisi lampu TIDAK SESUAI");
        }
        System.out.println("-------------------------------------------------");
    }
    
    void input7(){
        System.out.print("Masukkan jumlah kijpas angin: ");
        kelas.setJmKipas(in.nextInt());
        System.out.print("masukkan jumlah kipas angin dalam kondisi BAIK: ");
        kelas.setKonKipas(in.nextInt());
        in.nextLine();
        System.out.print("Masukkan posisi kipas angin: ");
        kelas.setPosKipas(in.nextLine());
        
    }
    
    void analisisKipasAngin(){
        if(kelas.getJmKipas()>=2){
            System.out.println("Jumlah kipas angin SESUAI");
        }
        else{
            System.out.println("Jumlah kipas angin TIDAK SESUAI");
        }
        if(kelas.getKonKipas()>=2){
            System.out.println("Kondisi kipas angin SESUAI");
        }
        else{
            System.out.println("KOndisi kipas angin TIDAK SESUAI");
        }
        if(kelas.getPosKipas().equals("belakang") || kelas.getPosKipas().equals("samping")){
            System.out.println("Posisi kipas angin SESUAI");
        }
        else{
            System.out.println("Posisi kipas angin TIDAK SESUAI");
        }
        System.out.println("-------------------------------------------------");
    }
    
    void input8(){
        System.out.print("Masukkan jumlah AC: ");
        kelas.setJmAC(in.nextInt());
        in.nextLine();
        System.out.print("Masukkan kondisi AC(baik/ tidak baik): ");
        kelas.setKonAC(in.nextLine());
        System.out.print("Masukkan posisi AC: ");
        kelas.setPosAC(in.nextLine());
        
    }
    
    void analisisAC(){
        if(kelas.getJmAC()>=1){
            System.out.println("jumlah AC SESUAI");
        }
        else{
            System.out.println("jumlah AC TIDAK SESUIA");
        }
        if(kelas.getKonAC().equals("baik")){
            System.out.println("Kondisi AC SESUIA");
        }
        else{
            System.out.println("kondidi AC TIDAK SESUAI");
        }
        if(kelas.getPosAC().equals("di belakang")|| kelas.getPosAC().equals("samping")){
            System.out.println("Posisi AC SESUAI");
        }
        else{
            System.out.println("Posisi AC TIDAK SESUAI");
        }
        System.out.println("-------------------------------------------------");
    }
    
    void input9(){
        System.out.print("Masukkan pilihan SSID: ");
        kelas.setSSID(in.nextLine());
        System.out.print("Masukkan bandwidth (bisa login/ tidak bisa login): ");
        kelas.setBanwidth(in.nextLine());
        
    }
    
    void analisisInternet(){
        if(kelas.getSSID().equals("UMM Hotspot")){
            System.out.println("SSID SESUAI");
        }
        else{
            System.out.println("SSID TIDAK SESUAI");
        }
        if(kelas.getBanwidth().equals("bisa login")){
            System.out.println("bandwidth SESUAI");
        }
        else{
            System.out.println("bandwidth TIDAK SESUAI");
        }
        System.out.println("-------------------------------------------------");
    }
    
    void input10(){
        System.out.print("Masukkan Jumlah CCCV: ");
        kelas.setJmCCTV(in.nextInt());
        System.out.print("masukkan jumlah CCV dalam kondisi baik: ");
        kelas.setKonCCTV(in.nextInt());
        in.nextLine();
        System.out.print("Masukkan posisi CCTV: ");
        kelas.setPosCCTV(in.nextLine());
    }
    
    void analisisCCTV(){
        if(kelas.getJmCCTV()==2){
            System.out.println("Jumlah CCTV SESUAI");
        }
        else{
            System.out.println("Jumlah CCTV TIDAK SESUAI");
        }
        if(kelas.getKonCCTV()==2){
            System.out.println("Kondisi CCTV SESUAI");
        }
        else{
            System.out.println("Kondisi CCTV TIDAK SESUAI");
        }
        if(kelas.getPosCCTV().equals("depan")&& kelas.getPosCCTV().equals("belakang")){
            System.out.println("Posisi CCTV SESUIA");
        }
        else{
            System.out.println("Posisi CCTV TIDAK SESUAI");
        }
        System.out.println("-------------------------------------------------");
    }
    
    void input11(){
        System.out.print("Masukkan kondisi lantai(bersih/tidak bersih): ");
        kelas.setKonLantai(in.nextLine());                
    }
    void analisisKebersihanLantai(){
        if(kelas.getKonLantai().equals("bersih")){
            System.out.println("Kondisi lantai SESUAI");
        }
        else{
            System.out.println("Kondisi lantai TIDAK SESUAI");
        }
        System.out.println("-------------------------------------------------");
    }
    
    void input12(){
        System.out.print("Masukkan kondisi dinding(bersih/ tidak bersih): ");
        kelas.setKonDinding(in.nextLine());
    }
    
    void analisisKebersihanDinding(){
        if(kelas.getKonDinding().equals("bersih")){
            System.out.println("Kondisi dinding SESUAI");
        }
        else{
            System.out.println("KOndisi dinding TIDAK SESUAI");
        }
        System.out.println("-------------------------------------------------");
    }
    
    void input13(){
        System.out.print("masukkan kondisi atap(bersih/ tidak bersih): ");
        kelas.setKonAtap(in.nextLine());
    }
    
    void analisisKebersihanAtap(){
        if(kelas.getKonAtap().equals("bersih")){
            System.out.println("Kondisi atap SESUAI");
        }
        else{
            System.out.println("Kondisi atap TIDAK SESUAI");
        }
        System.out.println("-------------------------------------------------");
    }
    
    void input14(){
        System.out.print("Masukkan kondisi pintu(bersih/tidak bersih): ");
        kelas.setKonPintu(in.nextLine());
    }
    
    void analisisKebersihanPintu(){
        if(kelas.getKonPintu().equals("bersih")){
            System.out.println("Kondisi pintu SESUAI");
        }
        else{
            System.out.println("Kondisi pintu TIDAK SESUAI");
        }
        System.out.println("-------------------------------------------------");
    }
    
    void input15(){
        System.out.print("Masukkan kondisi jendela (bersih/tidak bersih: ");
        kelas.setKonJendela(in.nextLine());
    }
    
    void analisisKebersihanJendela(){
        if(kelas.getKonJendela().equals("bersih")){
            System.out.println("Kondisi jendela SESUAI");
        }
        else{
            System.out.println("Kondisi Jendela TIDAK SESUAI");
        }
        System.out.println("-------------------------------------------------");
    }
    
    void input16(){
        System.out.print("Masukkan kondisi sirkulasi udara(lancar/tidak lancar): ");
        kelas.setSirkulasiUdara(in.nextLine());
    }
    
    void analisisSirkulasiUdara(){
        if(kelas.getSirkulasiUdara().equals("lancar")){
            System.out.println("Sirkulasi udara SESUIA");
        }
        else{
            System.out.println("Sirkulasi udara TIDAK SESUAI");
        }
        System.out.println("-------------------------------------------------");
    }
    
    void input17(){
        System.out.print("Masukkan nilai pencahayaan(angka): ");
        kelas.setPencahayaan(in.nextInt());
    }
    
    void analisisPencahayaan(){
        if(kelas.getPencahayaan()>=250&& kelas.getPencahayaan()<=350){
            System.out.println("Pencahayaan SESUIA");
        }
        else{
            System.out.println("pencahayaan TIDAK SESUAI");
        }
        System.out.println("-------------------------------------------------");
    }
    
    void input18(){
        System.out.print("Masukkan nilai kelambapan(angka): ");
        kelas.setKelembapan(in.nextDouble());
    }
    
    void analisisKelembapan(){
        if(kelas.getKelembapan()>=70&&kelas.getKelembapan()<=80){
            System.out.println("kelambapan SESUAI");
        }
        else{
            System.out.println("Kelembapan TIDAK SESUAI");
        }
        System.out.println("-------------------------------------------------");
    }
    
    void input19(){
        System.out.print("Masukkan suhu (cecius): ");
        kelas.setSuhu(in.nextDouble());
        in.nextLine();
    }
    
    void analisisSuhu(){
        if(kelas.getSuhu()>=25&&kelas.getSuhu()<=35){
            System.out.println("Suhu SESUAI");
            
        }
        else{
            System.out.println("Suhu TIDAK SESUAI");
        }
        System.out.println("-------------------------------------------------");
    }
    
    void input20(){
        System.out.print("Masukkan kebisingan(bising/ tidak bising): ");
        kelas.setKebisingan(in.nextLine());
    }
    
    void analisisKebisingan(){
        if(kelas.getKebisingan().equals("tidak bising")){
            System.out.println("Kebisingna SESUAI");
        }
        else
            System.out.println("Kebisingan TIDAK SESUAI");
        System.out.println("-------------------------------------------------");
    }
    
    void input21(){
        
        System.out.print("Masukkan bau (bau/ tidak bau): ");
        kelas.setBau(in.nextLine());
    }
    
    void analisisBau(){
        if(kelas.getBau().equals("tidak bau")){
            System.out.println("Bau SESUAI");
        }
        else{
            System.out.println("Bau TIDAK SESUAI");
        }
        System.out.println("-------------------------------------------------");
    }
    
    
    void input22(){
        System.out.print("Masukkan kebocoran (bocor/ tidak bocor): ");
        kelas.setKebocoran(in.nextLine());
    }
    
    void analisisKebocoran(){
        if(kelas.getKebocoran().equals("tidak bocor")){
            System.out.println("Kebocoran SESUAI");
        }
        else{
            System.out.println("kebocoran TIDAK SESUAI");
        }
        System.out.println("-------------------------------------------------");
    }
    
    void input23(){
        System.out.print("Masukkan kerusakan (rusak/ tidak rusak): ");
        kelas.setKerusakan(in.nextLine());
    }
    
    void analisisKerusakan(){
        if(kelas.getKerusakan().equals("tidak rusak")){
            System.out.println("Kerusakan SESUAI");
        }
        else{
            System.out.println("Kerusakan TIDAK SESUAI");
        }
        System.out.println("-------------------------------------------------");
    }
    
    void input24(){
        System.out.print("Masukkan keausan (aus/ tidak aus): ");
        kelas.setKeausan(in.nextLine());
    }
    
    void analisisKeausan(){
        if(kelas.getKeausan().equals("tidak aus")){
            System.out.println("Keausan SESUAI");
        }
        else
            System.out.println("Keausan TIDAK SESUAI");
        System.out.println("-------------------------------------------------");
    }
   
    void input25(){
        System.out.print("Masukkan kekokohan (kokoh/tidak kokoh): ");
        kelas.setKekokohan(in.nextLine());
    }
    
    void analisisKekokohan(){
        if(kelas.getKekokohan().equals("kokoh")){
            System.out.println("Kekokohan SESUAI");
        }
        else{
            System.out.println("Kekokohan TIDAK SESUAI");
        }
        System.out.println("-------------------------------------------------");
    }
    
    void input26(){
        System.out.print("Masukkan kunci pintu(ada/ tidak ada): ");
        kelas.setKunciPintu(in.nextLine());        
    }
    
    void analisisKunciPintu(){
        if(kelas.getKunciPintu().equals("ada")){
            System.out.println("Kunci pintu SESUAI");
        }
        else{
            System.out.println("Kunci pintu TIDAK SESUAI");
        }
        System.out.println("-------------------------------------------------");
    }
    
    void input27(){
        System.out.print("Masukkan kunci jendela (ada/ tidak ada): ");
        kelas.setKunciJendela(in.nextLine());
    }
    
    void analisisKunciJendela(){
        if(kelas.getKunciJendela().equals("ada")){
            System.out.println("Kunci jendela SESUAi");
        }
        else{
            System.out.println("Kunci jendela TIDAK SESUAi");
        }
        System.out.println("-------------------------------------------------");
    }
    
    void input28(){
        System.out.print("Masukkan bahaya (aman/ tidak aman): ");
        kelas.setBahaya(in.nextLine());
    }
    
    void analisisKeamanan(){
        if(kelas.getBahaya().equals("aman")){
            System.out.println("Keamanan SESUIA");
        }
        else{
            System.out.println("keamanan TIDAK SESUAI");
        }
        System.out.println("-------------------------------------------------");
    }
    
    void cetak(){
        System.out.println("Nama Kelas: "+kelas.getNama());
        System.out.println("Lokasi Kelas: "+kelas.getLokasi());
        System.out.println("Panjang Kelas: "+kelas.getPanjang());
        System.out.println("Lebar Kelas: "+kelas.getLebar());
        System.out.println("luas: " + hitungLuasRuang());
        System.out.println("Jumlah kursi: "+kelas.getJmKursi());
        System.out.println("Rasio luas: "+hitungRasioLuas());
        System.out.println("Jumlah pintu: "+kelas.getJmPintu());
        System.out.println("Jumlah jendelah: "+kelas.getJmJendela());
        System.out.println("Jumlah stop kontak: "+kelas.getJmStopKontak());
        System.out.println("Kondisi stop kontak ;"+kelas.getKonStopKontak());
        System.out.println("Jumlah kabel LCD: "+kelas.getJmKabelLCD());
        System.out.println("Kondisi kabel LCD: "+kelas.getKonKabelLCD());
        System.out.println("Posisi kabel LCD: "+kelas.getPosKabelLCD());
        System.out.println("Jumlah lampu: "+kelas.getJmLampu());
        System.out.println("Kondisi lampu: "+kelas.getKonLampu());
        System.out.println("Posisi lampu: "+kelas.getPosLampu());
        System.out.println("Jumlah kipas angin: "+kelas.getJmKipas());
        System.out.println("Kondisi kipas angin: "+kelas.getKonKipas());
        System.out.println("Posisi kipas angin: "+kelas.getPosKipas());
        System.out.println("Jumalah AC: "+kelas.getJmAC());
        System.out.println("Kondisi AC: "+kelas.getKonAC());
        System.out.println("Posisi AC: "+kelas.getPosAC());
        System.out.println("SSID: "+kelas.getSSID());
        System.out.println("Bandwidth: "+kelas.getBanwidth());
        System.out.println("Jumlah CCTV: "+kelas.getJmCCTV());
        System.out.println("Kondidi CCTV: "+kelas.getKonCCTV());
        System.out.println("Posisi CCTV: "+kelas.getPosCCTV());
        System.out.println("Kondisi lantai: "+kelas.getKonLantai());
        System.out.println("Kondisi dinding: "+kelas.getKonDinding());
        System.out.println("KOndisi atap: "+kelas.getKonAtap());
        System.out.println("Kondisi pintu: "+kelas.getKonPintu());
        System.out.println("Kondisi jendela: "+kelas.getKonJendela());
        System.out.println("Sirkulasi udara: "+kelas.getSirkulasiUdara());
        System.out.println("Pencahayaan: "+kelas.getPencahayaan());
        System.out.println("Kelembapan: "+kelas.getKelembapan());
        System.out.println("Suhu: "+kelas.getSuhu());
        System.out.println("Kebisingan: "+kelas.getKebisingan());
        System.out.println("Bau: "+kelas.getBau());
        System.out.println("Kebocoran: "+kelas.getKebocoran());
        System.out.println("Kerusakan: "+kelas.getKerusakan());
        System.out.println("Keausan: "+kelas.getKeausan());
        System.out.println("Kekokohan: "+kelas.getKekokohan());
        System.out.println("Kunci pintu: "+kelas.getKunciPintu());
        System.out.println("Kunci jendela: "+kelas.getKunciJendela());
        System.out.println("Bahaya: "+kelas.getBahaya());
    }

}
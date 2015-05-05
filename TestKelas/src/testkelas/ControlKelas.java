package testkelas;

import java.util.Scanner;


public class ControlKelas extends Kebersihan{

    Scanner in = new Scanner(System.in);
    private final RuangKelas kelas = new RuangKelas();
    int totSesuai=0;
    int sesuai=0;
  
    
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
            totSesuai++;
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
        if(hitungRasioLuas()>=0.5){
            System.out.println("Rasio SESUAI");
            totSesuai++;
        }
        else{
            System.out.println("Rasio TIDAK SESUAI");
        }
        System.out.print("masukkan jumlah pintu: ");
        kelas.setJmPintu(in.nextInt());
        System.out.print("Masukkan jumlah jendela: ");
        kelas.setJmJendela(in.nextInt());
        
    }
    
    String anlisisPintuDanJendela(){
        sesuai=0;
        if(kelas.getJmPintu()>=2){
            System.out.println("Jumlah pintu SESUAI");
            sesuai++;            
        }
        else{
            System.out.println("Jumalah pintu TIDAK SESUAI");
        }
        if(kelas.getJmJendela()>=1){
            System.out.println("Jumlah jendela SESUAI");
            sesuai++;
        }
        else{
            System.out.println("Jumlah jendela TIDAK SESUAI");
        }
        if(sesuai==2){
            System.out.println("Analisis Pintu dan Jendela SESUAI ");
            totSesuai++;        
       }
        System.out.println("-------------------------------------------------");
        return null;
    }
    
    void input4(){
        System.out.print("Masukkan jumlah stop kontak/ steker: ");
        kelas.setJmStopKontak(in.nextInt());
        
        System.out.print("Masukkan jumlah stop kontak dalam kondisi BAIK: ");
        kelas.setKonStopKontak(in.nextInt());
        in.nextLine();
        System.out.print("masukkan posisi stop kontak (pojok ruang/ dekat dosen): ");
        kelas.setPosStopKontak(in.nextLine());
        
        
    }
    
    String analisisKelistrikan(){
        sesuai=0;
        if(kelas.getJmStopKontak()>=4){
            System.out.println("jumlah stop kontak SESUAI");
            sesuai++;
        }
        else{
            System.out.println("Jumlah Stop kontak TIDAK SESUAI");
        }
        if(kelas.getKonStopKontak()>=4){
            System.out.println("kondisi steker BAIK");
            sesuai++;
        }
        else{
            System.out.println("Kondisi steker TIDAK BAIK");
        }
        if(kelas.getPosStopKontak().equals("pojok ruang") && kelas.getPosStopKontak().equals("dekat dosen")){
            System.out.println("posisi steker SESUAI");
            sesuai++;
        }
        else{
            System.out.println("Posisi steker TIDAK SESUAI");
        }
        if(sesuai==3){
            System.out.println("Analisis Kelistrikan SESUAI");
            totSesuai++;
        }
        System.out.println("-------------------------------------------------");        
        return null;
    }
    
    void input5(){
        System.out.print("Masukkan jumlah kebel LCD: ");
        kelas.setJmKabelLCD(in.nextInt());
        in.nextLine();
        System.out.print("Masukkan kondisi kabel LCD(berfungsi/tidak berfungsi): ");
        kelas.setKonKabelLCD(in.nextLine());
        System.out.print("Masukkan posisi kabel LCD (dekat dosen/ tempat lain): ");
        kelas.setPosKabelLCD(in.nextLine());   
        
    }
    
    String analisisLCD(){
        sesuai=0;
        if(kelas.getJmKabelLCD()>=1){
            System.out.println("jumlah kabel LCD SESUAI");
            sesuai++;
        }
        else{
            System.out.println("jumlah kabel LCD TIDAK SESUAI");
        }
        if(kelas.getKonKabelLCD().equals("berfungsi")){
            System.out.println("kondisi kabel LCD SESUAI");
            sesuai++;
        }
        else{
            System.out.println("kondisi kebel LCD TIDAK SESUAI");
        }
        if(kelas.getPosKabelLCD().equals("dekat dosen")){
            System.out.println("Posisi kabel LCD SESUAI");
            sesuai++;
        }
        else{
            System.out.println("Posisi kabel LCD TIDAK SESUAI");
        }
        if(sesuai==3){
            System.out.println("Analisis LCD SESUAI");
            totSesuai++;
        }
        System.out.println("-------------------------------------------------");
        return null;
    }
    
    void input6(){
        System.out.print("Masukkan jumlah lampu: ");
        kelas.setJmLampu(in.nextInt());
        System.out.print("Masukkan jumlah lampu dalam kondisi BAIK: ");
        kelas.setKonLampu(in.nextInt());
        in.nextLine();
        System.out.print("Masukkkan posisi lampu (atap ruangan/ tempat lain): ");
        kelas.setPosLampu(in.nextLine());
        
    }
    
    String analisisLampu(){
        sesuai=0;
        if(kelas.getJmLampu()>=18){
            System.out.println("Jumlah lampu SESUAI");
            sesuai++;
        }
        else{
            System.out.println("Jumlah lampu TIDAK SESUAI");
        }
        if(kelas.getKonLampu()>=18){
            System.out.println("Kondisi lampu SESUAI");
            sesuai++;
        }
        else{
            System.out.println("Kondisi lampu TIDAK SESUAI");
        }
        if(kelas.getPosLampu().equals("atap ruangan")){
            System.out.println("posisi lampu SESUAI");
            sesuai++;
        }
        else{
            System.out.println("posisi lampu TIDAK SESUAI");
        }
        if(sesuai==3){
            System.out.println("Analisis Lampu SESUAI");
            totSesuai++;
        }
        System.out.println("-------------------------------------------------");
        return null;
    }
    
    void input7(){
        System.out.print("Masukkan jumlah kijpas angin: ");
        kelas.setJmKipas(in.nextInt());
        System.out.print("masukkan jumlah kipas angin dalam kondisi BAIK: ");
        kelas.setKonKipas(in.nextInt());
        in.nextLine();
        System.out.print("Masukkan posisi kipas angin (belakang/ samping): ");
        kelas.setPosKipas(in.nextLine());
        
    }
    
    String analisisKipasAngin(){
        sesuai=0;
        if(kelas.getJmKipas()>=2){
            System.out.println("Jumlah kipas angin SESUAI");
            sesuai++;
        }
        else{
            System.out.println("Jumlah kipas angin TIDAK SESUAI");
        }
        if(kelas.getKonKipas()>=2){
            System.out.println("Kondisi kipas angin SESUAI");
            sesuai++;
        }
        else{
            System.out.println("KOndisi kipas angin TIDAK SESUAI");
        }
        if(kelas.getPosKipas().equals("belakang") || kelas.getPosKipas().equals("samping")){
            System.out.println("Posisi kipas angin SESUAI");
            sesuai++;
        }
        else{
            System.out.println("Posisi kipas angin TIDAK SESUAI");
        }
        if(sesuai==3){
            System.out.println("Analisis Kipas Angin SESUIA");
            totSesuai++;
        }
        System.out.println("-------------------------------------------------");
        return null;
    }
    
    void input8(){
        System.out.print("Masukkan jumlah AC: ");
        kelas.setJmAC(in.nextInt());
        in.nextLine();
        System.out.print("Masukkan kondisi AC(baik/ tidak baik): ");
        kelas.setKonAC(in.nextLine());
        System.out.print("Masukkan posisi AC (belakang/ samping): ");
        kelas.setPosAC(in.nextLine());
        
    }
    
    String analisisAC(){
        sesuai=0;
        if(kelas.getJmAC()>=1){
            System.out.println("jumlah AC SESUAI");
            sesuai++;
        }
        else{
            System.out.println("jumlah AC TIDAK SESUIA");
        }
        if(kelas.getKonAC().equals("baik")){
            System.out.println("Kondisi AC SESUIA");
            sesuai++;
        }
        else{
            System.out.println("kondidi AC TIDAK SESUAI");
        }
        if(kelas.getPosAC().equals("di belakang")|| kelas.getPosAC().equals("samping")){
            System.out.println("Posisi AC SESUAI");
            sesuai++;
        }
        else{
            System.out.println("Posisi AC TIDAK SESUAI");
        }
        if(sesuai==3){
            System.out.println("Analisis AC SESUAI");
            totSesuai++;
        }
        System.out.println("-------------------------------------------------");
        return null;
    }
    
    void input9(){
        System.out.print("Masukkan pilihan SSID: ");
        kelas.setSSID(in.nextLine());
        System.out.print("Masukkan bandwidth (bisa login/ tidak bisa login): ");
        kelas.setBanwidth(in.nextLine());
        
    }
    
    String analisisInternet(){
        sesuai=0;
        if(kelas.getSSID().equals("UMM Hotspot")){
            System.out.println("SSID SESUAI");
            sesuai++;
        }
        else{
            System.out.println("SSID TIDAK SESUAI");
        }
        if(kelas.getBanwidth().equals("bisa login")){
            System.out.println("bandwidth SESUAI");
            sesuai++;
        }
        else{
            System.out.println("bandwidth TIDAK SESUAI");
        }
        if(sesuai==2){
            System.out.println("Analisis Interner SESUAI");
            totSesuai++;
        }
        System.out.println("-------------------------------------------------");
        return null;
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
    
    String analisisCCTV(){
        sesuai=0;
        if(kelas.getJmCCTV()==2){
            System.out.println("Jumlah CCTV SESUAI");
            sesuai++;
        }
        else{
            System.out.println("Jumlah CCTV TIDAK SESUAI");
        }
        if(kelas.getKonCCTV()==2){
            System.out.println("Kondisi CCTV SESUAI");
            sesuai++;
        }
        else{
            System.out.println("Kondisi CCTV TIDAK SESUAI");
        }
        if(kelas.getPosCCTV().equals("depan")&& kelas.getPosCCTV().equals("belakang")){
            System.out.println("Posisi CCTV SESUIA");
            sesuai++;
        }
        else{
            System.out.println("Posisi CCTV TIDAK SESUAI");
        }
        if(sesuai==3){
            totSesuai++;
        }
        System.out.println("-------------------------------------------------");
        return null;
    }
    
    void input11(){
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
    }
    
    String analisisKebersihanDinding(){
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
        System.out.println("-------------------------------------------------");
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
    }
    
    void input16(){
        System.out.print("Masukkan kondisi sirkulasi udara(lancar/tidak lancar): ");
        kelas.setSirkulasiUdara(in.nextLine());
    }
    
    String analisisSirkulasiUdara(){
        if(kelas.getSirkulasiUdara().equals("lancar")){
            System.out.println("Sirkulasi udara SESUIA");
            totSesuai++;
        }
        else{
            System.out.println("Sirkulasi udara TIDAK SESUAI");
        }
        System.out.println("-------------------------------------------------");
        return null;
    }
    
    void input17(){
        System.out.print("Masukkan nilai pencahayaan(angka): ");
        kelas.setPencahayaan(in.nextInt());
    }
    
    String analisisPencahayaan(){
        if(kelas.getPencahayaan()>=250&& kelas.getPencahayaan()<=350){
            System.out.println("Pencahayaan SESUIA");
            totSesuai++;
        }
        else{
            System.out.println("pencahayaan TIDAK SESUAI");
        }
        System.out.println("-------------------------------------------------");
        return null;
    }
    
    void input18(){
        System.out.print("Masukkan nilai kelambapan(angka): ");
        kelas.setKelembapan(in.nextDouble());
    }
    
    String analisisKelembapan(){
        if(kelas.getKelembapan()>=70&&kelas.getKelembapan()<=80){
            System.out.println("kelambapan SESUAI");
            totSesuai++;
        }
        else{
            System.out.println("Kelembapan TIDAK SESUAI");
        }
        System.out.println("-------------------------------------------------");
        return null;
    }
    
    void input19(){
        System.out.print("Masukkan suhu (cecius): ");
        kelas.setSuhu(in.nextDouble());
        in.nextLine();
    }
    
    String analisisSuhu(){
        if(kelas.getSuhu()>=25&&kelas.getSuhu()<=35){
            System.out.println("Suhu SESUAI");
            totSesuai++;
        }
        else{
            System.out.println("Suhu TIDAK SESUAI");
        }
        System.out.println("-------------------------------------------------");
        return null;
    }
    
    void input20(){
        System.out.print("Masukkan kebisingan(bising/ tidak bising): ");
        kelas.setKebisingan(in.nextLine());
    }
    
    String analisisKebisingan(){
        if(kelas.getKebisingan().equals("tidak bising")){
            System.out.println("Kebisingna SESUAI");
            totSesuai++;
        }
        else
            System.out.println("Kebisingan TIDAK SESUAI");
        System.out.println("-------------------------------------------------");
        return null;
    }
    
    void input21(){
        
        System.out.print("Masukkan bau (bau/ tidak bau): ");
        kelas.setBau(in.nextLine());
    }
    
    String analisisBau(){
        if(kelas.getBau().equals("tidak bau")){
            System.out.println("Bau SESUAI");
            totSesuai++;
        }
        else{
            System.out.println("Bau TIDAK SESUAI");
        }
        System.out.println("-------------------------------------------------");
        return null;
    }
    
    
    void input22(){
        System.out.print("Masukkan kebocoran (bocor/ tidak bocor): ");
        kelas.setKebocoran(in.nextLine());
    }
    
    String analisisKebocoran(){
        if(kelas.getKebocoran().equals("tidak bocor")){
            System.out.println("Kebocoran SESUAI");
            totSesuai++;
        }
        else{
            System.out.println("kebocoran TIDAK SESUAI");
        }
        System.out.println("-------------------------------------------------");
        return null;
    }
    
    void input23(){
        System.out.print("Masukkan kerusakan (rusak/ tidak rusak): ");
        kelas.setKerusakan(in.nextLine());
    }
    
    String analisisKerusakan(){
        if(kelas.getKerusakan().equals("tidak rusak")){
            System.out.println("Kerusakan SESUAI");
            totSesuai++;
        }
        else{
            System.out.println("Kerusakan TIDAK SESUAI");
        }
        System.out.println("-------------------------------------------------");
        return null;
    }
    
    void input24(){
        System.out.print("Masukkan keausan (aus/ tidak aus): ");
        kelas.setKeausan(in.nextLine());
    }
    
    String analisisKeausan(){
        if(kelas.getKeausan().equals("tidak aus")){
            System.out.println("Keausan SESUAI");
            totSesuai++;
        }
        else
            System.out.println("Keausan TIDAK SESUAI");
        System.out.println("-------------------------------------------------");
        return null;
    }
   
    void input25(){
        System.out.print("Masukkan kekokohan (kokoh/tidak kokoh): ");
        kelas.setKekokohan(in.nextLine());
    }
    
    String analisisKekokohan(){
        if(kelas.getKekokohan().equals("kokoh")){
            System.out.println("Kekokohan SESUAI");
            totSesuai++;
        }
        else{
            System.out.println("Kekokohan TIDAK SESUAI");
        }
        System.out.println("-------------------------------------------------");
        return null;
    }
    
    void input26(){
        System.out.print("Masukkan kunci pintu(ada/ tidak ada): ");
        kelas.setKunciPintu(in.nextLine());        
    }
    
    String analisisKunciPintu(){
        if(kelas.getKunciPintu().equals("ada")){
            System.out.println("Kunci pintu SESUAI");
            totSesuai++;
        }
        else{
            System.out.println("Kunci pintu TIDAK SESUAI");
        }
        System.out.println("-------------------------------------------------");
        return null;
    }
    
    void input27(){
        System.out.print("Masukkan kunci jendela (ada/ tidak ada): ");
        kelas.setKunciJendela(in.nextLine());
    }
    
    String analisisKunciJendela(){
        if(kelas.getKunciJendela().equals("ada")){
            System.out.println("Kunci jendela SESUAi");
            totSesuai++;
        }
        else{
            System.out.println("Kunci jendela TIDAK SESUAi");
        }
        System.out.println("-------------------------------------------------");
        return null;
    }
    
    void input28(){
        System.out.print("Masukkan bahaya (aman/ tidak aman): ");
        kelas.setBahaya(in.nextLine());
    }
    
    String analisisKeamanan(){
        if(kelas.getBahaya().equals("aman")){
            System.out.println("Keamanan SESUIA");
            totSesuai++;
        }
        else{
            System.out.println("keamanan TIDAK SESUAI");
        }
        System.out.println("-------------------------------------------------");
        return null;
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
        System.out.println("Jumlah Analisis Yang SESUAI: "+totSesuai);
        
    }

}

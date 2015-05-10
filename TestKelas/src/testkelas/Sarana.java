
package testkelas;


public class Sarana extends ControlKelas{
    public Sarana(){}
    
    @Override
    void input4(){
        System.out.print("Masukkan jumlah stop kontak/ steker: ");
        super.setJmStopKontak(in.nextInt());
        System.out.print("Masukkan jumlah stop kontak dalam kondisi BAIK: ");
        super.setKonStopKontak(in.nextInt());
        in.nextLine();
        System.out.print("masukkan posisi stop kontak (1. pojok ruang\n2. dekat dosen\n3. tmpat lain): ");
        super.setPosStopKontak(in.nextInt());               
    }
    
    @Override
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
    
    @Override
    void input5(){
        System.out.print("Masukkan jumlah kebel LCD: ");
        super.setJmKabelLCD(in.nextInt());
        in.nextLine();
        System.out.print("Masukkan kondisi kabel LCD (1. berfungsi\n2.tidak berfungsi): ");
        super.setKonKabelLCD(in.nextInt());
        System.out.print("Masukkan posisi kabel LCD (1. dekat dosen\n2. tempat lain): ");
        super.setPosKabelLCD(in.nextInt());   
        
    }
    
    @Override
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
    
    @Override
    void input6(){
        System.out.print("Masukkan jumlah lampu: ");
        super.setJmLampu(in.nextInt());
        System.out.print("Masukkan jumlah lampu dalam kondisi BAIK: ");
        super.setKonLampu(in.nextInt());
        in.nextLine();
        System.out.print("Masukkkan posisi lampu (1. atap ruangan\n2. tempat lain): ");
        super.setPosLampu(in.nextInt());
        
    }
    
    @Override
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
    
    @Override
    void input7(){
        System.out.print("Masukkan jumlah kijpas angin: ");
        super.setJmKipas(in.nextInt());
        System.out.print("masukkan jumlah kipas angin dalam kondisi BAIK: ");
        super.setKonKipas(in.nextInt());
        in.nextLine();
        System.out.print("Masukkan posisi kipas angin (1. belakang\n2. samping\n3. tempat lain): ");
        super.setPosKipas(in.nextInt());
        
    }
    
    @Override
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
    
    @Override
    void input8(){
        System.out.print("Masukkan jumlah AC: ");
        super.setJmAC(in.nextInt());
        in.nextLine();
        System.out.print("Masukkan kondisi AC(1. baik\n2. tidak baik): ");
        super.setKonAC(in.nextInt());
        System.out.print("Masukkan posisi AC (1. belakang\n2. samping\n3. tempat lain): ");
        super.setPosAC(in.nextInt());
        
    }
    
    @Override
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
    
    @Override
    void input9(){
        System.out.print("Masukkan pilihan SSID(1/ UMMHotspot\n2. SSID lain): ");
        super.setSSID(in.nextInt());
        System.out.print("Masukkan bandwidth (1. bisa login\n2. tidak bisa login): ");
        super.setBanwidth(in.nextInt());
        
    }
    
    @Override
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
    
    @Override
    void input10(){
        System.out.print("Masukkan Jumlah CCCV: ");
        super.setJmCCTV(in.nextInt());
        System.out.print("masukkan jumlah CCV dalam kondisi baik: ");
        super.setKonCCTV(in.nextInt());
        in.nextLine();
        System.out.print("Masukkan posisi CCTV (1. depan\n2. belakang\n3. tempat lain): ");
        super.setPosCCTV(in.nextInt());
    }
    
    @Override
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
    @Override
    void cetakSarana(){
        /*System.out.println("Jumlah stop kontak: "+super.getJmStopKontak());
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
        System.out.println("Posisi CCTV: "+super.getPosCCTV());*/
        System.out.println(""+analisisKelistrikan());
        System.out.println(""+analisisLCD());
        System.out.println(""+analisisLampu());
        System.out.println(""+analisisKipasAngin());
        System.out.println(""+analisisAC());
        System.out.println(""+analisisInternet());
        System.out.println(""+analisisCCTV());
    }
}

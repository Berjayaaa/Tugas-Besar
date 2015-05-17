package testkelas;

abstract public class RuangKelas {
    public RuangKelas(){}
    

    private String nama;
    private String lokasi;
    private String studi;
    private Double panjang;
    private Double lebar;
    private int jmKursi;
    private int jmPintu;
    private int jmJendela;
    private int jmStopKontak;
    private int konStopKontak;
    private int posStopKontak;
    private int jmKabelLCD;
    private int konKabelLCD;
    private int PosKabelLCD;
    private int jmLampu;
    private int konLampu;
    private int posLampu;
    private int jmKipas;
    private int konKipas;
    private int posKipas;
    private int jmAC;
    private int konAC;
    private int posAC;
    private int SSID;
    private int banwidth;
    private int jmCCTV;
    private int konCCTV;
    private int posCCTV;
    private int konLantai;
    private int konDinding;
    private int konAtap;
    private int konPintu;
    private int konJendela;
    private int sirkulasiUdara;
    private double pencahayaan;
    private double kelembapan;
    private double suhu;
    private int kebisingan;
    private int bau;
    private int kebocoran;
    private int kerusakan;
    private int keausan;
    private int kekokohan;
    private int kunciPintu;
    private int kunciJendela;
    private int bahaya;
    
    public RuangKelas(String nama,String lokasi, String studi){
        this.nama=nama;
        this.lokasi=lokasi;
        this.studi=studi;
    }
    void data(){}
    void data(String nama,String lokasi, String studi){}
    
    public String getNama() {
        return nama;
    }

   
    public void setNama(String nama) {
        this.nama = nama;
    }


    public String getLokasi() {
        return lokasi;
    }


    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }


    public Double getPanjang() {
        return panjang;
    }


    public void setPanjang(Double panjang) {
        this.panjang = panjang;
    }


    public Double getLebar() {
        return lebar;
    }


    public void setLebar(Double lebar) {
        this.lebar = lebar;
    }


    public int getJmKursi() {
        return jmKursi;
    }


    public void setJmKursi(int jmKursi) {
        this.jmKursi = jmKursi;
    }


    public int getJmPintu() {
        return jmPintu;
    }


    public void setJmPintu(int jmPintu) {
        this.jmPintu = jmPintu;
    }


    public int getJmJendela() {
        return jmJendela;
    }


    public void setJmJendela(int jmJendela) {
        this.jmJendela = jmJendela;
    }


    public int getJmStopKontak() {
        return jmStopKontak;
    }


    public void setJmStopKontak(int jmStopKontak) {
        this.jmStopKontak = jmStopKontak;
    }


    public int getKonStopKontak() {
        return konStopKontak;
    }


    public void setKonStopKontak(int konStopKontak) {
        this.konStopKontak = konStopKontak;
    }


    public int getJmKabelLCD() {
        return jmKabelLCD;
    }


    public void setJmKabelLCD(int jmKabelLCD) {
        this.jmKabelLCD = jmKabelLCD;
    }


    public int getKonKabelLCD() {
        return konKabelLCD;
    }


    public void setKonKabelLCD(int konKabelLCD) {
        this.konKabelLCD = konKabelLCD;
    }


    public int getPosKabelLCD() {
        return PosKabelLCD;
    }


    public void setPosKabelLCD(int PosKabelLCD) {
        this.PosKabelLCD = PosKabelLCD;
    }

    public int getJmLampu() {
        return jmLampu;
    }


    public void setJmLampu(int jmLampu) {
        this.jmLampu = jmLampu;
    }


    public int getKonLampu() {
        return konLampu;
    }


    public void setKonLampu(int konLampu) {
        this.konLampu = konLampu;
    }


    public int getPosLampu() {
        return posLampu;
    }


    public void setPosLampu(int posLampu) {
        this.posLampu = posLampu;
    }


    public int getJmKipas() {
        return jmKipas;
    }


    public void setJmKipas(int jmKipas) {
        this.jmKipas = jmKipas;
    }


    public int getKonKipas() {
        return konKipas;
    }


    public void setKonKipas(int konKipas) {
        this.konKipas = konKipas;
    }


    public int getPosKipas() {
        return posKipas;
    }


    public void setPosKipas(int posKipas) {
        this.posKipas = posKipas;
    }


    public int getJmAC() {
        return jmAC;
    }


    public void setJmAC(int jmAC) {
        this.jmAC = jmAC;
    }


    public int getKonAC() {
        return konAC;
    }


    public void setKonAC(int konAC) {
        this.konAC = konAC;
    }


    public int getPosAC() {
        return posAC;
    }


    public void setPosAC(int posAC) {
        this.posAC = posAC;
    }


    public int getSSID() {
        return SSID;
    }


    public void setSSID(int SSID) {
        this.SSID = SSID;
    }


    public int getBanwidth() {
        return banwidth;
    }

    /**
     * @param banwidth the banwidth to set
     */
    public void setBanwidth(int banwidth) {
        this.banwidth = banwidth;
    }

    /**
     * @return the jmCCTV
     */
    public int getJmCCTV() {
        return jmCCTV;
    }

    /**
     * @param jmCCTV the jmCCTV to set
     */
    public void setJmCCTV(int jmCCTV) {
        this.jmCCTV = jmCCTV;
    }

    /**
     * @return the konCCTV
     */
    public int getKonCCTV() {
        return konCCTV;
    }

    /**
     * @param konCCTV the konCCTV to set
     */
    public void setKonCCTV(int konCCTV) {
        this.konCCTV = konCCTV;
    }

    /**
     * @return the posCCTV
     */
    public int getPosCCTV() {
        return posCCTV;
    }

    /**
     * @param posCCTV the posCCTV to set
     */
    public void setPosCCTV(int posCCTV) {
        this.posCCTV = posCCTV;
    }

    /**
     * @return the konLantai
     */
    public int getKonLantai() {
        return konLantai;
    }

    /**
     * @param konLantai the konLantai to set
     */
    public void setKonLantai(int konLantai) {
        this.konLantai = konLantai;
    }

    /**
     * @return the konDinding
     */
    public int getKonDinding() {
        return konDinding;
    }

    /**
     * @param konDinding the konDinding to set
     */
    public void setKonDinding(int konDinding) {
        this.konDinding = konDinding;
    }

    /**
     * @return the konAtap
     */
    public int getKonAtap() {
        return konAtap;
    }

    /**
     * @param konAtap the konAtap to set
     */
    public void setKonAtap(int konAtap) {
        this.konAtap = konAtap;
    }

    /**
     * @return the konPintu
     */
    public int getKonPintu() {
        return konPintu;
    }

    /**
     * @param konPintu the konPintu to set
     */
    public void setKonPintu(int konPintu) {
        this.konPintu = konPintu;
    }

    /**
     * @return the konJendela
     */
    public int getKonJendela() {
        return konJendela;
    }

    /**
     * @param konJendela the konJendela to set
     */
    public void setKonJendela(int konJendela) {
        this.konJendela = konJendela;
    }

    /**
     * @return the sirkulasiUdara
     */
    public int getSirkulasiUdara() {
        return sirkulasiUdara;
    }

    /**
     * @param sirkulasiUdara the sirkulasiUdara to set
     */
    public void setSirkulasiUdara(int sirkulasiUdara) {
        this.sirkulasiUdara = sirkulasiUdara;
    }

    /**
     * @return the pencahayaan
     */
    public double getPencahayaan() {
        return pencahayaan;
    }

    /**
     * @param pencahayaan the pencahayaan to set
     */
    public void setPencahayaan(double pencahayaan) {
        this.pencahayaan = pencahayaan;
    }

    /**
     * @return the kelembapan
     */
    public double getKelembapan() {
        return kelembapan;
    }

    /**
     * @param kelembapan the kelembapan to set
     */
    public void setKelembapan(double kelembapan) {
        this.kelembapan = kelembapan;
    }

    /**
     * @return the suhu
     */
    public double getSuhu() {
        return suhu;
    }

    /**
     * @param suhu the suhu to set
     */
    public void setSuhu(double suhu) {
        this.suhu = suhu;
    }

    /**
     * @return the kebisingan
     */
    public int getKebisingan() {
        return kebisingan;
    }

    /**
     * @param kebisingan the kebisingan to set
     */
    public void setKebisingan(int kebisingan) {
        this.kebisingan = kebisingan;
    }

    /**
     * @return the bau
     */
    public int getBau() {
        return bau;
    }

    /**
     * @param bau the bau to set
     */
    public void setBau(int bau) {
        this.bau = bau;
    }

    /**
     * @return the kebocoran
     */
    public int getKebocoran() {
        return kebocoran;
    }

    /**
     * @param kebocoran the kebocoran to set
     */
    public void setKebocoran(int kebocoran) {
        this.kebocoran = kebocoran;
    }

    /**
     * @return the kerusakan
     */
    public int getKerusakan() {
        return kerusakan;
    }

    /**
     * @param kerusakan the kerusakan to set
     */
    public void setKerusakan(int kerusakan) {
        this.kerusakan = kerusakan;
    }

    /**
     * @return the keausan
     */
    public int getKeausan() {
        return keausan;
    }

    /**
     * @param keausan the keausan to set
     */
    public void setKeausan(int keausan) {
        this.keausan = keausan;
    }

    /**
     * @return the kekokohan
     */
    public int getKekokohan() {
        return kekokohan;
    }

    /**
     * @param kekokohan the kekokohan to set
     */
    public void setKekokohan(int kekokohan) {
        this.kekokohan = kekokohan;
    }

    /**
     * @return the kunciPintu
     */
    public int getKunciPintu() {
        return kunciPintu;
    }

    /**
     * @param kunciPintu the kunciPintu to set
     */
    public void setKunciPintu(int kunciPintu) {
        this.kunciPintu = kunciPintu;
    }

    /**
     * @return the kunciJendela
     */
    public int getKunciJendela() {
        return kunciJendela;
    }

    /**
     * @param kunciJendela the kunciJendela to set
     */
    public void setKunciJendela(int kunciJendela) {
        this.kunciJendela = kunciJendela;
    }

    /**
     * @return the bahaya
     */
    public int getBahaya() {
        return bahaya;
    }

    /**
     * @param bahaya the bahaya to set
     */
    public void setBahaya(int bahaya) {
        this.bahaya = bahaya;
    }

    /**
     * @return the studi
     */
    public String getStudi() {
        return studi;
    }

    /**
     * @param studi the studi to set
     */
    public void setStudi(String studi) {
        this.studi = studi;
    }

    /**
     * @return the posStopKontak
     */
    public int getPosStopKontak() {
        return posStopKontak;
    }

    /**
     * @param posStopKontak the posStopKontak to set
     */
    public void setPosStopKontak(int posStopKontak) {
        this.posStopKontak = posStopKontak;
    }

    abstract void cetak();
}

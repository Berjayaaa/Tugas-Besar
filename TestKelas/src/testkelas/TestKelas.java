
package ruangkelas;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class KelasTest implements Serializable{

    int banyakRuang = 1;
    ControlKelas[] c = new ControlKelas[banyakRuang];
    Sarana[] s = new Sarana[banyakRuang];
    Kebersihan[] b = new Kebersihan[banyakRuang];
    Lingkungan[] l = new Lingkungan[banyakRuang];
    Kenyamanan[] k = new Kenyamanan[banyakRuang];
    Keamanan[] a = new Keamanan[banyakRuang];

    public KelasTest() {
        for (int x = 0; x < banyakRuang; x++) {
            c[x] = new ControlKelas();
            s[x] = new Sarana();
            b[x] = new Kebersihan();
            l[x] = new Lingkungan();
            k[x] = new Kenyamanan();
            a[x] = new Keamanan();
        }
    }

    public static void main(String[] jaya) {
        
        Scanner in = new Scanner(System.in);
        //RuangKelas r=new RuangKelas("123", "GKB 1", "PBO Java");
        KelasTest KS = new KelasTest();
        
        try{
            ObjectInputStream is= new ObjectInputStream(new FileInputStream("data.ser"));
            KS= (KelasTest)is.readObject();
            is.close();
            for(int x=0; x< KS.banyakRuang; x++){
            KS.c[x].cetak();
                //s[x].cetakSarana();
                KS.s[x].cetak();
                KS.b[x].cetakKebersihan();
                KS.l[x].cetakLinkungan();
                KS.k[x].cetakKenyamanan();
                KS.a[x].cetakKeamanan();
        }
        }
        catch(Exception e){
            System.out.println("Belum ada data");
        }
        
        
        
        for (int x = 0; x < KS.banyakRuang; x++) {
            KS.c[x].data(null, null, null);
            //c[x].inputData();
            KS.c[x].hitungLuasRuang();
            KS.c[x].hitungBentukRuang();
            KS.c[x].inputKursi();
            KS.c[x].hitungRasioLuas();
            KS.c[x].inputPintuDanJendela();
            KS.c[x].analisisPintuDanJendela();

            KS.s[x].inputKelistrikan();
            KS.s[x].analisisKelistrikan();
            KS.s[x].inputLCD();
            KS.s[x].analisisLCD();
            KS.s[x].inputLampu();
            KS.s[x].analisisLampu();
            KS.s[x].inputKipasAngin();
            KS.s[x].analisisKipasAngin();
            KS.s[x].inputAC();
            KS.s[x].analisisAC();
            KS.s[x].inputInternet();
            KS.s[x].analisisInternet();
            KS.s[x].inputCCTV();
            KS.s[x].analisisCCTV();
            KS.b[x].inputKebersihan();

            KS.b[x].analisisKebersihan();
            KS.l[x].inputSirkulasiUdara();
            KS.l[x].analisisSirkulasiUdara();
            KS.l[x].inputPencahayaan();
            KS.l[x].analisisPencahayaan();
            KS.l[x].inputKelembapan();
            KS.l[x].analisisKelembapan();
            KS.l[x].inputSuhu();
            KS.l[x].analisisSuhu();

            KS.k[x].inputKebisingan();
            KS.k[x].analisisKebisingan();
            KS.k[x].inputBau();
            KS.k[x].analisisBau();
            KS.k[x].inputKebocoran();
            KS.k[x].analisisKebocoran();
            KS.k[x].inputKerusakan();
            KS.k[x].analisisKerusakan();
            KS.k[x].inputKeausan();
            KS.k[x].analisisKeausan();

            String edit = "y";
            while (edit.equals("y")) {
                KS.a[x].inputKekokohan();
                KS.a[x].analisisKekokohan();
                KS.a[x].inputKunciPintu();
                KS.a[x].analisisKunciPintu();
                KS.a[x].inputKunciJendela();
                KS.a[x].analisisKunciJendela();
                KS.a[x].inputKeamanan();
                KS.a[x].analisisKeamanan();

                System.out.println("edit (y/n): ");
                edit = in.nextLine();
                KS.c[x].inputBelajar();
                KS.c[x].analisisBelajar();
                //c[x].cetakControl();
                KS.c[x].cetak();
                //s[x].cetakSarana();
                KS.s[x].cetak();
                KS.b[x].cetakKebersihan();
                KS.l[x].cetakLinkungan();
                KS.k[x].cetakKenyamanan();
                KS.a[x].cetakKeamanan();

            }

        }
        try{
            ObjectOutputStream os= new ObjectOutputStream(new FileOutputStream("data.ser"));
            os.writeObject(KS);
            os.close();
        }
        catch(Exception e){
            System.out.println("Belum ada data");
            e.printStackTrace();
        }
    }
}

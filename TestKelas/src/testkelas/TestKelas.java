
package ruangkelas;
import java.util.Scanner;

public class KelasTest {

    public static void main(String[] jaya) {
        Scanner in=new Scanner(System.in);
        //RuangKelas r=new RuangKelas("123", "GKB 1", "PBO Java");
        ControlKelas[] c = new ControlKelas[1];
        Sarana[] s=new Sarana[1];
        Kebersihan[] b=new Kebersihan[1];
        Lingkungan[] l=new Lingkungan[1];
        Kenyamanan[] k=new Kenyamanan[1];
        Keamanan[] a=new Keamanan[1];
        for (int x = 0; x < c.length; x++) {
            c[x] = new ControlKelas();
            s[x]=new Sarana();
            b[x]=new Kebersihan();
            l[x]=new Lingkungan();
            k[x]=new Kenyamanan();
            a[x]=new Keamanan();
            c[x].data(null, null, null);
            //c[x].inputData();
            c[x].hitungLuasRuang();
            c[x].hitungBentukRuang();
            c[x].inputKursi();
            c[x].hitungRasioLuas();
            c[x].inputPintuDanJendela();
            c[x].analisisPintuDanJendela();
            
            s[x].inputKelistrikan();
            s[x].analisisKelistrikan();
            s[x].inputLCD();
            s[x].analisisLCD();
            s[x].inputLampu();
            s[x].analisisLampu();
            s[x].inputKipasAngin();
            s[x].analisisKipasAngin();
            s[x].inputAC();
            s[x].analisisAC();
            s[x].inputInternet();
            s[x].analisisInternet();
            s[x].inputCCTV();
            s[x].analisisCCTV();
            b[x].inputKebersihan();
            
            b[x].analisisKebersihan();
            l[x].inputSirkulasiUdara();
            l[x].analisisSirkulasiUdara();
            l[x].inputPencahayaan();
            l[x].analisisPencahayaan();
            l[x].inputKelembapan();
            l[x].analisisKelembapan();
            l[x].inputSuhu();
            l[x].analisisSuhu();
            
            k[x].inputKebisingan();
            k[x].analisisKebisingan();
            k[x].inputBau();
            k[x].analisisBau();
            k[x].inputKebocoran();
            k[x].analisisKebocoran();
            k[x].inputKerusakan();
            k[x].analisisKerusakan();
            k[x].inputKeausan();
            k[x].analisisKeausan();
            
            String edit = "y";
            while(edit.equals("y")){
            a[x].inputKekokohan();
            a[x].analisisKekokohan();
            a[x].inputKunciPintu();
            a[x].analisisKunciPintu();
            a[x].inputKunciJendela();
            a[x].analisisKunciJendela();
            a[x].inputKeamanan();
            a[x].analisisKeamanan();
            
            System.out.println("edit (y/n): ");
            edit = in.nextLine();
            c[x].inputBelajar();
            c[x].analisisBelajar();
            //c[x].cetakControl();
            c[x].cetak();
            //s[x].cetakSarana();
            s[x].cetak();
            b[x].cetakKebersihan();
            l[x].cetakLinkungan();
            k[x].cetakKenyamanan();
            a[x].cetakKeamanan();
            
            }
        }
    }
}

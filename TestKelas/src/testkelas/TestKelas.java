
package ruangkelas;

import java.util.Scanner;

public class KelasTest {

    public static void main(String[] jaya) {
        Scanner in=new Scanner(System.in);
        RuangKelas r=new RuangKelas("123", "GKB 1", "PBO Java");
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
            //c[x].input1();
            c[x].hitungLuasRuang();
            c[x].hitungBentukRuang();
            c[x].input2();
            c[x].hitungRasioLuas();
            c[x].input3();
            c[x].analisisPintuDanJendela();
            s[x].input4();      
            s[x].analisisKelistrikan();
            s[x].input5();
            s[x].analisisLCD();
            s[x].input6();
            s[x].analisisLampu();
            s[x].input7();
            s[x].analisisKipasAngin();
            s[x].input8();
            s[x].analisisAC();
            s[x].input9();
            s[x].analisisInternet();
            s[x].input10();
            s[x].analisisCCTV();
            b[x].inputkebersihan();
            b[x].analisisKebersihan();
            /*kelas[x].input11();
            kelas[x].analisisKebersihanLantai();
            kelas[x].input12();
            kelas[x].analisisKebersihanDinding();
            kelas[x].input13();
            kelas[x].analisisKebersihanAtap();
            kelas[x].input14();
            kelas[x].analisisKebersihanPintu();
            kelas[x].input15();
            kelas[x].analisisKebersihanJendela();*/
            l[x].input16();
            l[x].analisisSirkulasiUdara();
            l[x].input17();
            l[x].analisisPencahayaan();
            l[x].input18();
            l[x].analisisKelembapan();
            l[x].input19();
            l[x].analisisSuhu();
            k[x].input20();
            k[x].analisisKebisingan();
            k[x].input21();
            k[x].analisisBau();
            k[x].input22();
            k[x].analisisKebocoran();
            k[x].input23();
            k[x].analisisKerusakan();
            k[x].input24();
            k[x].analisisKeausan();
            //mulai:
            String edit = "y";
            while(edit.equals("y")){
            a[x].input25();
            a[x].analisisKekokohan();
            a[x].input26();
            a[x].analisisKunciPintu();
            a[x].input27();
            a[x].analisisKunciJendela();
            a[x].input28();
            a[x].analisisKeamanan();
            
            System.out.println("edit (y/n): ");
            edit = in.nextLine();
            c[x].cetakControl();
            s[x].cetakSarana();
            b[x].cetakKebersihan();
            l[x].cetakLinkungan();
            k[x].cetakKenyamanan();
            a[x].cetakKeamanan();
            
            }
        }
    }
}

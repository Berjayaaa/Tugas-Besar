/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruangkelas;
import com.sun.org.apache.bcel.internal.generic.GOTO;
import java.util.Scanner;
/**
 *
 * @author Berjayaaa
 */
public class KelasTest {

    public static void main(String[] okeh) {
        Scanner in=new Scanner(System.in);
        ControlKelas[] kelas = new ControlKelas[1];
        for (int a = 0; a < kelas.length; a++) {
            kelas[a] = new ControlKelas();
            kelas[a].input1();
            kelas[a].hitungLuasRuang();
            kelas[a].hitungBentukRuang();
            kelas[a].input2();
            kelas[a].hitungRasioLuas();
            kelas[a].input3();
            kelas[a].anlisisPintuDanJendela();
            kelas[a].input4();
            kelas[a].analisisKelistrikan();
            kelas[a].input5();
            kelas[a].analisisLCD();
            kelas[a].input6();
            kelas[a].analisisLampu();
            kelas[a].input7();
            kelas[a].analisisKipasAngin();
            kelas[a].input8();
            kelas[a].analisisAC();
            kelas[a].input9();
            kelas[a].analisisInternet();
            kelas[a].input10();
            kelas[a].analisisCCTV();
            kelas[a].input11();
            kelas[a].analisisKebersihanLantai();
            kelas[a].input12();
            kelas[a].analisisKebersihanDinding();
            kelas[a].input13();
            kelas[a].analisisKebersihanAtap();
            kelas[a].input14();
            kelas[a].analisisKebersihanPintu();
            kelas[a].input15();
            kelas[a].analisisKebersihanJendela();
            kelas[a].input16();
            kelas[a].analisisSirkulasiUdara();
            kelas[a].input17();
            kelas[a].analisisPencahayaan();
            kelas[a].input18();
            kelas[a].analisisKelembapan();
            kelas[a].input19();
            kelas[a].analisisSuhu();
            kelas[a].input20();
            kelas[a].analisisKebisingan();
            kelas[a].input21();
            kelas[a].analisisBau();
            kelas[a].input22();
            kelas[a].analisisKebocoran();
            kelas[a].input23();
            kelas[a].analisisKerusakan();
            kelas[a].input24();
            kelas[a].analisisKeausan();
            //mulai:
            String edit = "y";
            while(edit.equals("y")){
            kelas[a].input25();
            kelas[a].analisisKekokohan();
            kelas[a].input26();
            kelas[a].analisisKunciPintu();
            kelas[a].input27();
            kelas[a].analisisKunciJendela();
            kelas[a].input28();
            kelas[a].analisisKeamanan();
            kelas[a].cetak();
            
            System.out.println("edit (y/n): ");
            edit = in.nextLine();
            
            }
        }
    }
}



package testkelas;


public class Kebersihan {
    String kondisi;
    int totSesuai;
    String analisisKebersihan(){
        if(kondisi.equals("bersih")){
            System.out.println("Kondisi dinding SESUAI");
            totSesuai++;
        }
        else{
            System.out.println("KOndisi dinding TIDAK SESUAI");
        }
        System.out.println("-------------------------------------------------");
        return null;
    }
}

package odev;
import java.util.Scanner;
public class kdv_odev {
    public static void main(String[]args){
        double kdv;
        double paraMik;
        double kdvLiTutar;
        Scanner input=new Scanner(System.in);
        System.out.println("Para değeri girin");
        paraMik=input.nextDouble();
        if(paraMik>0 && paraMik<1000){
            kdv=0.18;
            kdvLiTutar=paraMik*kdv;
            System.out.println("Kdv li tutar:"+kdvLiTutar);
        }
        else if(paraMik>1000){
            kdv=0.08;
            kdvLiTutar=paraMik*kdv;
            System.out.println("Kdv li tutar:"+kdvLiTutar);
        }
        else{
            System.out.println("Kdv tutarı hesaplanamadı.");
        }





    }
}

import java.util.Scanner;

public class ManavKasaProgramı {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b,c,d,e;
        double Armut=2.14;
        double Elma= 3.67;
        double Domates=1.11;
        double Muz=0.95;
        double Patlıcan=5.00;
        System.out.println("Armut Kaç Kilo ? :");
        a=input.nextInt();
        System.out.println("Elma Kaç Kilo ? :");
        b=input.nextInt();
        System.out.println("Domates Kaç Kilo ? :");
        c=input.nextInt();
        System.out.println("Muz Kaç Kilo ? :");
        d=input.nextInt();
        System.out.println("Patlıcan Kaç Kilo ? :");
        e=input.nextInt();

        double toplamTutar=Armut*a+Elma*b+Domates*c+Muz*d+Patlıcan*e;

        System.out.println("Toplam Tutar : "+toplamTutar);
    }
}

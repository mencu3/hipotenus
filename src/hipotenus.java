import java.util.Scanner;

public class hipotenus {
    public static void main (String [] args ){
        int a,b;
        double c;

        Scanner ucgen = new Scanner(System.in);

        System.out.print("1.Kenarı giriniz");
        a = ucgen.nextInt();
        System.out.print("2.Kenarı giriniz");
        b = ucgen.nextInt();
        c = Math.sqrt((a*a) + (b*b));
        System.out.print("Hipotenus:" + c);



    }
}

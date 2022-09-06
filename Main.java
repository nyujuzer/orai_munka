


public class Main {//Ez alapból legenerálódik. A Main helyett a file neve kell oda


    public static void main(String[] args){//ez is alapból ott van

            double a = 1; //itt deklaráljuk a változót. double  a típus, "a" a neve, 9 az érték
            double b = 2;
            double c = 1;

            /*órán vettük a másodfokú egyenlet megoldást, aminek a képlete:
            -b+|-//(b^2 - 4*a*c)2*a

            ezt sokféle módon lehet megoldani, de amelyiket most vettük az a változós megoldás
             */

            double a_szor_kettő = 2*a;              //jobb, ha lépésekre szedve rakjuk össze az egyenletet.
            double b_a_másodikra = Math.pow(b,2);
            double negyszer_a_c = 4* a * c;


            System.out.println((-b)+(Math.sqrt(b_a_másodikra-negyszer_a_c))/a_szor_kettő);
            System.out.println((-b)-(Math.sqrt(b_a_másodikra-negyszer_a_c))/a_szor_kettő);





    }
}
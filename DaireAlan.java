import java.util.Scanner;

public class DaireAlan {
    
    public static void main(String[] args){

        double yarıcap, acıÖlcüsü, pi=3.14, alan;
        
        Scanner inp = new Scanner(System.in);

        System.out.println("Please login your radius : ");
        yarıcap = inp.nextDouble();

        System.out.println("Please login your angel : ");
        acıÖlcüsü = inp.nextDouble();

        alan = (pi*acıÖlcüsü*(yarıcap*yarıcap))/360;
        System.out.println(" Area of your circle slice : " + alan);

    }
}

import java.util.Scanner;

public class omvanling {
	

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Läs in hastighet i knop
        System.out.print("Skriv in en hastighet i knop: ");
        double knop = scan.nextDouble();

        // Konvertera knop till km/h
        double kmh = knop * 1.852;

        // Visa resultatet
        System.out.printf("%.2f knop motsvarar %.2f km/h", knop, kmh);
        
     // stäng scanner-objektet
        scan.close(); 
    }
}


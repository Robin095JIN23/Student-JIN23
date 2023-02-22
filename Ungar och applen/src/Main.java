import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //scanner object
        Scanner input = new Scanner(System.in);


// Ta in input
        System.out.println("Hur många äpplen har Kalle? ");
        int kalle = input.nextInt();

        System.out.println("Hur många äpplen har Pelle? ");
        int pelle = input.nextInt();

// Bearbeta
        int tillsammans = kalle + pelle;

// Leverera resultat
        System.out.println("De har " + tillsammans + " äpplen tillsammans");

    }
}


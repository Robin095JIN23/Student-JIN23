import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Skriv din kod här

        Scanner input = new Scanner(System.in);
        // Deklarera.


        //ta in input
        System.out.println("how many times has Samuel L jackson used the MF-Word?");
        int mofo= input.nextInt();

        System.out.println("in how many movies?");
        int movies= input.nextInt();

        int per_movie = mofo/movies;
        //bearbetning
        System.out.println("Samuel L Jacksson says mofo in " + per_movie/6.3+ " movies");


    }

}
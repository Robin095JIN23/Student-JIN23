mport java.util.Scanner;

public class Main {
    public static void main(String[] var0) {

        Scanner var1 = new Scanner(System.in);
        System.out.println("Hej igen, ditt förnamn tack: ");

        String förnamn = var1.next(); //converta input (förnamn) till en string och går till nästa linje.

        System.out.println("Tack "+ förnamn + (" ,ditt efternamn please :"));

        String efternamn = var1.next(); //converta input (efternamn) till en string och går till nästa linje.

        System.out.println("Hej igen! Tack " + förnamn + efternamn + (" för ditt fullständiga namn")); //printar ut båda strings och sätter i hop dem med ett + tecken.


    }
}

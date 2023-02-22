import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //scanner object
        Scanner input = new Scanner(System.in);


// personlig info/////////
       System.out.println("vad är din födelseår");
        int födelseår = input.nextInt();

      System.out.println("vad är din födelsemånad");
       String födelsemånad = input.next();

      System.out.println("vad är din födelsedag");
       int dag = input.nextInt();
  ///////////////////////////

      System.out.println("vad är det för år idag?");
       int år_nu = input.nextInt();

       System.out.println("vad är det för månad idag?");
       int månad_nu = input.nextInt();

       System.out.println("vad är det för dag idag?");
        int dag_nu = input.nextInt();

        int årlevda = år_nu - födelseår;

        int dagarlevda = dag_nu - dag;

        System .out.println("du har levt i " + årlevda + " år och " + dagarlevda + " dagar");


    }
}
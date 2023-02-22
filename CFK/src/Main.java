import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //creates a scanner object

        System.out.println("Welcome to the temperature converter");
        System.out.println("Please select a category");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");

        int category = input.nextInt();//allows the user to input a number

        if (category == 1) { //if the user selects celsius
            System.out.println("Celsius");
            System.out.println("Please select a conversion");
            System.out.println("1. Celsius -> Fahrenheit");
            System.out.println("2. Celsius -> Kelvin");

            int conversion = input.nextInt();

            if (conversion == 1) { //if the user selects fahrenheit
                System.out.println("Celsius -> Fahrenheit");
                System.out.println("Please enter the temperature in Celsius");

                double celsius = input.nextDouble(); //converts the input to a double
                double fahrenheit = (celsius * 1.8) + 32; //  converts the temperature to fahrenheit

                System.out.println(celsius + "°C is " + fahrenheit + "°F"); //prints the temperature in fahrenheit
                //if the user enter not a number it will send an error message

            }
            if (conversion == 2) { //if the user selects kelvin
                System.out.println("Celsius -> Kelvin");
                System.out.println("Please enter the temperature in Celsius");

                double celsius = input.nextDouble(); //converts the input to a double
                double kelvin = celsius + 273.15; //Celsius= kelvin if you add 273.15

                System.out.println(celsius + "°C is " + kelvin + "K"); //prints the temperature in kelvin

            }

        }
        if (category == 2) { //if the user selects fahrenheit
            System.out.println("Fahrenheit");
            System.out.println("Please select a conversion");
            System.out.println("1. Fahrenheit -> Celsius");
            System.out.println("2. Fahrenheit -> Kelvin");

            int conversion = input.nextInt(); //converts the input to an integer

            if (conversion == 1) { //if the user selects Fahrenheit -> Celsius
                System.out.println("Fahrenheit -> Celsius");
                System.out.println("Please enter the temperature in Fahrenheit");

                double fahrenheit = input.nextDouble();
                double celsius = (fahrenheit - 32) / 1.8; //celsius = fahrenheit if you subtract 32 and divide by 1.8
                System.out.println(fahrenheit + "°F is " + celsius + "°C");


            }
            if (conversion == 2) { //if the user selects Fahrenheit -> Kelvin
                System.out.println("Fahrenheit -> Kelvin");
                System.out.println("Please enter the temperature in Fahrenheit");

                double fahrenheit = input.nextDouble();
                double kelvin = (fahrenheit + 459.67) / 1.8; //kelvin = fahrenheit if you add 459.67 and divide by 1.8
                System.out.println(fahrenheit + "°F is " + kelvin + "K");

            }

        }

        if (category == 3) { //if the user selects kelvin
            System.out.println("Kelvin");
            System.out.println("Please select a conversion");
            System.out.println("1. Kelvin -> Celsius");
            System.out.println("2. Kelvin -> Fahrenheit");

            int conversion = input.nextInt();

            if (conversion == 1) { //if the user selects Kelvin -> Celsius
                System.out.println("Kelvin -> Celsius");
                System.out.println("Please enter the temperature in Kelvin");

                double kelvin = input.nextDouble(); //double is used for decimal numbers
                double celsius = kelvin - 273.15; //celsius = kelvin if you subtract 273.15

                System.out.println(kelvin + "K is " + celsius + "°C");
            }
            if (conversion == 2) { //if the user selects Kelvin -> Fahrenheit
                System.out.println("Kelvin -> Fahrenheit");
                System.out.println("Please enter the temperature in Kelvin");

                double kelvin = input.nextDouble();
                double fahrenheit = kelvin * 1.8 - 459.67; //fahrenheit = kelvin if you multiply by 1.8 and subtract 459.67

                System.out.println(kelvin + "K is " + fahrenheit + "°F");

            }


        }else { //if the user enters a number that is not on in the menu
            System.out.println("Please enter a valid number");

        }
    }
}

//notes:
// Double is used for decimal numbers
// Integer is used for whole numbers
// no else statement is needed because the program does not need a condition to be false
// added a else statement to the end of the program to print a message if the user enters a number that is not 1, 2, or 3
//that is all for now/Tack och hej,lever pastej.
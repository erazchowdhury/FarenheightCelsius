import java.util.Scanner;

public class Converter {

    public static void main(String[] args) {

        Scanner stdin =  new Scanner(System.in);
        double tempToBeConverted;
        double tempToConvertTo;
        String conversionMode;
        int answer;


        System.out.println("-----------------------------------Welcome------------------------------------------\n" +
                "---Celsius-Fahrenheit/Fahrenheit-Celsius converter----");

        do {
            System.out.println("choose the conversion mode:\n" +
                    "1- Celsius-Fahrenheit\n" +
                    "2- Fahrenheit-Celsius");
            conversionMode = stdin.nextLine();

            while (!(conversionMode.equals("1")) && !(conversionMode.equals("2"))) {
                System.out.println("Invalid entry try again");
                System.out.println("choose the conversion mode:\n" +
                        "1- Celsius-Fahrenheit\n" +
                        "2- Fahrenheit-Celsius");
                conversionMode = stdin.nextLine();
            }

            if (conversionMode.equals("1")) {
                System.out.println("Enter the temperature to convert: ");
                tempToBeConverted = stdin.nextDouble();
                tempToConvertTo = (tempToBeConverted*9/5)+32;
                System.out.println( tempToBeConverted + " F ------------------>" + tempToConvertTo + " C");

            } else {
                System.out.println("Enter the temperature to convert: ");
                tempToBeConverted = stdin.nextDouble();
                tempToConvertTo = (tempToBeConverted-32)*5/9;
                System.out.println( tempToBeConverted + " C ------------------>" + tempToConvertTo + " F");
            }

            System.out.println("do you want to convert other temperatures ? 1- Yes/2- No");
            answer = stdin.nextInt();
            while ((answer != 1) && (answer != 2)) {
                System.out.println("Invalid entry try again");
                System.out.println("do you want to convert other temperatures ? 1- Yes/2- No");
                answer = stdin.nextInt();
            }

            } while (answer == 1);
        System.out.println("-------------------------------Good bye, see you soon---------------------------");

        System.out.println("Turgut Tezir");
    }

}

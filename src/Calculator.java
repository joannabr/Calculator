import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userAnswer;

        do {
            System.out.println("Dostępne menu (podaj liczbe):");
            System.out.println("1.Mnożenie");
            System.out.println("2.Dzielenie");
            System.out.println("3.Potęogowanie do dowolnego wykłądnika");
            System.out.println("4.Pierwiastek");
            System.out.println("5.Zamiana liczby całkowitej na liczbe binarna");
            System.out.println("6.Zamiana liczby binarnej na całkowitą");
            System.out.println("7.Największy wspólny dzielnik ");
            System.out.println("8.Srednia zbioru ");
        
            System.out.print("Twój wybór: ");
            userAnswer = scanner.nextLine();

            switch (userAnswer) {
                case "1": {
                    System.out.println("Podaj liczby które chcesz wymnożyć:");

                    double multi1 = Double.parseDouble(scanner.nextLine());
                    double multi2 = Double.parseDouble(scanner.nextLine());
                    double result = multi1 * multi2;

                    System.out.println("Wynik mnozenia: " + result);

                    break;
                }

                case "2": {
                    System.out.println("Podaj dzielną:");
                    int division1 = Integer.parseInt(scanner.nextLine());

                    System.out.println("Podaj dzielnik");
                    double result = 0;
                    int division2;
                    do {
                        division2 = Integer.parseInt(scanner.nextLine());

                        if (division2 == 0) {
                            System.out.println("Nie dzielimy przez 0, podaj dzielnik ponownie");
                        }
                        else
                            result = (double) division1 / division2;
                        break;
                    }while(division2 == 0);

                    System.out.println("Wynik dzielenia: " + result);
                    break;
                }

                case "3": {
                    System.out.println("Podaj liczbe: ");
                    int base = Integer.parseInt(scanner.nextLine());

                    System.out.println("Podaj wykladnik");
                    int index = Integer.parseInt(scanner.nextLine());
                    int result = 1;

                    if (!(index == 0))
                        for (int i1 = 0; i1 < index; i1++) {
                            result *= base;
                        }
                    else
                        result = 1;
                    System.out.println("Wynik: " + result);
                    break;
                }

                case "4": {
                    System.out.println("Podaj liczbe: ");
                    int sqrt = Integer.parseInt(scanner.nextLine());

                    double result =Math.sqrt(sqrt);
                    System.out.println("Wynik pierwiastkowania to: "+result);
                    break;
                }

                case "5": {
                    System.out.println("Podaj liczbe: ");
                    int number = Integer.parseInt(scanner.nextLine());

                    StringBuilder binary = new StringBuilder();
                    while(number != 0) {
                        binary.append(number % 2);
                        number /= 2;
                    }
                    System.out.println("Liczba w reprezentacji biarnej: "+binary.reverse().toString());
                    break;
                }

                case "6": {
                    System.out.println("Podaj liczbe: ");
                    int liczba1 = Integer.parseInt(scanner.nextLine());
                    String liczba2 = String.valueOf(liczba1);
                    int liczba3 = 0;

                    for (int i = 0; i < liczba2.length(); i++) {
                        int liczba4 = liczba2.charAt(i)*i;
                        liczba3 =+ liczba4;
                    }
                    System.out.println("Liczba po zamianie: " + liczba3);
                    break;
                }

                case("7"):{

                    System.out.println("Podaj pierwszą liczbę :");
                    int number1  = Integer.parseInt(scanner.nextLine());
                    System.out.println("Podaj drugą liczbę :");
                    int number2  = Integer.parseInt(scanner.nextLine());

                    while (number1 != number2)
                    {
                        if (number1 > number2){
                            number1 = number1 - number2;
                        }
                        else{
                            number2 = number2 - number1;
                        }
                    }
                    System.out.println("Wynik: "+number1);
                }

                case "8": {
                    System.out.println("Podaj liczebnosc zbioru: ");
                    int n = Integer.parseInt(scanner.nextLine());
                    int[] tab = new int[n];
                    int sum = 0;
                    for (int i = 0; i < tab.length; i++) {
                        System.out.println("Liczba: " + i + " w zbiorze:");
                        tab[i] = Integer.parseInt(scanner.nextLine());
                        sum += tab[i];
                    }
                    double srednia = (double) sum / tab.length;
                    System.out.println("Średnia zbioru wynosi: " + srednia);
                    break;
                }
                default: {
                    System.out.println("Nie znam takiej opcji");
                }
            }

        } while (!userAnswer.equals("exit"));
    }}
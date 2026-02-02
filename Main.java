import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 0;
        double d = 3.14;
        float f = 3.14F;
        long l = 123456789023456789L;

        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        String s3 = s2;
        System.out.println(s3.equals(s1));

        Integer comlexInt = 5;
        System.out.println("my int x =" + " "+ x+ " " + "my double d "+d);
        System.out.println(comlexInt.toString());

        boolean leapYear = true;
        int days = 0;

        for (int month = 1;month <= 12;month++) {
            switch (month) {
                case 1: // months with 31 days
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days += 31;
                    break;
                case 2: // February is a special case
                    if (leapYear)
                        days += 29;
                    else
                        days += 28;
                    break;
                default: // it must be a month with 30 days
                    days += 30;
                    break;
            }
        }
        System.out.println("number of days: " + days);


//        Часть 1: Примитивные типы и переменные
//        Обратите внимание на различия с Python: объявление типов, целочисленное деление,
//        char, boolean.
//                Задание 1: Игра с переменными
//        Создайте переменные следующих типов и выведите их на экран:
//• int
//• double
//• boolean
//• char
//• String
//        Требования:
//• Сохраните: ваш возраст, рост, значение isStudent, первую букву вашего имени и
//        ваше имя
//• Выведите каждое значение с понятным поясняющим сообщением


        int age = 20;
        double height = 1.62;
        boolean isStudent = true;
        char firstLetter = 'A';
        String name = "Ayana";

        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Is student: " + isStudent);
        System.out.println("First letter: " + firstLetter);
        System.out.println("Name: " + name);


//        Задание 2: Преобразование типов
//        1. Создайте переменную типа int со значением 7
//        2. Разделите её на 2
//        3. Выведите результат
//        4. Затем приведите число к типу double и разделите снова
//        5. Выведите новый результат




        int a = 7;

        int result1 = a / 2;
        System.out.println(result1);

        double result2 = (double) a / 2;
        System.out.println(result2);


//        Задание 3: Простой калькулятор
//        Выберите два числа и выведите:
//• Сумму
//• Разность
//• Произведение
//• Результат деления
//• Остаток от деления

        int a2 = 10;
        int b = 3;

        int sum2 = a2 + b;
        System.out.println("sum2 " + sum2);

        System.out.println("Sum: " + (a2 + b));
        System.out.println("Difference: " + (a2 - b));
        System.out.println("Product: " + (a2 * b));
        System.out.println("Division: " + (a2 / b));
        System.out.println("Remainder: " + (a2 % b));



//         Задание 4: Практика логических операторов
// Используйте две переменные:
// • age
// • hasStudentCard (true/false)
// Выведите:
// • "Discount allowed", если age < 18 ИЛИ hasStudentCard == true
// • "No discount" в противном случае
// Используйте:
// • ||
// • &&
// • !



        int age2 = 7;
        boolean hasStudentCard = false;

        if (age2 < 18 || hasStudentCard == true) {
            System.out.println("Discount allowed");
        } else {
            System.out.println("No discount");
        }



//Выберите число от 0 до 100 и выведите:
//• A (90–100)
//• B (80–89)
//• C (70–79)
//• D (60–69)
//• F (меньше 60)



        int score = 75;
        int grade = score / 10;

        switch (grade) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
        }



//        Выберите число от 1 до 7 и выведите:
//• 1 → Понедельник
//• 2 → Вторник
//• …
//• 7 → Воскресенье
//• default → Неверный день
//        Обязательно использовать switch




        int day =  5;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

//        Используя цикл for:
//• Выведите числа от 1 до 10
//• Выведите только чётные числа от 1 до 20

        for (int c = 1; c <= 10; c++) {
            System.out.println(c);
        }

        for (int v = 1; v <= 20; v++) {
            if (v % 2 == 0) {
                System.out.println(v);
            }
        }


//        Задание 8: Сумма чисел
//        Выберите число n
//        Используя цикл for, вычислите сумму чисел от 1 до n
//        Пример:
//        Ввод: 5 → Вывод: 15




        int n = 5;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("sum " + sum);

//        Задание 9: Таблица умножения
//        Выберите число и выведите таблицу умножения до 10
//        Пример для 3:
//        3 x 1 = 3
//        3 x 2 = 6
//...
//        3 x 10 = 30



        int num = 3;

        for (int i = 1; i <= 10; i++) {
            int umnoj = num * i;
            System.out.println(" ooo " + num + " x " + i + " = " + umnoj );
        }

//        Выберите число
//        Проверьте, является ли оно простым
//        Используйте:
//• цикл for
//• переменную типа boolean



        int number = 9;
        boolean isPrime = true;

        if (number <= 1); {
            isPrime = false;
        }

        for (int i = 2; i < number; i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime = true) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not prime number");
        }


//        Запросите у пользователя число
//        Вычислите факториал с помощью цикла for
//        Пример:
//        5 → 120



        Scanner input = new Scanner(System.in);

        int n3 = input.nextInt();
        int result = 1;

        for (int i = 1; i <= n3; i = i + 1) {
            result = result * i;
        }

        System.out.println(result);



    }

}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Task_3_1();
        Task_3_2();
        Task_3_3();
        Task_3_4();
        Task_3_5_a();
        Task_3_5_b();
    }

    private static void Task_3_1() {
        System.out.println("Задание №3.1");
        System.out.println("Умножение 123456789 на 9, 18, 27 ... 81");
        int a = 12345679;
        int counter = 0;
        int result = 0;
        while (counter < 81) {
            counter += 9;
            result = a * counter;
            System.out.println("Результат умножения на " + counter + " = " + result);
        }
    }

    private static void Task_3_2() {
        System.out.println();
        System.out.println("Задание №3.2");
        System.out.println("Выведение таблицы умножения на 7:");
        int result = 0;
        for (int i = 1; i < 11; i++) {
            result = 7 * i;
            System.out.println(i + " * 7 = " + result);
        }
    }

    private static void Task_3_3() {
        System.out.println();
        System.out.println("Задание №3.3");
        System.out.println("Таблица начений Sin 2, 3, 4 ... 20");
        double i = 1;
        double result = 0;
        while (i < 20) {
            i++;
            result = Math.sin(i);
            System.out.println("Sin " + i + " = " + result);
        }
    }

    private static void Task_3_4() {
        System.out.println();
        System.out.println("Задание №3.4");
        System.out.println("Факториалы и все такое");
        System.out.print("Введите значение х: ");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double fact = 1;
        double res = 0;
        double sum = 0;
        int sign = -1;
        for (int n = 1; n <= 13; n += 2) {
            for (int j = 1; j <= n; j++) {
                fact *= j;
            }
            sign *= -1;
            res = sign * (Math.pow(x, n) / fact);
            System.out.println("Итерация " + n + ": " + res);
            sum += res;
        }
        System.out.println("\nОбщий результат: " + sum);
    }

    private static void Task_3_5_a() {
        System.out.println();
        System.out.println("Задание №3.5.a");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение начала отрезка (a): ");
        double a = sc.nextDouble();
        System.out.print("Введите значение конца отрезка (b): ");
        double b = sc.nextDouble();
        System.out.print("Введите значение шага (h) для поиска значений функции: ");
        double h = sc.nextDouble();
        double F = 0;
        for (double i = a; i <= b; i += h) {
            F = Math.tan(i);
            System.out.println("Значение функции в точке " + i + " равно " + F);
        }
    }

    private static void Task_3_5_b() {
        System.out.println();
        System.out.println("Задание №3.5.b");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение начала отрезка (a): ");
        double a = sc.nextDouble();
        System.out.print("Введите значение конца отрезка (b): ");
        double b = sc.nextDouble();
        System.out.print("Введите значение шага (h) для поиска значений функции: ");
        double h = sc.nextDouble();
        double x = 0;
        double F = 0;
        for (x = a; x < b; x += h) {
            F = (1 / Math.tan(x)) + 1;
            System.out.println("Результат вычислений для значения х " + x + " равен " + F);
        }
    }
}
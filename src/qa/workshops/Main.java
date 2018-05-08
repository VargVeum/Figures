package qa.workshops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int wantToContinue;
        int sign = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Выберите фигуру для расчета площади: " +
                    "\n 1 - Triangle (Треугольник), 2 - Circle (Круг), 3 - Square (Квадрат), 4 - Rectangle (Прямоугольник)");
            try {
                sign = scanner.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println(ex.toString());
            }

            switch (sign) {
                case 1:
                    triangle();
                    break;
                case 2:
                    circle();
                    break;
                case 3:
                    square();
                    break;
                case 4:
                    rectangle();
                    break;
            }
            System.out.println("Вы хотите продолжить? y - Да, n - Нет");
            wantToContinue = scanner.next().charAt(0);
        }
        while (wantToContinue == 'Y' || wantToContinue == 'y');

        System.out.println("Количество фигур: " + Figure.getCounter());
    }

    private static void rectangle() {
        try {
            Rectangle rectangle = new Rectangle();
            rectangle.showArea();
        } catch (InputMismatchException ex){
            System.out.println("Неправильно введенный формат данных!");
        }

    }

    private static void square() {
        try {
            Square square = new Square();
            square.showArea();
        } catch (InputMismatchException ex) {
            System.out.println("Неправильно введенный формат данных!");
        }
    }

    private static void triangle() {
        try {
            Triangle triangle = new Triangle();
            triangle.showArea();
        } catch (InputMismatchException ex) {
            System.out.println("Неправильно введенный формат данных!");
        }

    }

    private static void circle() {
        try {
            Circle circle = new Circle();
            circle.showArea();
        } catch (InputMismatchException ex) {
            System.out.println("Неправильно введенный формат данных!");
        }

    }

}

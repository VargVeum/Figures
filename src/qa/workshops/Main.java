package qa.workshops;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Triangle triangle = new Triangle();
//        triangle.showArea();

//        Circle circle = new Circle();
//        circle.showArea();

//        Square square = new Square();
//        square.showArea();

//        Rectangle rectangle = new Rectangle();
//        rectangle.showArea();

        int triangle;
        int circle;
        int square;
        int rectangle;
        int wantToContinue;
        int sign = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            try {
                System.out.println("Выберите фигуру для расчета площади: " +
                        "\n 1 - Triangle (Треугольник), 2 - Circle (Круг), 3 - Square (Квадрат), 4 - Rectangle (Прямоугольник)");
                sign = scanner.nextInt();
            }
            catch (Exception ex) {
                System.out.println(ex.toString());
            }

            switch(sign){
                case 1:
                    do {
                        Triangle triangle = new Triangle();
                        triangle.showArea();
                    }
                    break;
                case 2:
                    result=number1-number2;
                    System.out.println(result);
                    break;
                case 3:
                    result=number1*number2;
                    System.out.println(result);
                    break;
                case 4:
                    result=number1/number2;
                    System.out.println(result);
                    break;
            }
            System.out.println("Вы хотите продолжить? y - Да, n - Нет");
            wantToContinue = scanner.next().charAt(0);
        }
            while (wantToContinue == 'Y' || wantToContinue == 'y' );

        }

    }

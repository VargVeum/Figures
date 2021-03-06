package qa.workshops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangle extends Figure {
    private double width;
    private double height;

    public Triangle() throws InputMismatchException {
        getParametersFromUser();
    }

    public void showArea() {
        double area = (width * height) / 2;
        System.out.println("Площадь треугольника равна: " + ConsoleColors.ANSI_BLUE + area + ConsoleColors.ANSI_RESET);
    }

    private void getParametersFromUser() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ширину треугольника:");
        width = scanner.nextDouble();

        System.out.println("Введите высоту треугольника:");
        height = scanner.nextDouble();
    }
}

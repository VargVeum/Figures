package qa.workshops;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Rectangle extends Figure {

    public double width;
    public double length;

    public Rectangle() throws InputMismatchException {
        getParametersFromUser();
    }

    public void getParametersFromUser() throws InputMismatchException  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ширину прямоугольника:");
        length = scanner.nextDouble();
        System.out.println("Введите высоту прямоугольника:");
        width = scanner.nextDouble();

    }

    public void showRectangleArea(){
        double area = length * width;
        System.out.println("Площадь прямоугольника равна: " + ConsoleColors.ANSI_BLUE + area + ConsoleColors.ANSI_RESET);
    }

    @Override
    public void showArea() {
        showRectangleArea();
    }

}


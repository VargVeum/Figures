package qa.workshops;

abstract public class Figure {
    static int counter;

    public Figure(){
        counter++;
    }

    public static int getCounter(){
        return counter;
    }

    public abstract void showArea();

}


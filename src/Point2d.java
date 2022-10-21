// класс двумерной точки
public class Point2d {
    // координаты
    private double xCoord;
    private double yCoord;

    // конструкор
    public Point2d (double x, double y) {
        xCoord = x;
        yCoord = y;
    }
    // конструктор по умолчанию
    public Point2d () {
        this(0, 0);
    }

    // получение первой координаты
    public double getX () {
        return xCoord;
    }

    // получение второй координаты
    public double getY () {
        return yCoord;
    }

    // изменение первой координаты
    public void setX ( double val) {
        xCoord = val;
    }

    // изменение второй координаты
    public void setY ( double val) {
        yCoord = val;
    }
}

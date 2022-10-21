import java.math.BigDecimal;
import java.math.RoundingMode;

// класс описывающий точку в трехмерном пространстве
public class Point3d extends Point2d{
    // третья координата
    private double zCoord;

    // конструктор
    public Point3d(double x,double y, double z) {
        super(x, y);
        zCoord = z;
    }

    // конструктор по умолчанию
    public Point3d() {
        this(0.0,0.0, 0.0);
    }
    // получение третьей координаты
    public double getZ() {
        return zCoord;
    }
    // изменение третьей координаты
    public void setZ(double z) {
        this.zCoord = z;
    }

    // сравнивает две точки по их координатам
    public boolean equals(Point3d other) {
        double firstX = this.getX();
        double firstY = this.getY();
        double firstZ = this.getZ();
        double secondX = other.getX();
        double secondY = other.getY();
        double secondZ = other.getZ();
        return (firstX == secondX) &&
                (firstY == secondY) &&
                (firstZ == secondZ);
    }

    // возвращает расстояние между выбранными точками
    public double distanceTo(Point3d other) {
        BigDecimal bd = BigDecimal.valueOf(Math.sqrt(Math.pow(this.getX() - other.getX(), 2) +
                Math.pow(this.getY() - other.getY(), 2) +
                Math.pow(this.getZ() - other.getZ(), 2)));
        return bd.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
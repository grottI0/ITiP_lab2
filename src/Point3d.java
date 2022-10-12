import java.math.BigDecimal;
import java.math.RoundingMode;

// класс описывающий точку в трехмерном пространстве
public class Point3d {
    private double xCoord;
    private double yCoord;
    private double zCoord;

    // конструктор
    public Point3d(double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }

    // конструктор по умолчанию
    public Point3d() {
        this(0.0,0.0,0.0);
    }

    // возвращают одну из координат
    public double getX() {
        return xCoord;
    }

    public double getY() {
        return yCoord;
    }

    public double getZ() {
        return zCoord;
    }

    // изменяют одну из координат
    public void setX(double x) {
        this.xCoord = x;
    }

    public void setY(double y) {
        this.yCoord = y;
    }

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
        return (Math.abs(firstX - secondX) < 0.00001) &&
               (Math.abs(firstY - secondY) < 0.00001) &&
               (Math.abs(firstZ - secondZ) < 0.00001);
    }

    // возвращает расстояние между выбранными точками
    public double distanceTo(Point3d other) {
        BigDecimal bd = BigDecimal.valueOf(Math.sqrt(Math.pow(this.getX() - other.getX(), 2) +
                                           Math.pow(this.getY() - other.getY(), 2) +
                                           Math.pow(this.getZ() - other.getZ(), 2)));
        return bd.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}

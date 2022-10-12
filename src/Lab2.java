public class Lab2 {
    public static void main(String[] args) {
        Point3d first = new Point3d(Double.parseDouble(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2]));
        Point3d second = new Point3d(Double.parseDouble(args[3]), Double.parseDouble(args[4]), Double.parseDouble(args[5]));
        Point3d third = new Point3d(Double.parseDouble(args[6]), Double.parseDouble(args[7]), Double.parseDouble(args[8]));

        if (first.comparePoints(second) || first.comparePoints(third) || second.comparePoints(third)) {
            System.out.println("Среди введенных точек есть одинаковые!");
        } else {
            System.out.println("Площадь равна " + computeArea(first, second, third));
        }
    }

    static double computeArea(Point3d first, Point3d second, Point3d third) {
        double firstSecond = first.distanceTo(second);
        double secondThird = second.distanceTo(third);
        double thirdFirst = third.distanceTo(first);
        double halfPerimeter = (firstSecond + secondThird + thirdFirst) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - firstSecond) * (halfPerimeter - secondThird) * (halfPerimeter - thirdFirst));
    }
}

package ru.job4j.condition;

public class Triangle {

    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }


    public double period(Triangle triangle) {
        return (triangle.first.distance(triangle.second) + triangle.first.distance(triangle.third)
                + triangle.second.distance(triangle.third)) / 2;
    }


    public double area(Triangle triangle) {
        double rsl = -1;
        double p = period(triangle);
        if (this.exist(triangle)) {
            return Math.sqrt(p * (p - triangle.first.distance(triangle.second)) *
                    (p - triangle.first.distance(triangle.third)) * (p - triangle.second.distance(triangle.third)));

        }
        return rsl;
    }


    public boolean exist(Triangle triangle) {
        return (triangle.first.distance(triangle.second) + triangle.first.distance(triangle.third) > triangle.second.distance(triangle.third) &&
                triangle.second.distance(triangle.third) + triangle.first.distance(triangle.third) > triangle.first.distance(triangle.second) &&
                triangle.first.distance(triangle.second) + triangle.second.distance(triangle.third) > triangle.first.distance(triangle.third));


    }
}

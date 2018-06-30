package Domain.Shape.Models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class PolygonTest {

    @Test
    void createLine() {
        try {
            Polygon polygon = new Polygon(null);
            fail("Points can't be null");
        } catch (Exception e) {
            fail(e.getMessage());
        }

        Point[] points = new Point[]{};

        try {
            Polygon polygon = new Polygon(points);
            fail("Points length point can't be 0");
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    void containPointsPolygon() {
        Point[] points = new Point[]{new Point(1, 2)};
        try {
            Polygon polygon = new Polygon(points);
            assertEquals(1, polygon.getNumberOfPoints());
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}
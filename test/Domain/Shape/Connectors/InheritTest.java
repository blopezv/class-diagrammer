package Domain.Shape.Connectors;

import Domain.Shape.Classes.NormalClass;
import Domain.Shape.Models.Point;
import Domain.Shape.Models.Size;
import Domain.Shape.Shape;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Created by brenda on 29/06/2018.
 */
public class InheritTest {
    @Test
    void createConnector(){
        Point positionPointA = new Point(100, 100);
        Size sizeA = new Size(100, 100);
        String textA = "A";

        Point positionPointB = new Point(300, 300);
        Size sizeB = new Size(100, 100);
        String textB = "B";

        try {
            Shape shape = null;
            Inherit connector = new Inherit();
            shape = connector.createConnector(new NormalClass(positionPointA, sizeA, textA),
                    new NormalClass(positionPointB, sizeB, textB));

            assertEquals(true, shape != null, "Connector Inherit");
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}
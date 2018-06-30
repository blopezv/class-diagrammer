package Domain.Persistence;

import Domain.Board.Board;
import Domain.Shape.Classes.NormalClass;
import Domain.Shape.Models.Point;
import Domain.Shape.Models.Size;
import Domain.Shape.ObjectsToDraw;
import Domain.Shape.Shape;
import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.fail;

/**
 * Created by Brenda on 28/06/2018.
 */
public class FileTest {
    @Test
    void Save() {

        List<Shape> shapes = new ArrayList<>(0);
        Point startPoint = new Point(0, 0);
        Size size = new Size(100, 100);
        String text = "Text Sample";

        NormalClass normalClass = null;
        try{
            normalClass = new NormalClass(startPoint, size, text);
            shapes.add(normalClass);

            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("test"));
            out.writeObject(shapes);
            out.close();

        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}

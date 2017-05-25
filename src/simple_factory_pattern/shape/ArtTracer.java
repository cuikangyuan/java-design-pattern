package simple_factory_pattern.shape;

/**
 * Created by cuikangyuan on 2017/5/25.
 */
public class ArtTracer {

    public static void main(String[] args) {
        ArtTracer artTracer = new ArtTracer();


        try {
            artTracer.factory("circle");
        } catch (BadShapeException e) {
            e.printStackTrace();
        }
    }


    public Shape factory(String which) throws BadShapeException {

        if (which.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (which.equalsIgnoreCase("square")) {
            return new Square();
        } else if (which.equalsIgnoreCase("triangle")) {
            return new Triangle();
        } else {
            throw new BadShapeException(which);
        }
    }
}

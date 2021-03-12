//import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmaticTest {
    private final Arithmatic arithmeticOperation = new Arithmatic();

    @Test
    public void canAdd() {
        assertEquals(3, arithmeticOperation.add(1, 2));
    }

    @Test
    public void canSubtract() {
        assertEquals(1, arithmeticOperation.subtract(2, 1));
    }

    @Test
    public void canMultiply() {
        assertEquals(6, arithmeticOperation.multiply(2, 3));
    }

    @Test
    void canDivide() {
        assertEquals(3, arithmeticOperation.divide(6, 2));
    }

    @Test
    public  void areofRectangle(){
        assertEquals(10,arithmeticOperation.rectanglearea(2,5));
    }
    @Test
    public  void perimeterOfRectangle(){
        assertEquals(12,arithmeticOperation.rectanglePerimeter(4,2));
    }

}


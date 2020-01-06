import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(20);
    }

    @Test
    public void hasSheets(){
        assertEquals(20,printer.getSheets());
    }

    @Test
    public void printRequest(){
        printer.print(2,5);
        assertEquals(10,printer.getSheets());
    }
}



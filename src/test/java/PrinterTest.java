import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(20,50);
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

    @Test
    public void printerHasEnoughPaper(){
        Printer smallPrinter = new Printer(5,50);
        smallPrinter.print(2,5);
        assertEquals(5,smallPrinter.getSheets());
    }

    @Test
    public void printerHasToner(){
        assertEquals(50,printer.getToner());
    }

    @Test
    public void reduceTonerLevelForEveryPage(){
        printer.print(2,6);
        assertEquals(38,printer.getToner());
    }
}



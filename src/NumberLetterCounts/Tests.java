package NumberLetterCounts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    @Test
    public void shouldReturn19When5 () {
        LetterSummator summator = new LetterSummator(5);
        assertEquals(19, summator.lettersCount());
    }

    @Test
    public void shoudlReturnStringForLongNumber() {
        Teleporter porter = new Teleporter();
        //assertEquals("threehundredandfortytwo", porter.getStringFor(342));
        assertEquals("fortytwo", porter.getStringFor(42));
    }
    @Test
    public void shouldReturnStringForANumber(){
        Teleporter porter = new Teleporter();
        assertEquals("four", porter.getStringFor(4));
        assertEquals("five", porter.getStringFor(5));
        assertEquals("six", porter.getStringFor(6));
        assertEquals("one", porter.getStringFor(1));
        assertEquals("eleven", porter.getStringFor(11));
        assertEquals("twelve", porter.getStringFor(12));
        assertEquals("nineteen", porter.getStringFor(19));
        assertEquals("twenty", porter.getStringFor(20));
    }
    @Test
    public void shouldReturnStringForANumber21(){
        Teleporter porter = new Teleporter();
        assertEquals("twentyone", porter.getStringFor(21));
        assertEquals("fortythree", porter.getStringFor(43));
    }
    @Test
    public void shouldReturnMultipleOf10(){
        Teleporter porter = new Teleporter();
        assertEquals("thirty", porter.getStringFor(30));
        assertEquals("forty", porter.getStringFor(40));
        assertEquals("fifty", porter.getStringFor(50));
        assertEquals("sixty", porter.getStringFor(60));
        assertEquals("seventy", porter.getStringFor(70));
        assertEquals("eighty", porter.getStringFor(80));
        assertEquals("ninety", porter.getStringFor(90));
    }

    @Test
    public void shouldReturnPowForNumber() {
        assertEquals(2, PowFinder.find(100));
        assertEquals(1, PowFinder.find(10));
        assertEquals(0, PowFinder.find(1));
    }
}

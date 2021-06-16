import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class HelloWorldTest {

    private String expected;

    @Before
    public void setUp(){
        this.expected = "Hello, World!";
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIfHelloWorldWorks(){
        String expectedDave = "Hello, Dave!";

        assertEquals(this.expected, HelloWorld.hello());
        assertNotEquals(null, HelloWorld.hello());
        assertNotEquals("Hello, null!", HelloWorld.hello());
        assertNotEquals("Hello, null!", HelloWorld.hello(null));
        assertEquals(expectedDave, HelloWorld.hello("Dave"));
    }

}

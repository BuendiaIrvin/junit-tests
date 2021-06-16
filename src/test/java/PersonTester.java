import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class PersonTester {
    ArrayList<Person> people;

    @Test
    public void testPerson() {
        assertEquals("Dave" , this.people.get(2).getName());
        assertSame(this.people.get(2), this.people.get(3));
//        assertSame(dave, dave2);
    }

    @Test
    public void arrayTest(){
        int[] arrayOfInts = {1,2,3,4};
        int[] yeetMoreInts = {5,6,7,8};

//        assertEquals(arrayOfInts, yeetMoreInts);
        assertArrayEquals(arrayOfInts, yeetMoreInts);
    }

    @Test
    public void testForCool() {
       assertTrue(this.people.get(0).isCool());
       assertTrue("Jose is super cool", this.people.get(0).isCool());
       assertFalse("David has never been cool", this.people.get(1).isCool());


    }

}

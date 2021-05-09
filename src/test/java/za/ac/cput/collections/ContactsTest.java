package za.ac.cput.collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class ContactsTest {

    Contacts con1, con2, con3;

    @BeforeEach void setUp() {
        con1 = new Contacts("Athenkosi", "Zono", "Athi", 838614201, 750265151, 10);
        con2 = new Contacts("Slii", "Mbalo", "Malii", 2245455, 325445, 9);
        con3 = new Contacts("Xola", "Vest", "X", 216565, 564451, 8);
    }

    @Test public void testCollections(){
        Collection<Contacts> coll = new LinkedList();

        // Add Should Pass coz size = 3
        coll.add(con1);
        coll.add(con2);
        coll.add(con3);
        assertEquals(coll.size(), 3);

        // Remove Should Pass coz size = 1
        coll.remove(con3);
        coll.remove(con1);
        assertEquals(coll.size(), 1);

        // Find Should Pass - con2 is in the contact list
        assertEquals(coll.contains(con2), true);
    }

    @Test public void testMap(){
        Map<Integer, String> map = new HashMap();

        // Add Should Pass coz size = 3
        map.put(con1.getTest(), con1.getName());
        map.put(con2.getTest(), con2.getName());
        map.put(con3.getTest(), con3.getName());
        assertEquals(map.size(), 3);

        // Remove Should Pass coz size = 1
        map.remove(8);
        map.remove(10);
        assertEquals(map.size(), 1);

        // Find Should Pass coz object 9 is 'Slii'
        assertEquals(map.get(9), "Slii");
    }

    @Test public void testSet(){
        Set<String> set = new HashSet();

        // Add Should Pass coz size = 3
        set.add(con1.getNickname());
        set.add(con2.getNickname());
        set.add(con3.getNickname());
        assertEquals(set.size(), 3);

        // Remove Should Pass coz size = 1
        set.remove("Athi");
        set.remove("Malii");
        assertEquals(set.size(), 1);

        // Find Should Pass coz String 'X' is Still there
        assertEquals(set.contains("X"), true);
    }

    @Test public void testList(){
        List<Long> list = new ArrayList();

        // Add Should Pass coz size = 3
        list.add(con1.getNumbers());
        list.add(con2.getNumbers());
        list.add(con3.getNumbers());
        assertEquals(list.size(), 3);

        // Remove Should Pass coz size = 1
        list.remove(0);
        list.remove(1);
        assertEquals(list.size(), 1);

        // Find Should Pass coz number 2245455 is Still there
        assertEquals(list.get(0), 2245455);
    }

}
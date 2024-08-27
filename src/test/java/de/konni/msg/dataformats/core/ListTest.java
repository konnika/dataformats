package de.konni.msg.dataformats.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ListTest {
    private List<String> list;

    @BeforeEach
    void setUp() {
        list = new ArrayList<>(List.of("a", "b", "c"));
    }

    @Test
    void addAtBeginning() {
        list.add(0, "x");
        assertEquals(4, list.size());
        assertEquals("x", list.get(0));
        assertEquals("a", list.get(1));
        assertEquals("b", list.get(2));
        assertEquals("c", list.get(3));
    }

    @Test
    void addAtEnd() {
        list.add(3, "x");
        assertEquals(4, list.size());
        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
        assertEquals("c", list.get(2));
        assertEquals("x", list.get(3));
    }

    @Test
    void addAfterEnd() {
        assertThrows(IndexOutOfBoundsException.class, () -> list.add(4, "x"));
    }
}

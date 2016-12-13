package com.geeksforgeeks;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hudak on 12/13/2016.
 */
public class ReverseArrayWithoutSpecialTest {
    @Test
    public void reverseWithoutExtraSpace() throws Exception {
        assertEquals("c,b$a", ReverseArrayWithoutSpecial.reverseWithoutExtraSpace("a,b$c"));
        assertEquals("Ab,c,de!$", ReverseArrayWithoutSpecial.reverseWithoutExtraSpace("ed,c,bA!$"));
        assertEquals("a!!!b.c.d,e'f,ghi", ReverseArrayWithoutSpecial.reverseWithoutExtraSpace("i!!!h.g.f,e'd,cba"));

    }

    @Test
    public void reverseWithTemporaryArray() throws Exception {

        assertEquals("c,b$a", ReverseArrayWithoutSpecial.reverseWithTemporaryArray("a,b$c"));
        assertEquals("Ab,c,de!$", ReverseArrayWithoutSpecial.reverseWithTemporaryArray("ed,c,bA!$"));
        assertEquals("a!!!b.c.d,e'f,ghi", ReverseArrayWithoutSpecial.reverseWithTemporaryArray("i!!!h.g.f,e'd,cba"));
    }

}
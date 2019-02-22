package com.kugmax.learn.inr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BatchIteratorTest {

    private BatchIterator biter;

    @BeforeEach
    public void before() {
        List<String> lines = new ArrayList<>();
        lines.add("123");
        lines.add("- test -");
        lines.add("start");
        lines.add("end");
        lines.add("test123");

        biter = new BatchIterator(lines.iterator(), ".*test.*");
    }

    @Test
    public void regex() {
        String regexp = ".*test.*";

        assertFalse("123".matches(regexp));
        assertTrue("- test -".matches(regexp));
        assertFalse("start".matches(regexp));
        assertFalse("end".matches(regexp));
        assertTrue("test123".matches(regexp));

        assertTrue("test".matches(regexp));
        assertTrue("FtestG".matches(regexp));
    }


    @Test
    public void with_two_next() {
        List<String> n1 = biter.next();
        assertThat(n1).containsOnly("- test -", "start", "end");

        List<String> n2 = biter.next();
        assertThat(n2).containsOnly("test123");
    }

    @Test
    public void with_hasNext() {
        List<String> n1 = biter.next();
        assertThat(n1).containsOnly("- test -", "start", "end");

        assertTrue(biter.hasNext());
        assertTrue(biter.hasNext());
        assertTrue(biter.hasNext());

        List<String> n2 = biter.next();
        System.out.println(n2);

        assertThat(n2).containsOnly("test123");

        assertFalse(biter.hasNext());
        assertFalse(biter.hasNext());
        assertFalse(biter.hasNext());
    }

    @Test
    public void ff() {
        assertTrue(biter.hasNext());
        assertTrue(biter.hasNext());
        assertTrue(biter.hasNext());

        List<String> n1 = biter.next();
        assertThat(n1).containsOnly("- test -", "start", "end");

        assertTrue(biter.hasNext());
        assertTrue(biter.hasNext());
        assertTrue(biter.hasNext());

        List<String> n2 = biter.next();
        System.out.println(n2);

        assertThat(n2).containsOnly("test123");

        assertFalse(biter.hasNext());
        assertFalse(biter.hasNext());
        assertFalse(biter.hasNext());
    }

    @Test
    public void with_3_blocks() {
        List<String> lines = new ArrayList<>();
        lines.add("123");

        lines.add("- test -");
        lines.add("start");
        lines.add("end");

        lines.add("test123");
        lines.add("aaa");
        lines.add("bbb");

        lines.add("5test123");

        biter = new BatchIterator(lines.iterator(), ".*test.*");

        List<String> n1 = biter.next();
        assertThat(n1).containsOnly("- test -", "start", "end");

        List<String> n2 = biter.next();
        assertThat(n2).containsOnly("test123", "aaa", "bbb");

        List<String> n3 = biter.next();
        assertThat(n3).containsOnly("5test123");
    }


    @Test
    public void with_3_blocks_with_hasNext() {
        List<String> lines = new ArrayList<>();
        lines.add("123");

        lines.add("- test -");
        lines.add("start");
        lines.add("end");

        lines.add("test123");
        lines.add("aaa");
        lines.add("bbb");

        lines.add("5test123");

        biter = new BatchIterator(lines.iterator(), ".*test.*");

        assertTrue(biter.hasNext());
        assertTrue(biter.hasNext());
        assertTrue(biter.hasNext());
        List<String> n1 = biter.next();
        assertThat(n1).containsOnly("- test -", "start", "end");


        assertTrue(biter.hasNext());
        assertTrue(biter.hasNext());
        assertTrue(biter.hasNext());
        List<String> n2 = biter.next();
        assertThat(n2).containsOnly("test123", "aaa", "bbb");


        assertTrue(biter.hasNext());
        assertTrue(biter.hasNext());
        assertTrue(biter.hasNext());
        List<String> n3 = biter.next();
        assertThat(n3).containsOnly("5test123");

        assertFalse(biter.hasNext());
        assertFalse(biter.hasNext());
        assertFalse(biter.hasNext());
    }
}

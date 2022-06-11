package ru.job4j.oop;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

public class PointTest {

        @Test
        public void testDistance2D() {
            Point a = new Point(2, 4);
            Point b = new Point(6, 2);
            double rsl = a.distance(b);
            assertThat(rsl, closeTo(4.4, 0.1));
        }

        @Test
        public void testDistance3D() {
            Point a = new Point(2, 4, 8);
            Point b = new Point(6, 2, 1);
            double rsl = a.distance(b);
            assertThat(rsl, closeTo(8.3, 0.1));
    }
}
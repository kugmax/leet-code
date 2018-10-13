package main.java.com.kugmax.learn.letcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class TstHasMap {

    public static class A {
        int x;
        int y;
        int z;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            A a = (A) o;
            return x == a.x &&
                    y == a.y &&
                    z == a.z;
        }

        @Override
        public int hashCode() {
            return x + y;
//            return Objects.hash(x, y);
        }

        @Override
        public String toString() {
            return "A{" +
                    "x=" + x +
                    ", y=" + y +
                    ", z=" + z +
                    '}';
        }
    }

    public static void main(String[] args) {
        A o1 = new A();
        o1.x = 1;
        o1.y = 2;
        o1.z = 3;

        A o2 = new A();
        o2.x = 2;
        o2.y = 1;
        o2.z = 3;

        Set<A> set = new HashSet<>();
        set.add(o1);
        set.add(o2);

        System.out.println(set.size());
        System.out.println(set);
    }
}

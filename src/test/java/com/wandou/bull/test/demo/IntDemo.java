package com.wandou.bull.test.demo;

import com.wandou.bull.model.pojo.Book;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.Range;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author liming
 * @date 2021/12/22 11:06
 */
public class IntDemo {

    @Test
    public void m() {
        for (int i = 0; i < 100; i++) {
            double v = RandomUtils.nextDouble(1, 1000);
            System.out.println("v = " + v);
            System.out.println((int) v);
        }
    }

    @Test
    public void m2() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("a", 99));
        books.add(new Book("cc", 0));
        books.add(new Book("com", 45));

        System.out.println("books = " + books);

        books = books.stream().sorted().collect(Collectors.toList());
        System.out.println("books = " + books);
    }

    @Test
    public void m3IntRange() {
        Range<Integer> range = Range.between(1, 3);
        System.out.println(range.contains(1));
        System.out.println(range.contains(2));
        System.out.println(range.contains(3));
        System.out.println(range.contains(4));

    }
}

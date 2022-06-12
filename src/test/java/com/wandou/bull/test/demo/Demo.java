package com.wandou.bull.test.demo;

import com.wandou.bull.model.pojo.Book;
import org.junit.jupiter.api.Test;
import org.springframework.util.CollectionUtils;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author liming
 * @date 2022/1/11 16:40
 */
public class Demo {

    @Test
    public void m1() {
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("no is null");
        System.out.println("illegalArgumentException.getClass().getName() = " + illegalArgumentException.getClass().getName());
        System.out.println("illegalArgumentException.getClass().getSimpleName() = " + illegalArgumentException.getClass().getSimpleName());
        System.out.println("illegalArgumentException.getClass().getCanonicalName() = " + illegalArgumentException.getClass().getCanonicalName());
        System.out.println("illegalArgumentException.getClass().getTypeName() = " + illegalArgumentException.getClass().getTypeName());

    }

    @Test
    public void m2Class() {
        try {
            Class<?> bookClass = Class.forName("com.wandou.bull.model.pojo.Book");
            System.out.println("bookClass.getTypeName() = " + bookClass.getTypeName());
            System.out.println("bookClass.getClasses() = " + Arrays.toString(bookClass.getClasses()));
            System.out.println("bookClass.getMethods() = " + Arrays.toString(bookClass.getMethods()));
            System.out.println("bookClass.isInstance(new Object()) = " + bookClass.isInstance(new Object()));
            System.out.println("bookClass.isInstance(new Book()) = " + bookClass.isInstance(new Book()));
            System.out.println("bookClass.isInterface() = " + bookClass.isInterface());
            Field nameField = bookClass.getDeclaredField("name");
            System.out.println("nameField.getName() = " + nameField.getName());
            Field orderField = bookClass.getDeclaredField("order");
            System.out.println("orderField = " + orderField);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void m3() {
        Set<String> set = new HashSet<>();
        set.add("aaa1");

        Set<String> set1 = new HashSet<>();
        set1.add("bbb");
        set1.add("aaa");
        set1.add("ccc");

        System.out.println(set.retainAll(set1));

        System.out.println("CollectionUtils.containsAny(set, set1) = " + CollectionUtils.containsAny(set, set1));
    }

    @Test
    public void m4() {
        System.out.println(Boolean.TRUE.equals(null));
    }
}

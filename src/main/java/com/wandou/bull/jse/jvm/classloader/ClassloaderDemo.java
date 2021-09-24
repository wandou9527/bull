package com.wandou.bull.jse.jvm.classloader;

/**
 * @author liming
 */
public class ClassloaderDemo {

    public static void main(String[] args) {
        System.out.println(ClassloaderDemo.class.getClassLoader());
        System.out.println(ClassloaderDemo.class.getClassLoader().getParent());
        System.out.println(ClassloaderDemo.class.getClassLoader().getParent().getParent());

    }
}

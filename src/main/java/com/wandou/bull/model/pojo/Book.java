package com.wandou.bull.model.pojo;

/**
 * @author liming
 * @date 2022/1/11 19:43
 */
public class Book implements Comparable<Book> {

    private String name;

    private Integer order;

    public Book() {
    }

    public Book(String name, Integer order) {
        this.name = name;
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", order=" + order +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return Integer.compare(this.getOrder(), o.getOrder());
    }
}

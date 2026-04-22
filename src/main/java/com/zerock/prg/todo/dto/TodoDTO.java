package com.zerock.prg.todo.dto;

import java.time.LocalDate;

public class TodoDTO {
    private long num;
    private String name;
    private LocalDate day;

    public long getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDay() {
        return day;
    }

    public void setNum(long num) {
        this.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDay(LocalDate day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "TodoDTO{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", day=" + day +
                '}';
    }
}

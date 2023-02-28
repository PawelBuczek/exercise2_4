package com.kodilla.exercise2_4;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

public class Student {
    private final String indexNumber;

    public Student() {
        this.indexNumber = RandomStringUtils.randomAlphabetic(10);
    }
}

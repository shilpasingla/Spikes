package com.thoughtworks.twu.domain;

/**
 * Created with IntelliJ IDEA.
 * User: ashaw
 * Date: 23/08/12
 * Time: 4:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class Country {
    private String name;

    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

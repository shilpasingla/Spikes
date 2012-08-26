package com.thoughtworks.twu.domain.Form;

/**
 * Created with IntelliJ IDEA.
 * User: ewonou
 * Date: 26/8/12
 * Time: 2:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class HourForm {

    int monday;

    public void setMonday(int monday) {
            this.monday  = monday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HourForm hourForm = (HourForm) o;

        if (monday != hourForm.monday) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return monday;
    }

    public int getMonday() {
        return monday;

    }

}

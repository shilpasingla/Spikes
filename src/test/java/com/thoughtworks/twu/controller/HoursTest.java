package com.thoughtworks.twu.controller;

import com.thoughtworks.twu.domain.Form.HourForm;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: ewonou
 * Date: 26/8/12
 * Time: 2:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class HoursTest {
    @Test
    public void shouldReturnHoursWorkedOnMonday(){
        HourForm hourForm = new HourForm();
        hourForm.setMonday(8);

        HourController hourController = new HourController();
        ModelAndView hourView = hourController.displayHour(hourForm);

        HourForm expectedHourForm  = new HourForm();
        expectedHourForm.setMonday(8);
        assertThat((HourForm) hourView.getModel().get("hourForm"), is(expectedHourForm));
        //assertThat(hourView.getView(),is("status"));
    }


}

package com.thoughtworks.twu.controller;

import com.thoughtworks.twu.domain.Form.HourForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created with IntelliJ IDEA.
 * User: ewonou
 * Date: 26/8/12
 * Time: 2:46 PM
 * To change this template use File | Settings | File Templates.
 */

@Controller
public class HourController{

    @RequestMapping(value ="hour", method = RequestMethod.GET)
    public ModelAndView display(HourForm hourForm) {
        ModelAndView modelAndView = new ModelAndView("example/hour");
        return modelAndView;
    }

    @RequestMapping(value= "hour", method = RequestMethod.POST)
    public ModelAndView displayHour(@ModelAttribute("hourForm") HourForm hourform) {

     ModelAndView modelAndView = new ModelAndView("example/status");

     modelAndView.addObject("hourForm",hourform);

     return modelAndView;
    }



}

package com.thoughtworks.twu.controller;

import com.thoughtworks.twu.domain.User;
import com.thoughtworks.twu.domain.timesheet.forms.FavoriteTimesheetForm;
import com.thoughtworks.twu.service.CountryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FavoriteTimesheetController {
    @RequestMapping(value = "/timesheet/favorite/new", method = RequestMethod.GET)
    public ModelAndView newFavorite() {
        CountryService countryService = new CountryService();

        ModelAndView modelAndView = new ModelAndView("ui/timesheet/favorite/new_form");
        modelAndView.addObject("countries", countryService.getCountries());
        return modelAndView;
    }

    @RequestMapping(value = "/timesheet/favorite/new", method = RequestMethod.POST)
    public ModelAndView doNewFavorite(@ModelAttribute("form") FavoriteTimesheetForm form) {

        CountryService countryService = new CountryService();

        ModelAndView modelAndView = new ModelAndView("ui/timesheet/favorite/new_form");
        modelAndView.addObject("countries", countryService.getCountries());

        return modelAndView;
    }

    @RequestMapping(value = "/timesheet/favorite/list", method = RequestMethod.GET)
    public ModelAndView list(@ModelAttribute("form") FavoriteTimesheetForm form) {
        ModelAndView modelAndView = new ModelAndView("ui/timesheet/favorite/favorite_list");
        return modelAndView;
    }
}

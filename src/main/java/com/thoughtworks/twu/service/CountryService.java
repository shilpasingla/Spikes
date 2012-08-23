package com.thoughtworks.twu.service;

import com.thoughtworks.twu.domain.Country;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ashaw
 * Date: 23/08/12
 * Time: 4:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class CountryService {

    private List<Country> countryList = new ArrayList<Country>();

    public CountryService() {
        countryList.add(new Country("India"));
        countryList.add(new Country("USA"));
        countryList.add(new Country("Australia"));
        countryList.add(new Country("Brazil"));
        countryList.add(new Country("China"));
    }

    public List<Country> getCountries() {
        return countryList;
    }


}

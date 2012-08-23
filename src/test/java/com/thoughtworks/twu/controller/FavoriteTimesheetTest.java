package com.thoughtworks.twu.controller;

import com.thoughtworks.twu.domain.Country;
import com.thoughtworks.twu.service.CountryService;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FavoriteTimesheetTest {
    @Test
    public void shouldReceiveACountryList() throws Exception {
        //Given
        CountryService countryService = new CountryService();
        //When
        List<Country> countries = countryService.getCountries();
        //Then
        assertThat(countries.size(), is(5));
    }
}

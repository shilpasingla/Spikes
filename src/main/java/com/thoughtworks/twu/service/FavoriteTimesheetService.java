package com.thoughtworks.twu.service;

import com.thoughtworks.twu.domain.FavoriteTimesheet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: flahti
 * Date: 24/8/12
 * Time: 9:47 AM
 * To change this template use File | Settings | File Templates.
 */
public class FavoriteTimesheetService {

    private List<FavoriteTimesheet> favoriteTimesheets = new ArrayList<FavoriteTimesheet>();

    public FavoriteTimesheetService() {
        favoriteTimesheets.add(new FavoriteTimesheet("TWU"));
        favoriteTimesheets.add(new FavoriteTimesheet("GAP"));
        favoriteTimesheets.add(new FavoriteTimesheet("GetUp"));
        favoriteTimesheets.add(new FavoriteTimesheet("Telstra"));
    }

    public List<FavoriteTimesheet> getFavoriteTimesheets() {
        return favoriteTimesheets;
    }
}

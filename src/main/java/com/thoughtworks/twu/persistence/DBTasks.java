package com.thoughtworks.twu.persistence;

import org.hibernate.Session;

public class DBTasks {

    public DBTasks(Session session) {
        this.session = session;
    }

    Session session;

    public void insertIntoFavoriteTimeSheet(String favoritetimesheetname, String userid)
    {
        FavoriteTimesheet timesheet = new FavoriteTimesheet();
        timesheet.setName(favoritetimesheetname);
        timesheet.setUserId(userid);
        System.out.println("insert records");
        session.save(timesheet);
        session.flush();

    }

}

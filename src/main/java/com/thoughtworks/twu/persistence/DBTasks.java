package com.thoughtworks.twu.persistence;

import org.hibernate.Session;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

public class DBTasks {

    public DBTasks(Session session) {
        this.session = session;
    }

    Session session;

    public JSONArray selectFromFavoriteTimeSheet() throws JSONException {
        JSONArray allTimeSheets = new JSONArray();
        List<FavoriteTimesheet> timeSheets = null;
        if (session != null) {
            timeSheets =  session.createQuery("from com.thoughtworks.twu.persistence.FavoriteTimesheet").list();
        }
        for (int i=0;i<timeSheets.size();i++)
        {
            JSONObject newTimeSheet=new JSONObject();
            newTimeSheet.put("favoritetimesheetname", timeSheets.get(i).getFavoritetimesheetname());
            newTimeSheet.put("userid", timeSheets.get(i).getUserid());
            newTimeSheet.put("id", timeSheets.get(i).getId());
            allTimeSheets.put(newTimeSheet);
        }
        return allTimeSheets;
    }

    public void insertIntoFavoriteTimeSheet(String favoritetimesheetname, String userid, int id)
    {
        FavoriteTimesheet timesheet = new FavoriteTimesheet();
        timesheet.setFavoritetimesheetname(favoritetimesheetname);
        timesheet.setUserid(userid);
        timesheet.setId(id);
        System.out.println("insert records");
        session.save(timesheet);

    }

}

package com.thoughtworks.twu.persistence;

/**
 * Created with IntelliJ IDEA.
 * User: shilpa
 * Date: 8/23/12
 * Time: 12:06 PM
 * To change this template use File | Settings | File Templates.
 */

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "favoritetimesheet" )
public class FavoriteTimesheet {

    String favoritetimesheetname;
    String userid;

    public void setId(int id) {
        this.id = id;
    }

    int id;

    public String getFavoritetimesheetname() {
        return favoritetimesheetname;
    }

    public void setFavoritetimesheetname(String favoritetimesheetname) {
        this.favoritetimesheetname = favoritetimesheetname;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
    @Id
    @GeneratedValue(generator="id")
    @GenericGenerator(name="id", strategy = "increment")
    public int getId() {
        return id;
    }
}

package com.thoughtworks.twu.domain.timesheet.forms;

public class FavoriteTimesheetForm {
    String name;
    String country;
    String state;
    String activity;
    boolean billable;
    String taskComment;
    float monday;
    float tuesday;
    float wednesday;
    float thursday;
    float friday;
    float saturday;
    float sunday;

    @Override
    public String toString() {
        return "FavoriteTimesheetForm{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", activity='" + activity + '\'' +
                ", billable=" + billable +
                ", taskComment='" + taskComment + '\'' +
                ", monday=" + monday +
                ", tuesday=" + tuesday +
                ", wednesday=" + wednesday +
                ", thursday=" + thursday +
                ", friday=" + friday +
                ", saturday=" + saturday +
                ", sunday=" + sunday +
                '}';
    }
}

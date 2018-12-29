package com.luciz.criminalintent;

import android.text.format.DateFormat;

import java.util.Date;
import java.util.UUID;

public class Crime {
    private UUID id;
    private String title;
    private Date date;
    private boolean solved;

    public Crime() {
        id = UUID.randomUUID();
        date = new Date();
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Chapter 8 Challenge
    public String getDate() {
        return (String) DateFormat.format("yyyy.MM.dd HH:mm:ss", date);
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isSolved() {
        return solved;
    }

    public void setSolved(boolean solved) {
        this.solved = solved;
    }
}

package com.learn.mergebeans;

import java.util.Properties;

public class EmailDetails extends Details{
    private Properties details;

    @Override
    public void setDetails(Properties details) {
        this.details = details;
    }

    public Properties getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return "EmailDetails{" +
                "details=" + details +
                '}';
    }
}

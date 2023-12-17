package com.learn.mergebeans;

import java.util.Properties;

public class Details {
    private Properties details;

    public void setDetails(Properties details) {
        this.details = details;
    }

    public Properties getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return "Details{" +
                "details=" + details +
                '}';
    }
}

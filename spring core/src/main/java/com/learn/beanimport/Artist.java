package com.learn.beanimport;

public class Artist {
    private String name;
    private Instrument instrument;

    public Artist(String name, Instrument instrument) {
        this.name = name;
        this.instrument = instrument;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", instrument=" + instrument +
                '}';
    }
}

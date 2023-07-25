package com.pinelabs;

import java.util.List;

public class Restro {
    private String restroId;
    private String restroName;
    private Location restroLoc;
    private  List<Dish>  menu;

    public String getRestroId() {
        return restroId;
    }

    public void setRestroId(String restroId) {
        this.restroId = restroId;
    }

    public Location getRestroLoc() {
        return restroLoc;
    }

    public void setRestroName(String restroName) {
        this.restroName = restroName;
    }

    public String getRestroName() {
        return restroName;
    }

    public void setRestroLoc(Location restroLoc) {
        this.restroLoc = restroLoc;
    }

    public List<Dish> getMenu() {
        return menu;
    }

    public void setMenu(List<Dish> menu) {
        this.menu = menu;
    }

    @Override
    public String toString() {
        return "Restro{" +
                "restroId='" + restroId + '\'' +
                ", restroName='" + restroName + '\'' +
                ", restroLoc=" + restroLoc +
                ", dishList=" + menu +
                '}';
    }
}

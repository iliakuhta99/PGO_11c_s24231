package PGO_07;

import java.util.ArrayList;
import java.util.List;

class Orphanage {
    private List<Child> childrens = new ArrayList<>();
    private String name;
    private Location location;


    public Orphanage(String name, Location location) {
        this.location = location;
        this.name = name;

    }
    public void addChild(Child child){
        childrens.add(child);
    }
    public String getName() {
        return name;
    }
    public Location getLocation() {
        return location;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLocation(Location location) {
        this.location = location;
    }
}
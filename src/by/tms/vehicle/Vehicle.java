package by.tms.vehicle;

public abstract class Vehicle {
    public int since;
    public int speed_max;
    public String model;
    public abstract String action_movement();
}
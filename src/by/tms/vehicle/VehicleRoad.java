package by.tms.vehicle;

public class VehicleRoad extends Vehicle implements Comparable<VehicleRoad> {
    protected int CountDoors;

    public String action_movement() {
        return "road";
    }

    @Override
    public int compareTo(VehicleRoad o) {
        if (this.CountDoors < o.CountDoors)
            return -1;
        else
            return 0;
    }
}

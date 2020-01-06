package by.tms;

import java.util.Objects;

// public
// protected
// package-private
// private

// extends наследование
// implements имплементирование
// super

// транспорт
public class CarImpl implements Car {
    private String model;
    private int since;

    public void setModel(String model) {
        this.model = model;
    }

    public void setSince(int since) {
        this.since = since;
    }

    public CarImpl(String model, int since) {
        this.model = model;
        this.since = since;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarImpl car = (CarImpl) o;
        return since == car.since &&
                Objects.equals(model, car.model);
    }
}

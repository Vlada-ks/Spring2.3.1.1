package web.model;

import java.util.Objects;

public class Cars {
    private int id;
    private String model;
    private String color;
    private int year;

    public Cars() {
    }

    public Cars(int id, String model, String color, int year) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cars cars)) return false;
        return getId() == cars.getId() && getYear() == cars.getYear() && Objects.equals(getModel(), cars.getModel()) && Objects.equals(getColor(), cars.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getModel(), getColor(), getYear());
    }

    @Override
    public String toString() {
        return "Cars{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
}

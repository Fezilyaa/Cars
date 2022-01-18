package web.model;

public class Car {
    private String model;
    private String color;
    private int series;

    public Car(String model, String color, int series) {
        this.model = model;
        this.color = color;
        this.series = series;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car : " +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", series=" + series +
                '.';
    }

}

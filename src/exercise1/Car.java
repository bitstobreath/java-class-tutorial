package exercise1;

import java.time.LocalDate;

public class Car {
    private int id;
    private String manufacturer;
    private String model;
    private LocalDate purchaseDate;
    private int numberOfSeats;

    public Car() {
    }

    public Car(int id) {
        this.id = id;
    }

    public Car(int id, String manufacturer) {
        this.id = id;
        this.manufacturer = manufacturer;
    }

    public Car(int id, String manufacturer, String model) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public Car(int id, String manufacturer, String model, LocalDate purchaseDate) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.purchaseDate = purchaseDate;
    }

    public Car(int id, String manufacturer, String model, LocalDate purchaseDate, int numberOfSeats) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.purchaseDate = purchaseDate;
        this.numberOfSeats = numberOfSeats;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setAll(int id, String manufacturer, String model, LocalDate purchaseDate, int numberOfSeats) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.purchaseDate = purchaseDate;
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", purchaseDate=" + purchaseDate +
                ", numberOfSeats=" + numberOfSeats +
                '}';
    }
}

package ru.savin.homeworks.hw6.climbers.modules;

public class Mountain {
    private String title;
    private String country;
    private int height;

    public void setTitle(String value) {
        if (value.length() < 4) {
            throw new IllegalArgumentException("Название горы не менее 4 букв");
        }
        this.title = value;
    }

    public void setCountry(String value) {
        if (value.length() < 4) {
            throw new IllegalArgumentException("Название страны не менее 4 букв");
        }
        this.country = value;
    }

    public void setHeight(int value) {
        if (value < 100) {
            throw new IllegalArgumentException("Высота горы не менее 100 метров");
        }
        this.height = value;
    }

    public void getMountainInfo() {
        System.out.println("Гора " + this.title + " высотой " + this.height + "м в стране " + this.country);
    }

    @Override
    public String toString() {
        return "Mountain{" +
                "title='" + title + '\'' +
                ", country='" + country + '\'' +
                ", height=" + height +
                '}';
    }
}

package ru.savin.homeworks.hw6.climbers.modules;

public class Climber {
    private String name;
    private String address;

    public void setName(String value) {
        if (value.length() < 3) {
            throw new IllegalArgumentException("Имя альпиниста не может быть короче 3 букв");
        }
        this.name = value;
    }

    public void setAddress(String value) {
        if (value.length() < 5) {
            throw new IllegalArgumentException("Адрес не может быть короче 5 букв");
        }
        this.address = value;
    }

    public void getClimberInfo() {
        System.out.println("Альпинист " + this.name + " живет по адресу " + this.address);
    }

    @Override
    public String toString() {
        return "Climber{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

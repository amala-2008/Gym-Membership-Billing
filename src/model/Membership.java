package model;

public class Membership {

    private String type;
    private int duration;
    private double fee;

    public Membership(String type, int duration) {
        this.type = type;
        this.duration = duration;

        if (type.equalsIgnoreCase("Basic")) {
            fee = 1000 * duration;
        } else if (type.equalsIgnoreCase("Premium")) {
            fee = 1500 * duration;
        }
    }

    public String getType() {
        return type;
    }

    public int getDuration() {
        return duration;
    }

    public double getFee() {
        return fee;
    }

    public void displayMembership() {
        System.out.println("Membership Type : " + type);
        System.out.println("Duration        : " + duration + " month(s)");
        System.out.println("Membership Fee  : Rs." + fee);
    }
}
package org.homeTasks.OOP;

public class PCtoString {

    private String screen;
    private double RAM;
    private double ROM;

    PCtoString(){
        this.screen = "1600x900";
        this.RAM = 512.0;
        this.ROM = 120.0;
    }
    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public double getRAM() {
        return RAM;
    }

    public void setRAM(double RAM) {
        this.RAM = RAM;
    }

    public double getROM() {
        return ROM;
    }

    public void setROM(double ROM) {
        this.ROM = ROM;
    }

    public String toString(){
        return String.format("Екран: %s%nRAM: %s%nRom: %s%n", screen, RAM, ROM);
    }
}


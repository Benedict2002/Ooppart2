package Composition;

public class Motherboard {
    private String model;
    private String manufacturer;
    private int ramslots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacturer, int ramslots, int cardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramslots = ramslots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }
    public void loadProgram(String programName){
        System.out.println("Program "+programName+" is loading");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamslots() {
        return ramslots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }
}

package Composition;

public class main {
    public static void main(String[] args) {
        Dimension dimensions = new Dimension(20,20,5);
         Case thecase = new Case("220","Dell","240",dimensions);

         Monitor monitor = new Monitor("12Inch beast","Hp",27,new Resolution(2540,1440));


         Motherboard motherboard = new Motherboard("B-2020","Acer",16,6,"v2.44");

         PC thePC = new PC(thecase, monitor,motherboard);
         thePC.powerUP();
    }
}

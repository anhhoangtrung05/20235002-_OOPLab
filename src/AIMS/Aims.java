package AIMS;

public class Aims {
    public static void main(String[] args){
        Cart anOrder=new Cart();

        DigitalVideoDisc dvd1= new DigitalVideoDisc("The Lion King", "Animation", "Roger Alers", 87, 19.95f);
        anOrder.add(dvd1);
        System.out.println("Total cost is: "+ anOrder.totalCost());

    }
}

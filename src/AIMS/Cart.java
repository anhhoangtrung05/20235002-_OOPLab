package AIMS;

public class Cart {
    public static final int MAX_NUMBER_ORDERED=20;
    DigitalVideoDisc[] DVDCart= new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    private int qtyOrdered=0;
    private float totalCost;

    boolean add(DigitalVideoDisc disc){
        if (qtyOrdered==MAX_NUMBER_ORDERED){
            return false;
        }
        for (int i=0; i<qtyOrdered; i++){
            if (DVDCart[i].equals(disc)){
                return false;
            }
        }
        DVDCart[qtyOrdered]=disc;
        qtyOrdered++;
        totalCost+=disc.getCost();

        return true;

    }

    boolean remove(DigitalVideoDisc disc){
        boolean removed=false;
        int idx=0;
        while(idx<qtyOrdered && !removed){
            if (DVDCart[idx].equals(disc)){
                totalCost-=DVDCart[idx].getCost();
                DVDCart[idx]=null;
                removed=true;
                for (int i=idx; i<qtyOrdered-1; i++){
                    DVDCart[i]=DVDCart[i+1];
                }
                qtyOrdered--;
            }
            else{
                idx++;
            }
        }
        return removed;
    }   

    float totalCost(){
        return totalCost;
    }
}

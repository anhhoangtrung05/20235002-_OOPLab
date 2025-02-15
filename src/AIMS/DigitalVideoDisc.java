package AIMS;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    //constructors
    public DigitalVideoDisc(String title){
        this.title=title;
    }
    public DigitalVideoDisc(String title, String category){
        this.title=title;
        this.category=category;
    }
    public DigitalVideoDisc(String title, String category, String director){
        this.title=title;
        this.category=category;
        this.director=director;
    }
    public DigitalVideoDisc(String title, String category, String director, int length){
        this.title=title;
        this.category=category;
        this.director=director;
        this.length=length;
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost){
        this.title=title;
        this.category=category;
        this.director=director;
        this.length=length;
        this.cost=cost;
    }


    public String getTitle(){
        return title;
    }

    public String getCategory(){
        return category;
    }

    public String getDirector(){
        return director;
    }

    public int getLength(){
        return length;
    }

    public float getCost(){
        return cost;
    }

}

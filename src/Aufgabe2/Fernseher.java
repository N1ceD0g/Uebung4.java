package Aufgabe2;

public class Fernseher {

    private static final int MAX_VOLUME = 1000;
    private static final int MAX_BRIGHTNESS = 15;
    private boolean on;
    private int program;
    private int volume;
    private int brightness;

    private String brand;
    private String type;


    public Fernseher(boolean on,int program,int volume, int brightness, String brand, String type ){
        this.on=on;
        this.program=program;
        this.volume=volume;
        this.brightness=brightness;
        this.brand=brand;
        this.type=type;
    }


    public void turnOn(){
        on=true;
    }
    public void turnOff(){
        on=false;
    }

    public void switchProgram(int program){
        if(program >= 0){
        this.program = program;
        }
    }

    public void lowerVolume(){
        if(this.volume>0){
            this.volume--;
        }
    }

    public void increaseVolume(){
        if (this.volume < MAX_VOLUME){
            this.volume++;
        }
    }

    public void lowerBrightness(){
        if(this.brightness>0){
            this.brightness--;
        }
    }

    public void increaseBrightness(){
        if(this.brightness < MAX_BRIGHTNESS){
            this.brightness++;
        }
    }

    public void setBrand(String brand){
        this.brand = brand;

    }
    public void setType(String type){
        this.type = type;
    }

    public void ausgabe (){
        System.out.println("The TV is on: "+ on);
        System.out.println("Program: "+ program);
        System.out.println("Volume: "+ volume);
        System.out.println("Brightness: "+ brightness);
        System.out.println("Brand: "+ brand);
        System.out.println("Type: "+ type);
    }
}

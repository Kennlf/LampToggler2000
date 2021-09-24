package com.company;

public class Lamp {

    private boolean lampStatus;
    private String name;

    public Lamp( String name){
        this.lampStatus = false;
        this.name = name;
    }
    //Gør at man kan sætte lampStatus i det man opretter den nye variabel
    public Lamp( String name , boolean status){
        this.lampStatus = status;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


    public boolean getLampStatus(){
        return lampStatus;
    }

    public void setLampStatus(boolean lampStatus){
        this.lampStatus = lampStatus;
    }


    public void lightSwitch(){
        if(lampStatus == true){ // Hvis lampeStatsu er true så skal den sættes til false
            lampStatus = false;
        } else {                // Hvis den ikke er true(altså hvis den er false) så skal den sættes true
            lampStatus = true;
        }

    }

    public String toString(){
        if( lampStatus == true){
            return name + " er Tændt";
        } else {
            return name + " er Slukket";
        }
    }
}

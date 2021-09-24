package com.company;

import java.util.Scanner;

public class LampToggler {

    public static void main(String[] args) {

        Lamp selectedLamp = null;

        Lamp lamp1 = new Lamp("lamp1");
        Lamp lamp2 = new Lamp("lamp2");
        Lamp lamp3 = new Lamp("lamp3");
        Lamp lamp4 = new Lamp("lamp4");
        Lamp lamp5 = new Lamp("lamp5");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println(lamp1 + "\n"
                    + lamp2 + "\n"
                    + lamp3 + "\n"
                    + lamp4 + "\n"
                    + lamp5 + "\n");


            System.out.println("Hvilken lampe ønsker du er tænde/slukke for?");
            int onOff = sc.nextInt();
            if (onOff == 1) {
                selectedLamp = lamp1;
            } else if (onOff == 2) {
                selectedLamp = lamp2;
            } else if (onOff == 3) {
                selectedLamp = lamp3;
            } else if (onOff == 4) {
                selectedLamp = lamp4;
            } else if (onOff == 5) {
                selectedLamp = lamp5;
            }
            selectedLamp.lightSwitch();
        }


    }


}

package com.laziv.lesson7;

public class Main {
    public static void main(String[] args) {

        ControlAirplane controlAirplane = new ControlAirplane(25, 15, 19);
        Su25 su25 = new Su25(1200, "white", controlAirplane);
        su25.controlAirplane.startEngines();
        su25.controlAirplane.takeoffAirplane();

        su25.controlAirplane.motionForward();
        su25.controlAirplane.motionBackwards();
        su25.controlAirplane.motionDown();
        su25.controlAirplane.motionUp();

        su25.technologyStealth();
        su25.nuclearStrike();
        su25.turboBoost();

        su25.controlAirplane.landingAirplane();

    }
}
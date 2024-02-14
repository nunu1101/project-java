package com.ohgiraffers;

public class KaKaoBlue extends Taxi {
    public KaKaoBlue(){
        super("Blue", 5000, 500);
    }

    public KaKaoBlue(String type, double baseFare, double additionalFare) {
        super(type, baseFare, additionalFare);
    }

    @Override
    public double calcFare(double distance) {
        return getBaseFare() + Math.max(0, distance - 1000) / 1000 * getAdditionalFare();
    }
}

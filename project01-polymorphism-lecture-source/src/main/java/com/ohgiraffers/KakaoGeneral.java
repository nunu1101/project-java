package com.ohgiraffers;

public class KakaoGeneral extends Taxi {
    public KakaoGeneral(){
        super("General", 3000, 200);
    }

    public KakaoGeneral(String type, double baseFare, double additionalFare) {
        super(type, baseFare, additionalFare);
    }

    @Override
    public double calcFare(double distance) {
        return getBaseFare() + Math.max(0, distance - 1000) / 1000 * getAdditionalFare();
    }
}

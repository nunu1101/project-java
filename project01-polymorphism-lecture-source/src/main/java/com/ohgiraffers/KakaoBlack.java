package com.ohgiraffers;

public class KakaoBlack extends Taxi{
    public KakaoBlack(){
        super("Black", 10000, 1000);
    }

    public KakaoBlack(String type, double baseFare, double additionalFare) {
        super(type, baseFare, additionalFare);
    }

    @Override
    public double calcFare(double distance) {
        return getBaseFare() + Math.max(0, distance - 1000) / 1000 * getAdditionalFare();
    }
}

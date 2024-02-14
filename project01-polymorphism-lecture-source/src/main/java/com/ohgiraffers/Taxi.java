package com.ohgiraffers;

public abstract class Taxi {

    private String type; // 택시 종류
    private double baseFare; // 기본 요금
    private double additionalFare; // 추가 요금

    public Taxi(String type, double baseFare, double additionalFare){
        this.type = type;
        this.baseFare = baseFare;
        this.additionalFare = additionalFare;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBaseFare() {
        return baseFare;
    }

    public void setBaseFare(double baseFare) {
        this.baseFare = baseFare;
    }

    public double getAdditionalFare() {
        return additionalFare;
    }

    public void setAdditionalFare(double additionalFare) {
        this.additionalFare = additionalFare;
    }

    public abstract double calcFare(double distance); // 요금 계산

    public void waitPassenger(){
        System.out.println("승객을 기다립니다..");
    }
    public void drive(double distance){
        System.out.println("목적지를 향해 이동 중 입니다..");
        if (distance > 1000) {
            double totalFare = calcFare(distance);
            System.out.println("총 요금 : " + totalFare);
        }
    }

    public void stop(){
        System.out.println("목적지에 도착하였습니다..");
    }



}

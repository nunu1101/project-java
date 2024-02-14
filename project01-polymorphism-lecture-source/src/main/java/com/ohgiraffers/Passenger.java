package com.ohgiraffers;

import java.util.Scanner;

public class Passenger {
        private String name;
        private double distance;

        public Passenger(String name){
            this.name = name;
        }

        public void callTaxi(Taxi taxi, double distance){
            System.out.println(name + "이(가) 카카오 " + taxi.getType() + " 택시를 잡습니다.");
            try{Thread.sleep(2000);}catch (InterruptedException e) {
                e.printStackTrace();
            }
            taxi.waitPassenger();
            try{Thread.sleep(2000);}catch (InterruptedException e) {
                e.printStackTrace();
            }
            taxi.drive(distance);
            try{Thread.sleep(2000);}catch (InterruptedException e) {
                e.printStackTrace();
            }
            taxi.stop();
        }

        public void pay(String paymentMethod){
            System.out.println(paymentMethod + " (으)로 결제 합니다..");
        }

        public void lateForSchedule(int minutesLate, double distance) {
            Taxi taxi;
            Scanner sc = new Scanner(System.in);

            if (minutesLate <= 10){
                taxi = new KakaoGeneral();
            } else if (minutesLate <= 20) {
                taxi = new KaKaoBlue();
            } else if (minutesLate <= 30) {
                taxi = new KakaoBlack();
            } else {
                System.out.println("죄송합니다. 택시 이용이 많아 서비스를 지원할 수 없습니다..");
                sc.close();
                return;
            }

            callTaxi(taxi, distance);
            System.out.print("결제 방법을 알려주세요.(현금 또는 카드) : ");
            String paymentMethod = sc.nextLine();
            try{Thread.sleep(2000);}catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (!paymentMethod.equals("현금") && !paymentMethod.equals("카드")) {
                System.out.println("기사님께 결제해주세요");
                sc.close();
                return;
            }

            pay(paymentMethod);
            sc.close();
        }
}

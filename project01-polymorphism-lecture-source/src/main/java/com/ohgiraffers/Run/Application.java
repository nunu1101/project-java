package com.ohgiraffers.Run;

import com.ohgiraffers.Passenger;
import com.ohgiraffers.Taxi;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        /* Read Me */

        /* 승객과 택시의 상호작용 */

        /* 택시가 동작하는 것 */
        /*  1. 승객을 태우기 위해 기다린다.
         *  2. 승객이 목적지를 알려주면 해당 목적지까지 이동한다. ( 목적지 확인 후 1000m가 넘으면 200원씩 추가 (택시마다 기본금액 / 추가 금액 다름) )
         *  3. 목적지에 도착하면 이동을 멈춘다.
         *  5. 승객이 결제를 한다. ( cash or credit )
         */

        /* 승객의 행위 */
        /*  1. 약속에 늦었다면 택시를 호출한다.
         *  2. 택시를 호출할 때, 늦은 정도에 따라 택시 종류를 선택할 수 있다.
         *  3. 목적지와 거리를 설정한다.
         *  4. 목적지에 도착하면 택시를 내린다.
         *  5. 결제를 한다. ( cash or credit )
         */

        /* 카O오 택시의 다형성 */
        /* 1. 일반호출
         * 2. 블루호출
         * 3. 블랙호출
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("당신이 약속에 늦은 시각을 10분, 20분, 30분 단위로 적으세요 : ");
        int minutesLate = sc.nextInt();

        System.out.print("거리를 입력해주세요 : ");
        double distance = sc.nextDouble();

        Passenger passenger = new Passenger("누누");
        passenger.lateForSchedule(minutesLate, distance);

        sc.close();



    }
}

package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_switch {

    public void testSimpleSwitchStatement() {

        /* 수업목표. switch 문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        /* 필기.
        *   [switch 문 표현식]
        *   switch(비교할 변수) {
        *       case 비교값1 : 비교값1 과 일치하는 경우 실행할 구문; break;
        *       case 비교값2 : 비교값2 와 일치하는 경우 실행할 구문; break;
        *       default : case에 모두 해당하지 않는 경우 실행할 구문; break;
        *   }
        *  */

        /* 필기.
        *   여러 개의 비교값 중 일치하는 조건에 해당하는 로직을 실행하는 것은
        *   if - else - if 와 유사하다.
        *   따라서 일부 호환이 가능하다.
        *   하지만, switch 문으로 비교 가능한 값은 정수, 문자, 문자열의 형태이다.
        *   실수와 논리는 비교할 수 없다.
        *   또한 정확하게 일치하는 경우만 비교할 수 있으며, 대소비교를 할 수 없다는게
        *   차이점이다.
        *  */

        /* 필기.
        *   정수 두 개와 연산 기호 문자를 입력 받아서
        *   두 숫자의 연산 결과를 출력해보는 간단한 계산기를 만들어보자.
        *  */

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력해주세요 : ");
        int first = sc.nextInt();
        System.out.print("두 번째 정수를 입력해주세요 : ");
        int second = sc.nextInt();
        System.out.print("연산 기호 입력(+, -, *, /, %) : ");
        char op = sc.next().charAt(0);

        /* 연산의 결과를 저장할 변수 생성 */
        int result = 0;

        /* 입력한 연산기호 문자에 따라 연산의 결과가 달라짐 */
        switch (op) {
            case '+' :
                result = first + second;
                break;
            case '-' :
                result = first - second;
                break;
            case '*' :
                result = first * second;
                break;
            case '/' :
                result = first / second;
                break;
            case '%' :
                result = first % second;
                break;
        }

        System.out.println(first + " " + op + " " + second + " = " + result);

    }

}

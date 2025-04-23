package com.pcwk.ehr.projectcrud;
//Login
import java.util.Scanner;

public class Login {

    private static final String ADMIN_ID = "admin";
    private static final String ADMIN_PASSWORD = "1234";

    public static boolean login() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("관리자 ID: ");
        String inputId = scanner.nextLine();

        System.out.print("비밀번호: ");
        String inputPw = scanner.nextLine();

        if (inputId.equals(ADMIN_ID) && inputPw.equals(ADMIN_PASSWORD)) {
            System.out.println(" 로그인 성공! 관리자 모드로 진입합니다.");
            return true;
        } else {
            System.out.println(" 로그인 실패! 아이디 또는 비밀번호가 틀렸습니다.");
            return false;
        }
    }
}

//Login 테스트 코드
//
//public class Main {
//    public static void main(String[] args) {
//        if (Login.login()) {
//            // 관리자 메뉴 보여주기
//            System.out.println("여기에 등록/수정/삭제 기능 연결!");
//        } else {
//            System.out.println("메인 메뉴로 돌아갑니다...");
//        }
//    }
//}

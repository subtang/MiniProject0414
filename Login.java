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



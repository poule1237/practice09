package com.javaex.ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        ArrayList<Friend> friendList = new ArrayList<>();

        System.out.println("친구 3명의 정보를 등록해주세요");

        for (int i = 0; i < 3; i++) {
            System.out.print("입력: ");
            String line = scanner.nextLine();
            String[] parts = line.split(" "); // 공백으로 나누기

            // 예외처리: 입력이 정확히 3개 아닐 경우
            if (parts.length != 3) {
                System.out.println("입력 형식이 올바르지 않습니다. 다시 입력해주세요.");
                i--; // 다시 입력받기
                continue;
            }

            String name = parts[0];
            String hp = parts[1];
            String school = parts[2];

            friendList.add(new Friend(name, hp, school));
        }

        // 출력
        System.out.println("\n입력된 친구 정보:");
        for (Friend friend : friendList) {
            friend.showInfo();
        }

        scanner.close();
    }
}
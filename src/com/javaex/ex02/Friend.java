package com.javaex.ex02;

public class Friend {

    private String name;
    private String hp;
    private String school;
    
    // 생성자
    public Friend(String name, String hp, String school) {
        this.name = name;
        this.hp = hp;
        this.school = school;
    }

    // 출력 메서드
    public void showInfo() {
        System.out.println("이름: " + name + ", 핸드폰: " + hp + ", 학교: " + school);
    }
}



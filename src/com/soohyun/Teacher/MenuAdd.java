package com.soohyun.Teacher;

import java.util.Scanner;

public class MenuAdd {
	//음식등록
	public Food [] add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴 개수를 입력");
		int count = sc.nextInt();
		Food [] foods = new Food[count];
		
		for(int i=0; i<foods.length; i++) {
			Food food = new Food();
			System.out.println("음식명 입력");
			food.name = sc.next();
			System.out.println("가격 입력");
			food.price = sc.nextInt();
			System.out.println("재고 입력");
			food.amount = sc.nextInt();
			foods[i] = food;
		}//for문 끝
		
		
		return foods;
	}
}

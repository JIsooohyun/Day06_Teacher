package com.soohyun.Teacher;

import java.util.Scanner;

//메뉴를 선택하는 곳(1.음식주문 ? 2.최종결산)
public class MenuController {
	public void start() {

		//1.메뉴등록
		MenuAdd menuAdd = new MenuAdd();
		boolean check=true;
		Scanner sc = new Scanner(System.in);
		MenuView menuCount = new MenuView();


		Food [] foods = menuAdd.add();

		//1.몇개를 주문했는지 받을 수 있는 배열을 만든다.
		int [] counts = new int[foods.length];


		while(check) {
			System.out.println("1.음식주문 \t2.최종결산");
			int select = sc.nextInt();


			if(select == 1) {
				while(check) {
					for(int i=0; i<foods.length; i++) {
						System.out.println(i+1+". "+foods[i].name+" : "+foods[i].price);
					}
					System.out.println(foods.length+1+". 주문하기");
					select = sc.nextInt();
					if(select <=foods.length) {
						System.out.println("수량을 입력");
						counts[select-1]=sc.nextInt();   //배열에 수량 저장
					}else {
						//영수증을 출력하고 while문 탈출
						menuCount.orderView(foods, counts); // 영수증출력
						break;
					}
				}

			}else {
				menuCount.count(foods);   //결산출력과 영수증출력으로 합친다.


				//check =! check -> while문을 나가는 방법
				break;
			}

		}//while문

	}
}

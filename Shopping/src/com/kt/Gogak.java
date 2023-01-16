package com.kt;

import com.kt.entity.Computer;
import com.kt.entity.Product;
import com.kt.entity.Refrigerator;
import com.kt.entity.TV;

public class Gogak {
	private int money;
	private int amount=0;
	private Product[] basket = new Product[5];
	private int count;
	public Gogak(int money) {
		this.money = money;
	}
	
	public void addProduct(Product product) {
		if(money<product.getPrice()) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		
		//바구니가 꽉 찼을 경우 바구니 큰 걸로 교환
		if(basket.length<=count) {
			Product[] newBasket = new Product[basket.length*2];
			System.arraycopy(product, 0, newBasket, 0, basket.length);
			basket = newBasket;
		}
		
		basket[count++] = product;
		money -= product.getPrice();
		amount += product.getPrice();
		
		System.out.println("잔액: "+ money);
		
	}
	
	public void printBasket() {
		//구매 목록과 잔액을 출력
		//Computer : 1개
		//TV : 2개
		//사용 금액 : 5000원
		//잔액: 5000원
		int tvcnt=0, comcnt=0, refcnt=0;
		for(int i=0; i<count; i++) {
			if(basket[i] instanceof TV) {
				tvcnt++;
			}
			else if(basket[i] instanceof Computer) {
				comcnt++;
			}
			else if(basket[i] instanceof Refrigerator) {
				refcnt++;
			}
		}
		System.out.println("[구매내역 및 잔액]");
		System.out.printf("Computer : %d개\n",comcnt);
		System.out.printf("TV : %d\n",tvcnt);
		System.out.printf("Refrigerator : %d개\n",refcnt);
		System.out.printf("사용 금액: %d원\n",amount);
		System.out.printf("잔액 : %d원\n", money);
	}

	public void saleProductList(Product[] pros) {
		System.out.println("[제품목록 및 가격]");
		for(int i=0; i<pros.length; i++) {
			System.out.println(pros[i].getName()+"\t"+pros[i].getPrice()+"원");
		}
		System.out.println("---------------");
		System.out.println("잔액:" + money + "원");
		
	}
}

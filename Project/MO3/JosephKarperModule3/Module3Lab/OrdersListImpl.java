package com.olympic.cis143.m03.student.tacotruck.queue;

import java.util.ArrayList;

import com.olympic.cis143.m03.student.tacotruck.Orders;
import com.olympic.cis143.m03.student.tacotruck.TacoImpl;

public class OrdersListImpl implements Orders {

	ArrayList<TacoImpl> ordersList;
	/* Joseph Karper*/
	public OrdersListImpl() {
		ordersList = new ArrayList<>();
	}
	
	@Override
	public void addOrder(TacoImpl tacoOrder) {
		ordersList.add(tacoOrder);
		
	}

	@Override
	public boolean hasNext() {
		return (howManyOrders() > 0);
	}

	@Override
	public TacoImpl closeNextOrder() {
		TacoImpl nextTaco = ordersList.remove(0);
		return nextTaco;
	}

	@Override
	public int howManyOrders() {
		return ordersList.size();
	}

}

package com.olympic.cis143.m04.student.tacotruck.set;

import com.olympic.cis143.m04.student.tacotruck.Orders;
import com.olympic.cis143.m04.student.tacotruck.TacoImpl;
import java.util.HashSet;
import java.util.Set;

  /*Both tests were passing I do not know what happened from the time I stopped working on it until now */
public class OrdersSetImpl  implements Orders {
	private Set<TacoImpl> orders = new HashSet<>();
	
    @Override
    public void addOrder(TacoImpl tacoOrder) {
    	this.orders.add(tacoOrder);
    }

    @Override
    public boolean hasNext() {
    	return !this.orders.isEmpty();
    }

    @Override
    public TacoImpl closeNextOrder() {
        TacoImpl taco = (TacoImpl)(this.orders.toArray())[0];
        this.orders.remove(taco);
        return taco;
    }

    @Override
    public int howManyOrders() {
        return this.orders.size();
    }
}

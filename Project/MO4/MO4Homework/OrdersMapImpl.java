package com.olympic.cis143.m04.student.homework.tacotruckmap.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.olympic.cis143.m04.student.homework.tacotruckmap.OrderDoesNotExistException;
import com.olympic.cis143.m04.student.homework.tacotruckmap.Orders;
import com.olympic.cis143.m04.student.homework.tacotruckmap.OrdersTest;
import com.olympic.cis143.m04.student.homework.tacotruckmap.TacoImpl;
      /* Joseph Karper
       * CIS143 
       * I would like to turn this in with a late ticket*/
public class OrdersMapImpl implements Orders {
	private HashMap<String, List<TacoImpl>> tacoListById;
    public OrdersMapImpl() {
		tacoListById = new HashMap<>(); //init to empty map
	}
    @Override
    public void createOrder(final String orderid) {
      //idead: add an order to our map<orderif,[taco_list]>
      List<TacoImpl> list = new ArrayList<>();// can be declared this way //sp 
      tacoListById.put(orderid, list);
      //this.orders.put(orderid, new ArrayList<TacoImpl>());
    }

    @Override
    public void addTacoToOrder(final String orderid, final TacoImpl taco) throws OrderDoesNotExistException {
    	//map: id --> :List<Taco>
    	//get the list specified by the id
    	List<TacoImpl> list = tacoListById.get(orderid);
    	//check to see if order exists
    	if(list == null) {
    	throw new OrderDoesNotExistException("order id does not exist");
    	}
    	//add taco to the list
    	list.add(taco);
    	// can be done this way this.orders.get(orderid).add(taco); //sp
    }

    @Override
    public boolean hasNext() {
    	return false;
    	// need to check if empty return !this.orders.isEmpty();
    }

    @Override
    public List<TacoImpl> closeOrder(final String orderid) throws OrderDoesNotExistException {
    	// get list of tacosfor order 
    	List<TacoImpl> list = tacoListById.get(orderid);
    	//check if this order exists
    	if(list == null) {
    		//order does not exist
    		throw new OrderDoesNotExistException("order id does not exist");
    	}
    	tacoListById.remove(orderid);
    	return list;
    	// can be done this way return this.orders.remove(orderid); //sp
    }

    @Override
    public int howManyOrders() {
    	int numOrders = tacoListById.size();
    	return numOrders;
    }

    @Override
    public List<TacoImpl> getListOfOrders(final String orderid) throws OrderDoesNotExistException {
    	if(tacoListById.get(orderid) == null) {
    		//does not exist
    		throw new OrderDoesNotExistException("Order id does not exist");
    	}
        return tacoListById.get(orderid);
    }
}

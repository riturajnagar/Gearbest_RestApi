package com.gearbest.service;

import java.time.LocalDate;
import java.util.List;

import com.gearbest.exception.CartException;
import com.gearbest.exception.OrderException;
import com.gearbest.model.Order;

public interface OrderService {
	
	public Order addOrder(Order order, int cartId)throws OrderException,CartException;
	
	public Order viewOrder(int orderId)throws OrderException;
	
	public List<Order> viewOrdersByDate(LocalDate startDate, LocalDate endDate)throws OrderException;
	
	public Order updateOrderStatus(int orderId, String status)throws OrderException;
	
	public Order deleteOrder(int orderId)throws OrderException;
	
}

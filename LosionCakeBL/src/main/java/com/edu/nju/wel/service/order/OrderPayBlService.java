package com.edu.nju.wel.service.order;

import java.util.List;

import com.edu.nju.wel.model.Order;

/**
 * @author congye6
 *
 */
public interface OrderPayBlService {

	/**
	 * 结算订单
	 * @param order
	 * @param userId
	 * @param password
	 * @return
	 */
	public boolean pay(List<Order> orders,int userId,String password);
	
}

package com.edu.nju.wel.service.order;

import com.edu.nju.wel.domain.Order;

/**
 * @author congye6
 *
 */
public interface OrderCreateBlService {

	/**
	 * 计算订单总价
	 * @param order
	 * @return
	 */
	public double getPrice(Order order);
	
	/**
	 * 保存订单
	 * @param order
	 */
	public void saveOrder(Order order);
}

package com.edu.nju.wel.service.order;

import java.util.List;

import com.edu.nju.wel.model.Order;

/**
 * @author congye6
 *
 */
public interface OrderSearchStrategy {

	/**
	 * 搜索符合条件的订单
	 * @param order
	 * @return
	 */
	public List<Order> search(List<Order> order);
	
}

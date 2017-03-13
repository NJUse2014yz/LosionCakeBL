package com.edu.nju.wel.service.order;

import java.util.List;

import com.edu.nju.wel.domain.Order;

/**
 * @author congye6
 *
 */
public interface OrderSearchBlService {

	/**
	 * 获取用户所有订单
	 * @param userId
	 * @return
	 */
	public List<Order> getAllOrder(int userId);
	
	/**
	 * 获取用户未完成订单
	 * @param userId
	 * @return
	 */
	public List<Order> getUnfinishOrder(int userId);
	
	/**
	 * 根据策略筛选订单
	 * @param strategy
	 * @return
	 */
	public List<Order> getOrder(OrderSearchStrategy strategy,int userId);
	
}

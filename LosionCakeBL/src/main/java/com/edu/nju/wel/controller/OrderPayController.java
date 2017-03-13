package com.edu.nju.wel.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.edu.nju.wel.domain.Message;
import com.edu.nju.wel.domain.Order;

/**
 * @author congye6
 *
 */
public class OrderPayController {
	
	@RequestMapping(value="/pay",method=RequestMethod.POST)
	public Message pay(List<Order> orders, int userId, String password) {
		
		return new Message();
	}
}

package com.edu.nju.wel.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.edu.nju.wel.domain.Message;
import com.edu.nju.wel.domain.Order;

/**
 * @author congye6
 *
 */
public class OrderCreateController {

	@RequestMapping(value="/getPrice",method=RequestMethod.POST)
	public @ResponseBody double getPrice(@RequestBody Order order) {
		
		return 0;
	}

	@RequestMapping(value="/save",method=RequestMethod.POST)
	public @ResponseBody Message saveOrder(Order order) {
		return new Message();
		
	}
}

package com.edu.nju.wel.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.edu.nju.wel.domain.Message;
import com.edu.nju.wel.service.discount.DiscountInfoService;
import com.edu.nju.wel.service.discount.DiscountUpdateService;

/**
 * Created by YU Fan on 2017/3/11.
 */
@Controller
public class DiscountController {
	@Autowired
    private DiscountInfoService discountInfoService;
    @Autowired
    private DiscountUpdateService discountUpdateService;
    
    @RequestMapping(value="/insert_discount" , method= RequestMethod.POST)
    public Message insertDiscount(HttpServletRequest request, HttpServletResponse response){
    	Message message = new Message();
    	return message;
    }
    
    @RequestMapping(value="/delete_discount" , method=RequestMethod.POST)
    public Message deleteDiscount(@RequestParam("goodId") String goodId){
    	Message message = new Message();
    	return message;
    }
    @RequestMapping(value="/update_discount" , method=RequestMethod.POST)
    public Message updateDiscount(@RequestParam("goodId") String goodId){
    	Message message = new Message();
    	return message;
    }
    @RequestMapping(value="/get_discount" , method=RequestMethod.POST)
    public Message getDiscount(@RequestParam("goodId") String goodId){
    	Message message = new Message();
    	return message;
    }
}

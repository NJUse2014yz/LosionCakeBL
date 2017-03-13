package com.edu.nju.wel.service.discount;

import java.util.List;

import com.edu.nju.wel.model.Discount;

public interface DiscountUpdateService {
//	public List<Discount> getDiscount(int GoodID) throws Exception;
//	public List<Discount> getDiscount(String GoodName) throws Exception;
	public void changeDiscount(int GoodID,List<Discount> list) throws Exception;
	public void changeDiscount(String GoodName,List<Discount> list) throws Exception;
}

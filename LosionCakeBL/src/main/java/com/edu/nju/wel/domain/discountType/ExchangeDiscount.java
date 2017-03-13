package com.edu.nju.wel.model.discountType;

import com.edu.nju.wel.model.Discount;
@XmlRootElement(name="exchangediscount") // 标注类名为XML根节点
@XmlAccessorType(XmlAccessType.FIELD) // 表示将所有域作为XML节点
public class ExchangeDiscount extends Discount{
	public int requiredPoint;
	public double reduceAmount;
	public ExchangeDiscount(){
		super();
		GoodID=0
		requiredPoint=0.0;
		reduceAmount=0.0;
	}
}

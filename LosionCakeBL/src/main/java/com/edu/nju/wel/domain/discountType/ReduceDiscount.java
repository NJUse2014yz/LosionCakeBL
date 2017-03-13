package com.edu.nju.wel.model.discountType;

import com.edu.nju.wel.model.Discount;
@XmlRootElement(name="reducediscount") // 标注类名为XML根节点
@XmlAccessorType(XmlAccessType.FIELD) // 表示将所有域作为XML节点
public class ReduceDiscount extends Discount{
	public double requiredAmount;
	public double reduceAmount;
	public ReduceDiscount(){
		super();
		GoodID=0
		requiredAmount=0.0;
		reduceAmount=0.0;
	}
}

package com.edu.nju.wel.model.discountType;

import com.edu.nju.wel.model.Discount;
@XmlRootElement(name="cutdowndiscount") // 标注类名为XML根节点
@XmlAccessorType(XmlAccessType.FIELD) // 表示将所有域作为XML节点
public class CutdownDiscount extends Discount{
	public double percentage;
	public CutdownDiscount(){
		super();
		GoodID=0
		percentage=0.0;
	}
}

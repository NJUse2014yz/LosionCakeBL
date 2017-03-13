/**
 * <p>项目名称：restful
 * <p>Package名称：com.hnust.bean
 * 文件名称：Message.java 
 * 版本：1.00 
 * 创建日期：2014年11月2日
 * Copyright©2014 HNUST .All Rights Reserved.
 */
package com.edu.nju.wel.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *<p>类说明：
 * (这里用一句话描述这是一个什么样的类，格式：本类是XXXXXX。)
 * (这里用1~5句话描述这个类的功能是什么。 - 可选)
 * (这里介绍这个类涉及到的相关信息。 譬如，专有名词、概念的简单解释。 - 可选)
 * (这里介绍这个类在系统中的角色， 以及如何和其他类交互。 - 可选)
 * (这里介绍这个类的WHY，即为什么会存在这样一个类。 - 可选)
 * (这里介绍这个类的使用方法。 - 可选)
 * (这里是使用这个类的sample。 - 可选)
 * (这里是使用这个类的注意事项。 - 可选) 
 *
 *@author：Heweipo
 *@version 1.00
 *
 */
@XmlRootElement(name="message") // 标注类名为XML根节点
@XmlAccessorType(XmlAccessType.FIELD) // 表示将所有域作为XML节点
public class Message {
	
	// 信息的具体描述
	private String msg;
	// 信息成功与否
	private String result;

	private Object data;

	public Message(){
		// do nothing
	}

	public Message(String msg, String result) {
		super();
		this.msg = msg;
		this.result = result;
	}
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}


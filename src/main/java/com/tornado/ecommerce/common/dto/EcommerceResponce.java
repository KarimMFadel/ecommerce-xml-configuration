package com.tornado.ecommerce.common.dto;


import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EcommerceResponce implements Serializable{
	
	private String code;
	private String msg;
	private Object object;
	
	static public EcommerceResponce successResponce(String msg,Object object){
		return new EcommerceResponce("0000", msg, object);
	}
	
	static public EcommerceResponce failureResponce(String msg){
		return new EcommerceResponce("-1111", msg, null);
	}
	
	public EcommerceResponce(String code, String msg, Object object) {
		super();
		this.code = code;
		this.msg = msg;
		this.object = object;
	}
	public EcommerceResponce() {
		super();
	}

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}

}

package com.rrsalian.demorest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Alian {
	
	String name;
	int point;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	

}

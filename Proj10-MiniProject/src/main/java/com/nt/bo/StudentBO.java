package com.nt.bo;

import java.io.Serializable;

public class StudentBO implements Serializable {
private int rollNO;
private String name;
private String course;
private int year;
private int m1;
private int m2;
private int m3;
private String result;
private int total;
private float avg;
public int getRollNO() {
	return rollNO;
}
public void setRollNO(int rollNO) {
	this.rollNO = rollNO;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public int getM1() {
	return m1;
}
public void setM1(int m1) {
	this.m1 = m1;
}
public int getM2() {
	return m2;
}
public void setM2(int m2) {
	this.m2 = m2;
}
public int getM3() {
	return m3;
}
public void setM3(int m3) {
	this.m3 = m3;
}
public String getResult() {
	return result;
}
public void setResult(String result) {
	this.result = result;
}
public float getAvg() {
	return avg;
}
public void setAvg(float avg) {
	this.avg = avg;
}
public int getTotal() {
	return total;
}
public void setTotal(int total) {
	this.total = total;
}
}

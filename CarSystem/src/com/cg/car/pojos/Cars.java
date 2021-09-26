package com.cg.car.pojos;

import java.util.ArrayList;

public class Cars {
		int id ,avg;
		String name, fuleType;
		public Cars(int id, int avg, String name, String fuleType) {
			super();
			this.id = id;
			this.avg = avg;
			this.name = name;
			this.fuleType = fuleType;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getAvg() {
			return avg;
		}
		public void setAvg(int avg) {
			this.avg = avg;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getFuleType() {
			return fuleType;
		}
		public void setFuleType(String fuleType) {
			this.fuleType = fuleType;
		}
	}
	
	


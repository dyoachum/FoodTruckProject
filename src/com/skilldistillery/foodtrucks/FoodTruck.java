package com.skilldistillery.foodtrucks;

public class FoodTruck {
	public String name;
	public String foodType;
	public int rating;
	public int truckId;
	public static int nextTruckId = 001;
	
	public FoodTruck() {
		
	}
	
	public FoodTruck(String name, String foodType, int rating) {
		this.name = name;
		this.foodType = foodType;
		this.truckId = nextTruckId;
		this.rating = rating;
		nextTruckId++;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return foodType;
	}

	public void setType(String foodType) {
		this.foodType = foodType;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getTruckId() {
		return truckId;
	}

	public void setTruckId(int truckId) {
		this.truckId = truckId;
	}
	public  String toString() {
		String output = "Name : " + name + " Food Type : " + foodType + " Rating: " + rating + " Truck ID: " + truckId;
		return output;
	}
//	public  String displayTruck() {
//	    String truckData = this.toString();
//	    System.out.println(truckData);
//	    return truckData;
//	  }

}

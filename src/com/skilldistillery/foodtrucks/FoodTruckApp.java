package com.skilldistillery.foodtrucks;

import java.util.Scanner;

public class FoodTruckApp {
	static Scanner kb = new Scanner(System.in);
	public int MAX_TRUCKS = 5;


	public static void main(String[] args) {

		FoodTruck[] foodTruck = new FoodTruck[5];
		FoodTruckApp truckApp = new FoodTruckApp();
		foodTruck = truckApp.addFoodTruck(foodTruck);
		
		System.out.println("Welcome to the food truck app");
		foodTruck = truckApp.addFoodTruck(foodTruck);
		int choice = 0;
		while (choice != 4) {
		System.out.println("Choose from the following options 1-4");
		System.out.println("1.List all food trucks");
		System.out.println("2.Highest rated truck");
		System.out.println("3.Average truck rating");
		System.out.println("4.Quit program");
		choice = kb.nextInt();
		switch (choice) {
		case 1:
			truckApp.getFoodTrucks(foodTruck);
			break;
		case 2:
			truckApp.getHighestRating(foodTruck);
			break;
		case 3:
			truckApp.getAverage(foodTruck);
			break;
		case 4:
			System.out.println("GoodBye");
			break;
		default: 
			System.out.println("Invalid Input");
		}
		}
		kb.close();
	}



	public FoodTruck[] addFoodTruck(FoodTruck[] foodTruck) {
		for (int i = 0; i < foodTruck.length; i++) {

			System.out.println("Enter name of Food Truck: \nType Quit to go to Menu");
			String name = kb.nextLine();
			if (name.equalsIgnoreCase("Quit"))
				break;

			System.out.println("Enter food type: ");
			String foodType = kb.nextLine();
			
			System.out.println("Enter rating (1 - 5)of truck: ");
			int rating = kb.nextInt();
			kb.nextLine();
			foodTruck[i] = new FoodTruck(name, foodType, rating);
		}
		return foodTruck;
	}

	public void getFoodTrucks(FoodTruck[] foodTruck) {
		for (int i = 0; i < foodTruck.length; i++) {
			if (foodTruck[i] == null)
				break;
			
			System.out.println(foodTruck[i]);
		}

	}

	public void getAverage(FoodTruck[] foodTruck) {
		int counter = 0;
		double sum = 0;
		for (int i = 0; i < foodTruck.length; i++) {
			if (foodTruck[i] == null)
				break;
			sum += foodTruck[i].getRating();
			counter++;
		}
		sum /= counter;
		System.out.println("Average Rating: " + sum);
	}

	public void getHighestRating(FoodTruck[] foodTruck) {
		FoodTruck foodTRUCK = foodTruck[0];
		int highestRating = (foodTruck[0].getRating());
		for (int i = 1; i < foodTruck.length; i++) {
			if (foodTruck[i] == null)
				break;
			if (foodTruck[i].getRating() > highestRating) {
				foodTRUCK = foodTruck[i];
				highestRating = foodTruck[i].getRating();
			}
			System.out.println("Highest Rating: " + foodTRUCK);
		}
	}
}

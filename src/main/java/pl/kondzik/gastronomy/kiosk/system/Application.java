package pl.kondzik.gastronomy.kiosk.system;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.kondzik.gastronomy.kiosk.system.Product.*;
import pl.kondzik.gastronomy.kiosk.system.ProductRepositories.*;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner dataLoader(BurgerRepo burgerRepo, CoffeeRepo coffeeRepo, DessertRepo dessertRepo,
										DrinkRepo drinkRepo, ExtrasRepo extrasRepo, FriesRepo friesRepo,
										IceCreamRepo iceCramRepo, NuggetsRepo nuggetsRepo, WrapRepo wrapRepo) {
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				//BurgerRepo filling
				burgerRepo.save(new Burger(1L, "Jalapeno Burger", 6.50));
				burgerRepo.save(new Burger(2L, "Hamburger", 5.90));
				burgerRepo.save(new Burger(3L, "Chikker", 7.50));
				burgerRepo.save(new Burger(4L, "Cheeseburger", 6.50));
				burgerRepo.save(new Burger(5L, "McDouble", 9.90));
				burgerRepo.save(new Burger(6L, "McChicken", 16.70));
				burgerRepo.save(new Burger(7L, "Veggie Burger", 18.60));
				burgerRepo.save(new Burger(8L, "Wieśniak", 19.10));
				burgerRepo.save(new Burger(9L, "McRoyal", 19.10));
				burgerRepo.save(new Burger(10L, "Big Mac", 19.40));

				//CoffeeRepo filling
				coffeeRepo.save(new Coffee(1L, "Black Coffee", 8.90));
				coffeeRepo.save(new Coffee(2L, "Coffee with milk", 9.70));
				coffeeRepo.save(new Coffee(3L, "Flat White", 12.40));
				coffeeRepo.save(new Coffee(4L, "Caffe Latte", 12.40));
				coffeeRepo.save(new Coffee(5L, "Iced Latte", 14.40));
				coffeeRepo.save(new Coffee(6L, "Iced Caramel Latte", 15.30));
				coffeeRepo.save(new Coffee(7L, "Carmel Latte Macchiato", 16.60));

				//DessertRepo filling
				dessertRepo.save(new Dessert(1L,"Mango-passion fruit cake", 7.90));
				dessertRepo.save( new Dessert(2L,"Apple cake", 7.90));
				dessertRepo.save( new Dessert(3L,"Strawberry white chocolate muffin", 7.70));
				dessertRepo.save( new Dessert(4L,"Chocolate muffin", 7.70));
				dessertRepo.save( new Dessert(5L,"Nougat swirl", 7.70));
				dessertRepo.save( new Dessert(6L,"Butter croissant", 6.60));
				dessertRepo.save(new Dessert(7L,"Cocoa croissant", 7.70));
				dessertRepo.save( new Dessert(8L,"Salted caramel cookie", 6.60));
				dessertRepo.save( new Dessert(9L,"Oatcake", 6.60));
				dessertRepo.save( new Dessert(10L,"Chocolate chip cookie", 6.60));

				//DrinkRepo filling
				drinkRepo.save(new Drink(1L,"Still water", 8.70));
				drinkRepo.save(new Drink(2L,"Sparkling water", 8.70));
				drinkRepo.save(new Drink(3L,"Tea", 9.10));
				drinkRepo.save(new Drink(4L,"Lipton Ice Tea", 7.50));
				drinkRepo.save(new Drink(5L,"CocaCola", 7.50));
				drinkRepo.save(new Drink(6L,"CocaCola Zero", 7.50));
				drinkRepo.save(new Drink(7L,"Fanta", 7.50));
				drinkRepo.save(new Drink(8L,"Sprite", 7.50));
				drinkRepo.save(new Drink(9L,"Chocolate Shake", 8.90));
				drinkRepo.save(new Drink(10L,"Vanilla shake", 7.50));
				drinkRepo.save(new Drink(11L,"Strawberry Shake", 7.50));

				//ExtrasRepo filling
				extrasRepo.save(new Extras(1L,"Olive oil", 1.50));
				extrasRepo.save(new Extras(2L,"Ketchup", 1.50));
				extrasRepo.save(new Extras(3L,"Garlic sauce", 2.00));
				extrasRepo.save(new Extras(4L,"1000 Island sauce", 2.00));
				extrasRepo.save(new Extras(5L,"Mustard sauce", 2.00));
				extrasRepo.save(new Extras(6L,"Barbeque sauce", 2.00));
				extrasRepo.save(new Extras(7L,"Sweet and sour sauce", 2.00));
				extrasRepo.save(new Extras(8L,"Cream sauce", 2.00));
				extrasRepo.save(new Extras(9L ,"Dill sauce", 2.00));
				extrasRepo.save(new Extras(10L,"Vinaigrette sauce", 2.00));

				//FriesRepo filling
				friesRepo.save(new Fries(1L,"Small fries", 9.40));
				friesRepo.save(new Fries(2L,"Medium Fries", 10.50));
				friesRepo.save(new Fries(3L,"Large fries", 10.90));
				friesRepo.save( new Fries(4L,"Chopped Potatoes", 9.90));

				//IceCreamRepo filling
				iceCramRepo.save(new IceCream(1L,"Chocolate ice cream", 9.90));
				iceCramRepo.save( new IceCream(2L,"Strawberry ice cream", 9.90));
				iceCramRepo.save( new IceCream(3L,"Caramel cream ice cream", 9.90));
				iceCramRepo.save(  new IceCream(4L,"Chocolate ice cream with chocolate coating", 9.90));
				iceCramRepo.save( new IceCream(5L,"Chocolate ice cream with strawberry coating", 9.90));
				iceCramRepo.save(  new IceCream(6L,"Chocolate ice cream with caramel coating", 9.90));

				//NuggetsRepo filling
				nuggetsRepo.save(new Nuggets(1L,"Six McNuggets", 16.00));
				nuggetsRepo.save( new Nuggets(2L,"Nine McNuggets", 18.80));
				nuggetsRepo.save(   new Nuggets(3L,"Twenty McNuggets", 30.30));
				nuggetsRepo.save(   new Nuggets(4L,"Three Chicken Tenders", 16.70));
				nuggetsRepo.save(   new Nuggets(5L,"Five Chicken Tenders", 21.30));
				nuggetsRepo.save(  new Nuggets(6L,"ChickenBox", 43.40));

				//WrapRepo filling
				wrapRepo.save(new Wrap(1L,"McWrap Veggie", 18.60));
				wrapRepo.save(new Wrap(2L,"McWrap Crispy Classic", 19.90));
				wrapRepo.save(new Wrap(3L,"McWrap Crispy Bacon Deluxe", 20.50));
				wrapRepo.save(new Wrap(4L,"McWrap Supreme Chicken Sweet & Spicy", 22.70));

			}
		};
	}



}






















package fruit;

public class TestFruit {

	public static void main(String[] args) {

		//Vegetable vegetable = new Vegetable(); //No se puede es abstracta

	      //Part one: making a tomato
	      Tomato tomato = new Tomato();

	      System.out.println(FandVUtility.isThisARoot(tomato));
	      //output is: This is not a root
	      System.out.println(
	        FandVUtility.doesThisHaveAPeel(tomato));
	      //output is: This does not have a peel
	      System.out.println
	        (FandVUtility.doesThisHaveAPeelOrIsThisRoot
	          (tomato));
	      //output is: This neither has a peel or is a root


	      //Part two: making a fruit
	      //Fruit  = new Fruit();  
	        //can not instantiate an interface like 
	        //  this because Fruit is not a class
	      Fruit tomatoFruit = new Tomato();   
	        //can instantiate by interface like 
	        //  this because Tomato is a class


	      //System.out.println(
	      //  FandVUtility.isThisARoot(tomatoFruit));  
	        //can not treat tomatoFruit as a Vegetable 
	        //  without casting it to a Vegetable or Tomato
	      System.out.println(
	        FandVUtility.doesThisHaveAPeel(tomatoFruit));
	      //output is: This does not have a peel
	      System.out.println
	      	(FandVUtility.doesThisHaveAPeelOrIsThisRoot((Tomato) tomatoFruit)); 
	        //can not treat tomatoFruit as a Vegetable 
	        //  without casting it to a Vegetable or Tomato
	 
	   }
}

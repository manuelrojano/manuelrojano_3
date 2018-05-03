package fruit;

class Tomato implements Fruit, Vegetable { 


	   boolean peel = false;
	   boolean root = false;


	   public Tomato() {}   


	   public boolean hasAPeel()  
	   //must have this method, 
	   //  because Fruit declared it
	   { 
	      return peel; 
	   } 
	   
	   public boolean isARoot()  
	     //must have this method, 
	     //  because Vegetable declared it
	   { 
	      return root; 
	   }      
}
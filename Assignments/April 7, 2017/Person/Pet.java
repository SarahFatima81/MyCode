package corejavamultipleclasses;

public class Pet {
	
	public String name;
    public String color;
    public String breed;
    
   
	public Pet(String name, String color, String breed) {
		super();
		this.name = name;
		this.color = color;
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	
	public String toString()
	{
		return this.name + " " + this.color + " " + this.breed;
		
	}

	
	}
	
    
    


package logic;
import java.util.ArrayList;

public class SnakePart extends GameObject{
	ArrayList<String> snakePartArr = new ArrayList<String>();
	public SnakePart() {
		
	}
	
	
	public void addSnakePart(){
		System.out.println("Neues Element!");
	}
	
	public void updateCoordinate(){
		for (int i = 0; i < snakePartArr.length; i++) {
			//Change Coordinate for each Array element
		}
	}

}

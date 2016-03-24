package mongo.tp7;

import java.util.ArrayList;

import com.google.code.morphia.annotations.Entity;

@Entity
public class Article {
	private String name;
	private int stars;
	private ArrayList<Person> buyers;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStars() {
		return stars;
	}
	public void setStars(int stars) {
		this.stars = stars;
	}
	public ArrayList<Person> getBuyers() {
		return buyers;
	}
	public void setBuyers(ArrayList<Person> buyers) {
		this.buyers = buyers;
	}
	

}

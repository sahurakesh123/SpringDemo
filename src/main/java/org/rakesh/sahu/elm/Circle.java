package org.rakesh.sahu.elm;

public class Circle {

	private String type;
	private String radius;

	public String getRadius() {
		return radius;
	}

	public String getType() {
		return type;
	}

	public void draw() {
		System.out.println(getType() + " Circle printed of Radius " + getRadius());
	}

	/**
	 * @param type
	 */
	public Circle(String type, String radius) {
		this.type = type;
		this.radius = radius;
	}
}

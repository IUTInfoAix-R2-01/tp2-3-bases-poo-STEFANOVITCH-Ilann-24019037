package fr.IlannStefanovitch.Exo1;


public class Circle {
	
    private double radius ;
    private String color;
    
    public Circle() {
        radius = 1.0;
        setColor("red");
    }
    public Circle(double r) {
        radius = r;
        setColor("red");
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}

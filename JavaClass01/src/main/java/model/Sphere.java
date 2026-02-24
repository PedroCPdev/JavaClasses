package model;

public class Sphere implements ShapeInterface {

	private Double radius;

	public Sphere() {
	}

	public Sphere(Double radius) {
		setRadius(radius);
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public Double calculateVolume() {
		return (4 / 3) * Math.PI * Math.pow(radius, 3);
	}

}

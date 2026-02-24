package model;

public class Cube implements ShapeInterface {

	private Double edge;

	public Cube() {
	}

	public Cube(Double edge) {
		setEdge(edge);
	}

	public Double getEdge() {
		return edge;
	}

	public void setEdge(Double edge) {
		this.edge = edge;
	}

	@Override
	public Double calculateVolume() {
		return Math.pow(edge, 3);
	}

}

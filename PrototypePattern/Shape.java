public abstract class Shape implements Cloneable {

	private String id;
	protected String type;

	abstract void draw();

	public String getType() {
		return type

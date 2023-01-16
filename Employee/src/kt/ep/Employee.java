package kt.ep;

abstract public class Employee {
	private int id;
	private String name;
	public  Employee() {}
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public abstract int getPay();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "사번:"+id+", 이름:"+name;
	}
	
	
	
}

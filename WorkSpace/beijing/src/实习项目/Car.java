package 实习项目;

public class Car {
	private Integer id;
	private String name;
	private String state;
	public Car(Integer id, String name, String state) {
		super();
		this.id = id;
		this.name = name;
		this.state = state;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", state=" + state + "]";
	}
	
}

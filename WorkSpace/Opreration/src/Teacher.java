
public class Teacher {
	private String name;
	private String profession;
	private String kecheng;
	private int jiaoling;
	public Teacher(String name, String profession, String kecheng, int jiaoling) {
		super();
		this.name = name;
		this.profession = profession;
		this.kecheng = kecheng;
		this.jiaoling = jiaoling;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getKecheng() {
		return kecheng;
	}
	public void setKecheng(String kecheng) {
		this.kecheng = kecheng;
	}
	public int getJiaoling() {
		return jiaoling;
	}
	public void setJiaoling(int jiaoling) {
		this.jiaoling = jiaoling;
	}
	
}

package Project;

public class FoodVo {
	private int num;
	private String name;
	private int vote;
	
	public FoodVo() {
	}
	
	public FoodVo(String name) {
		this.name = name;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getVote() {
		return vote;
	}
	public void setVote(int vote) {
		this.vote = vote;
	}
	public FoodVo(int num, String name, int vote) {
		this.num = num;
		this.name = name;
		this.vote = vote;
	}
}

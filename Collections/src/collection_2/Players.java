package collection_2;

public class Players {
	private String name;
	private int age;
	private int runs;
	private int jerseyNo;
	private String teamName;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setRuns (int runs) {
		this.runs = runs;
	}
	public int getRuns() {
		return runs;
	}
	public void setJerseyNo(int jerseyNo) {
		this.jerseyNo = jerseyNo;
	}
	public int getJerseyNo() {
		return jerseyNo;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getTeamName() {
		return teamName;
	}
	
	public Players(String name, int age, int runs, int jerseyNo, String teamName) {
		this.name = name;
		this.age = age;
		this.runs = runs;
		this.jerseyNo = jerseyNo;
		this.teamName = teamName;
	}
	
	
	public String toString() {
		return name+" "+age+" "+runs+" "+jerseyNo+" "+teamName;
	}


}

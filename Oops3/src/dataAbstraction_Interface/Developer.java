package dataAbstraction_Interface;

public abstract class Developer implements Human {
	public String eat() {
		return " Day 3 Times Eatable";
	}
	public String sleep(int time) {
		if(time>9) {
			return time+" is Sleeping time";
		}
		else {
			return time+" is Working time";
		}
	}
	public abstract String workOut(int time);

}

package inheritanceRevice;

public class ActionMovie extends Movie {
	boolean actionScene(boolean isAction) {
		return isAction;
	}
	
	public static void main(String[] args) {
		ActionMovie mov = new ActionMovie();
		System.out.println(mov.movieType("black"));
		System.out.println(mov.length(250));
		System.out.println(mov.actionScene(true));
	}

}

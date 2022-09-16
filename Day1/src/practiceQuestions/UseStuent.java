package practiceQuestions;

public class UseStuent {
	public static void main(String[]args)
	{
		Student s=new Student();
		s.name="Siva";
		s.id=234;
		s.age=14;
		s.clas="IX";
		s.attePercent=75;
		
		s.totalWorkingDays=240;
		s.nODPresent=s.totalWorkingDays*s.attePercent/100;
		
		Student m=new Student();
		m.name="mani";
		m.id=236;
		m.age=15;
		m.clas="X";
		m.attePercent=80;
		m.nODPresent=s.totalWorkingDays*m.attePercent/100;
		
		Student k=new Student();
		k.name="Kavi";
		k.id=236;
		k.age=13;
		k.clas="IX";
		k.attePercent=100;
		k.nODPresent=s.totalWorkingDays*k.attePercent/100;
		
	
		System.out.println("Siva="+s.nODPresent);
		System.out.println("Mani="+m.nODPresent);
		System.out.println("Kavi="+k.nODPresent);	
	}

}
import java.util.ArrayList;

public class MainJava 
{

	public static void main(String[] args) 
	{
		ArrayList <measurable> myList = new ArrayList<measurable>();
		for(int i = 0; i<15;i++)
		{
			myList.add(new country(Math.random()*2000+100));
		}
		System.out.println("average poplation: "+findAverage(myList));
	}
	private static double findAverage(ArrayList<measurable> List)
	{
		double total = 0;
		int count= 0;
		for(measurable obj: List)
		{
			total+=;
		}
		return total/count;
	}
}

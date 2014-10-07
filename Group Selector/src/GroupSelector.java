import java.util.*;

public class GroupSelector
	{
	
	public static void main(String[] args)
		{
		
		Scanner file = new Scanner(new File ("classroster.txt"));	
	
//		get the number of students
		
	ArrayList <Student> gradebook = new ArrayList<Student>();
	int numberOfStudents = file.nextInt();
	
//	instantiate an ArrayList 
//
	for(int i = 0; i < numberOfStudents; i++ )
		{
		String firstName = file.next();
		String lastName = file.next();
		double score = file.nextDouble();
		}
	
	gradebook.setFirstName(i);
	

//	for loop - 0 to the numberOfStudents
//		firstName = file.next()
//		lastName = file.next()
//		score = file.nextDouble()
//		add ClassRoster data to ArrayList
//	
	
//	sort by score - use the comparator
//	Collections.sort(gradebook, new ScoreSorter());
	Collections.sort(gradebook, new ScoreSorter());

//	ask user how many groups they want
	System.out.println("How many groups would you like?");
	Scanner keyboard = new Scanner(System.in);
	int groups = keyboard.nextInt();
	
	
//	deal out into groups

//	sort by name
//	Collections.sort(gradebook , new NameSorter());
	Collections.sort(gradebook, new NameSorter());
//		return
//		Group number
//		names

		}
	}
	

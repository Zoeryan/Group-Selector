import java.util.Comparator;
public class NameSorter implements Comparator <GroupSelector>
	{
	
	public int compare(GroupSelector s1, GroupSelector s2)
		{
		return(s1.getLastName().compareTo(s2.getLastName()));
		}

	}

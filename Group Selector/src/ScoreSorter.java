import java.util.Comparator;
public class ScoreSorter implements Comparator <GroupSelector>
	{
	public int compare (GroupSelector s1, GroupSelector s2)
		{
		if(s1.getScore() < s2.getScore())
			return(1);
		
		else
			return(-1);
		}

	}

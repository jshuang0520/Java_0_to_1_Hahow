import java.util.ArrayList;
import java.util.List;

public interface DataHelper{
	// in java8, keyword "default" can make a method of an interface to be implemented
	default List<String[]> getData(){
		List<String[]> dataList = new ArrayList<String[]>();
		String[] row1 = new String[]{"1", "J.Hsiao", "Leader"};
		String[] row2 = new String[]{"2", "F.Hsiao", "Scientist"};
		String[] row3 = new String[]{"3", "J.Huang", "Engineer"};
		dataList.add(row1);
		dataList.add(row2);
		dataList.add(row3);
		return dataList;
	}
}
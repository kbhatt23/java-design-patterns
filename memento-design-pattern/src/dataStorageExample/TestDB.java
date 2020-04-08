package dataStorageExample;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestDB {

	public static void main(String[] args) {
		TableCareTaker careTaker = new TableCareTaker();
		DataBaseTable table = new DataBaseTable("kanishk_table");
		//first row
		List<String> properties = IntStream.range(1, 3)
			.boxed()
			.map(i -> new StringBuilder().append("value"+i))
			.map(StringBuilder::toString)
			.collect(Collectors.toList());
		table.addRowEntry(properties);
		
		List<String> properties1 = IntStream.range(4, 6)
				.boxed()
				.map(i -> new StringBuilder().append("value"+i))
				.map(StringBuilder::toString)
				.collect(Collectors.toList());
		
		table.addRowEntry(properties1);
		table.showAllRows();
		
		careTaker.saveDB(table);
		
		List<String> properties2 = IntStream.range(9, 11)
				.boxed()
				.map(i -> new StringBuilder().append("value"+i))
				.map(StringBuilder::toString)
				.collect(Collectors.toList());
		
		table.addRowEntry(properties2);
		table.showAllRows();
		
		careTaker.undo(table);
		
		table.showAllRows();
	}

}

package dataStorageExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Map.Entry;

//mimicking database table
public class DataBaseTable {
	private int initId = 108;
	private String tableName;
	//considering rows of string only
	private Map<Integer,List<String>> rows;
	public DataBaseTable(String tableName) {
		this.tableName = tableName;
		rows = new HashMap<Integer, List<String>>();
	}
	
	//assuming each row will have 3 columns
	public void addRowEntry(List<String> row) {
		rows.put(initId, row);
		initId++;
	}
	
	public void showAllRows() {
		rows.entrySet().forEach(entry -> {
			Integer id = entry.getKey();
			String restOfcolumnns =entry.getValue().stream().collect(Collectors.joining(" "));
			System.out.println("Row "+ id+ " "+restOfcolumnns);
			
		});
	}
	
	public Object saveDB() {
		return new TableMemento(this.tableName, this.rows);
	}
	
	public void undoDB(Object obj) {
		TableMemento mementoObj = (TableMemento)obj;
		this.tableName=mementoObj.tableName;
		this.rows=mementoObj.rows;
	}
	
	private class TableMemento{

		private String tableName;
		
		private Map<Integer,List<String>> rows;

		public TableMemento(String tableName, Map<Integer, List<String>> rowsCol) {
			this.tableName = tableName;
			//list is mutable object
			//hence modifyiung in client it will modify saved state too
			Map<Integer, List<String>> rowsColNew= rowsCol.entrySet()
					.stream()
					.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
			this.rows=rowsColNew;
		}
		
		
	}
}

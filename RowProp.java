package hello;

import java.util.List;

public class RowProp {
	private String rowId;
	private List<Properties> row;
	
	public RowProp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RowProp(String rowId, List<Properties> row) {
		super();
		this.rowId = rowId;
		this.row = row;
	}
	public String getRowId() {
		return rowId;
	}
	public void setRowId(String rowId) {
		this.rowId = rowId;
	}
	public List<Properties> getRow() {
		return row;
	}
	public void setRow(List<Properties> row) {
		this.row = row;
	}
	@Override
	public String toString() {
		return "rowProp [rowId=" + rowId + ", row=" + row + "]";
	}
	

}

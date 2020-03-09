package hello;

import java.util.Map;

public class Properties {
	private String rowPropId;
	private String label;
	private boolean readOnly;
	private Validator Validators;
	
	public Properties() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Properties(String rowPropId, String label, boolean readOnly,Validator validators) {
		super();
		this.rowPropId = rowPropId;
		this.label = label;
		this.readOnly = readOnly;
		Validators = validators;
	}
	public String getRowPropId() {
		return rowPropId;
	}
	public void setRowPropId(String rowPropId) {
		this.rowPropId = rowPropId;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public boolean isReadOnly() {
		return readOnly;
	}
	public void setReadOnly(boolean readOnly) {
		this.readOnly = readOnly;
	}
	public Validator getValidators() {
		return Validators;
	}
	public void setValidators(Validator validators) {
		Validators = validators;
	}
	@Override
	public String toString() {
		return "Properties [rowPropId=" + rowPropId + ", label=" + label + ", readOnly=" + readOnly + ", Validators="
				+ Validators + "]";
	}
	
	

}

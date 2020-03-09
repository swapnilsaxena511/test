package hello;

public class FormData {

	private String formId;
	private String rowId;
	private String rowPropId;
	private String label;
	private boolean readOnly;
	private String rowPropValidatorId;
	private boolean required;
	
	
	public FormData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FormData(String formId, String rowId, String rowPropId, String label, boolean readOnly,
			String rowPropValidatorId, boolean required) {
		super();
		this.formId = formId;
		this.rowId = rowId;
		this.rowPropId = rowPropId;
		this.label = label;
		this.readOnly = readOnly;
		this.rowPropValidatorId = rowPropValidatorId;
		this.required = required;
	}
	public String getFormId() {
		return formId;
	}
	public void setFormId(String formId) {
		this.formId = formId;
	}
	public String getRowId() {
		return rowId;
	}
	public void setRowId(String rowId) {
		this.rowId = rowId;
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
	public String getRowPropValidatorId() {
		return rowPropValidatorId;
	}
	public void setRowPropValidatorId(String rowPropValidatorId) {
		this.rowPropValidatorId = rowPropValidatorId;
	}
	public boolean isRequired() {
		return required;
	}
	public void setRequired(boolean required) {
		this.required = required;
	}
	
	
	
}

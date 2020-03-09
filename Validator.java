package hello;

public class Validator {
	private boolean required;
	private String rowPropValidatorId;
	
	public Validator(boolean required, String rowPropValidatorId) {
		super();
		this.required = required;
		this.rowPropValidatorId = rowPropValidatorId;
	}

	public Validator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Validator(boolean required) {
		super();
		this.required = required;
	}

	public boolean isRequired() {
		return required;
	}

	public void setRequired(boolean required) {
		this.required = required;
	}

	public String isValidatorId() {
		return rowPropValidatorId;
	}

	public void setValidatorId(String rowPropValidatorId) {
		this.rowPropValidatorId = rowPropValidatorId;
	}

	@Override
	public String toString() {
		return "Validator [required=" + required + ", rowPropValidatorId=" + rowPropValidatorId + "]";
	}
	
}

package ar.com.trinomio.mercadolibre;

public class Attributes {
	
	private String attribute_group_name;

	private long source;
	
	private String id;

	private String name;

	private String value_id;

	private String value_name;

	private String value_struct;

	private String attribute_group_id;

	public String getAttribute_group_name() {
		return attribute_group_name;
	}

	public void setAttribute_group_name(String attribute_group_name) {
		this.attribute_group_name = attribute_group_name;
	}

	public long getSource() {
		return source;
	}

	public void setSource(long source) {
		this.source = source;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue_id() {
		return value_id;
	}

	public void setValue_id(String value_id) {
		this.value_id = value_id;
	}

	public String getValue_name() {
		return value_name;
	}

	public void setValue_name(String value_name) {
		this.value_name = value_name;
	}

	public String getValue_struct() {
		return value_struct;
	}

	public void setValue_struct(String value_struct) {
		this.value_struct = value_struct;
	}

	public String getAttribute_group_id() {
		return attribute_group_id;
	}

	public void setAttribute_group_id(String attribute_group_id) {
		this.attribute_group_id = attribute_group_id;
	}
	
	public Attributes() {
		
	}
	

}

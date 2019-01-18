package ar.com.trinomio.mercadolibre;

public class Values {

	private String id;
	
	private String name;
	
	private int results;
	
	private PathFromRoot[] path_from_root;
	
	public int getResults() {
		return results;
	}

	public void setResults(int results) {
		this.results = results;
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
	
	

	public PathFromRoot[] getPath_from_root() {
		return path_from_root;
	}

	public void setPath_from_root(PathFromRoot[] path_from_root) {
		this.path_from_root = path_from_root;
	}

	private Values() {
		
	}
	
}

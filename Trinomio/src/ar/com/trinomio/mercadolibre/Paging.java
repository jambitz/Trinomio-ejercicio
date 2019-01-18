package ar.com.trinomio.mercadolibre;

public class Paging {

	private int total;
	
	private int offset;
	
	private int limit;
	
	private int primary_results;

	public Paging() {
		
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getPrimary_results() {
		return primary_results;
	}

	public void setPrimary_results(int primary_results) {
		this.primary_results = primary_results;
	}
	
}
	
	
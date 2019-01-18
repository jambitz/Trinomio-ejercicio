package ar.com.trinomio.mercadolibre;

import java.util.List;

public class Resultados {

	private String site_id;
	
	private Paging paging;

	private List<Results> results;
	
	private String[] secondary_results;

	private String[] related_results;
	
	private Sort sort;

	private AvailableSorts[]  available_sorts;
	
	private Filters[] filters;
	
	private AvailableFilters[] available_filters;
	
	public Resultados() {
		
	}
	
	
	public String[] getSecondary_results() {
		return secondary_results;
	}


	public void setSecondary_results(String[] secondary_results) {
		this.secondary_results = secondary_results;
	}


	public String[] getRelated_results() {
		return related_results;
	}


	public void setRelated_results(String[] related_results) {
		this.related_results = related_results;
	}


	public Sort getSort() {
		return sort;
	}


	public void setSort(Sort sort) {
		this.sort = sort;
	}


	public AvailableSorts[] getAvailable_sorts() {
		return available_sorts;
	}


	public void setAvailable_sorts(AvailableSorts[] available_sorts) {
		this.available_sorts = available_sorts;
	}


	public Filters[] getFilters() {
		return filters;
	}


	public void setFilters(Filters[] filters) {
		this.filters = filters;
	}


	public AvailableFilters[] getAvailable_filters() {
		return available_filters;
	}


	public void setAvailable_filters(AvailableFilters[] available_filters) {
		this.available_filters = available_filters;
	}


	public String getSite_id() {
		return site_id;
	}


	public void setSite_id(String site_id) {
		this.site_id = site_id;
	}


	public Paging getPaging() {
		return paging;
	}


	public void setPaging(Paging paging) {
		this.paging = paging;
	}


	public List<Results> getResults() {
		return results;
	}


	public void setResults(List<Results> results) {
		this.results = results;
	}





	

}

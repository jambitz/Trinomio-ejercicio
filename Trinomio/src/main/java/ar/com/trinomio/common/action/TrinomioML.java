package main.java.ar.com.trinomio.common.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import com.opensymphony.xwork2.ActionSupport;

import ar.com.trinomio.mercadolibre.Categoria;
import ar.com.trinomio.mercadolibre.Resultados;
import ar.com.trinomio.mercadolibre.Results;

public class TrinomioML extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final String REST_URI = "https://api.mercadolibre.com/sites/MLA/categories";

	private String categoriaElegida;
	private String idCategoriaElegida;
	private int publicaciones;
	private List<String> Idcategorias;
	private List<String> resultadosCategoria;
	HashMap<String, String> categorias;
	

	
	

	public Categoria[] getResponseCategorias() {
		   Client client = ClientBuilder.newClient();   
		   WebTarget target = client.target(REST_URI);
		   Categoria[] respuesta = target.request(MediaType.APPLICATION_JSON).get(Categoria[].class);
		   return respuesta;
		}
	
	public Resultados getResponseResultados() {
		Client client = ClientBuilder.newClient();   
		WebTarget target = client.target("https://api.mercadolibre.com/sites/MLA/search?category="+getIdCategoriaElegida()+"&official_store_id=all");
		Resultados respuesta = target.request(MediaType.APPLICATION_JSON).get(Resultados.class);
		return respuesta;
	}
	
	public List<String> getResultados() {
		
		resultadosCategoria = new ArrayList<String>();
		setPublicaciones(getResponseResultados().getPaging().getTotal());
		for(Results resultado : getResponseResultados().getResults()) {
			resultadosCategoria.add(resultado.getTitle());
			resultadosCategoria.add(resultado.getPrice().toString());
			resultadosCategoria.add(resultado.getSeller().getPower_seller_status());
			resultadosCategoria.add(resultado.getCondition());
			if(resultado.isAccepts_mercadopago()) {
				resultadosCategoria.add("Si");
			}else {
				resultadosCategoria.add("NO");
			}
			resultadosCategoria.add(resultado.getAvailable_quantity()+" / "+resultado.getSold_quantity());
			resultadosCategoria.add(resultado.getAddress().getState_name()+", "+resultado.getAddress().getCity_name());
			resultadosCategoria.add(resultado.getThumbnail());
			resultadosCategoria.add(resultado.getPermalink());
		}
		
		return resultadosCategoria;
		
	}
	
	public void setCategorias(HashMap<String, String> categorias) {
		this.categorias = categorias;
	}

	public HashMap<String, String> getCategorias() {
		return categorias;
	}

	public List<String> getResultadosCategoria() {
		return resultadosCategoria;
	}
	
	public void setResultadosCategoria(List<String> resultadosCategoria) {
		this.resultadosCategoria = resultadosCategoria;
	}
	

	
	public String getCategoriaElegida() {
		return categoriaElegida;
	}
	
	public void setCategoriaElegida(String categoriaElegida) {
		this.categoriaElegida = categorias.get(categoriaElegida);
		setIdCategoriaElegida(categoriaElegida);
		setResultadosCategoria(getResultados());
	}
	
	public String getCategoriaDefault() {
		return getResponseCategorias().getClass().getName();
	}
	
	public String getIdCategoriaElegida() {
		return idCategoriaElegida;
	}

	public void setIdCategoriaElegida(String idCategoriaElegida) {
		this.idCategoriaElegida = idCategoriaElegida;
	}
	
	
	public List<String> getIdcategorias() {
		return Idcategorias;
	}

	public void setIdcategorias(List<String> idcategorias) {
		Idcategorias = idcategorias;
	}

	
	
	public int getPublicaciones() {
		return publicaciones;
	}

	public void setPublicaciones(int publicaciones) {
		this.publicaciones = publicaciones;
	}

	public TrinomioML(){
		
		categorias = new HashMap<String, String>();
	

		for(Categoria categoria : getResponseCategorias()) {
			categorias.put(categoria.getId(), categoria.getName());
		}
	
		
	}


	public String execute() {
		return SUCCESS;
	}
	
	public String display() {
		return NONE;
	}
}

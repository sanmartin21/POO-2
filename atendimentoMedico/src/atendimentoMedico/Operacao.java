package atendimentoMedico;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Operacao {

	private Date inicio;
	private Date fim;
	
	
	public Date getInicio() {
		return inicio;
	}
	
	public void setInicio(String inicio) {
		try {
            this.inicio = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(inicio);
        } catch (ParseException ex) {
            Logger.getLogger(Operacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
	
	public Date getFim() {
		return fim;
	}
	
	public void setFim(String fim) {
		try {
            this.fim = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(fim);
        } catch (ParseException ex) {
            Logger.getLogger(Operacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
	
	
	public void tempoTotal(Date inicial, Date finall) {
		
		long diferencaInicial = finall.getTime() - inicial.getTime();
	

		List<TimeUnit> unidades = new ArrayList<TimeUnit>(EnumSet.allOf(TimeUnit.class));
	    Collections.reverse(unidades);

	   
	    Map<TimeUnit,Long> resultado = new LinkedHashMap<TimeUnit,Long>();
	    long restoMilesimo = diferencaInicial;

	    for ( TimeUnit unidade : unidades ) {

	    long diferenca = unidade.convert(restoMilesimo,TimeUnit.MILLISECONDS);
	    long difMilesimosUnidade = unidade.toMillis(diferenca);
	    restoMilesimo = restoMilesimo - difMilesimosUnidade;

	    resultado.put(unidade,diferenca); 
	    System.out.println(diferenca + " " + unidade);
	    
	    }
	   
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Operacao [inicio=");
		builder.append(inicio);
		builder.append(", fim=");
		builder.append(fim);
		builder.append(", getInicio()=");
		builder.append(getInicio());
		builder.append(", getFim()=");
		builder.append(getFim());
		builder.append("]");
		return builder.toString();
	}
	
	
}



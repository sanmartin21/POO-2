package injecaoDependenciaPersistenciaGenerics;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;


public class XmlGenerics <T> implements TipoPersistenciaGenerics {
	
	@Override
	public String persistir(AlunoGenerics object) {
		 XStream xml = new XStream(new DomDriver());
    return (xml.toXML(object));
	}

	

}

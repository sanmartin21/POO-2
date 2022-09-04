package injecaoDependenciaPersistencia;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class Xml implements TipoPersistencia{

	
	@Override
	public String persistir(Aluno object) {
		 XStream xml = new XStream(new DomDriver());
    return (xml.toXML(object));
	}
	
}

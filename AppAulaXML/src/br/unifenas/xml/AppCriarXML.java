package br.unifenas.xml;

import java.io.FileWriter;
import java.io.IOException;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

public class AppCriarXML {

	public static void main(String[] args) {
		
		Element empresa = new Element("empresa");
		Document doc = new Document(empresa);
		
		//funcionario 1
		Element func1 = new Element("funcionario");
		func1.setAttribute(new Attribute("id", "1"));
		func1.addContent(new Element("nome").setText("Maria"));
		func1.addContent(new Element("Sobrenome").setText("Silva"));
		func1.addContent(new Element("username").setText("maria.Silva"));
		func1.addContent(new Element("salario").setText("2000"));
		
		doc.getRootElement().addContent(func1);

		//funcionario 2
		Element func2 = new Element("funcionario");
		func1.setAttribute(new Attribute("id", "2"));
		func1.addContent(new Element("nome").setText("José"));
		func1.addContent(new Element("Sobrenome").setText("Silva"));
		func1.addContent(new Element("username").setText("José.Silva"));
		func1.addContent(new Element("salario").setText("3000"));
		doc.getRootElement().addContent(func2);
	
		XMLOutputter xmlOutput = new XMLOutputter();
		xmlOutput.setFormat(Format.getPrettyFormat());
		
		try {
			xmlOutput.output(doc,new FileWriter("arquivo.xml"));
			System.out.println("Arquivo gerado");
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	

}

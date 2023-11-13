package br.unicap.eng2.debuggin_squad.war.model;

public class Hello {

	static String messageImplemented() {
		return "Hello World";
	}

	static String messageNotImplemented() {
		throw new UnsupportedOperationException();
		
	}
}
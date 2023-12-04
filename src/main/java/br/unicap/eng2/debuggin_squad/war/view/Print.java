package br.unicap.eng2.debuggin_squad.war.view;

public class Print {

	public static void print() {
		System.out.println("Jogadores vivos:\n- "P1"/n- "P2"/n- "P3"\n- "P4);
	}

	public static String messageImplemented() {
		return "Hello World";
	}

	static String messageNotImplemented() {
		throw new UnsupportedOperationException();
		
	}
}
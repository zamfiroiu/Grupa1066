package codexistente_imprimanta;

public class DocumentPrintabil implements Printabil {

	@Override
	public void printeazaDocument() {
		System.out.println("se printeaza un document");
	}

	@Override
	public String scaneaza() {
		return "Scanare";
	}

}

package actiTime;

public class FirFoxBrowser implements WebBrowser {

	@Override
	public void close() {
		System.out.println("close firefox");
		
	}

	@Override
	public void quit() {
		System.out.println( " quit firefox");
		
	}

	@Override
	public void findElement() {
		System.out.println(" findelement in firefox");
	}

	@Override
	public void findElements() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getText() {
		// TODO Auto-generated method stub
		
	}

}

package codecheck;



public class App {
	public static void main(String[] args) {
		for (int i = 0, l = args.length; i < l; i++) {
			//String output = String.format("argv[%s]: %s", i, args[i]);
			String output = getResult(args[i]);
			System.out.println(output);
		}
	}

	private static String getResult(String param){
		final String IDIOT = "idiot";

		int i = Integer.parseInt(param);

		if ((i % 3 == 0) && (i <= 1000)){
			return IDIOT;
		} else {
			return null;
		}



	}
}

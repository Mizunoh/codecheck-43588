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
		final String STUPID = "stupid";

		int i = Integer.parseInt(param);

		// 3の倍数の1000以下の非負整数の場合、 idiot
		if ((i % 3 == 0) && (i <= 1000))
			return IDIOT;
		// 3のつく1000以下の非負整数の場合、 stupid
		else if ((param.contains("3")) && (i <= 1000)){
			return STUPID;
		} else {
			return null;
		}



	}
}

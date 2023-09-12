package utilities;

public class UtilFunc {
	
	public UtilFunc(){}
	
	public static boolean validadorSN(String resposta) {
		boolean SN = null != null;
		if (resposta.equals("S") || resposta.equals("N") && resposta != null) {
			SN = true;
		} else {
			SN = false;
		}
		return SN;
	}
}

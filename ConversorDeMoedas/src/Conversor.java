import javax.swing.JOptionPane;

public class Conversor {

	public static void main(String[] args) {
	
	String opcoes[] = {"Conversor de moedas", "Conversor de temperatura"};
	
	int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Conversor",
			JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes,opcoes[0]);
	
	if(escolha == 0) {
		String moedas[] = {"Converter de Reais a Dólar", "real euro", "real libra esterlinas",
				"real peso argentino", "real peso chileno","dolar a real",
				"euro a real","libras esterlinas a real",
				"peso argentino a real", "peso chileno a real"};
	
		String escolhaMoeda =(String) JOptionPane.showInputDialog(null, "Escolha a conversão: ", "moedas",
				JOptionPane.PLAIN_MESSAGE, null, moedas, moedas[0]);
		
		double valor = Double.parseDouble(JOptionPane.showInputDialog(null,
				"Digite o valor a ser convertido"));
		
		double resultado = 0.0;
		
		switch(escolhaMoeda) {
		case "Converter de Reais a Dólar":
			resultado = valor / 5.16;
			JOptionPane.showMessageDialog(null, resultado);
			
		}
		
		
	}
	
	}		        
}
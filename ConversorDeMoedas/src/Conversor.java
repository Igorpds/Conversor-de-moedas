import javax.swing.JOptionPane;

public class Conversor {

	public static void main(String[] args) {
	
	String opcoes[] = {"Conversor de moedas", "Conversor de temperatura"};
	
	int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Conversor",
			JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes,opcoes[0]);
	
	if(escolha == 0) {
		String moedas[] = {"Converter de Reais a Dólar", "Converter de Reais a Euro",
				"Converter de Reais a Libra Esterlinas",
				"Converter de Reais a Peso Argentino",
				"Converter de Reais a Peso Chileno","Converter de Dolar a Reais",
				"Converter de Euro a Reais","Converter de Libras Esterlinas a Reais",
				"Converter de Peso Argentino a Reais",
				"Converter de Peso chileno a Reais"};
	
		String escolhaMoeda =(String) JOptionPane.showInputDialog(null, "Escolha a conversão: ", "moedas",
				JOptionPane.PLAIN_MESSAGE, null, moedas, moedas[0]);
		
		double valor = Double.parseDouble(JOptionPane.showInputDialog(null,
				"Digite o valor a ser convertido"));
		
		double resultado = 0.0;
		
		switch(escolhaMoeda) {
		case "Converter de Reais a Dólar": //1
			resultado = valor / 5.16;
			JOptionPane.showMessageDialog(null, resultado);
			
		case "Converter de Reais a Euro": //2
			resultado = valor / 5.43; 
			
		case "Converter de Reais a Libra Esterlinas": //3
			resultado = valor / 6.11;
			
		case "Converter de Reais a Peso Argentino": //4
			resultado = valor / 0.026;
			
		case "Converter de Reais a Peso Chileno": //5
			resultado = valor / 0.0064;
			
		case "Converter de Dolar a Reais": //6
			resultado = valor * 5.16;
			
		case "Converter de Euro a Reais": //7
			resultado = valor * 5.43;
			
		case "Converter de Libras Esterlinas a Reais": //8
			resultado = valor * 6.11;
			
		case "Converter de Peso Argentino a Reais": //9
			resultado = valor * 0.026;
			
		case "Converter de Peso chileno a Reais": //10
			resultado = valor * 0.0064;
			
		}
		
		
	}
	
	}		        
}
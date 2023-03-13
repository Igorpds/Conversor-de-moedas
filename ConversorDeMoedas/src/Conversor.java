import javax.swing.JOptionPane;

public class Conversor {

	public static void main(String[] args) {

		boolean continuar = true;
		
		while(continuar) {
			
			String opcoes[] = { "Conversor de moedas", "Conversor de temperatura" };

			int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Conversor", JOptionPane.DEFAULT_OPTION,
					JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);

			if (escolha == 0) { // conversor de moedas
				String moedas[] = { "Converter de Reais a Dólar", "Converter de Reais a Euro",
						"Converter de Reais a Libra Esterlinas", "Converter de Reais a Peso Argentino",
						"Converter de Reais a Peso Chileno", "Converter de Dolar a Reais", "Converter de Euro a Reais",
						"Converter de Libras Esterlinas a Reais", "Converter de Peso Argentino a Reais",
						"Converter de Peso chileno a Reais" };

				String escolhaMoeda = (String) JOptionPane.showInputDialog(null, "Escolha a conversão: ", "moedas",
						JOptionPane.PLAIN_MESSAGE, null, moedas, moedas[0]);

				double valor = 0.0;
				boolean valorValido = false;
				
				while(!valorValido) {
					try {
						valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor a ser convertido"));
						valorValido = true;
					}catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Valor inválido. Por favor, digite um número válido.");
					}	
				}

				double resultado = 0.0;
				
				switch (escolhaMoeda) {
				case "Converter de Reais a Dólar": // 1
					resultado = valor / 5.16;
					JOptionPane.showMessageDialog(null, "O valor convertido é: US$" + String.format("%.2f", resultado));
					break;

				case "Converter de Reais a Euro": // 2
					resultado = valor / 5.43;
					JOptionPane.showMessageDialog(null, "O valor convertido é: €" + String.format("%.2f", resultado));
					break;
					
				case "Converter de Reais a Libra Esterlinas": // 3
					resultado = valor / 6.11;
					JOptionPane.showMessageDialog(null, "O valor convertido é: €" + String.format("%.2f", resultado , " £"));
					break;
					
				case "Converter de Reais a Peso Argentino": // 4
					resultado = valor / 0.026;
					JOptionPane.showMessageDialog(null, "O valor convertido é: €" + String.format("%.2f", resultado , " ARS$"));
					break;
					
				case "Converter de Reais a Peso Chileno": // 5
					resultado = valor / 0.0064;
					JOptionPane.showMessageDialog(null, "O valor convertido é: €" + String.format("%.2f", resultado , " CLP$"));
					break;
					
				case "Converter de Dolar a Reais": // 6
					resultado = valor * 5.16;
					JOptionPane.showMessageDialog(null, "O valor convertido é: €" + String.format("%.2f", resultado , " R$"));
					break;
					
				case "Converter de Euro a Reais": // 7
					resultado = valor * 5.43;
					JOptionPane.showMessageDialog(null, "O valor convertido é: €" + String.format("%.2f", resultado , " R$"));
					break;
					
				case "Converter de Libras Esterlinas a Reais": // 8
					resultado = valor * 6.11;
					JOptionPane.showMessageDialog(null, "O valor convertido é: €" + String.format("%.2f", resultado , " R$"));
					break;
					
				case "Converter de Peso Argentino a Reais": // 9
					resultado = valor * 0.026;
					JOptionPane.showMessageDialog(null, "O valor convertido é: €" + String.format("%.2f", resultado , " R$"));
					break;
					
				case "Converter de Peso chileno a Reais": // 10
					resultado = valor * 0.0064;
					JOptionPane.showMessageDialog(null, "O valor convertido é: €" + String.format("%.2f", resultado , " R$"));
					break;
					
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida");
				
				}
			} else if (escolha == 1) { // conversor de temperatura
				String temperaturas[] = { "Celsius para Fahrenheit", "Celsius para Kelvin", "Fahrenheit para Celsius",
						"Fahrenheit para Kelvin", "Kelvin para Celsius", "Kelvin para Fahrenheit" };

				String escolhaTemperatura = (String) JOptionPane.showInputDialog(null, " Escolha a temperatura",
						"Conversor temperatura", JOptionPane.PLAIN_MESSAGE, null, temperaturas, temperaturas[0]);

				double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a temperatura a ser convertida: "));

				double resultado = 0.0;

				switch (escolhaTemperatura) {
				
				case "Celsius para Fahrenheit":
					resultado = (valor * 1.8) + 32;
					JOptionPane.showMessageDialog(null,  "A temperatura convertida é : " + String.format("%.2f", resultado) + " °F");
					break;
					
				case "Celsius para Kelvin":
					resultado = valor + 273.15;
					JOptionPane.showMessageDialog(null,  "A temperatura convertida é : " + String.format("%.2f", resultado) + " K");
					break;
					
				case "Fahrenheit para Celsius":
					resultado = (valor - 32) / 1.8;
					JOptionPane.showMessageDialog(null,  "A temperatura convertida é : " + String.format("%.2f", resultado) + " ºC");
					break;
					
				case "Fahrenheit para Kelvin":
					resultado = (valor - 32)* 5 / 9 + 273.15;
					JOptionPane.showMessageDialog(null,  "A temperatura convertida é : " + String.format("%.2f", resultado) + " K");
					break;
					
				case "Kelvin para Celsius":
					resultado = valor - 273.15;
					JOptionPane.showMessageDialog(null,  "A temperatura convertida é : " + String.format("%.2f", resultado) + " ºC");
					break;
					
				case "Kelvin para Fahrenheit":
					resultado = (valor - 273.15) * 9 / 5 + 32;
					JOptionPane.showMessageDialog(null,  "A temperatura convertida é : " + String.format("%.2f", resultado) + " ºF");
					break;
					
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida");
					
				}

			}
			int resposta = JOptionPane.showConfirmDialog(null,"Deseja realizar outra conversão?","Conversor", JOptionPane.YES_NO_CANCEL_OPTION);
			
			if(resposta == JOptionPane.YES_OPTION) {
				continuar = true;
				
			}else if (resposta == JOptionPane.NO_OPTION) {
				JOptionPane.showMessageDialog(null, "Programa finalizado");
				continuar = false;
			
			}else {
				JOptionPane.showMessageDialog(null, "Programa concluído");
				continuar = false;
			}
		}
		
		

	}

}
import javax.swing.JOptionPane;

public class Conversor {

	public static void main(String[] args) {
		Object [] itens = {"Conversor de moedas", "Conversor de temperatura"};
		Object selectValue = JOptionPane.showInputDialog(null, "Escolha uma opção: ", "Menu", JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
		JOptionPane.showInputDialog(null, "Insira um valor: ");
		
		Object[] moedas = {"De reais a Dolares", "De reais a euros", "de reais a libras", "de reais a yenes", "de reais a won coreano", "de dolares a reais"," de euro a reais", "de libras a reais"};
	Object selectValue1 = JOptionPane.showInputDialog(null, "Escolha uma opção: ", "Moedas", JOptionPane.INFORMATION_MESSAGE,null, moedas, moedas[0]);
	JOptionPane.showMessageDialog(null," O valor convertido é de:","Message", JOptionPane.OK_OPTION, null);
	
	
	}
}

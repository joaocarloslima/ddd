import javax.swing.JOptionPane;

public class Hospital {
	public static void main(String[] args) {
		
		
		ProntuarioMedico prontuario = 
				new ProntuarioMedico();
		
		String stringAltura = JOptionPane.showInputDialog("Digite a altura do paciente");
		String stringPeso = JOptionPane.showInputDialog("Digite o peso do paciente");
		
		prontuario.setAltura(Double.valueOf(stringAltura));
		prontuario.setPeso(Double.valueOf(stringPeso));
		
		prontuario.setDiaDoNascimento(02);
		prontuario.setMesDoNascimento(06);
		prontuario.setAnoDoNascimento(2000);
		
		
		JOptionPane.showMessageDialog(null, prontuario, "Prontuário Médico", JOptionPane.WARNING_MESSAGE);
		
		//System.out.println(prontuario);
	}
}

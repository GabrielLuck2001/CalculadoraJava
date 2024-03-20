package calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class tela {

	private JFrame frmCalculadora;
	private JTextField txtField;
double numero1;
double numero2;
double resultado;
String operacao;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela window = new tela();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.getContentPane().setBackground(new Color(0, 0, 0));
		frmCalculadora.getContentPane().setForeground(new Color(255, 0, 128));
		frmCalculadora.setTitle("calculadora");
		frmCalculadora.setBounds(100, 100, 248, 388);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		txtField = new JTextField();
		txtField.setHorizontalAlignment(SwingConstants.RIGHT);
		txtField.setFont(new Font("Brush Script MT", Font.ITALIC, 25));
		txtField.setBounds(10, 11, 218, 38);
		frmCalculadora.getContentPane().add(txtField);
		txtField.setColumns(10);
		
		JButton btnc = new JButton("c");
		btnc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			txtField.setText("");
			}
		});
		btnc.setForeground(new Color(0, 0, 0));
		btnc.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnc.setBounds(181, 60, 47, 48);
		frmCalculadora.getContentPane().add(btnc);
		
		JButton btnsoma = new JButton("+");
		btnsoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "+";
			}
			});
		btnsoma.setForeground(new Color(0, 0, 0));
		btnsoma.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnsoma.setBounds(181, 119, 47, 48);
		frmCalculadora.getContentPane().add(btnsoma);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String IngressarNumero=txtField.getText()+btn9.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn9.setForeground(new Color(0, 0, 0));
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn9.setBounds(124, 119, 47, 48);
		frmCalculadora.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero=txtField.getText()+btn6.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn6.setBounds(124, 177, 47, 48);
		frmCalculadora.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero=txtField.getText()+btn3.getText();
				txtField.setText(IngressarNumero);}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn3.setBounds(124, 236, 47, 48);
		frmCalculadora.getContentPane().add(btn3);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero=txtField.getText()+btn5.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn5.setBounds(67, 178, 47, 48);
		frmCalculadora.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero=txtField.getText()+btn2.getText();
				txtField.setText(IngressarNumero);}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn2.setBounds(67, 236, 47, 48);
		frmCalculadora.getContentPane().add(btn2);
		
		JButton btnponto = new JButton(".");
		btnponto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero=txtField.getText()+btnponto.getText();
				txtField.setText(IngressarNumero);}
		});
		btnponto.setForeground(new Color(0, 0, 0));
		btnponto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnponto.setBounds(67, 295, 47, 48);
		frmCalculadora.getContentPane().add(btnponto);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero=txtField.getText()+btn8.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn8.setBounds(67, 119, 47, 48);
		frmCalculadora.getContentPane().add(btn8);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn0.setForeground(new Color(0, 0, 0));
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn0.setBounds(10, 295, 47, 48);
		frmCalculadora.getContentPane().add(btn0);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String IngressarNumero=txtField.getText()+btn1.getText();
			txtField.setText(IngressarNumero);
			}
		});
		btn1.setForeground(new Color(0, 0, 0));
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn1.setBounds(10, 236, 47, 48);
		frmCalculadora.getContentPane().add(btn1);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero=txtField.getText()+btn7.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn7.setBounds(10, 119, 47, 48);
		frmCalculadora.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero=txtField.getText()+btn4.getText();
				txtField.setText(IngressarNumero);
			
			}
			
		});
		btn4.setForeground(new Color(0, 0, 0));
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn4.setBounds(10, 177, 47, 48);
		frmCalculadora.getContentPane().add(btn4);
		
		JButton btnigual = new JButton("=");
		btnigual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String selecionar;
			numero2=Double.parseDouble(txtField.getText());
		if(operacao.equals("+")){
				 resultado = numero1+numero2;
				selecionar =String.format("%.0f", resultado);
				txtField.setText(selecionar);
			}else if(operacao.equals("-")) {
				resultado = numero1-numero2;
				selecionar =String.format("%.0f", resultado);
				txtField.setText(selecionar);
			}else if(operacao.equals("x")) {
				resultado = numero1*numero2;
				selecionar =String.format("%.0f", resultado);
				txtField.setText(selecionar);
			}else if(operacao.equals("/")) {
				resultado = numero1/numero2;
				selecionar =String.format("%.0f", resultado);
				txtField.setText(selecionar);
			}
			}
		});
		btnigual.setForeground(new Color(0, 0, 0));
		btnigual.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnigual.setBounds(124, 295, 47, 48);
		frmCalculadora.getContentPane().add(btnigual);
		
		JButton btnsub = new JButton("-");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "-";
			}
		});
		btnsub.setForeground(new Color(0, 0, 0));
		btnsub.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnsub.setBounds(181, 178, 47, 48);
		frmCalculadora.getContentPane().add(btnsub);
		
		JButton btnmult = new JButton("x");
		btnmult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "*";
			}
		});
		btnmult.setForeground(new Color(0, 0, 0));
		btnmult.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnmult.setBounds(181, 236, 47, 48);
		frmCalculadora.getContentPane().add(btnmult);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "/";
			}
		});
		btndiv.setForeground(new Color(0, 0, 0));
		btndiv.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btndiv.setBounds(181, 295, 47, 48);
		frmCalculadora.getContentPane().add(btndiv);
	}
}

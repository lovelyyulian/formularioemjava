import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormApp {
    
    public static void main(String[] args) {
        // Criar o frame (janela principal)
        JFrame frame = new JFrame("Formulário de Dados");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Criar o painel para adicionar os componentes
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2)); // Organizar componentes em grade

        // Criar os componentes de entrada
        JLabel nameLabel = new JLabel("Nome:");
        JTextField nameField = new JTextField(20);
        
        JLabel ageLabel = new JLabel("Idade:");
        JTextField ageField = new JTextField(20);
        
        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField(20);

        // Criar um botão de submissão
        JButton submitButton = new JButton("Submeter");

        // Área de texto para exibir os dados submetidos
        JTextArea resultArea = new JTextArea();
        resultArea.setEditable(false);

        // Adicionar os componentes ao painel
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(ageLabel);
        panel.add(ageField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(submitButton);

        // Adicionar o painel e a área de texto ao frame
        frame.add(panel, BorderLayout.NORTH);
        frame.add(new JScrollPane(resultArea), BorderLayout.CENTER);

        // Adicionar ação ao botão de submissão
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Capturar os dados informados
                String name = nameField.getText();
                String age = ageField.getText();
                String email = emailField.getText();

                // Exibir os dados na área de texto
                resultArea.setText("Dados Submetidos:\n");
                resultArea.append("Nome: " + name + "\n");
                resultArea.append("Idade: " + age + "\n");
                resultArea.append("Email: " + email + "\n");
            }
        });

        // Tornar a janela visível
        frame.setVisible(true);
    }
}

package aufgabe_4;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Screen extends JFrame {

    private static final Color GELB = new Color(255, 195, 20);
    private static final Color GRAU = new Color(190, 200, 215);
    private static final Color WEISS = Color.WHITE;
    
    private List<JButton> buttons = new ArrayList<>();

    public Screen() {
        setTitle("Periodensystem");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new GridLayout(15,15));
        mainPanel.setBackground(Color.WHITE);


     // 2 Labels
        mainPanel.add(createFillLabel());
        mainPanel.add(createFillLabel());

        // 11 Buttons
        for (int i = 0; i < 11; i++) {
            mainPanel.add(createButton());
        }

        // 3 Labels
        for (int i = 0; i < 3; i++) {
            mainPanel.add(createFillLabel());
        }

        // 13 graue Labels
        for (int i = 0; i < 13; i++) {
            mainPanel.add(createGreyLabel());
        }

        // 1 Label
        mainPanel.add(createFillLabel());


        // 11x:
        // 1 Button
        // 1 Grau
        // 11 Weiß
        // 1 Grau
        // 1 Button
        for (int i = 0; i < 11; i++) {

            mainPanel.add(createButton());

            mainPanel.add(createGreyLabel());

            for (int j = 0; j < 11; j++) {
                mainPanel.add(createWhiteLabel());
            }

            mainPanel.add(createGreyLabel());

            mainPanel.add(createButton());
        }


        // Am Ende:
        // 1 Label
        mainPanel.add(createFillLabel());

        // 13 Grau
        for (int i = 0; i < 13; i++) {
            mainPanel.add(createGreyLabel());
        }

        // 3 Labels
        for (int i = 0; i < 3; i++) {
            mainPanel.add(createFillLabel());
        }

        // 11 Buttons
        for (int i = 0; i < 11; i++) {
            mainPanel.add(createButton());
        }

        // 2 Labels
        mainPanel.add(createFillLabel());
        mainPanel.add(createFillLabel());




       

   
       
        
  
        
        


        add(mainPanel);

        setSize(1000, 1000);
        setLocationRelativeTo(null);
    }

    // ==========================================
    // BUTTON ERSTELLEN
    // ==========================================

    private JButton createButton() {

        JButton button = new JButton();
buttons.add(button);
        button.setBackground(GELB);
        button.setOpaque(true);
        button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        // Wichtig: Mindestgröße
        button.setBounds(0, 0, 70, 70);

        return button;
    }
    
    private JLabel createFillLabel() {
		JLabel label = new JLabel();
		//label.setPreferredSize(new Dimension(70, 70));
		//label.setMinimumSize(new Dimension(50, 50));
		label.setOpaque(true);
		return label;
	}
    
    private JLabel createWhiteLabel() {
    			JLabel label = new JLabel();
    			label.setBackground(WEISS);
    			label.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    			label.setOpaque(true);
    			return label;
    }
    
    private JLabel createGreyLabel() {
   		JLabel label = new JLabel();
   			label.setBackground(GRAU);
   			label.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
   			label.setOpaque(true);
   			return label;
   			
    	
    }

    // ==========================================
    // MAIN
    // ==========================================

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            Screen screen = new Screen();
            screen.setVisible(true);
        });
    }
}
package aufgabe_4;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Screen extends JFrame {
	
	
	private logic logic;
	private List<JLabel> fieldLabels = new ArrayList<>();

    private static final Color buttonColor1 = new Color(255, 195, 20);  //orange
    private static final Color buttonColor2 = new Color(60, 170, 255); // blau
    private static final Color buttonTextColor1 = new Color(150, 110, 10); //dunkelorange
    private static final Color buttonTextColor2 = new Color(45, 145, 225);   //dunkelblau
    private static final Color fieldColor1 = Color.WHITE; 				//weiß
    private static final Color fieldColor2 = new Color(190, 200, 215); //grau
    
    
    
    private List<JButton> buttons = new ArrayList<>();

    public Screen() {
    	logic = new logic();
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

        // 13 fieldColor2e Labels
        for (int i = 0; i < 13; i++) {
            mainPanel.add(createGreyLabel());
        }

        // 1 Label
        mainPanel.add(createFillLabel());


        // 11x:
        // 1 Button
        // 1 fieldColor2
        // 11 Weiß
        // 1 fieldColor2
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

        // 13 fieldColor2
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
        
        //Text nicht in einem Array weil die buttons in der Liste nicht in der richtigen Reihenfolge sind
        buttons.get(0).setText("1");
        buttons.get(1).setText("2");
        buttons.get(2).setText("3");
        buttons.get(3).setText("4");
        buttons.get(4).setText("5");
        buttons.get(5).setText("6");
        buttons.get(6).setText("7");
        buttons.get(7).setText("8");
        buttons.get(8).setText("9");
        buttons.get(9).setText("10");
        buttons.get(10).setText("11");
        buttons.get(11).setText("44");
        buttons.get(12).setText("12");
        buttons.get(13).setText("43");
        buttons.get(14).setText("13");
        buttons.get(15).setText("42");
        buttons.get(16).setText("14");
        buttons.get(17).setText("41");
        buttons.get(18).setText("15");
        buttons.get(19).setText("40");
        buttons.get(20).setText("16");
        buttons.get(21).setText("39");
        buttons.get(22).setText("17");
        buttons.get(23).setText("38");
        buttons.get(24).setText("18");
        buttons.get(25).setText("37");
        buttons.get(26).setText("19");
        buttons.get(27).setText("36");
        buttons.get(28).setText("20");
        buttons.get(29).setText("35");
        buttons.get(30).setText("21");
        buttons.get(31).setText("34");
        buttons.get(32).setText("22");
        buttons.get(33).setText("33");
        buttons.get(34).setText("32");
        buttons.get(35).setText("31");
        buttons.get(36).setText("30");
        buttons.get(37).setText("29");
        buttons.get(38).setText("28");
        buttons.get(39).setText("27");
        buttons.get(40).setText("26");
        buttons.get(41).setText("25");
        buttons.get(42).setText("24");
        buttons.get(43).setText("23");
        
        
        
        
        

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        for (JButton button : buttons) {
			button.setForeground(buttonTextColor1);
			button.setFont(new Font("Arial", Font.BOLD, 20));
		}
        
        
        
        
        for (JButton button : buttons) {

            button.addMouseListener(new MouseAdapter() {
                public void mouseEntered(MouseEvent e) {
                    button.setBackground(buttonColor2);
                    button.setForeground(buttonTextColor2);
                }

                public void mouseExited(MouseEvent e) {
                    button.setBackground(buttonColor1);
                    button.setForeground(buttonTextColor1);
                }
            });
        }




       

   
       
        
  
        
        


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
        button.setBackground(buttonColor1);
        button.setOpaque(true);
        button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

        // Wichtig: Mindestgröße
        button.setBounds(0, 0, 70, 70);

        return button;
    }
    
    private JLabel createFillLabel() {
		JLabel label = new JLabel();
		//label.setPreferredSize(new Dimension(70, 70));
		//label.setMinimumSize(new Dimension(50, 50));
		//label.setOpaque(true);
		return label;
	}
    
    private JLabel createWhiteLabel() {
    			JLabel label = new JLabel();
    			label.setBackground(fieldColor1);
    			label.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
    			label.setOpaque(true);
    			fieldLabels.add(label);
    			return fieldLabels.get(fieldLabels.size() - 1);
    }
    
    private JLabel createGreyLabel() {
   		JLabel label = new JLabel();
   			label.setBackground(fieldColor2);
   			label.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
   			label.setOpaque(true);
   			fieldLabels.add(label);
			return fieldLabels.get(fieldLabels.size() - 1);
    }
    
    
    private JLabel createBallLabel(Ball ball, JLabel label) {
		label.setOpaque(true);
		label.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setVerticalAlignment(SwingConstants.CENTER);

		if (ball.getColor().equals("blue")) {
			label.setBackground(Color.BLUE);
			label.setText("B");
			label.setForeground(Color.WHITE);
		} else if (ball.getColor().equals("red")) {
			label.setBackground(Color.RED);
			label.setText("R");
			label.setForeground(Color.WHITE);
		} else if (ball.getColor().equals("goal")) {
			label.setBackground(Color.GREEN);
			label.setText("G");
			label.setForeground(Color.WHITE);
		}

		return label;
    }
    
    
    private void updateBallPositions() {
        for (Ball ball : logic.getBallList()) {
			int x = ball.getPos()[0];
			int y = ball.getPos()[1];
			
			int index = y * 13 + x;
			createBallLabel(ball, fieldLabels.get(index));
			
			
			
			
		
		}
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
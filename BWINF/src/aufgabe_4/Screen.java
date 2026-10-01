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
    private static final Color ballColorBlue = new Color(60, 170, 255); // blau
    private static final Color ballColorRed = new Color(255, 60, 60); // rot
    private static final Color ballColorGoal  = new Color(255, 215, 0); // gold
    private int gameState = 1;
    private boolean blueTurn = true;
    
    
    
    private List<JButton> buttons = new ArrayList<>();

    public Screen() {
    	logic = new logic();
        setTitle("Periodensystem");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel bigPanel = new JPanel(new BorderLayout());
        JPanel mainPanel = new JPanel(new GridLayout(15,15));
        JPanel sidePanel = new JPanel(new GridLayout(5,1));
        //mainPanel.setBackground(Color.WHITE);


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
        
        
        JLabel sideLabel1 = new JLabel();
        JLabel sideLabel2 = new JLabel();
        JLabel sideLabel3 = new JLabel();
        JLabel sideLabel4 = new JLabel();
        JButton applyButton = new JButton("Throw!");
        applyButton.setBackground(buttonColor1);
        
        sidePanel.add(sideLabel1);
        sidePanel.add(sideLabel2);
        sidePanel.add(sideLabel3);
        sidePanel.add(sideLabel4);
        sidePanel.add(applyButton);
        
        sidePanel.setPreferredSize(new Dimension(50, 0));
        
        
        sidePanel.setPreferredSize(new Dimension(300, 0));

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
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
        //gameState = 2;

	//boolean blueTurn = gameState == 1;

        
        
        
        
        
	buttons.get(0).addActionListener(e -> tryPlaceBall(2, 1));
	buttons.get(1).addActionListener(e -> tryPlaceBall(3, 1));
	buttons.get(2).addActionListener(e -> tryPlaceBall(4, 1));
	buttons.get(3).addActionListener(e -> tryPlaceBall(5, 1));
	buttons.get(4).addActionListener(e -> tryPlaceBall(6, 1));
	buttons.get(5).addActionListener(e -> tryPlaceBall(7, 1));
	buttons.get(6).addActionListener(e -> tryPlaceBall(8, 1));
	buttons.get(7).addActionListener(e -> tryPlaceBall(9, 1));
	buttons.get(8).addActionListener(e -> tryPlaceBall(10, 1));
	buttons.get(9).addActionListener(e -> tryPlaceBall(11, 1));
	buttons.get(10).addActionListener(e -> tryPlaceBall(12, 1));

	buttons.get(11).addActionListener(e -> tryPlaceBall(1, 2));
	buttons.get(12).addActionListener(e -> tryPlaceBall(13, 2));
	buttons.get(13).addActionListener(e -> tryPlaceBall(1, 3));
	buttons.get(14).addActionListener(e -> tryPlaceBall(13, 3));
	buttons.get(15).addActionListener(e -> tryPlaceBall(1, 4));
	buttons.get(16).addActionListener(e -> tryPlaceBall(13, 4));
	buttons.get(17).addActionListener(e -> tryPlaceBall(1, 5));
	buttons.get(18).addActionListener(e -> tryPlaceBall(13, 5));
	buttons.get(19).addActionListener(e -> tryPlaceBall(1, 6));
	buttons.get(20).addActionListener(e -> tryPlaceBall(13, 6));
	buttons.get(21).addActionListener(e -> tryPlaceBall(1, 7));
	buttons.get(22).addActionListener(e -> tryPlaceBall(13, 7));
	buttons.get(23).addActionListener(e -> tryPlaceBall(1, 8));
	buttons.get(24).addActionListener(e -> tryPlaceBall(13, 8));
	buttons.get(25).addActionListener(e -> tryPlaceBall(1, 9));
	buttons.get(26).addActionListener(e -> tryPlaceBall(13, 9));
	buttons.get(27).addActionListener(e -> tryPlaceBall(1, 10));
	buttons.get(28).addActionListener(e -> tryPlaceBall(13, 10));
	buttons.get(29).addActionListener(e -> tryPlaceBall(1, 11));
	buttons.get(30).addActionListener(e -> tryPlaceBall(13, 11));
	buttons.get(31).addActionListener(e -> tryPlaceBall(1, 12));
	buttons.get(32).addActionListener(e -> tryPlaceBall(13, 12));
	

	buttons.get(33).addActionListener(e -> tryPlaceBall(2, 13));
	buttons.get(34).addActionListener(e -> tryPlaceBall(3, 13));
	buttons.get(35).addActionListener(e -> tryPlaceBall(4, 13));
	buttons.get(36).addActionListener(e -> tryPlaceBall(5, 13));
	buttons.get(37).addActionListener(e -> tryPlaceBall(6, 13));
	buttons.get(38).addActionListener(e -> tryPlaceBall(7, 13));
	buttons.get(39).addActionListener(e -> tryPlaceBall(8, 13));
	buttons.get(40).addActionListener(e -> tryPlaceBall(9, 13));
	buttons.get(41).addActionListener(e -> tryPlaceBall(10, 13));
	buttons.get(42).addActionListener(e -> tryPlaceBall(11, 13));
	buttons.get(43).addActionListener(e -> tryPlaceBall(12, 13));
	
	
	applyButton.addActionListener(e -> {

	    for (Ball ball : logic.getBallList()) {

	        if (!ball.getThrown() && gameState == 1) {
	        	System.out.println("debug");
	            // Zwischenobjekt erstellen
	            Ball newBall = new Ball(ball.getPos()[0], ball.getPos()[1], ball.getColor());

	            // Ball als geworfen markieren
	            newBall.setThrown(true);

	            // Ball pushen
	            logic.pushBall(newBall);

	            // Alten Ball durch den neuen ersetzen
	            logic.replaceBall(newBall, logic.getBallList().indexOf(ball));

	            // GameState ändern
	            gameState = 0;
	            System.out.println("GameState changed to: " + gameState);
	            blueTurn = !blueTurn;

	            // Nur einen Ball pro Klick
	            break;
	        }
	    }
	});

	

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

        updateBallPositions();

       

   
       
        
  
        
        
        bigPanel.add(mainPanel, BorderLayout.CENTER);
        bigPanel.add(sidePanel, BorderLayout.EAST);
        
        add(bigPanel);

        setSize(1300, 1000);
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
    
    
   /* private JLabel createBallLabel(Ball ball, JLabel label) {
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
    }*/
    
    
    private void updateBallPositions() {
    	
    	for (JLabel label : fieldLabels) {
    		removeCircle(label);
    	}
    	
        for (Ball ball : logic.getBallList()) {
			int x = ball.getPos()[0];
			int y = ball.getPos()[1];
			
			Color ballColor = Color.BLACK; // Default
			
			if (ball.getColor().equals("blue")) {ballColor = ballColorBlue;}
			if (ball.getColor().equals("red")) {ballColor = ballColorRed;}
			if (ball.getColor().equals("goal")) {ballColor = ballColorGoal;}
			
			
			
			int index = (y-1) * 13 + x-1;
			addCircle(fieldLabels.get(index), ballColor);
		}
    }
    
    
    public void addCircle(JLabel label, Color color) {
        label.setIcon(new Icon() {
            @Override
            public int getIconWidth() {
                return 20;
            }

            @Override
            public int getIconHeight() {
                return 20;
            }

            @Override
            public void paintIcon(Component c, Graphics g, int x, int y) {
                g.setColor(color);
                g.fillOval(x, y, 20, 20);
            }
        });
    }
    
    public void removeCircle(JLabel label) {
        label.setIcon(null);
    }
    
    public void tryPlaceBall(int x, int y) {

        if (gameState == 0) {
            return;
        }

        boolean targetIsClear = true;

        for (Ball ball : logic.getBallList()) {
            if (ball.getPos()[0] == x && ball.getPos()[1] == y) {
                targetIsClear = false;
                break;
            }
        }

        if (targetIsClear) {
            
            logic.placeBall(x, y, blueTurn);
            updateBallPositions();
        }
    }
    
    public logic getLogic() {
		return logic;
	}
    
    public int getGameState() {
		return gameState;
	}
    
    
    
    

    // ==========================================
    // MAIN
    // ==========================================

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            Screen screen = new Screen();
            screen.setVisible(true);

            Thread gameThread = new Thread(() -> {

                while (true) {

                    if (screen.getGameState() == 0) {

                        screen.getLogic().tick();
                        screen.updateBallPositions();
                        for (Ball ball : screen.getLogic().getBallList()) {
							if (ball.getMomentum().equals("rest")) {
								screen.gameState = 1;
								System.out.println("GameState changed to: " + screen.gameState);
							}
						}

                    }

                    try {
                        Thread.sleep(16); // ungefähr 60 FPS
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        break;
                    }
                }

            });

            gameThread.start();
        });
    }
}
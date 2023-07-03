package Primary.view;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class PrimaryView {
    public PrimaryView(){
        for(int i = 0; i < 4; i++){
            backIcon = new ImageIcon(backIcon.getImage().
                    getScaledInstance(60,60, BufferedImage.SCALE_SMOOTH));
            backButton[i] = new JButton();
            backButton[i].setIcon(backIcon);
            backButton[i].setFocusable(false);
            backButton[i].setContentAreaFilled(false);
            backButton[i].setBorderPainted(false);
            backButton[i].setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        }
    }

    // Subject Page
    private final JPanel subPrimaryPanel = new JPanel(new BorderLayout());
    // Simulation and Game Page
    private final JPanel simAndGamePrimaryPanel = new JPanel(new BorderLayout());
    // Sim
    // Counting and Comparing Page in Simulation Menu
    private final JPanel simCountingAndComparingPanel = new JPanel(new BorderLayout());
    // Counting and Comparing Page in Game Menu
    private final JPanel gameCountingAndComparingPanel = new JPanel(new BorderLayout());
    // Button
    private final JButton[] backButton = new JButton[4];
    private final JButton mathPrimaryButton = new JButton();
    private final JButton simPrimaryButton = new JButton("Simulation");
    private final JButton gamePrimaryButton = new JButton("Game");
    private final JButton countingSimButton = new JButton("Counting");
    private final JButton comparingSimButton = new JButton("Comparing");
    private final JButton countingGameButton = new JButton("Counting");
    private final JButton comparingGameButton = new JButton("Comparing");
    // Mathematics Icon
    ImageIcon mathIcon = new ImageIcon("src/assets/math.png");
    ImageIcon backIcon = new ImageIcon("src/assets/back.png");
    ImageIcon simIcon = new ImageIcon("src/assets/simulation.png");
    ImageIcon gameIcon = new ImageIcon("src/assets/game.png");
    ImageIcon countingIcon = new ImageIcon("src/assets/counting.png");
    ImageIcon comparingIcon = new ImageIcon("src/assets/comparing.png");
    // Color
    Color color = new Color(214, 255, 253);
    // Subject of Primary Level page
    public void mathPrimaryOption(){

        mathIcon = new ImageIcon(mathIcon.getImage().
                getScaledInstance(260,260, BufferedImage.SCALE_SMOOTH));

        subPrimaryPanel.setBackground(color);

        JPanel mathPanel = new JPanel();
        mathPanel.setBackground(color);
        mathPanel.setLayout(new GridBagLayout());

        mathPrimaryButton.setIcon(mathIcon);
        mathPrimaryButton.setText("Mathematics");
        mathPrimaryButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        mathPrimaryButton.setVerticalTextPosition(JButton.BOTTOM);
        mathPrimaryButton.setVerticalAlignment(JButton.TOP);
        mathPrimaryButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        mathPrimaryButton.setContentAreaFilled(false);
        mathPrimaryButton.setFocusable(false);
        mathPrimaryButton.setBorderPainted(false);
        mathPrimaryButton.setHorizontalTextPosition(JButton.CENTER);
        JLabel eduLevel = new JLabel("Primary School");
        eduLevel.setPreferredSize(new Dimension(390,70));
        eduLevel.setFont(new Font("Monospaced", Font.BOLD, 45));

        GridBagConstraints custom = new GridBagConstraints();
        custom.gridx = 0;
        custom.gridy = 0;
        custom.weighty = 0;
        custom.fill = GridBagConstraints.PAGE_START;
        mathPanel.add(eduLevel, custom);

        custom.gridx = 0;
        custom.gridy = 1;
        custom.weighty = 1;
        custom.insets = new Insets(0,0,150,0);
        custom.fill = GridBagConstraints.HORIZONTAL;
        mathPanel.add(mathPrimaryButton, custom);

        // Back Button
        JPanel backPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        backPanel.setPreferredSize(new Dimension(0,150));
        backPanel.setBackground(color);

        backIcon = new ImageIcon(backIcon.getImage().
                getScaledInstance(60,60, BufferedImage.SCALE_SMOOTH));


        backPanel.add(backButton[0]);

        subPrimaryPanel.add(backPanel, BorderLayout.PAGE_START);
        subPrimaryPanel.add(mathPanel, BorderLayout.CENTER);


    }

    // Inside the subject level, there are simulation and game
    public void simAndGamePrimaryOption(){
        simIcon = new ImageIcon(simIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));
        gameIcon = new ImageIcon(gameIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));

        JPanel subPanel = new JPanel(new GridBagLayout());
        subPanel.setBackground(color);

        simPrimaryButton.setIcon(simIcon);
        simPrimaryButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        simPrimaryButton.setVerticalTextPosition(JButton.BOTTOM);
        simPrimaryButton.setVerticalAlignment(JButton.TOP);
        simPrimaryButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        simPrimaryButton.setContentAreaFilled(false);
        simPrimaryButton.setFocusable(false);
        simPrimaryButton.setBorderPainted(false);
        simPrimaryButton.setHorizontalTextPosition(JButton.CENTER);

        gamePrimaryButton.setIcon(gameIcon);
        gamePrimaryButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        gamePrimaryButton.setVerticalTextPosition(JButton.BOTTOM);
        gamePrimaryButton.setVerticalAlignment(JButton.TOP);
        gamePrimaryButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        gamePrimaryButton.setContentAreaFilled(false);
        gamePrimaryButton.setFocusable(false);
        gamePrimaryButton.setBorderPainted(false);
        gamePrimaryButton.setHorizontalTextPosition(JButton.CENTER);

        JLabel eduLevel = new JLabel("Primary School");
        eduLevel.setPreferredSize(new Dimension(390,50));
        eduLevel.setFont(new Font("Monospaced", Font.BOLD, 45));

        GridBagConstraints custom = new GridBagConstraints();
        custom.gridx = 0;
        custom.gridy = 0;
        custom.gridwidth = 2;
        custom.fill = GridBagConstraints.PAGE_START;
        subPanel.add(eduLevel, custom);

        custom.gridx = 0;
        custom.gridy = 1;
        custom.weighty = 1;
        custom.gridwidth = 1;
        custom.insets = new Insets(0,0,150,50);
        custom.fill = GridBagConstraints.HORIZONTAL;
        subPanel.add(simPrimaryButton, custom);

        custom.gridx = 1;
        custom.gridy = 1;
        custom.weighty = 1;
        custom.insets = new Insets(0,50,150,0);
        custom.fill = GridBagConstraints.CENTER;
        subPanel.add(gamePrimaryButton, custom);

        JPanel backPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        backPanel.setPreferredSize(new Dimension(0,150));
        backPanel.setBackground(color);
        backPanel.add(backButton[1]);

        simAndGamePrimaryPanel.add(backPanel, BorderLayout.PAGE_START);
        simAndGamePrimaryPanel.add(subPanel, BorderLayout.CENTER);
    }

    public void simPrimaryLevel(){
        simCountingAndComparingPanel.setBackground(color);
        countingIcon = new ImageIcon(countingIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));
        comparingIcon = new ImageIcon(comparingIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));

        JPanel subPanel = new JPanel(new GridBagLayout());
        subPanel.setBackground(color);

        countingSimButton.setIcon(countingIcon);
        countingSimButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        countingSimButton.setVerticalTextPosition(JButton.BOTTOM);
        countingSimButton.setVerticalAlignment(JButton.TOP);
        countingSimButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        countingSimButton.setContentAreaFilled(false);
        countingSimButton.setFocusable(false);
        countingSimButton.setBorderPainted(false);
        countingSimButton.setHorizontalTextPosition(JButton.CENTER);

        comparingSimButton.setIcon(comparingIcon);
        comparingSimButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        comparingSimButton.setVerticalTextPosition(JButton.BOTTOM);
        comparingSimButton.setVerticalAlignment(JButton.TOP);
        comparingSimButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        comparingSimButton.setContentAreaFilled(false);
        comparingSimButton.setFocusable(false);
        comparingSimButton.setBorderPainted(false);
        comparingSimButton.setHorizontalTextPosition(JButton.CENTER);

        JLabel eduLevel = new JLabel("Primary School");
        eduLevel.setPreferredSize(new Dimension(390,50));
        eduLevel.setFont(new Font("Monospaced", Font.BOLD, 45));

        GridBagConstraints custom = new GridBagConstraints();
        custom.gridx = 0;
        custom.gridy = 0;
        custom.gridwidth = 2;
        custom.fill = GridBagConstraints.PAGE_START;
        subPanel.add(eduLevel, custom);

        custom.gridx = 0;
        custom.gridy = 1;
        custom.weighty = 1;
        custom.gridwidth = 1;
        custom.insets = new Insets(0,0,150,50);
        custom.fill = GridBagConstraints.HORIZONTAL;
        subPanel.add(countingSimButton, custom);

        custom.gridx = 1;
        custom.gridy = 1;
        custom.weighty = 1;
        custom.insets = new Insets(0,50,150,0);
        custom.fill = GridBagConstraints.CENTER;
        subPanel.add(comparingSimButton, custom);

        JPanel backPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        backPanel.setPreferredSize(new Dimension(0,150));
        backPanel.setBackground(color);
        backPanel.add(backButton[2]);

        simCountingAndComparingPanel.add(backPanel, BorderLayout.PAGE_START);
        simCountingAndComparingPanel.add(subPanel, BorderLayout.CENTER);
    }
    public void gamePrimaryLevel(){

        gameCountingAndComparingPanel.setBackground(color);
        countingIcon = new ImageIcon(countingIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));
        comparingIcon = new ImageIcon(comparingIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));

        countingGameButton.setIcon(countingIcon);
        countingGameButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        countingGameButton.setVerticalTextPosition(JButton.BOTTOM);
        countingGameButton.setVerticalAlignment(JButton.TOP);
        countingGameButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        countingGameButton.setContentAreaFilled(false);
        countingGameButton.setFocusable(false);
        countingGameButton.setBorderPainted(false);
        countingGameButton.setHorizontalTextPosition(JButton.CENTER);

        comparingGameButton.setIcon(comparingIcon);
        comparingGameButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        comparingGameButton.setVerticalTextPosition(JButton.BOTTOM);
        comparingGameButton.setVerticalAlignment(JButton.TOP);
        comparingGameButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        comparingGameButton.setContentAreaFilled(false);
        comparingGameButton.setFocusable(false);
        comparingGameButton.setBorderPainted(false);
        comparingGameButton.setHorizontalTextPosition(JButton.CENTER);

        JPanel subPanel = new JPanel(new GridBagLayout());
        subPanel.setBackground(color);

        JLabel eduLevel = new JLabel("Primary School");
        eduLevel.setPreferredSize(new Dimension(390,50));
        eduLevel.setFont(new Font("Monospaced", Font.BOLD, 45));

        GridBagConstraints custom = new GridBagConstraints();
        custom.gridx = 0;
        custom.gridy = 0;
        custom.gridwidth = 2;
        custom.fill = GridBagConstraints.PAGE_START;
        subPanel.add(eduLevel, custom);

        custom.gridx = 0;
        custom.gridy = 1;
        custom.weighty = 1;
        custom.gridwidth = 1;
        custom.insets = new Insets(0,0,150,50);
        custom.fill = GridBagConstraints.HORIZONTAL;
        subPanel.add(countingGameButton, custom);

        custom.gridx = 1;
        custom.gridy = 1;
        custom.weighty = 1;
        custom.insets = new Insets(0,50,150,0);
        custom.fill = GridBagConstraints.CENTER;
        subPanel.add(comparingGameButton, custom);

        JPanel backPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        backPanel.setPreferredSize(new Dimension(0,150));
        backPanel.setBackground(color);
        backPanel.add(backButton[3]);

        gameCountingAndComparingPanel.add(backPanel, BorderLayout.PAGE_START);
        gameCountingAndComparingPanel.add(subPanel, BorderLayout.CENTER);

    }
    //=========================
    // Get Panel
    public JPanel getSubPrimaryPanel(){
        return  subPrimaryPanel;
    }
    public JPanel getSimAndGamePrimaryPanel(){
        return simAndGamePrimaryPanel;
    }
    public JPanel getSimCountingAndComparingPanel(){
        return simCountingAndComparingPanel;
    }
    public JPanel getGameCountingAndComparingPanel(){
        return gameCountingAndComparingPanel;
    }
    //=========================
    // Get Button
    public JButton getMathPrimaryButton(){
        return mathPrimaryButton;
    }
    public JButton getSimPrimaryButton(){
        return simPrimaryButton;
    }
    public JButton getGamePrimaryButton(){
        return gamePrimaryButton;
    }

    //region get Back Button
    public JButton getBackButton0(){
        return backButton[0];
    }
    public JButton getBackButton1(){
        return backButton[1];
    }
    public JButton getBackButton2(){
        return backButton[2];
    }
    public JButton getBackButton3(){
        return backButton[3];
    }
    //endregion


}

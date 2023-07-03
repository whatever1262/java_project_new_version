package Elementary.view;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class ElementaryView {
    public ElementaryView(){
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
    private final JPanel subElementaryPanel = new JPanel(new BorderLayout());
    // Simulation and Game Page
    private final JPanel simAndGameElementaryPanel = new JPanel(new BorderLayout());

    /* Elementary School Panel */
    // Fragment and Area Builder in Simulation Menu
    private final JPanel simElementaryPanel = new JPanel(new BorderLayout());
    // Fragment and Area Builder in Game Menu
    private final JPanel gameElementaryPanel = new JPanel(new BorderLayout());
    // Button
    // Back Button
    private final JButton[] backButton = new JButton[4];
    private final JButton mathElementaryButton = new JButton();
    private final JButton simElementaryButton = new JButton("Simulation");
    private final JButton gameElementaryButton = new JButton("Game");
    private final JButton fractionSimButton = new JButton("Fraction");
    private final JButton areaSimButton = new JButton("Area & Perimeter");
    private final JButton fractionGameButton = new JButton("Fraction");
    private final JButton areaGameButton = new JButton("Area & Perimeter");
    // Mathematics Icon
    ImageIcon mathIcon = new ImageIcon("src/assets/math.png");
    ImageIcon backIcon = new ImageIcon("src/assets/back.png");
    ImageIcon simIcon = new ImageIcon("src/assets/simulation.png");
    ImageIcon gameIcon = new ImageIcon("src/assets/game.png");
    ImageIcon fractionIcon = new ImageIcon("src/assets/fraction.png");
    ImageIcon areaIcon = new ImageIcon("src/assets/area.png");
    // Color
    Color color = new Color(214, 255, 253);
    // Subject of Primary Level page
    public void mathElementaryOption(){

        mathIcon = new ImageIcon(mathIcon.getImage().
                getScaledInstance(260,260, BufferedImage.SCALE_SMOOTH));

        subElementaryPanel.setBackground(color);

        JPanel mathPanel = new JPanel();
        mathPanel.setBackground(color);
        mathPanel.setLayout(new GridBagLayout());

        mathElementaryButton.setIcon(mathIcon);
        mathElementaryButton.setText("Mathematics");
        mathElementaryButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        mathElementaryButton.setVerticalTextPosition(JButton.BOTTOM);
        mathElementaryButton.setVerticalAlignment(JButton.TOP);
        mathElementaryButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        mathElementaryButton.setContentAreaFilled(false);
        mathElementaryButton.setFocusable(false);
        mathElementaryButton.setBorderPainted(false);
        mathElementaryButton.setHorizontalTextPosition(JButton.CENTER);
        JLabel eduLevel = new JLabel("Elementary School");
        eduLevel.setPreferredSize(new Dimension(470,70));
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
        mathPanel.add(mathElementaryButton, custom);

        // Back Button
        JPanel backPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        backPanel.setPreferredSize(new Dimension(0,150));
        backPanel.setBackground(color);

        backIcon = new ImageIcon(backIcon.getImage().
                getScaledInstance(60,60, BufferedImage.SCALE_SMOOTH));


        backPanel.add(backButton[0]);

        subElementaryPanel.add(backPanel, BorderLayout.PAGE_START);
        subElementaryPanel.add(mathPanel, BorderLayout.CENTER);


    }

    // Inside the subject level, there are simulation and game
    public void simAndGameElementaryOption(){
        simIcon = new ImageIcon(simIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));
        gameIcon = new ImageIcon(gameIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));

        JPanel subPanel = new JPanel(new GridBagLayout());
        subPanel.setBackground(color);

        simElementaryButton.setIcon(simIcon);
        simElementaryButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        simElementaryButton.setVerticalTextPosition(JButton.BOTTOM);
        simElementaryButton.setVerticalAlignment(JButton.TOP);
        simElementaryButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        simElementaryButton.setContentAreaFilled(false);
        simElementaryButton.setFocusable(false);
        simElementaryButton.setBorderPainted(false);
        simElementaryButton.setHorizontalTextPosition(JButton.CENTER);

        gameElementaryButton.setIcon(gameIcon);
        gameElementaryButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        gameElementaryButton.setVerticalTextPosition(JButton.BOTTOM);
        gameElementaryButton.setVerticalAlignment(JButton.TOP);
        gameElementaryButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        gameElementaryButton.setContentAreaFilled(false);
        gameElementaryButton.setFocusable(false);
        gameElementaryButton.setBorderPainted(false);
        gameElementaryButton.setHorizontalTextPosition(JButton.CENTER);

        JLabel eduLevel = new JLabel("Elementary School");
        eduLevel.setPreferredSize(new Dimension(470,70));
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
        subPanel.add(simElementaryButton, custom);

        custom.gridx = 1;
        custom.gridy = 1;
        custom.weighty = 1;
        custom.insets = new Insets(0,50,150,0);
        custom.fill = GridBagConstraints.CENTER;
        subPanel.add(gameElementaryButton, custom);

        JPanel backPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        backPanel.setPreferredSize(new Dimension(0,150));
        backPanel.setBackground(color);
        backPanel.add(backButton[1]);

        simAndGameElementaryPanel.add(backPanel, BorderLayout.PAGE_START);
        simAndGameElementaryPanel.add(subPanel, BorderLayout.CENTER);
    }

    public void simElementaryLevel(){
        simElementaryPanel.setBackground(color);
        fractionIcon = new ImageIcon(fractionIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));
        areaIcon = new ImageIcon(areaIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));

        JPanel subPanel = new JPanel(new GridBagLayout());
        subPanel.setBackground(color);

        fractionSimButton.setIcon(fractionIcon);
        fractionSimButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        fractionSimButton.setVerticalTextPosition(JButton.BOTTOM);
        fractionSimButton.setVerticalAlignment(JButton.TOP);
        fractionSimButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        fractionSimButton.setContentAreaFilled(false);
        fractionSimButton.setFocusable(false);
        fractionSimButton.setBorderPainted(false);
        fractionSimButton.setHorizontalTextPosition(JButton.CENTER);

        areaSimButton.setIcon(areaIcon);
        areaSimButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        areaSimButton.setVerticalTextPosition(JButton.BOTTOM);
        areaSimButton.setVerticalAlignment(JButton.TOP);
        areaSimButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        areaSimButton.setContentAreaFilled(false);
        areaSimButton.setFocusable(false);
        areaSimButton.setBorderPainted(false);
        areaSimButton.setHorizontalTextPosition(JButton.CENTER);

        JLabel eduLevel = new JLabel("Elementary School");
        eduLevel.setPreferredSize(new Dimension(470,70));
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
        subPanel.add(fractionSimButton, custom);

        custom.gridx = 1;
        custom.gridy = 1;
        custom.weighty = 1;
        custom.insets = new Insets(0,50,150,0);
        custom.fill = GridBagConstraints.CENTER;
        subPanel.add(areaSimButton, custom);

        JPanel backPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        backPanel.setPreferredSize(new Dimension(0,150));
        backPanel.setBackground(color);
        backPanel.add(backButton[2]);

        simElementaryPanel.add(backPanel, BorderLayout.PAGE_START);
        simElementaryPanel.add(subPanel, BorderLayout.CENTER);
    }
    public void gameElementaryLevel(){

        gameElementaryPanel.setBackground(color);
        fractionIcon = new ImageIcon(fractionIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));
        areaIcon = new ImageIcon(areaIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));

        fractionGameButton.setIcon(fractionIcon);
        fractionGameButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        fractionGameButton.setVerticalTextPosition(JButton.BOTTOM);
        fractionGameButton.setVerticalAlignment(JButton.TOP);
        fractionGameButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        fractionGameButton.setContentAreaFilled(false);
        fractionGameButton.setFocusable(false);
        fractionGameButton.setBorderPainted(false);
        fractionGameButton.setHorizontalTextPosition(JButton.CENTER);

        areaGameButton.setIcon(areaIcon);
        areaGameButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        areaGameButton.setVerticalTextPosition(JButton.BOTTOM);
        areaGameButton.setVerticalAlignment(JButton.TOP);
        areaGameButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        areaGameButton.setContentAreaFilled(false);
        areaGameButton.setFocusable(false);
        areaGameButton.setBorderPainted(false);
        areaGameButton.setHorizontalTextPosition(JButton.CENTER);

        JPanel subPanel = new JPanel(new GridBagLayout());
        subPanel.setBackground(color);

        JLabel eduLevel = new JLabel("Elementary School");
        eduLevel.setPreferredSize(new Dimension(470,70));
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
        subPanel.add(fractionGameButton, custom);

        custom.gridx = 1;
        custom.gridy = 1;
        custom.weighty = 1;
        custom.insets = new Insets(0,50,150,0);
        custom.fill = GridBagConstraints.CENTER;
        subPanel.add(areaGameButton, custom);

        JPanel backPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        backPanel.setPreferredSize(new Dimension(0,150));
        backPanel.setBackground(color);
        backPanel.add(backButton[3]);

        gameElementaryPanel.add(backPanel, BorderLayout.PAGE_START);
        gameElementaryPanel.add(subPanel, BorderLayout.CENTER);

    }
    //=========================
    // Get Panel
    public JPanel getSubElementaryPanel(){
        return subElementaryPanel;
    }
    public JPanel getSimAndGameElementaryPanel(){
        return simAndGameElementaryPanel;
    }
    public JPanel getSimElementaryPanel(){
        return simElementaryPanel;
    }
    public JPanel getGameElementaryPanel(){
        return gameElementaryPanel;
    }
    //=========================
    // Get Button
    public JButton getMathElementaryButton(){
        return mathElementaryButton;
    }
    public JButton getSimElementaryButton(){
        return simElementaryButton;
    }
    public JButton getGameElementaryButton(){
        return gameElementaryButton;
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

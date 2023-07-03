package High_School.view;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class HighSchoolView {

    public HighSchoolView(){
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

    // Color and Icon
    Color color = new Color(214, 255, 253);
    ImageIcon backIcon = new ImageIcon("src/assets/back.png");

    /* High School Panel */
    private final JPanel subHighSchoolPanel = new JPanel(new BorderLayout());
    private final JPanel mathHSPanel = new JPanel(new BorderLayout());
    private final JPanel physicHSPanel = new JPanel(new BorderLayout());
    private final JPanel chemHSPanel = new JPanel(new BorderLayout());

    //region High School Button
    private final JButton[] backButton = new JButton[4];
    private final JButton mathHSButton = new JButton("Mathematics");
    private final JButton physicHSButton = new JButton("Physic");
    private final JButton chemHSButton = new JButton("Chemistry");
    private final JButton lineSimButton = new JButton("Line");
    private final JButton quadraticButton = new JButton("Quadratic");
    private final JButton parabolaButton = new JButton("Parabola");
    private final JButton waveButton = new JButton("Wave");
    private final JButton laboratoryButton = new JButton("Laboratory");
    //endregion

    public void subjectHighSchool(){
        ImageIcon mathIcon = new ImageIcon("src/assets/math.png");
        mathIcon = new ImageIcon(mathIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));
        ImageIcon physicIcon = new ImageIcon("src/assets/physic.png");
        physicIcon = new ImageIcon(physicIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));
        ImageIcon chemIcon = new ImageIcon("src/assets/chemistry.png");
        chemIcon = new ImageIcon(chemIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));


        JPanel subPanel = new JPanel();
        subPanel.setBackground(color);
        subPanel.setLayout(new GridBagLayout());

        mathHSButton.setIcon(mathIcon);
        mathHSButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        mathHSButton.setVerticalTextPosition(JButton.BOTTOM);
        mathHSButton.setVerticalAlignment(JButton.TOP);
        mathHSButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        mathHSButton.setContentAreaFilled(false);
        mathHSButton.setFocusable(false);
        mathHSButton.setBorderPainted(false);
        mathHSButton.setHorizontalTextPosition(JButton.CENTER);

        physicHSButton.setIcon(physicIcon);
        physicHSButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        physicHSButton.setVerticalTextPosition(JButton.BOTTOM);
        physicHSButton.setVerticalAlignment(JButton.TOP);
        physicHSButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        physicHSButton.setContentAreaFilled(false);
        physicHSButton.setFocusable(false);
        physicHSButton.setBorderPainted(false);
        physicHSButton.setHorizontalTextPosition(JButton.CENTER);

        chemHSButton.setIcon(chemIcon);
        chemHSButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        chemHSButton.setVerticalTextPosition(JButton.BOTTOM);
        chemHSButton.setVerticalAlignment(JButton.TOP);
        chemHSButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        chemHSButton.setContentAreaFilled(false);
        chemHSButton.setFocusable(false);
        chemHSButton.setBorderPainted(false);
        chemHSButton.setHorizontalTextPosition(JButton.CENTER);

        JLabel eduLevel = new JLabel("High School");
        eduLevel.setPreferredSize(new Dimension(310,70));
        eduLevel.setFont(new Font("Monospaced", Font.BOLD, 45));

        GridBagConstraints custom = new GridBagConstraints();
        custom.gridx = 1;
        custom.gridy = 0;
        custom.weighty = 0;
        custom.fill = GridBagConstraints.HORIZONTAL;
        subPanel.add(eduLevel, custom);

        custom.gridx = 0;
        custom.gridy = 1;
        custom.weighty = 1;
        custom.insets = new Insets(0,0,150,0);
        custom.fill = GridBagConstraints.HORIZONTAL;
        subPanel.add(mathHSButton, custom);

        custom.gridx = 1;
        custom.gridy = 1;
        custom.weighty = 1;
        custom.insets = new Insets(0,0,150,0);
        custom.fill = GridBagConstraints.HORIZONTAL;
        subPanel.add(physicHSButton, custom);

        custom.gridx = 2;
        custom.gridy = 1;
        custom.weighty = 1;
        custom.insets = new Insets(0,0,150,0);
        custom.fill = GridBagConstraints.HORIZONTAL;
        subPanel.add(chemHSButton, custom);

        JPanel backPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        backPanel.add(backButton[0]);
        backPanel.setBackground(color);

        subHighSchoolPanel.add(backPanel, BorderLayout.PAGE_START);
        subHighSchoolPanel.add(subPanel, BorderLayout.CENTER);
    }

    public void mathHighSchool(){
        mathHSPanel.setBackground(color);

        ImageIcon lineIcon = new ImageIcon("src/assets/line.png");
        lineIcon = new ImageIcon(lineIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));
        ImageIcon quadraticIcon = new ImageIcon("src/assets/quadratic.png");
        quadraticIcon = new ImageIcon(quadraticIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));
        ImageIcon parabolaIcon = new ImageIcon("src/assets/parabola.png");
        parabolaIcon = new ImageIcon(parabolaIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));

        JPanel subPanel = new JPanel();
        subPanel.setBackground(color);
        subPanel.setLayout(new GridBagLayout());

        lineSimButton.setIcon(lineIcon);
        lineSimButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        lineSimButton.setVerticalTextPosition(JButton.BOTTOM);
        lineSimButton.setVerticalAlignment(JButton.TOP);
        lineSimButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lineSimButton.setContentAreaFilled(false);
        lineSimButton.setFocusable(false);
        lineSimButton.setBorderPainted(false);
        lineSimButton.setHorizontalTextPosition(JButton.CENTER);

        quadraticButton.setIcon(quadraticIcon);
        quadraticButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        quadraticButton.setVerticalTextPosition(JButton.BOTTOM);
        quadraticButton.setVerticalAlignment(JButton.TOP);
        quadraticButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        quadraticButton.setContentAreaFilled(false);
        quadraticButton.setFocusable(false);
        quadraticButton.setBorderPainted(false);
        quadraticButton.setHorizontalTextPosition(JButton.CENTER);

        parabolaButton.setIcon(parabolaIcon);
        parabolaButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        parabolaButton.setVerticalTextPosition(JButton.BOTTOM);
        parabolaButton.setVerticalAlignment(JButton.TOP);
        parabolaButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        parabolaButton.setContentAreaFilled(false);
        parabolaButton.setFocusable(false);
        parabolaButton.setBorderPainted(false);
        parabolaButton.setHorizontalTextPosition(JButton.CENTER);

        JLabel eduLevel = new JLabel("High School");
        eduLevel.setPreferredSize(new Dimension(310,70));
        eduLevel.setFont(new Font("Monospaced", Font.BOLD, 45));

        GridBagConstraints custom = new GridBagConstraints();
        custom.gridx = 1;
        custom.gridy = 0;
        custom.weighty = 0;
        custom.fill = GridBagConstraints.HORIZONTAL;
        subPanel.add(eduLevel, custom);

        custom.gridx = 0;
        custom.gridy = 1;
        custom.weighty = 1;
        custom.insets = new Insets(0,0,150,0);
        custom.fill = GridBagConstraints.HORIZONTAL;
        subPanel.add(lineSimButton, custom);

        custom.gridx = 1;
        custom.gridy = 1;
        custom.weighty = 1;
        custom.insets = new Insets(0,0,150,0);
        custom.fill = GridBagConstraints.HORIZONTAL;
        subPanel.add(quadraticButton, custom);

        custom.gridx = 2;
        custom.gridy = 1;
        custom.weighty = 1;
        custom.insets = new Insets(0,0,150,0);
        custom.fill = GridBagConstraints.HORIZONTAL;
        subPanel.add(parabolaButton, custom);

        JPanel backPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        backPanel.add(backButton[1]);
        backPanel.setBackground(color);

        mathHSPanel.add(backPanel, BorderLayout.PAGE_START);
        mathHSPanel.add(subPanel, BorderLayout.CENTER);

    }

    public void physicHighSchool(){
        physicHSPanel.setBackground(color);

        ImageIcon waveIcon = new ImageIcon("src/assets/wave.png");
        waveIcon = new ImageIcon(waveIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));

        JPanel subPanel = new JPanel();
        subPanel.setBackground(color);
        subPanel.setLayout(new GridBagLayout());

        waveButton.setIcon(waveIcon);
        waveButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        waveButton.setVerticalTextPosition(JButton.BOTTOM);
        waveButton.setVerticalAlignment(JButton.TOP);
        waveButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        waveButton.setContentAreaFilled(false);
        waveButton.setFocusable(false);
        waveButton.setBorderPainted(false);
        waveButton.setHorizontalTextPosition(JButton.CENTER);

        JLabel eduLevel = new JLabel("High School");
        eduLevel.setPreferredSize(new Dimension(310,70));
        eduLevel.setFont(new Font("Monospaced", Font.BOLD, 45));

        GridBagConstraints custom = new GridBagConstraints();
        custom.gridx = 0;
        custom.gridy = 0;
        custom.weighty = 0;
        custom.fill = GridBagConstraints.HORIZONTAL;
        subPanel.add(eduLevel, custom);

        custom.gridx = 0;
        custom.gridy = 1;
        custom.weighty = 1;
        custom.insets = new Insets(0,0,150,0);
        custom.fill = GridBagConstraints.HORIZONTAL;
        subPanel.add(waveButton, custom);

        // Back Button
        JPanel backPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        backPanel.setPreferredSize(new Dimension(0,150));
        backPanel.setBackground(color);

        backPanel.add(backButton[2]);

        physicHSPanel.add(backPanel, BorderLayout.PAGE_START);
        physicHSPanel.add(subPanel, BorderLayout.CENTER);
    }

    public void chemistryHighSchool(){
        chemHSPanel.setBackground(color);

        ImageIcon labIcon = new ImageIcon("src/assets/Lab.png");
        labIcon = new ImageIcon(labIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));

        JPanel subPanel = new JPanel();
        subPanel.setBackground(color);
        subPanel.setLayout(new GridBagLayout());

        laboratoryButton.setIcon(labIcon);
        laboratoryButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        laboratoryButton.setVerticalTextPosition(JButton.BOTTOM);
        laboratoryButton.setVerticalAlignment(JButton.TOP);
        laboratoryButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        laboratoryButton.setContentAreaFilled(false);
        laboratoryButton.setFocusable(false);
        laboratoryButton.setBorderPainted(false);
        laboratoryButton.setHorizontalTextPosition(JButton.CENTER);

        JLabel eduLevel = new JLabel("Chemistry");
        eduLevel.setPreferredSize(new Dimension(0,70));
        eduLevel.setFont(new Font("Monospaced", Font.BOLD, 45));

        GridBagConstraints custom = new GridBagConstraints();
        custom.gridx = 0;
        custom.gridy = 0;
        custom.weighty = 0;
        custom.fill = GridBagConstraints.HORIZONTAL;
        subPanel.add(eduLevel, custom);

        custom.gridx = 0;
        custom.gridy = 1;
        custom.weighty = 1;
        custom.insets = new Insets(0,0,150,0);
        custom.fill = GridBagConstraints.HORIZONTAL;
        subPanel.add(laboratoryButton, custom);

        // Back Button
        JPanel backPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        backPanel.setPreferredSize(new Dimension(0,150));
        backPanel.setBackground(color);

        backPanel.add(backButton[3]);

        chemHSPanel.add(backPanel, BorderLayout.PAGE_START);
        chemHSPanel.add(subPanel, BorderLayout.CENTER);
    }

    //region get High School Panel
    public JPanel getSubHighSchoolPanel(){
        return subHighSchoolPanel;
    }

    public JPanel getMathHSPanel(){
        return mathHSPanel;
    }

    public JPanel getPhysicHSPanel(){
        return physicHSPanel;
    }

    public JPanel getChemHSPanel(){
        return chemHSPanel;
    }
    //endregion

    //region get High School Button
    public JButton getMathHSButton(){
        return mathHSButton;
    }

    public JButton getPhysicHSButton(){
        return physicHSButton;
    }

    public JButton getChemHSButton(){
        return chemHSButton;
    }

    public JButton getLineSimButton() {
        return lineSimButton;
    }

    public JButton getQuadraticButton() {
        return quadraticButton;
    }

    public JButton getParabolaButton() {
        return parabolaButton;
    }

    public JButton getWaveButton() {
        return waveButton;
    }

    public JButton getLaboratoryButton() {
        return laboratoryButton;
    }

    //endregion

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

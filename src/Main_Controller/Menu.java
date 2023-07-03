/**
 * This class provides :
 *  - starting page of our application.
 *  - Education level menu (Primary, Elementary, High School)
 *
 */
package Main_Controller;

import Elementary.view.ElementaryView;
import High_School.view.HighSchoolView;
import Primary.view.PrimaryView;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class Menu implements ActionListener {
    private static final JPanel startingPagePanel = new JPanel();
    private static final CardLayout optionCard = new CardLayout();

    // Education Level
    private final JPanel eduLevelOptionPanel = new JPanel(new BorderLayout());
    private final JButton primaryButt = new JButton("Primary");
    private final JButton elemButt = new JButton("Elementary");
    private final JButton highSchoolButt = new JButton("High School");
    //============================================
    // Create Primary View Object
    PrimaryView primaryView = new PrimaryView();

    // Create Elementary View Object
    ElementaryView elementaryView = new ElementaryView();

    // Create High School View Object
    HighSchoolView highSchoolView = new HighSchoolView();

    //=====================================

    public Menu(){
        // Cyan Background Color
        Color color = new Color(214,255,253);
        Border border = new LineBorder(Color.black);

        startingPagePanel.setPreferredSize(new Dimension(1460, 1024));
        startingPagePanel.setBackground(color);
        startingPagePanel.setLayout(optionCard);
        startingPagePanel.setBorder(border);

        setEduLevelOptionPanel();

        // Primary Level Menu Panel
        primaryView.mathPrimaryOption();
        primaryView.simAndGamePrimaryOption();
        primaryView.simPrimaryLevel();
        primaryView.gamePrimaryLevel();

        // Elementary Level Menu Panel
        elementaryView.mathElementaryOption();
        elementaryView.simAndGameElementaryOption();
        elementaryView.simElementaryLevel();
        elementaryView.gameElementaryLevel();

        // High School Level Menu Panel
        highSchoolView.subjectHighSchool();
        highSchoolView.mathHighSchool();
        highSchoolView.physicHighSchool();
        highSchoolView.chemistryHighSchool();


    }

    public void setEduLevelOptionPanel(){

        JPanel topPanel = new JPanel();
        JPanel subPanel = new JPanel(new GridBagLayout());

        subPanel.setBackground(new Color(214,255,253));
        topPanel.setPreferredSize(new Dimension(0,60));
        topPanel.setBackground(new Color(214,255,253));
        eduLevelOptionPanel.add(topPanel, BorderLayout.PAGE_START);

        eduLevelOptionPanel.setBackground(new Color(214,255,253));

        ImageIcon primaryIcon = new ImageIcon("src/assets/primary.png");
        primaryIcon = new ImageIcon(primaryIcon.getImage().
                getScaledInstance(260,260, BufferedImage.SCALE_SMOOTH));
        ImageIcon elementaryIcon = new ImageIcon("src/assets/elementary.png");
        elementaryIcon = new ImageIcon(elementaryIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));
        ImageIcon highSchoolIcon = new ImageIcon("src/assets/high.png");
        highSchoolIcon = new ImageIcon(highSchoolIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));

        //region set up education level option
        primaryButt.setIcon(primaryIcon);
        primaryButt.setFont(new Font("Monospaced", Font.BOLD, 30));
        primaryButt.setVerticalTextPosition(JButton.BOTTOM);
        primaryButt.setVerticalAlignment(JButton.TOP);
        primaryButt.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        primaryButt.setContentAreaFilled(false);
        primaryButt.setFocusable(false);
        primaryButt.setBorderPainted(false);
        primaryButt.setHorizontalTextPosition(JButton.CENTER);
        primaryButt.addActionListener(this);

        elemButt.setIcon(elementaryIcon);
        elemButt.setFont(new Font("Monospaced", Font.BOLD, 30));
        elemButt.setVerticalTextPosition(JButton.BOTTOM);
        elemButt.setVerticalAlignment(JButton.TOP);
        elemButt.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        elemButt.setContentAreaFilled(false);
        elemButt.setFocusable(false);
        elemButt.setBorderPainted(false);
        elemButt.setHorizontalTextPosition(JButton.CENTER);
        elemButt.addActionListener(this);

        highSchoolButt.setIcon(highSchoolIcon);
        highSchoolButt.setFont(new Font("Monospaced", Font.BOLD, 30));
        highSchoolButt.setVerticalTextPosition(JButton.BOTTOM);
        highSchoolButt.setVerticalAlignment(JButton.TOP);
        highSchoolButt.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        highSchoolButt.setContentAreaFilled(false);
        highSchoolButt.setFocusable(false);
        highSchoolButt.setBorderPainted(false);
        highSchoolButt.setHorizontalTextPosition(JButton.CENTER);
        highSchoolButt.addActionListener(this);
        highSchoolButt.addActionListener(this);
        //endregion

        JLabel eduLevel = new JLabel("Select Your Education Level");
        eduLevel.setPreferredSize(new Dimension(750,70));
        eduLevel.setFont(new Font("Monospaced", Font.BOLD, 45));

        GridBagConstraints custom = new GridBagConstraints();
        custom.fill = GridBagConstraints.PAGE_START;
        custom.gridx = 0;
        custom.gridy = 0;
        custom.gridwidth = 3;
        subPanel.add(eduLevel, custom);

        custom.fill = GridBagConstraints.HORIZONTAL;
        custom.gridx = 0;
        custom.gridy = 1;
        custom.gridwidth = 1;
        custom.weighty = 1;
        custom.insets = new Insets(0,0,150,50);
        subPanel.add(primaryButt, custom);

        custom.fill = GridBagConstraints.CENTER;
        custom.gridy = 1;
        custom.gridx = 1;
        custom.weighty = 1;
        custom.insets = new Insets(0,0,150,0);
        subPanel.add(elemButt, custom);

        custom.fill = GridBagConstraints.HORIZONTAL;
        custom.gridx = 2;
        custom.gridy = 1;
        custom.weighty = 1;
        custom.insets = new Insets(0,50,150,0);
        subPanel.add(highSchoolButt, custom);

        eduLevelOptionPanel.add(subPanel, BorderLayout.CENTER);
        startingPagePanel.add(eduLevelOptionPanel, "eduOption");

    }

    public static JPanel getMenuPanel(){
        return startingPagePanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //==========================
        //region When we click on Primary Level
        // Show Math Subject of Primary Level
        if(e.getSource() == primaryButt){
            // add Subject Panel of Primary Level to CardLayout
            startingPagePanel.add(primaryView.getSubPrimaryPanel(), "mathPrimaryOption");
            // Display Subject page
            optionCard.show(startingPagePanel, "mathPrimaryOption");
            // add action listener to back and Subject Button
            primaryView.getBackButton0().addActionListener(this);
            primaryView.getMathPrimaryButton().addActionListener(this);
        }
        // if user clicked on back button of subject page
        if(e.getSource() == primaryView.getBackButton0()){
            // display education level page
            optionCard.show(startingPagePanel,"eduOption");
        }
        // if user clicked on any subject button
        if(e.getSource() == primaryView.getMathPrimaryButton()){
            // add Sim and Game Panel to card layout
            startingPagePanel.add(primaryView.getSimAndGamePrimaryPanel(),
                    "Simulation & Game Primary");
            // display Sim and Game page
            optionCard.show(startingPagePanel, "Simulation & Game Primary");
            // add action listener to back button, sim, and game button
            primaryView.getBackButton1().addActionListener(this);
            primaryView.getSimPrimaryButton().addActionListener(this);
        }
        // If user clicked on back button of sim & game page
        if(e.getSource() == primaryView.getBackButton1()){
            // display subject page
            optionCard.show(startingPagePanel,"mathPrimaryOption");
        }
        // If user clicked on Simulation button
        if(e.getSource() == primaryView.getSimPrimaryButton()){
            // add Counting & Comparing sim to card layout
            startingPagePanel.add(primaryView.getSimCountingAndComparingPanel(),
                    "Counting & Comparing Simulation");
            // display Counting and Comparing Page
            optionCard.show(startingPagePanel, "Counting & Comparing Simulation");
            // add action listener
            primaryView.getBackButton2().addActionListener(this);
            primaryView.getGamePrimaryButton().addActionListener(this);
        }
        // If user clicked on back button of Counting and Comparing Page
        if(e.getSource() == primaryView.getBackButton2()){
            // display Sim & Game page
            optionCard.show(startingPagePanel,"Simulation & Game Primary");
        }
        // If user clicked on Game Button
        if(e.getSource() == primaryView.getGamePrimaryButton()){
            // add Game panel to card layout
            startingPagePanel.add(primaryView.getGameCountingAndComparingPanel(), "Counting & Comparing Game");
            // display Counting and Comparing Game
            optionCard.show(startingPagePanel, "Counting & Comparing Game");
            // add action listener to back button
            primaryView.getBackButton3().addActionListener(this);
        }
        // If user clicked on back button of primary game page
        if(e.getSource() == primaryView.getBackButton3()){
            // display Sim and Game page
            optionCard.show(startingPagePanel, "Simulation & Game Primary");
        }
        //endregion Primary School

        //region Elementary School Section

        if(e.getSource() == elemButt){
            // add Subject Panel of Elementary Level to CardLayout
            startingPagePanel.add(elementaryView.getSubElementaryPanel(), "mathElementaryOption");
            // Display Subject page
            optionCard.show(startingPagePanel, "mathElementaryOption");
            // add action listener to back and Subject Button
            elementaryView.getBackButton0().addActionListener(this);
            elementaryView.getMathElementaryButton().addActionListener(this);
        }
        // if user clicked on back button of subject page
        if(e.getSource() == elementaryView.getBackButton0()){
            // display education level page
            optionCard.show(startingPagePanel,"eduOption");
        }
        // if user clicked on any subject button
        if(e.getSource() == elementaryView.getMathElementaryButton()){
            // add Sim and Game Panel to card layout
            startingPagePanel.add(elementaryView.getSimAndGameElementaryPanel(),
                    "Simulation & Game Elementary");
            // display Sim and Game page
            optionCard.show(startingPagePanel, "Simulation & Game Elementary");
            // add action listener to back button, sim, and game button
            elementaryView.getBackButton1().addActionListener(this);
            elementaryView.getSimElementaryButton().addActionListener(this);
        }
        // If user clicked on back button of sim & game page
        if(e.getSource() == elementaryView.getBackButton1()){
            // display subject page
            optionCard.show(startingPagePanel,"mathElementaryOption");
        }
        // If user clicked on Simulation button
        if(e.getSource() == elementaryView.getSimElementaryButton()){
            // add Counting & Comparing sim to card layout
            startingPagePanel.add(elementaryView.getSimElementaryPanel(),
                    "Fraction & Area Simulation");
            // display Fraction and Area Page
            optionCard.show(startingPagePanel, "Fraction & Area Simulation");
            // add action listener
            elementaryView.getBackButton2().addActionListener(this);
            elementaryView.getGameElementaryButton().addActionListener(this);
        }
        // If user clicked on back button of Fraction and Area Page
        if(e.getSource() == elementaryView.getBackButton2()){
            // display Sim & Game page
            optionCard.show(startingPagePanel,"Simulation & Game Elementary");
        }
        // If user clicked on Game Button
        if(e.getSource() == elementaryView.getGameElementaryButton()){
            // add Game panel to card layout
            startingPagePanel.add(elementaryView.getGameElementaryPanel(), "Fraction & Area Game");
            // display Fraction and Area Game
            optionCard.show(startingPagePanel, "Fraction & Area Game");
            // add action listener to back button
            elementaryView.getBackButton3().addActionListener(this);
        }
        // If user clicked on back button of elementary game page
        if(e.getSource() == elementaryView.getBackButton3()){
            // display Sim and Game page
            optionCard.show(startingPagePanel, "Simulation & Game Elementary");
        }
        //endregion

        //region High School

        if(e.getSource() == highSchoolButt){
            // add Subject Panel of High School Level to CardLayout
            startingPagePanel.add(highSchoolView.getSubHighSchoolPanel(), "subHighSchoolOption");
            // Display Subject page
            optionCard.show(startingPagePanel, "subHighSchoolOption");
            // add action listener to back and Subject Button
            highSchoolView.getBackButton0().addActionListener(this);
            highSchoolView.getMathHSButton().addActionListener(this);
            highSchoolView.getPhysicHSButton().addActionListener(this);
            highSchoolView.getChemHSButton().addActionListener(this);
        }
        // if user clicked on back button of subject page
        if(e.getSource() == highSchoolView.getBackButton0()){
            // display education level page
            optionCard.show(startingPagePanel,"eduOption");
        }
        // if user clicked on Math button
        if(e.getSource() == highSchoolView.getMathHSButton()){
            // add Math application Panel to card layout
            startingPagePanel.add(highSchoolView.getMathHSPanel(),
                    "Math in High School");
            // display Math page applications (Line, Quadratic, Parabola
            optionCard.show(startingPagePanel, "Math in High School");
            // add action listener to back button, sim, and game button
            highSchoolView.getBackButton1().addActionListener(this);
            highSchoolView.getLineSimButton().addActionListener(this);
            highSchoolView.getQuadraticButton().addActionListener(this);
            highSchoolView.getParabolaButton().addActionListener(this);

        }
        // If user clicked on back button of sim & game page
        if(e.getSource() == highSchoolView.getBackButton1()){
            // display subject page
            optionCard.show(startingPagePanel,"subHighSchoolOption");
        }
        // If user clicked on Physic button
        if(e.getSource() == highSchoolView.getPhysicHSButton()){
            // add Physic Panel card layout
            startingPagePanel.add(highSchoolView.getPhysicHSPanel(),
                    "Physic in High School");
            // display Physic Page
            optionCard.show(startingPagePanel, "Physic in High School");
            // add action listener
            highSchoolView.getBackButton2().addActionListener(this);
            highSchoolView.getWaveButton().addActionListener(this);
        }
        // If user clicked on back button of Fraction and Area Page
        if(e.getSource() == highSchoolView.getBackButton2()){
            // display Sim & Game page
            optionCard.show(startingPagePanel,"subHighSchoolOption");
        }
        // If user clicked on Chemistry Subject Button
        if(e.getSource() == highSchoolView.getChemHSButton()){
            // add Chemistry panel to card layout
            startingPagePanel.add(highSchoolView.getChemHSPanel(), "Chem in High School");
            // display Chemistry Panel
            optionCard.show(startingPagePanel, "Chem in High School");
            // add action listener to back button
            highSchoolView.getBackButton3().addActionListener(this);
        }
        // If user clicked on back button of elementary game page
        if(e.getSource() == highSchoolView.getBackButton3()){
            // display Subject page
            optionCard.show(startingPagePanel, "subHighSchoolOption");
        }
        //endregion
    }
}

package Main_Controller;

import Primary.controller.PrimaryController;
import Primary.model.PrimaryModel;
import Primary.view.PrimaryView;

import javax.swing.*;
import java.util.Scanner;

public class Main extends JFrame {

    private void init(){

        Menu menu = new Menu();

        add(Menu.getMenuPanel());
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){

        Main main = new Main();
        main.init();

        System.out.println("Hello World");

        PrimaryModel primaryModel = setCountingValue();
        PrimaryView primaryView = new PrimaryView();
        PrimaryController primaryController = new PrimaryController(primaryView, primaryModel);

//        primaryController.displayCounting();

//        while (true){
//            Scanner input = new Scanner(System.in);
//            System.out.print("Inter Counting : ");
//            int c = input.nextInt();
//            primaryController.setCounting(c);
////            primaryController.displayCounting();
//
//        }
    }

    private static PrimaryModel setCountingValue(){
        PrimaryModel primaryModel = new PrimaryModel();
        primaryModel.assignSimulation(0);
        return primaryModel;
    }
}
// test update projecct
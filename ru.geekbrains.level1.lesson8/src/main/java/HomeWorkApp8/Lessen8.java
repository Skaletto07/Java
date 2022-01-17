package HomeWorkApp8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

import static java.lang.Double.parseDouble;


public class Lessen8 extends JFrame {

    private String value;
    private String calcs;
    private double a = 0;
    private double b;
    private double itog;


    Lessen8 () {

        JFrame jFrame = new JFrame("Calculator");
        jFrame.setBounds(500, 500, 600, 520);
        jFrame.setTitle("Simple Counter");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel panelCenter = new JPanel(new GridLayout(4,4));
        jFrame.add(mainPanel);
        JPanel panelSouth = new JPanel((new BorderLayout()));
        JPanel panelNorth = new JPanel(new BorderLayout());
        mainPanel.add(panelNorth, BorderLayout.NORTH);
        mainPanel.add(panelCenter, BorderLayout.CENTER);
        mainPanel.add(panelSouth, BorderLayout.SOUTH);


        Font font = new Font("Arial", Font.BOLD, 42);
        Font font2 = new Font("Arial", Font.BOLD, 20);


        JLabel counterValueView = new JLabel();
        counterValueView.setFont(font);
        counterValueView.setHorizontalAlignment(SwingConstants.CENTER);
        panelNorth.add(counterValueView);

        value = "0" ;
        calcs = "0";
        counterValueView.setText(String.valueOf(value));

        BigDecimal bg = new BigDecimal(value);

        JButton one = new JButton("1");
        one.setFont(font2);
        panelCenter.add(one);

        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (value == "0") {
                    value = "1";
                    a = 1;
                } else if (value.endsWith("=")){
                    value = "1";
                    a = 1;
                } else if (value.endsWith("+")) {
                    value = value + "1";
                    a = 1;
                    calcs = String.valueOf(a);
                } else if (value.endsWith("-")) {
                    value = value + "1";
                    a = 1;
                    calcs = String.valueOf(a);
                } else if (value.endsWith("*")) {
                    value = value + "1";
                    a = 1;
                    calcs = String.valueOf(a);
                } else if (value.endsWith("/")) {
                    value = value + "1";
                    a = 1;
                    calcs = String.valueOf(a);
                } else if (value.endsWith(".")) {
                    value = value + "1";
                    calcs += "1";
                    a = bg.doubleValue();

                } else {
                    value += "1";
                    calcs += "1";
                }
                counterValueView.setText(String.valueOf(value));
            }
        });

        JButton two = new JButton("2");
        two.setFont(font2);
        panelCenter.add(two);

        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (value == "0") {
                    value = "2";
                    a = 2;
                } else if (value.endsWith("=")){
                    value = "2";
                    a = 2;
                } else if (value.endsWith("+")) {
                    value = value + "2";
                    a = 2;
                    calcs = String.valueOf(a);
                } else if (value.endsWith("-")) {
                    value = value + "2";
                    a = 2;
                    calcs = String.valueOf(a);
                } else if (value.endsWith("*")) {
                    value = value + "2";
                    a = 2;
                    calcs = String.valueOf(a);
                } else if (value.endsWith("/")) {
                    value = value + "2";
                    a = 2;
                    calcs = String.valueOf(a);
                } else if (value.endsWith(".")) {
                    value = value + "2";
                    calcs += "2";
                    a = bg.doubleValue();
                } else {
                    value += "2";
                    calcs += "2";
                }
                counterValueView.setText(String.valueOf(value));
            }
        });

        JButton three = new JButton("3");
        three.setFont(font2);
        panelCenter.add(three);

        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (value == "0") {
                    value = "3";
                    a = 3;
                } else if (value.endsWith("=")){
                    value = "3";
                    a = 3;
                } else if (value.endsWith("+")) {
                    value = value + "3";
                    a = 3;
                    calcs = String.valueOf(a);
                } else if (value.endsWith("-")) {
                    value = value + "3";
                    a = 3;
                    calcs = String.valueOf(a);
                } else if (value.endsWith("*")) {
                    value = value + "3";
                    a = 3;
                    calcs = String.valueOf(a);
                } else if (value.endsWith("/")) {
                    value = value + "3";
                    a = 3;
                    calcs = String.valueOf(a);
                } else if (value.endsWith(".")) {
                    value = value + "3";
                    calcs += "3";
                    a = parseDouble(calcs);
                } else {
                    value += "3";
                    calcs += "3";
                }
                counterValueView.setText(String.valueOf(value));
            }
        });

        JButton addition = new JButton("+");
        addition.setFont(font2);
        panelCenter.add(addition);



        JButton four = new JButton("4");
        four.setFont(font2);
        panelCenter.add(four);

        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (value == "0") {
                    value = "4";
                    a = 4;
                } else if (value.endsWith("=")){
                    value = "4";
                    a = 4;
                } else if (value.endsWith("+")) {
                    value = value + "4";
                    a = 4;
                    calcs = String.valueOf(a);
                } else if (value.endsWith("-")) {
                    value = value + "4";
                    a = 4;
                    calcs = String.valueOf(a);
                } else if (value.endsWith("*")) {
                    value = value + "4";
                    a = 4;
                    calcs = String.valueOf(a);
                } else if (value.endsWith("/")) {
                    value = value + "4";
                    a = 4;
                    calcs = String.valueOf(a);
                } else if (value.endsWith(".")) {
                    value = value + "4";
                    calcs += "4";
                    a = parseDouble(calcs);
                } else {
                    value += "4";
                    calcs += "4";
                }
                counterValueView.setText(String.valueOf(value));
            }
        });

        JButton five = new JButton("5");
        five.setFont(font2);
        panelCenter.add(five);

        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (value == "0") {
                    value = "5";
                    a = 5;
                } else if (value.endsWith("=")){
                    value = "5";
                    a = 5;
                } else if (value.endsWith("+")) {
                    value = value + "5";
                    a = 5;
                    calcs = String.valueOf(a);
                    calcs = String.valueOf(a);
                } else if (value.endsWith("-")) {
                    value = value + "5";
                    a = 5;
                    calcs = String.valueOf(a);
                } else if (value.endsWith("*")) {
                    value = value + "5";
                    a = 5;
                    calcs = String.valueOf(a);
                } else if (value.endsWith("/")) {
                    value = value + "5";
                    a = 5;
                    calcs = String.valueOf(a);
                } else if (value.endsWith(".")) {
                    value = value + "5";
                    calcs += "5";
                    a = parseDouble(calcs);
                } else {
                    value += "5";
                    calcs += "5";

                }
                counterValueView.setText(String.valueOf(value));
            }
        });

        JButton six = new JButton("6");
        six.setFont(font2);
        panelCenter.add(six);

        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (value == "0") {
                    value = "6";
                    a = 6;
                } else if (value.endsWith("=")){
                    value = "6";
                    a = 6;
                } else if (value.endsWith("+")) {
                    value = value + "6";
                    a = 6;
                    calcs = String.valueOf(a);
                } else if (value.endsWith("-")) {
                    value = value + "6";
                    a = 6;
                    calcs = String.valueOf(a);
                } else if (value.endsWith("*")) {
                    value = value + "6";
                    a = 6;
                    calcs = String.valueOf(a);
                } else if (value.endsWith("/")) {
                    value = value + "6";
                    a = 6;
                    calcs = String.valueOf(a);
                } else if (value.endsWith(".")) {
                    value = value + "6";
                    calcs += "6";
                    a = parseDouble(calcs);
                } else {
                    value += "6";
                    calcs += "6";
                }
                counterValueView.setText(String.valueOf(value));
            }
        });

        JButton subtraction = new JButton("-");
        subtraction.setFont(font2);
        panelCenter.add(subtraction);

        JButton seven = new JButton("7");
        seven.setFont(font2);
        panelCenter.add(seven);

        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (value == "0") {
                    value = "7";
                    a = 7;
                } else if (value.endsWith("=")){
                    value = "7";
                    a = 7;
                } else if (value.endsWith("+")) {
                    value = value + "7";
                    a = 7;
                    calcs = String.valueOf(a);
                } else if (value.endsWith("-")) {
                    value = value + "7";
                    a = 7;
                    calcs = String.valueOf(a);
                } else if (value.endsWith("*")) {
                    value = value + "7";
                    a = 7;
                    calcs = String.valueOf(a);
                } else if (value.endsWith("/")) {
                    value = value + "7";
                    a = 7;
                    calcs = String.valueOf(a);
                } else if (value.endsWith(".")) {
                    value = value + "7";
                    calcs += "7";
                    a = parseDouble(calcs);
                } else {
                    value += "7";
                    calcs += "7";
                }
                counterValueView.setText(String.valueOf(value));
            }
        });

        JButton eight = new JButton("8");
        eight.setFont(font2);
        panelCenter.add(eight);

        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (value == "0") {
                    value = "8";
                    a = 8;
                } else if (value.endsWith("=")){
                    value = "8";
                    a = 8;
                } else if (value.endsWith("+")) {
                    value = value + "8";
                    a = 8;
                    calcs = String.valueOf(a);
                } else if (value.endsWith("-")) {
                    value = value + "8";
                    a = 8;
                    calcs = String.valueOf(a);
                } else if (value.endsWith("*")) {
                    value = value + "8";
                    a = 8;
                    calcs = String.valueOf(a);
                } else if (value.endsWith("/")) {
                    value = value + "8";
                    a = 8;
                    calcs = String.valueOf(a);
                } else if (value.endsWith(".")) {
                    value = value + "8";
                    calcs += "8";
                    a = parseDouble(calcs);
                } else {
                    value += "8";
                    calcs += "8";
                }
                counterValueView.setText(String.valueOf(value));
            }
        });


        JButton nine = new JButton("9");
        nine.setFont(font2);
        panelCenter.add(nine);

        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (value == "0") {
                    value = "9";
                    a = 9;
                } else if (value.endsWith("=")){
                    value = "9";
                    a = 9;
                } else if (value.endsWith("+")) {
                    value = value + "9";
                    a = 9;
                    calcs = String.valueOf(a);
                } else if (value.endsWith("-")) {
                    value = value + "9";
                    a = 9;
                    calcs = String.valueOf(a);
                } else if (value.endsWith("*")) {
                    value = value + "9";
                    a = 9;
                    calcs = String.valueOf(a);
                } else if (value.endsWith("/")) {
                    value = value + "9";
                    a = 9;
                    calcs = String.valueOf(a);
                } else if (value.endsWith(".")) {
                    value = value + "9";
                    calcs += "9";
                    a = parseDouble(calcs);
                } else {
                    value += "9";
                    calcs += "9";
                }
                counterValueView.setText(String.valueOf(value));
            }
        });

        JButton multiplication = new JButton("*");
        multiplication.setFont(font2);
        panelCenter.add(multiplication);

        JButton point = new JButton(".");
        point.setFont(font2);
        panelCenter.add(point);

        JButton zero = new JButton("0");
        zero.setFont(font2);
        panelCenter.add(zero);

        multiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (value.endsWith("+")) {

                } else if (value.endsWith("-")) {

                } else if (value.endsWith("*")) {

                } else if (value.endsWith("/")) {

                } else if (value.endsWith(".")) {

                } else {
                    b = parseDouble(value);
                    value += "*";
                    System.out.println(b);
                    System.out.println(a);
                }

                counterValueView.setText(String.valueOf(value));
            }
        });

        JButton division = new JButton("/");
        division.setFont(font2);
        panelCenter.add(division);

        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (value.endsWith("+")) {

                } else if (value.endsWith("-")) {

                } else if (value.endsWith("*")) {

                } else if (value.endsWith("/")) {

                } else if (value.endsWith(".")) {

                } else {
                    b = parseDouble(value);
                    value += "/";
                    System.out.println(b);
                    System.out.println(a);
                }

                counterValueView.setText(String.valueOf(value));
            }
        });



        point.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (value.endsWith("+")) {

                } else if (value.endsWith("-")) {

                } else if (value.endsWith("*")) {

                } else if (value.endsWith("/")) {

                } else {

                    b = bg.doubleValue();
                    value += ".";
                    calcs += ".";
                    System.out.println(b);
                    System.out.println(a);
                }

                counterValueView.setText(String.valueOf(value));
            }
        });

        JButton calculation = new JButton(" = ");
        calculation.setFont(font);
        panelCenter.add(calculation);

        calculation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value += "=";
                if (value.indexOf('+') != -1){
                    itog = b + a;

                    counterValueView.setText(String.valueOf(itog));
                    System.out.println(calcs);
                    System.out.println(value);
                    System.out.println(a);
                    System.out.println(b);
                } else if (value.indexOf('-') != -1){
                    itog = b - a;
                    counterValueView.setText(String.valueOf(itog));
                } else if (value.indexOf('*') != -1){
                    itog = b * a;
                    counterValueView.setText(String.valueOf(itog));
                } else if (value.indexOf('/') != -1){
                    itog = b / a;
                    counterValueView.setText(String.valueOf(itog));
                }
            }
        });

        JButton clear = new JButton(" C ");
        clear.setFont(font);
        panelSouth.add(clear);

        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = "0";
                counterValueView.setText(String.valueOf(value));
                a = 0;
                b = 0;
                calcs = "0";
            }
        });



        subtraction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                 if (value.endsWith("+")) {

                } else if (value.endsWith("-")) {

                } else if (value.endsWith("*")) {

                } else if (value.endsWith("/")) {

                } else if (value.endsWith(".")) {

                } else {
                     b = parseDouble(value);
                    value += "-";
                     System.out.println(b);
                     System.out.println(a);
                }

                counterValueView.setText(String.valueOf(value));
            }
        });

        addition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (value.endsWith("+")) {

                } else if (value.endsWith("-")) {

                } else if (value.endsWith("*")) {

                } else if (value.endsWith("/")) {

                } else if (value.endsWith(".")) {

                } else {
                    b = parseDouble(value);
                    value += "+";
                    System.out.println(b);
                    System.out.println(a);
                    System.out.println(value);
                }

                counterValueView.setText(String.valueOf(value));
            }
        });





        jFrame.setVisible(true);

    }

    public static void main(String[] args) {
        new Lessen8();

    }


}

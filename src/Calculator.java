import java.awt.*;
import java.awt.event.*;

        //coded by;Ishara Lakshitha 
        //         200111204572
        //         Student ID: 2021/2022/CO/SP/I3/023
        //         Batch Num : 2022/2023/CH/SE/Intake4 (SEAHORSE)

public class Calculator extends Frame implements ActionListener {
    private final TextField display;
    private double firstNumber;
    private String operation;

    public Calculator() {
        // Create a window for the calculator
        setTitle("Calculator by IsharaLak©");
        setResizable(false);
        setBounds(800, 200, 360, 500);

        // Create a panel to hold the buttons and text field
        Panel panel = new Panel();
        panel.setLayout(new GridLayout(5, 4, 5, 5));

        // Create buttons for the calculator
        Button button0 = new Button("0");
        Button button1 = new Button("1");
        Button button2 = new Button("2");
        Button button3 = new Button("3");
        Button button4 = new Button("4");
        Button button5 = new Button("5");
        Button button6 = new Button("6");
        Button button7 = new Button("7");
        Button button8 = new Button("8");
        Button button9 = new Button("9");
        Button buttonDot = new Button(".");
        Button buttonPlus = new Button("+");
        Button buttonMinus = new Button("-");
        Button buttonMultiply = new Button("*");
        Button buttonDivide = new Button("/");
        Button buttonPercent = new Button("%");
        Button buttonSquareRoot = new Button("sqrt");
        Button buttonClear = new Button("CE");
        Button buttonEqual = new Button("=");
        Button buttonClear2 = new Button("C");
        
        // Add action listeners to the buttons
        button0.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        buttonDot.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonMultiply.addActionListener(this);
        buttonDivide.addActionListener(this);
        buttonPercent.addActionListener(this);
        buttonSquareRoot.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonClear2.addActionListener(this);
        
        //Adding fonts and colors to the buttons
        Font font1 = new Font("Cooper Black",Font.BOLD,30);
        Font font2 = new Font("Scientific Calculator LCD",Font.BOLD,30);
        Font font3 = new Font("Calibri",Font.BOLD,50);
        Font font4 = new Font("Calibri",Font.BOLD,40);
        Font font5 = new Font("Scientific Calculator LCD",Font.BOLD,28);
        
        button0.setFont(font1);
        button1.setFont(font1);
        button2.setFont(font1);
        button3.setFont(font1);
        button4.setFont(font1);
        button5.setFont(font1);
        button6.setFont(font1);
        button7.setFont(font1);
        button8.setFont(font1);
        button9.setFont(font1);
        buttonDot.setFont(font3);
        buttonClear.setFont(font2);
        buttonDivide.setFont(font3);
        buttonEqual.setFont(font3);
        buttonMultiply.setFont(font3);
        buttonPercent.setFont(font4);
        buttonSquareRoot.setFont(font2);
        buttonMinus.setFont(font3);
        buttonPlus.setFont(font3);
        buttonClear2.setFont(font2);
        
        
        buttonPlus.setBackground(Color.YELLOW);
        buttonDivide.setBackground(Color.YELLOW);
        buttonMinus.setBackground(Color.YELLOW);
        buttonMultiply.setBackground(Color.YELLOW);
        buttonDivide.setBackground(Color.YELLOW);
        buttonPercent.setBackground(Color.YELLOW);
        buttonSquareRoot.setBackground(Color.YELLOW);
        buttonClear2.setBackground(Color.YELLOW);
        buttonEqual.setBackground(Color.RED);
        buttonEqual.setForeground(Color.WHITE);
        buttonDot.setBackground(Color.YELLOW);
        buttonClear.setBackground(Color.YELLOW);
        button0.setBackground(Color.gray);
        button0.setForeground(Color.white);
        button1.setBackground(Color.gray);
        button1.setForeground(Color.white);
        button2.setBackground(Color.gray);
        button2.setForeground(Color.white);
        button3.setBackground(Color.gray);
        button3.setForeground(Color.white);
        button4.setBackground(Color.gray);
        button4.setForeground(Color.white);
        button5.setBackground(Color.gray);
        button5.setForeground(Color.white);
        button6.setBackground(Color.gray);
        button6.setForeground(Color.white);
        button7.setBackground(Color.gray);
        button7.setForeground(Color.white);
        button8.setBackground(Color.gray);
        button8.setForeground(Color.white);
        button9.setBackground(Color.gray);
        button9.setForeground(Color.white);
       
        
        // Add the buttons to the panel
        panel.add(buttonClear2);
        panel.add(buttonSquareRoot);
        panel.add(buttonPercent);
        panel.add(buttonPlus);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(buttonMinus);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(buttonMultiply);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(buttonDivide);
        panel.add(buttonDot);
        panel.add(button0); 
        panel.add(buttonClear);
        panel.add(buttonEqual);
        

        
        add(panel, BorderLayout.CENTER);

        // Create a text field to display the result
        display = new TextField(12);
        display.setEditable(false);
        display.setBackground(Color.CYAN);
        display.setForeground(Color.black);
        display.setFont(font5);
        add(display, BorderLayout.NORTH);
        
        // Create a menu bar with copy, cut, paste, and etc options
       MenuBar menuBar = new MenuBar();       
            MenuItem mi1 = new MenuItem("Standard");
            MenuItem mi2 = new MenuItem("Scientific");
            MenuItem mi3 = new MenuItem("Copy");
            MenuItem mi4 = new MenuItem("Cut"); 
            MenuItem mi5 = new MenuItem("Paste");
            MenuItem mi6 = new MenuItem("Light");
            MenuItem mi7 = new MenuItem("Dark");
            
            Menu m1 = new Menu("View"); 
                m1.add(mi1);
                m1.add(mi2);
            
            Menu m2 = new Menu("Edit");
                m2.add(mi3);
                m2.add(mi4);
                m2.add(mi5);
                            
            Menu m3 = new Menu("UI");
                m3.add(mi6);
                m3.add(mi7);
                
            menuBar.add(m1);
            menuBar.add(m2);
            menuBar.add(m3);
 
        
        setMenuBar(menuBar);
        
        // Add a window listener to handle the window closing event
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent event) {             
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();
    if (command.equals("C")) {
        // Clear the display
        display.setText("");
    }else if (command.equals("CE")) {
        // Clear the display
        display.setText("");
    } else if (command.equals("+")) {
        // Store the first number and operation
        firstNumber = Double.parseDouble(display.getText());
        operation = "+";
        display.setText("");
    } else if (command.equals("-")) {
        // Store the first number and operation
        firstNumber = Double.parseDouble(display.getText());
        operation = "-";
        display.setText("");
    } else if (command.equals("*")) {
        // Store the first number and operation
        firstNumber = Double.parseDouble(display.getText());
        operation = "*";
        display.setText("");
    } else if (command.equals("/")) {
        // Store the first number and operation
        firstNumber = Double.parseDouble(display.getText());
        operation = "/";
        display.setText("");
    } else if (command.equals("%")) {
        // Calculate the percentage and display the result
        double percent = Double.parseDouble(display.getText()) / 100;
        display.setText(Double.toString(percent));
    } else if (command.equals("sqrt")) {
        // Calculate the square root and display the result
        double number = Double.parseDouble(display.getText());
        double squareRoot = Math.sqrt(number);
        display.setText(Double.toString(squareRoot));
    } else if (command.equals(".")) {
        // Add a decimal point to the display if it doesn't already have one
        if (!display.getText().contains(".")) {
            display.setText(display.getText() + ".");
        }
    } else if (command.equals("=")) {
        // Calculate the result of the operation and display it
        double secondNumber = Double.parseDouble(display.getText());
        double result = 0;
        if (operation.equals("+")) {
            result = firstNumber + secondNumber;
        } else if (operation.equals("-")) {
            result = firstNumber - secondNumber;
        } else if (operation.equals("*")) {
            result = firstNumber * secondNumber;
        } else if (operation.equals("/")) {
            result = firstNumber / secondNumber;
        }
        display.setText(Double.toString(result));
    } else {
        // Add the digit to the display
        display.setText(display.getText() + command);
    }
}

public static void main(String[] args) {
    Calculator calculator = new Calculator();
    calculator.setVisible(true);
}
}
   
       

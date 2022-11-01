import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaCalculator {
    private double total1 = 0.0;
    private double total2 = 0.0;
    private char math_operator;



    private JPanel JavaCalculator;
    private JTextField TextDisplay;
    private JButton btnEqu;
    private JButton btnAdd;
    private JButton btnSub;
    private JButton btnNine;
    private JButton btnMod;
    private JButton btnDiv;
    private JButton btnMul;
    private JButton btnSeven;
    private JButton btnEight;
    private JButton btnFive;
    private JButton btnFour;
    private JButton btnTwo;
    private JButton btnOne;
    private JButton btnC;
    private JButton btnZero;
    private JButton btnSix;
    private JButton btnThree;
    private JButton btnDec;
    private JButton btnDel;
    private JButton btn;

    private void getoperator (String btnText) {
        math_operator = btnText.charAt(0);
        total1 = total1 + Double.parseDouble(TextDisplay.getText());
        TextDisplay.setText("");
    }

    public JavaCalculator() {


//        Numbers

        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnZeroText = TextDisplay.getText() + btnZero.getText();
                TextDisplay.setText(btnZeroText);
            }
        });


        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = TextDisplay.getText() + btnOne.getText();
                TextDisplay.setText(btnOneText);
            }
        });

        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = TextDisplay.getText() + btnTwo.getText();
                TextDisplay.setText(btnTwoText);

            }
        });



        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnThreeText = TextDisplay.getText() + btnThree.getText();
                TextDisplay.setText(btnThreeText);
            }
        });

        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFourText = TextDisplay.getText() + btnFour.getText();
                TextDisplay.setText(btnFourText);
            }
        });

        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFiveText = TextDisplay.getText() + btnFive.getText();
                TextDisplay.setText(btnFiveText);
            }
        });

        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSixText = TextDisplay.getText() + btnSix.getText();
                TextDisplay.setText(btnSixText);
            }
        });

        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSevenText = TextDisplay.getText() + btnSeven.getText();
                TextDisplay.setText(btnSevenText);
            }
        });

        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEightText = TextDisplay.getText() + btnEight.getText();
                TextDisplay.setText(btnEightText);
            }
        });


        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNineText = TextDisplay.getText() + btnNine.getText();
                TextDisplay.setText(btnNineText);
            }
        });





//Equal button opertation
        btnEqu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (math_operator){
                    case '+':
                        total2 = total1 + Double.parseDouble(TextDisplay.getText());
                        break;
                    case '-':
                        total2 = total1 - Double.parseDouble(TextDisplay.getText());
                        break;
                    case 'X':
                        total2 = total1 * Double.parseDouble(TextDisplay.getText());
                        break;
                    case '/':
                        total2 = total1 / Double.parseDouble(TextDisplay.getText());
                        break;
                    case '%':
                        total2 = total1 * 0.01 * Double.parseDouble(TextDisplay.getText());
                        break;
//                    case 'DEL':
//                        total2 = total1  Double.parseDouble(TextDisplay.getText());
//                        break;

                }
                TextDisplay.setText(Double.toString(total2));
                total1 = 0;
            }
        });

//Clear button oprtation
        btnC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0;
                TextDisplay.setText("");
            }
        });

//        Decimal dot button operation
        btnDec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                to get initialy number as  0.
                if(TextDisplay.getText().equals("")){
                    TextDisplay.setText("0.");
                }
//                to avoid unnecessary errors
                else if (TextDisplay.getText().contains(".")){
                    btnDec.setEnabled(false);
                }
                else {
                    String btnDecText = TextDisplay.getText() + btnDec.getText();
                    TextDisplay.setText(btnDecText);
                }
                btnDec.setEnabled(true);
            }
        });

//        Adding operation

        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnAdd.getText();
                getoperator(button_text);
            }
        });

//        Substraction operation
        btnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnSub.getText();
                getoperator(button_text);
            }
        });

//        Division operation
        btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnDiv.getText();
                getoperator(button_text);
            }
        });

//        Multiple operation
        btnMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnMul.getText();
                getoperator(button_text);
            }
        });

//        Percentage opertaion
        btnMod.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnMod.getText();
                getoperator(button_text);
            }
        });

//        Deletion operation
        btnDel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String del = null;
                if(TextDisplay.getText().length()>0){

                    StringBuilder str = new StringBuilder(TextDisplay.getText());
                    str.deleteCharAt(TextDisplay.getText().length()-1);
                    del = String.valueOf(str);
                    TextDisplay.setText(del);
                }
            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaCalculator");
        frame.setContentPane(new JavaCalculator().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

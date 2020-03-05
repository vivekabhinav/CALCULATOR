package com.abhinav.calculator;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Text input, signBox;

    String sign, value1, value2;
    Double num1, num2, result;
    boolean hasDot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (TextView) findViewById(R.id.input);
        signBox = (TextView) findViewById(R.id.sign);

        hasDot = false;

    }

    @SuppressLint("SetTextI18n")
    public void btnClick_0(View view) {
        input.setTextContent(input.getTextContent() + "0");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_1(View view) {
        input.setTextContent(input.getTextContent() + "1");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_2(View view) {
        input.setTextContent(input.getTextContent() + "2");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_3(View view) {
        input.setTextContent(input.getTextContent() + "3");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_4(View view) {
        input.setTextContent(input.getTextContent() + "4");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_5(View view) {
        input.setTextContent(input.getTextContent() + "5");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_6(View view) {
        input.setTextContent(input.getTextContent() + "6");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_7(View view) {
        input.setTextContent(input.getTextContent() + "7");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_8(View view) {
        input.setTextContent(input.getTextContent() + "8");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_9(View view) {
        input.setTextContent(input.getTextContent() + "9");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_dot(View view) {
        if (!hasDot) {
            if (input.getTextContent().equals("")) {

                input.setTextContent("0.");
            } else {

                input.setTextContent(input.getTextContent() + ".");
            }

            hasDot = true;
        }

    }

    public void btnClick_add(View view) {
        sign = "+";
        value1 = input.getTextContent().toString();
        input.setTextContent(null);
        signBox.setTextContent("+");
        hasDot = false;
    }

    public void btnClick_subtract(View view) {
        sign = "-";
        value1 = input.getTextContent().toString();
        input.setTextContent(null);
        signBox.setTextContent("-");
        hasDot = false;
    }

    public void btnClick_multiply(View view) {
        sign = "*";
        value1 = input.getTextContent().toString();
        input.setTextContent(null);
        signBox.setTextContent("×");
        hasDot = false;
    }

    public void btnClick_divide(View view) {
        sign = "/";
        value1 = input.getTextContent().toString();
        input.setTextContent(null);
        signBox.setTextContent("÷");
        hasDot = false;
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_log(View view) {
        sign = "log";
        input.setTextContent(null);
        signBox.setTextContent("log");
        hasDot = false;
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_ln(View view) {
        sign = "ln";
        input.setTextContent(null);
        signBox.setTextContent("ln");
        hasDot = false;
    }

    public void btnClick_power(View view) {
        sign = "power";
        value1 = input.getTextContent().toString();
        input.setTextContent(null);
        hasDot = false;
        signBox.setTextContent("xⁿ");
    }

    public void btnClick_factorial(View view) {
        sign = "factorial";
        input.setTextContent(null);
        hasDot = false;
        signBox.setTextContent("!");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_sin(View view) {
        sign = "sin";
        input.setTextContent(null);
        hasDot = false;
        signBox.setTextContent("sin");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_cos(View view) {
        sign = "cos";
        input.setTextContent(null);
        hasDot = false;
        signBox.setTextContent("cos");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_tan(View view) {
        sign = "tan";
        input.setTextContent(null);
        hasDot = false;
        signBox.setTextContent("tan");
    }

    public void btnClick_root(View view) {
        sign = "root";
        input.setTextContent(null);
        hasDot = false;
        signBox.setTextContent("√");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_equal(View view) {
        if (sign == null) {
            signBox.setTextContent("Error!");
        } else if (input.getTextContent().equals("")) {
            signBox.setTextContent("Error!");
        } else if ((sign.equals("+") || sign.equals("-") || sign.equals("*") || sign.equals("/")) && value1.equals("")) {
            signBox.setTextContent("Error!");
        } else {
            switch (sign) {
                default:
                    break;
                case "log":
                    value1 = input.getTextContent().toString();
                    num1 = Double.parseDouble(value1);
                    input.setTextContent(Math.log10(num1) + "");
                    sign = null;
                    signBox.setTextContent(null);
                    break;
                case "ln":
                    value1 = input.getTextContent().toString();
                    num1 = Double.parseDouble(value1);
                    input.setTextContent(Math.log(num1) + "");
                    sign = null;
                    signBox.setTextContent(null);
                    break;
                case "power":
                    num1 = Double.parseDouble((value1));
                    value2 = input.getTextContent().toString();
                    num2 = Double.parseDouble(value2);
                    input.setTextContent(Math.pow(num1, num2) + "");
                    sign = null;
                    signBox.setTextContent(null);
                    break;
                case "root":
                    value1 = input.getTextContent().toString();
                    num1 = Double.parseDouble((value1));
                    input.setTextContent(Math.sqrt(num1) + "");
                    sign = null;
                    signBox.setTextContent(null);
                    break;
                case "factorial":
                    value1 = input.getTextContent().toString();
                    num1 = Double.parseDouble((value1));
                    int i = Integer.parseInt(value1) - 1;

                    while (i > 0) {
                        num1 = num1 * i;
                        i--;
                    }

                    input.setTextContent(num1 + "");
                    sign = null;
                    signBox.setTextContent(null);
                    break;
                case "sin":
                    value1 = input.getTextContent().toString();
                    num1 = Double.parseDouble((value1));
                    input.setTextContent(Math.sin(num1) + "");
                    sign = null;
                    signBox.setTextContent(null);
                    break;
                case "cos":
                    value1 = input.getTextContent().toString();
                    num1 = Double.parseDouble((value1));
                    input.setTextContent(Math.cos(num1) + "");
                    sign = null;
                    signBox.setTextContent(null);
                    break;
                case "tan":
                    value1 = input.getTextContent().toString();
                    num1 = Double.parseDouble((value1));
                    input.setTextContent(Math.tan(num1) + "");
                    sign = null;
                    signBox.setTextContent(null);
                    break;
                case "+":
                    value2 = input.getTextContent().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 + num2;
                    input.setTextContent(result + "");
                    sign = null;
                    signBox.setTextContent(null);
                    break;
                case "-":
                    value2 = input.getTextContent().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 - num2;
                    input.setTextContent(result + "");
                    sign = null;
                    signBox.setTextContent(null);
                    break;
                case "*":
                    value2 = input.getTextContent().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 * num2;
                    input.setTextContent(result + "");
                    sign = null;
                    signBox.setTextContent(null);
                    break;
                case "/":
                    value2 = input.getTextContent().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 / num2;
                    input.setTextContent(result + "");
                    sign = null;
                    signBox.setTextContent(null);
                    break;
            }

        }
    }


    public void btnClick_delete(View view) {
        if (input.getTextContent().equals("")) {
            input.setTextContent(null);
        } else {
            int len = input.getTextContent().length();
            String s = input.getTextContent().toString();
            if (s.charAt(len - 1) == '.') {
                hasDot = false;
                input.setTextContent(input.getTextContent().subSequence(0,input.getTextContent().length() - 1));

            } else {
                input.setTextContent(input.getTextContent().subSequence(0, input.getTextContent().length() - 1));
            }
        }
    }

    public void btnClick_clear(View view) {

        input.setTextContent(null);
        signBox.setTextContent(null);
        value1 = null;
        value2 = null;
        sign = null;
        hasDot = false;
    }


}

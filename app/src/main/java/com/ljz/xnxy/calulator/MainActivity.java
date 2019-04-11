package com.ljz.xnxy.calulator;

import android.graphics.Color;
import android.nfc.Tag;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button yi, er, san, si, wu, liu, qi, ba, jiu, jia, jian, cheng, chu, dengyu, c, del, zero, dian, left, right;
    public String inputstring;
    public String outputstring;
    private static final String TAG = "MainActivity";
    public ArrayList<String> arrayList = new ArrayList<>();
    public TextView input;
    int flag = 0;
    public TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setStatusBar();
        // View decorView = getWindow().getDecorView();//获取屏幕的decorView
        // decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);//设置全屏
        inputstring = new String("");
        inirview();
    }

    protected void setStatusBar() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow().setStatusBarColor(getResources().getColor(R.color.white));//设置状态栏颜色
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);//实现状态栏图标和文字颜色为暗色
        }
    }

    private void inirview() {
        yi = (Button) findViewById(R.id.button13); //1
        er = (Button) findViewById(R.id.button14);//2
        san = (Button) findViewById(R.id.button15);//3

        si = (Button) findViewById(R.id.button9);//4
        wu = (Button) findViewById(R.id.button10);//5
        liu = (Button) findViewById(R.id.button11);//6

        qi = (Button) findViewById(R.id.button5);//7
        ba = (Button) findViewById(R.id.button6);//8
        jiu = (Button) findViewById(R.id.button7);//9

        jia = (Button) findViewById(R.id.button16);//+
        c = (Button) findViewById(R.id.button2); //C
        del = (Button) findViewById(R.id.button3);//del
        chu = (Button) findViewById(R.id.button4); // /

        cheng = (Button) findViewById(R.id.button8);// *
        left = (Button) findViewById(R.id.button0);// (
        right = (Button) findViewById(R.id.button1);// )


        jian = (Button) findViewById(R.id.button12); // -
        zero = (Button) findViewById(R.id.button17); // 0
        dian = (Button) findViewById(R.id.button18); //  .
        dengyu = (Button) findViewById(R.id.button19); //  =
        input = (TextView) findViewById(R.id.textview1); //第一行
        result = (TextView) findViewById(R.id.textview2); //第二行


        yi.setOnClickListener(this);
        er.setOnClickListener(this);
        san.setOnClickListener(this);
        si.setOnClickListener(this);
        wu.setOnClickListener(this);
        liu.setOnClickListener(this);
        qi.setOnClickListener(this);
        ba.setOnClickListener(this);
        jiu.setOnClickListener(this);
        jia.setOnClickListener(this);
        jian.setOnClickListener(this);
        cheng.setOnClickListener(this);
        chu.setOnClickListener(this);
        dian.setOnClickListener(this);
        dengyu.setOnClickListener(this);
        c.setOnClickListener(this);
        del.setOnClickListener(this);
        chu.setOnClickListener(this);
        zero.setOnClickListener(this);
        left.setOnClickListener(this);
        right.setOnClickListener(this);


    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button13: //1
                if (flag == 1) {
                    input.setText("");
                    result.setText("");
                    inputstring = "";
                    outputstring = "";
                    flag = 0;
                }
                inputstring = inputstring.concat("1");
                input.setText(inputstring);
                break;
            case R.id.button0: //(
                if (flag == 1) {
                    input.setText("");
                    result.setText("");
                    inputstring = "";
                    outputstring = "";
                    flag = 0;
                }
                inputstring = inputstring.concat("(");
                input.setText(inputstring);
                break;
            case R.id.button1: //)
                if (flag == 1) {
                    input.setText("");
                    result.setText("");
                    inputstring = "";
                    outputstring = "";
                    flag = 0;
                }
                inputstring = inputstring.concat(")");
                input.setText(inputstring);
                break;
            case R.id.button14: //2
                if (flag == 1) {
                    input.setText("");
                    result.setText("");
                    inputstring = "";
                    outputstring = "";
                    flag = 0;
                }
                inputstring = inputstring.concat("2");
                input.setText(inputstring);
                break;
            case R.id.button15: //3
                if (flag == 1) {
                    input.setText("");
                    result.setText("");
                    inputstring = "";
                    outputstring = "";
                    flag = 0;
                }
                inputstring = inputstring.concat("3");
                //    Log.d(TAG, "onClick: " + inputstring);
                input.setText(inputstring);
                break;
            case R.id.button9: //4
                if (flag == 1) {
                    input.setText("");
                    result.setText("");
                    inputstring = "";
                    outputstring = "";
                    flag = 0;
                }
                inputstring = inputstring.concat("4");
                input.setText(inputstring);
                break;
            case R.id.button10: //5
                if (flag == 1) {
                    input.setText("");
                    result.setText("");
                    inputstring = "";
                    outputstring = "";
                    flag = 0;
                }
                inputstring = inputstring.concat("5");
                input.setText(inputstring);
                break;
            case R.id.button11: //6
                if (flag == 1) {
                    input.setText("");
                    result.setText("");
                    inputstring = "";
                    outputstring = "";
                    flag = 0;
                }
                inputstring = inputstring.concat("6");
                input.setText(inputstring);
                break;
            case R.id.button5: //7
                if (flag == 1) {
                    input.setText("");
                    result.setText("");
                    inputstring = "";
                    outputstring = "";
                    flag = 0;
                }
                inputstring = inputstring.concat("7");
                input.setText(inputstring);
                break;
            case R.id.button6: //8
                if (flag == 1) {
                    input.setText("");
                    result.setText("");
                    inputstring = "";
                    outputstring = "";
                    flag = 0;
                }
                inputstring = inputstring.concat("8");
                input.setText(inputstring);
                break;
            case R.id.button7: //9
                if (flag == 1) {
                    input.setText("");
                    result.setText("");
                    inputstring = "";
                    outputstring = "";
                    flag = 0;
                }
                inputstring = inputstring.concat("9");
                input.setText(inputstring);
                break;
            case R.id.button2: //c
                input.setText("");
                inputstring = "";
                result.setText("");
                break;
            case R.id.button3: //del
                if (!inputstring.equals("")) {
                    inputstring = inputstring.substring(0, inputstring.length() - 1);
                    input.setText(inputstring);
                } else {
                    input.setText("");
                }
                break;
            case R.id.button4: // /
                if (flag == 1) {
                    result.setText("");
                    inputstring = "";
                    inputstring = inputstring.concat(outputstring);
                    flag = 0;
                }
                inputstring = inputstring.concat("/");
                input.setText(inputstring);
                break;
            case R.id.button8: // *
                if (flag == 1) {
                    result.setText("");
                    inputstring = "";
                    inputstring = inputstring.concat(outputstring);
                    flag = 0;
                }
                inputstring = inputstring.concat("*");
                input.setText(inputstring);
                break;
            case R.id.button16: // +
                if (flag == 1) {
                    result.setText("");
                    inputstring = "";
                    inputstring = inputstring.concat(outputstring);
                    flag = 0;
                }
                SpannableString spannableString;
                inputstring = inputstring.concat("+");
                input.setText(inputstring);
                break;
            case R.id.button12: // -
                if (flag == 1) {
                    result.setText("");
                    inputstring = "";
                    inputstring = inputstring.concat(outputstring);
                    flag = 0;
                }
                inputstring = inputstring.concat("-");
                input.setText(inputstring);
                break;
            case R.id.button17: // 0
                if (flag == 1) {
                    input.setText("");
                    result.setText("");
                    inputstring = "";
                    outputstring = "";
                    flag = 0;
                }
                inputstring = inputstring.concat("0");
                input.setText(inputstring);
                break;
            case R.id.button18: // .
                inputstring = inputstring.concat(".");
                input.setText(inputstring);
                break;
            case R.id.button19: // =
                if (flag == 0) {
                    flag = 1;
                }
                try {

                    outputstring = getResult(inputstring);
                    if (outputstring.endsWith(".0")) {
                        outputstring = outputstring.substring(0, outputstring.length() - 2);
                    }
                    result.setText("=" + outputstring);


                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            default:
                break;
        }
    }

    private double doubleCal(double a1, double a2, char operator) throws Exception {
        switch (operator) {
            case '+':
                return a1 + a2;
            case '-':
                return a1 - a2;
            case '*':
                return a1 * a2;
            case '/':
                return a1 / a2;
            default:
                break;
        }
        throw new Exception("illegal operator!");
    }

    private int getPriority(String s) throws Exception {
        if (s == null) return 0;
        switch (s) {
            case "(":
                return 1;
            case "+":
                ;
            case "-":
                return 2;
            case "*":
                ;
            case "/":
                return 3;
            default:
                break;
        }
        throw new Exception("illegal operator!");
    }

    public String getResult(String expr) throws Exception {
        Log.d(TAG, "计算" + expr);
        //System.out.println("计算"+expr);
        /*数字栈*/
        Stack<Double> number = new Stack<Double>();
        /*符号栈*/
        Stack<String> operator = new Stack<String>();
        operator.push(null);// 在栈顶压人一个null，配合它的优先级，目的是减少下面程序的判断

        /* 将expr打散为运算数和运算符 */
        Pattern p = Pattern.compile("(?<!\\d)-?\\d+(\\.\\d+)?|[+\\-*/()]");// 这个正则为匹配表达式中的数字或运算符
        Matcher m = p.matcher(expr);
        while (m.find()) {
            String temp = m.group();
            if (temp.matches("[+\\-*/()]")) {//遇到符号
                if (temp.equals("(")) {//遇到左括号，直接入符号栈
                    operator.push(temp);
                    Log.d(TAG, "符号栈更新" + operator);
                    //    System.out.println("符号栈更新："+operator);
                } else if (temp.equals(")")) {//遇到右括号，"符号栈弹栈取栈顶符号b，数字栈弹栈取栈顶数字a1，数字栈弹栈取栈顶数字a2，计算a2 b a1 ,将结果压入数字栈"，重复引号步骤至取栈顶为左括号，将左括号弹出
                    String b = null;
                    while (!(b = operator.pop()).equals("(")) {
                        //   System.out.println("符号栈更新："+operator);
                        Log.d(TAG, "符号栈更新:" + operator);
                        double a1 = number.pop();
                        double a2 = number.pop();
                        Log.d(TAG, "数字栈更新:" + number);
                        Log.d(TAG, "计算" + a2 + b + a1);
                        number.push(doubleCal(a2, a1, b.charAt(0)));
                        Log.d(TAG, "数字栈更新:" + number);
                    }
                    // System.out.println("符号栈更新："+operator);
                    Log.d(TAG, "符号栈更新:" + operator);
                } else {//遇到运算符，满足该运算符的优先级大于栈顶元素的优先级压栈；否则计算后压栈
                    while (getPriority(temp) <= getPriority(operator.peek())) {
                        double a1 = number.pop();
                        double a2 = number.pop();
                        String b = operator.pop();
                        Log.d(TAG, "符号栈更新:" + operator);
                        Log.d(TAG, "数字栈更新:" + number);
                        Log.d(TAG, "计算" + a2 + b + a1);
                        number.push(doubleCal(a2, a1, b.charAt(0)));
                        Log.d(TAG, "数字栈更新:" + number);
                    }
                    operator.push(temp);
                    Log.d(TAG, "符号栈更新:" + operator);
                }
            } else {//遇到数字，直接压入数字栈
                number.push(Double.valueOf(temp));
                Log.d(TAG, "数字栈更新:" + number);
            }
        }

        while (operator.peek() != null) {//遍历结束后，符号栈数字栈依次弹栈计算，并将结果压入数字栈
            double a1 = number.pop();
            double a2 = number.pop();
            String b = operator.pop();
            Log.d(TAG, "符号栈更新:" + operator);
            Log.d(TAG, "数字栈更新:" + number);
            Log.d(TAG, "计算" + a2 + b + a1);
            number.push(doubleCal(a2, a1, b.charAt(0)));
            Log.d(TAG, "数字栈更新:" + number);

        }
        return number.pop() + "";
    }

    //textview 设置部分颜色
    public SpannableStringBuilder setPartColorText(String str) {
        //使用SpannableStringBuilder类
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        //确定部分颜色的位置
        String content="";
        int start = str.indexOf(content);
        int end = start + content.length();
        //确定颜色为红色
        ForegroundColorSpan mForeColor = new ForegroundColorSpan(Color.RED);
        //setspan
        spannableStringBuilder.setSpan(mForeColor, start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        return spannableStringBuilder;
    }

}

package com.cpsc41102.homework1;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RelativeLayout relativeRoot = new RelativeLayout(this);

        //columns with numbers
        GridLayout rootColumn = new GridLayout(this);
        createWidgetAtCell(rootColumn, 0);
        relativeRoot.addView(rootColumn);

        //first row root
        GridLayout hello1Root = new GridLayout(this);
        hello1Root.setColumnCount(1);
        hello1Root.setRowCount(1);
        TextView tv = new TextView(this);
        tv.setText("Rules void hello1(int hour)");
        tv.setHeight(93);
        tv.setWidth(1700);
        tv.setGravity(100);
        tv.setBackgroundColor(Color.BLACK);
        tv.setTextColor(Color.WHITE);
        tv.setTextAlignment(hello1Root.TEXT_ALIGNMENT_CENTER);
        GridLayout.Spec rowSpec = GridLayout.spec(0, GridLayout.FILL);
        GridLayout.Spec colSpec = GridLayout.spec(0, GridLayout.FILL);
        GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec,colSpec);
        params.leftMargin = 100;
        tv.setLayoutParams(params);
        hello1Root.addView(tv);
        relativeRoot.addView(hello1Root);

        //properties column
        GridLayout propertiesColumnroot = new GridLayout(this);
        propertiesColumnroot.setColumnCount(1);
        propertiesColumnroot.setRowCount(9);
        createPropertiesColumnWidgetCells(propertiesColumnroot);
        relativeRoot.addView(propertiesColumnroot);


        //name and category rows
        GridLayout nameRowRoot = new GridLayout(this);
        nameRowRoot.setColumnCount(2);
        nameRowRoot.setRowCount(2);
        createNameRowRoot(nameRowRoot);
        relativeRoot.addView(nameRowRoot);

        //C1 and min<= hour && hour <= max rows
        GridLayout minMaxRoot = new GridLayout(this);
        minMaxRoot.setColumnCount(2);
        minMaxRoot.setRowCount(2);
        createMinMaxRowRoot(minMaxRoot);
        relativeRoot.addView(minMaxRoot);

        //The rest of the cells, From, To, and Greeting columns
        GridLayout ftgRoot = new GridLayout(this);
        ftgRoot.setColumnCount(3);
        ftgRoot.setRowCount(6);
        createFTGRoot(ftgRoot);
        relativeRoot.addView(ftgRoot);


        setContentView(relativeRoot);

//        setContentView(R.layout.activity_main);
    }

    private void createWidgetAtCell(GridLayout l, int col){
        for(int i=1; i<=11; i++){
           TextView tv = new TextView(this);
            tv.setText("" + i);
            tv.setTextSize(24);
            tv.setTextAlignment(l.TEXT_ALIGNMENT_CENTER);
            tv.setBackgroundColor(Color.LTGRAY);
            tv.setWidth(100);
            tv.setHeight(93);


            GridLayout.Spec rowSpec =  GridLayout.spec(i - 1);
            GridLayout.Spec colSpec =  GridLayout.spec(col);
            GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec,colSpec);
//            params.setMargins(1,1,1,1);
            tv.setLayoutParams(params);
            l.addView(tv);

        }
    }

    private void createPropertiesColumnWidgetCells(GridLayout gl){
        TextView tv = new TextView(this);
        tv.setText("properties");
        tv.setWidth(300);
        tv.setHeight(186);
        tv.setGravity(100);
        tv.setTextAlignment(gl.TEXT_ALIGNMENT_CENTER);
        GridLayout.Spec rowSpec =  GridLayout.spec(0);
        GridLayout.Spec colSpec =  GridLayout.spec(0);
        GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec,colSpec);
        params.leftMargin = 100;
        params.topMargin = 93;
        tv.setLayoutParams(params);
        gl.addView(tv);

        tv = new TextView(this);
        tv.setText("Rule");
        tv.setWidth(300);
        tv.setHeight(93);
        tv.setGravity(100);
        tv.setBackgroundColor(Color.CYAN);
        tv.setTextAlignment(gl.TEXT_ALIGNMENT_CENTER);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        rowSpec =  GridLayout.spec(1);
        colSpec =  GridLayout.spec(0);
        params = new GridLayout.LayoutParams(rowSpec,colSpec);
        params.leftMargin = 100;
        tv.setLayoutParams(params);
        gl.addView(tv);

        tv = new TextView(this);
        tv.setText("");
        tv.setWidth(300);
        tv.setHeight(93);
        tv.setGravity(100);
        tv.setBackgroundColor(Color.CYAN);
        rowSpec =  GridLayout.spec(2);
        colSpec =  GridLayout.spec(0);
        params = new GridLayout.LayoutParams(rowSpec,colSpec);
        params.leftMargin = 100;
        tv.setLayoutParams(params);
        gl.addView(tv);

        tv = new TextView(this);
        tv.setText("");
        tv.setWidth(300);
        tv.setHeight(93);
        tv.setGravity(100);
        tv.setBackgroundColor(Color.CYAN);
        rowSpec =  GridLayout.spec(3);
        colSpec =  GridLayout.spec(0);
        params = new GridLayout.LayoutParams(rowSpec,colSpec);
        params.leftMargin = 100;
        tv.setLayoutParams(params);
        gl.addView(tv);

        tv = new TextView(this);
        tv.setText("Rule");
        tv.setWidth(300);
        tv.setHeight(93);
        tv.setGravity(100);
        tv.setPaddingRelative(25,0,0,0);
//        tv.setBackgroundColor(Color.WHITE);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        rowSpec =  GridLayout.spec(4);
        colSpec =  GridLayout.spec(0);
        params = new GridLayout.LayoutParams(rowSpec,colSpec);
        params.leftMargin = 100;
        tv.setLayoutParams(params);
        gl.addView(tv);


        for(int i=1; i<5; i++){

            tv = new TextView(this);
            tv.setText("R"+i*10);
            tv.setWidth(300);
            tv.setHeight(93);
            tv.setGravity(100);
            tv.setPaddingRelative(25,0,0,0);
//            tv.setBackgroundColor(Color.WHITE);
            rowSpec =  GridLayout.spec(i+4);
            colSpec =  GridLayout.spec(0);
            params = new GridLayout.LayoutParams(rowSpec,colSpec);
            params.leftMargin = 100;
            tv.setLayoutParams(params);
            gl.addView(tv);

        }

    }

    private void createNameRowRoot(GridLayout l){
        TextView tv = new TextView(this);
        tv.setText("name");
        tv.setWidth(600);
        tv.setHeight(93);
        tv.setGravity(100);
        tv.setTextAlignment(l.TEXT_ALIGNMENT_CENTER);
        GridLayout.Spec rowSpec = GridLayout.spec(0);
        GridLayout.Spec colSpec = GridLayout.spec(0);
        GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec,colSpec);
        params.leftMargin = 400;
        params.topMargin = 93;
        tv.setLayoutParams(params);
        l.addView(tv);

        tv = new TextView(this);
        tv.setText("category");
        tv.setWidth(600);
        tv.setHeight(93);
        tv.setGravity(100);
        tv.setTextAlignment(l.TEXT_ALIGNMENT_CENTER);
        rowSpec = GridLayout.spec(1);
        colSpec = GridLayout.spec(0);
        params = new GridLayout.LayoutParams(rowSpec,colSpec);
        params.leftMargin = 400;
        tv.setLayoutParams(params);
        l.addView(tv);

        tv = new TextView(this);
        tv.setText("Day Hour Classification");
        tv.setWidth(800);
        tv.setHeight(93);
        tv.setGravity(100);
        tv.setPaddingRelative(25,0,0,0);
        rowSpec = GridLayout.spec(0);
        colSpec = GridLayout.spec(1);
        params = new GridLayout.LayoutParams(rowSpec,colSpec);
        params.topMargin = 93;
        tv.setLayoutParams(params);
        l.addView(tv);

        tv = new TextView(this);
        tv.setText("Day and Time");
        tv.setWidth(800);
        tv.setHeight(93);
        tv.setGravity(100);
        tv.setPaddingRelative(25,0,0,0);
        rowSpec = GridLayout.spec(1);
        colSpec = GridLayout.spec(1);
        params = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setLayoutParams(params);
        l.addView(tv);
    }

    private void createMinMaxRowRoot(GridLayout l){
        TextView tv = new TextView(this);
        tv.setText("C1");
        tv.setWidth(600);
        tv.setHeight(93);
        tv.setGravity(100);
        tv.setTextAlignment(l.TEXT_ALIGNMENT_CENTER);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        tv.setBackgroundColor(Color.CYAN);
        GridLayout.Spec rowSpec = GridLayout.spec(0);
        GridLayout.Spec colSpec = GridLayout.spec(0);
        GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec,colSpec);
        params.leftMargin = 400;
        params.topMargin = 279;
        tv.setLayoutParams(params);
        l.addView(tv);

        tv = new TextView(this);
        tv.setText("min <= hour && hour <= max");
        tv.setWidth(600);
        tv.setHeight(93);
        tv.setGravity(100);
        tv.setTextAlignment(l.TEXT_ALIGNMENT_CENTER);
        tv.setBackgroundColor(Color.CYAN);
        rowSpec = GridLayout.spec(1);
        colSpec = GridLayout.spec(0);
        params = new GridLayout.LayoutParams(rowSpec,colSpec);
        params.leftMargin = 400;
        tv.setLayoutParams(params);
        l.addView(tv);

        tv = new TextView(this);
        tv.setText("A1");
        tv.setWidth(800);
        tv.setHeight(93);
        tv.setGravity(100);
        tv.setTextAlignment(l.TEXT_ALIGNMENT_CENTER);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        tv.setBackgroundColor(Color.CYAN);
        rowSpec = GridLayout.spec(0);
        colSpec = GridLayout.spec(1);
        params = new GridLayout.LayoutParams(rowSpec,colSpec);
        params.topMargin = 279;
        tv.setLayoutParams(params);
        l.addView(tv);

        tv = new TextView(this);
        tv.setText("System.out.println(greeting + \", World! \")");
        tv.setWidth(800);
        tv.setHeight(93);
        tv.setGravity(100);
        tv.setTextAlignment(l.TEXT_ALIGNMENT_CENTER);
        tv.setBackgroundColor(Color.CYAN);
        rowSpec = GridLayout.spec(1);
        colSpec = GridLayout.spec(1);
        params = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setLayoutParams(params);
        l.addView(tv);

    }

    private void createFTGRoot(GridLayout l){
        TextView tv = new TextView(this);
        tv.setText("int min");
        tv.setWidth(300);
        tv.setHeight(93);
        tv.setGravity(100);
        tv.setTextAlignment(l.TEXT_ALIGNMENT_CENTER);
        tv.setBackgroundColor(Color.CYAN);
        GridLayout.Spec rowSpec = GridLayout.spec(0);
        GridLayout.Spec colSpec = GridLayout.spec(0);
        GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec,colSpec);
        params.leftMargin = 400;
        params.topMargin = 465;
        tv.setLayoutParams(params);
        l.addView(tv);

        tv = new TextView(this);
        tv.setText("int max");
        tv.setWidth(300);
        tv.setHeight(93);
        tv.setGravity(100);
        tv.setTextAlignment(l.TEXT_ALIGNMENT_CENTER);
        tv.setBackgroundColor(Color.CYAN);
        rowSpec = GridLayout.spec(0);
        colSpec = GridLayout.spec(1);
        params = new GridLayout.LayoutParams(rowSpec,colSpec);
        params.topMargin = 465;
        tv.setLayoutParams(params);
        l.addView(tv);

        tv = new TextView(this);
        tv.setText("String greeting");
        tv.setWidth(800);
        tv.setHeight(93);
        tv.setGravity(100);
        tv.setTextAlignment(l.TEXT_ALIGNMENT_CENTER);
        tv.setBackgroundColor(Color.CYAN);
        rowSpec = GridLayout.spec(0);
        colSpec = GridLayout.spec(2);
        params = new GridLayout.LayoutParams(rowSpec,colSpec);
        params.topMargin = 465;
        tv.setLayoutParams(params);
        l.addView(tv);

        tv = new TextView(this);
        tv.setText("From");
        tv.setWidth(300);
        tv.setHeight(93);
        tv.setGravity(100);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        tv.setBackgroundColor(Color.YELLOW);
        tv.setPaddingRelative(25,0,0,0);
        rowSpec = GridLayout.spec(1);
        colSpec = GridLayout.spec(0);
        params = new GridLayout.LayoutParams(rowSpec,colSpec);
        params.leftMargin = 400;
        tv.setLayoutParams(params);
        l.addView(tv);

        tv = new TextView(this);
        tv.setText("0");
        tv.setWidth(300);
        tv.setHeight(93);
        tv.setGravity(100);
        tv.setTextAlignment(l.TEXT_ALIGNMENT_TEXT_END);
        tv.setBackgroundColor(Color.YELLOW);
        tv.setPaddingRelative(0,0,25,0);
        rowSpec = GridLayout.spec(2);
        colSpec = GridLayout.spec(0);
        params = new GridLayout.LayoutParams(rowSpec,colSpec);
        params.leftMargin = 400;
        tv.setLayoutParams(params);
        l.addView(tv);

        tv = new TextView(this);
        tv.setText("12");
        tv.setWidth(300);
        tv.setHeight(93);
        tv.setGravity(100);
        tv.setTextAlignment(l.TEXT_ALIGNMENT_TEXT_END);
        tv.setBackgroundColor(Color.YELLOW);
        tv.setPaddingRelative(0,0,25,0);
        rowSpec = GridLayout.spec(3);
        colSpec = GridLayout.spec(0);
        params = new GridLayout.LayoutParams(rowSpec,colSpec);
        params.leftMargin = 400;
        tv.setLayoutParams(params);
        l.addView(tv);

        tv = new TextView(this);
        tv.setText("18");
        tv.setWidth(300);
        tv.setHeight(93);
        tv.setGravity(100);
        tv.setTextAlignment(l.TEXT_ALIGNMENT_TEXT_END);
        tv.setBackgroundColor(Color.YELLOW);
        tv.setPaddingRelative(0,0,25,0);
        rowSpec = GridLayout.spec(4);
        colSpec = GridLayout.spec(0);
        params = new GridLayout.LayoutParams(rowSpec,colSpec);
        params.leftMargin = 400;
        tv.setLayoutParams(params);
        l.addView(tv);

        tv = new TextView(this);
        tv.setText("22");
        tv.setWidth(300);
        tv.setHeight(93);
        tv.setGravity(100);
        tv.setTextAlignment(l.TEXT_ALIGNMENT_TEXT_END);
        tv.setBackgroundColor(Color.YELLOW);
        tv.setPaddingRelative(0,0,25,0);
        rowSpec = GridLayout.spec(5);
        colSpec = GridLayout.spec(0);
        params = new GridLayout.LayoutParams(rowSpec,colSpec);
        params.leftMargin = 400;
        tv.setLayoutParams(params);
        l.addView(tv);

        tv = new TextView(this);
        tv.setText("To");
        tv.setWidth(300);
        tv.setHeight(93);
        tv.setGravity(100);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        tv.setBackgroundColor(Color.YELLOW);
        tv.setPaddingRelative(25,0,0,0);
        rowSpec = GridLayout.spec(1);
        colSpec = GridLayout.spec(1);
        params = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setLayoutParams(params);
        l.addView(tv);

        tv = new TextView(this);
        tv.setText("11");
        tv.setWidth(300);
        tv.setHeight(93);
        tv.setGravity(100);
        tv.setTextAlignment(l.TEXT_ALIGNMENT_TEXT_END);
        tv.setBackgroundColor(Color.YELLOW);
        tv.setPaddingRelative(0,0,25,0);
        rowSpec = GridLayout.spec(2);
        colSpec = GridLayout.spec(1);
        params = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setLayoutParams(params);
        l.addView(tv);

        tv = new TextView(this);
        tv.setText("17");
        tv.setWidth(300);
        tv.setHeight(93);
        tv.setGravity(100);
        tv.setTextAlignment(l.TEXT_ALIGNMENT_TEXT_END);
        tv.setBackgroundColor(Color.YELLOW);
        tv.setPaddingRelative(0,0,25,0);
        rowSpec = GridLayout.spec(3);
        colSpec = GridLayout.spec(1);
        params = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setLayoutParams(params);
        l.addView(tv);

        tv = new TextView(this);
        tv.setText("21");
        tv.setWidth(300);
        tv.setHeight(93);
        tv.setGravity(100);
        tv.setTextAlignment(l.TEXT_ALIGNMENT_TEXT_END);
        tv.setBackgroundColor(Color.YELLOW);
        tv.setPaddingRelative(0,0,25,0);
        rowSpec = GridLayout.spec(4);
        colSpec = GridLayout.spec(1);
        params = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setLayoutParams(params);
        l.addView(tv);

        tv = new TextView(this);
        tv.setText("23");
        tv.setWidth(300);
        tv.setHeight(93);
        tv.setGravity(100);
        tv.setTextAlignment(l.TEXT_ALIGNMENT_TEXT_END);
        tv.setBackgroundColor(Color.YELLOW);
        tv.setPaddingRelative(0,0,25,0);
        rowSpec = GridLayout.spec(5);
        colSpec = GridLayout.spec(1);
        params = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setLayoutParams(params);
        l.addView(tv);


        tv = new TextView(this);
        tv.setText("Greeting");
        tv.setWidth(800);
        tv.setHeight(93);
        tv.setGravity(100);
        tv.setBackgroundColor(Color.rgb(232,140,64));
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        tv.setPaddingRelative(25,0,0,0);
        rowSpec = GridLayout.spec(1);
        colSpec = GridLayout.spec(2);
        params = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setLayoutParams(params);
        l.addView(tv);

        tv = new TextView(this);
        tv.setText("Good Morning");
        tv.setWidth(800);
        tv.setHeight(93);
        tv.setGravity(100);
        tv.setBackgroundColor(Color.rgb(232,140,64));
        tv.setPaddingRelative(25,0,0,0);
        rowSpec = GridLayout.spec(2);
        colSpec = GridLayout.spec(2);
        params = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setLayoutParams(params);
        l.addView(tv);

        tv = new TextView(this);
        tv.setText("Good Afternoon");
        tv.setWidth(800);
        tv.setHeight(93);
        tv.setGravity(100);
        tv.setBackgroundColor(Color.rgb(232,140,64));
        tv.setPaddingRelative(25,0,0,0);
        rowSpec = GridLayout.spec(3);
        colSpec = GridLayout.spec(2);
        params = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setLayoutParams(params);
        l.addView(tv);

        tv = new TextView(this);
        tv.setText("Good Evening");
        tv.setWidth(800);
        tv.setHeight(93);
        tv.setGravity(100);
        tv.setBackgroundColor(Color.rgb(232,140,64));
        tv.setPaddingRelative(25,0,0,0);
        rowSpec = GridLayout.spec(4);
        colSpec = GridLayout.spec(2);
        params = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setLayoutParams(params);
        l.addView(tv);

        tv = new TextView(this);
        tv.setText("Good Night");
        tv.setWidth(800);
        tv.setHeight(93);
        tv.setGravity(100);
        tv.setBackgroundColor(Color.rgb(232,140,64));
        tv.setPaddingRelative(25,0,0,0);
        rowSpec = GridLayout.spec(5);
        colSpec = GridLayout.spec(2);
        params = new GridLayout.LayoutParams(rowSpec,colSpec);
        tv.setLayoutParams(params);
        l.addView(tv);
    }
}

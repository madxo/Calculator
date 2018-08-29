package com.internshala.helloworld.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button bclr,bone,btwo,bthree,badd,bfour,bfive,bsix,bsub,bseven,beight,bnine,bdiv,bequal,bce,bzero,bmul;
    TextView Input,Result;
    String s="",s1="",s2="",resultString="";
    int i=0,i1=0,c=-1;
    int result=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    bclr=(Button)findViewById(R.id.clr);
        bone=(Button)findViewById(R.id.one);
        btwo=(Button)findViewById(R.id.two);
        bthree=(Button)findViewById(R.id.three);
        bfour=(Button)findViewById(R.id.four);
        bfive=(Button)findViewById(R.id.five);
        bsix=(Button)findViewById(R.id.six);
        bseven=(Button)findViewById(R.id.seven);
        beight=(Button)findViewById(R.id.eight);
        bnine=(Button)findViewById(R.id.nine);
        bzero=(Button)findViewById(R.id.zero);
        bce=(Button)findViewById(R.id.ce);
        bequal=(Button)findViewById(R.id.equal);
        bsub=(Button)findViewById(R.id.sub);
        badd=(Button)findViewById(R.id.add);
        bdiv=(Button)findViewById(R.id.div);
        bmul=(Button)findViewById(R.id.mul);
         Input=(TextView)findViewById(R.id.Input);
        Result =(TextView)findViewById(R.id.Result);

        bone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                s=(String) Result.getText();
                if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")){
                    Result.setText("");
                    s="";
                }
                Result.setText(s+"1");
                s="";
            }
        });
        btwo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                s=(String) Result.getText();
                if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")){
                    Result.setText("");
                    s="";
                }
                Result.setText(s+"2");
                s="";
            }
        });
        bthree.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                s=(String) Result.getText();
                if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")){
                    Result.setText("");
                    s="";
                }
                Result.setText(s+"3");
                s="";
            }
        });
        bfour.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                s=(String) Result.getText();
                if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")){
                    Result.setText("");
                    s="";
                }
                Result.setText(s+"4");
                s="";
            }
        });
        bfive.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                s=(String) Result.getText();
                if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")){
                    Result.setText("");
                    s="";
                }
                Result.setText(s+"5");
                s="";
            }
        });
        bsix.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                s=(String) Result.getText();
                if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")){
                    Result.setText("");
                    s="";
                }
                Result.setText(s+"6");
                s="";
            }
        });
        bseven.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                s=(String) Result.getText();
                if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")){
                    Result.setText("");
                    s="";
                }
                Result.setText(s+"7");
                s="";
            }
        });
        beight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                s=(String) Result.getText();
                if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")){
                    Result.setText("");
                    s="";
                }
                Result.setText(s+"8");
                s="";
            }
        });
        bnine.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                s=(String) Result.getText();
                if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")){
                    Result.setText("");
                    s="";
                }
                Result.setText(s+"9");
                s="";
            }
        });
      badd.setOnClickListener(new View.OnClickListener() {
          public void onClick(View v) {
              String tmp =(String) Result.getText();
          if(tmp.isEmpty()){
              s1="0";
          }else if(!tmp.equals("+")&&!tmp.equals("-")&&!tmp.equals("*")&&!tmp.equals("/")){
              s1=tmp;
          }
          c=0;
              resultString="";
              Result.setText("+");
              Input.setText(s1+"+");
          }
      });
        bsub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String tmp =(String) Result.getText();
                if(tmp.isEmpty()){
                    s1="0";
                }else if(!tmp.equals("+")&&!tmp.equals("-")&&!tmp.equals("*")&&!tmp.equals("/")){
                    s1=tmp;
                }
                c=1;
                resultString="";
                Result.setText("-");
                Input.setText(s1+"-");
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String tmp =(String) Result.getText();
                if(tmp.isEmpty()){
                    s1="0";
                }else if(!tmp.equals("+")&&!tmp.equals("-")&&!tmp.equals("*")&&!tmp.equals("/")){
                    s1=tmp;
                }
                c=2;
                resultString="";
                Result.setText("/");
                Input.setText(s1+"/");
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String tmp =(String) Result.getText();
                if(tmp.isEmpty()){
                    s1="0";
                }else if(!tmp.equals("+")&&!tmp.equals("-")&&!tmp.equals("*")&&!tmp.equals("/")){
                    s1=tmp;
                }
                c=3;
                resultString="";
                Result.setText("*");
                Input.setText(s1+"*");
            }
        });
        bequal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
              String operator="";
                if(s1.equalsIgnoreCase("+")||s1.equalsIgnoreCase("-")||s1.equalsIgnoreCase("/")||s1.equalsIgnoreCase("*")) {
                    i = 0;
                }else if(s1==null||s1.isEmpty()){
                    i=0;
                }else{
                    i=Integer.parseInt(s1);
                }

               if(resultString.isEmpty()) {
                   s2 = (String) Result.getText();
                   if (s1.equalsIgnoreCase("+") || s1.equalsIgnoreCase("-") || s1.equalsIgnoreCase("/") || s1.equalsIgnoreCase("*")) {
                       i1 = 0;
                   } else if (s2 == null || s2.isEmpty()) {
                       i1 = 0;
                   } else {
                       i1 = Integer.parseInt(s2);
                   }
               }else{
                   i=result;
               }
               if(c==0){
                   operator="+";
                   result=i+i1;
               }
             else   if(c==1){
                    operator="-";
                    result=i-i1;
                }
               else if(c==2){
                    operator="/";
                    if(i1==0){
                        Toast.makeText(getApplicationContext(),"Invalid input" ,Toast.LENGTH_LONG).show();
                    result=0;
                    }else{
                        result=i/i1;
                    }
                }
                else if(c==3){
                   operator="*";
                   result=i*i1;
               }else
               {
                   operator="";
                   result=0;
               }
           if(!operator.isEmpty()){
                    Input.setText(i+"" +operator+""+i1);
                }else{
                    Input.setText("");
                }
                resultString=String.valueOf(result);
                Result.setText(resultString);
            }
        });
bclr.setOnClickListener(new View.OnClickListener() {
    public void onClick(View v) {
      s=(String) Result.getText();
        if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")){
    i=0;
        }else{
            i=Integer.parseInt(s);
            i=i/10;
        }if(i==0){
            Result.setText("");
        }else{
            Result.setText(i+"");
        }
    s=null;
    }
});
        bce.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
              Result.setText("");
                Input.setText("");
                i=0;
                i1=0;
                s1="";
                s2="";
                resultString="";
                c=-1;
                result=0;
            }
        });
    }
}

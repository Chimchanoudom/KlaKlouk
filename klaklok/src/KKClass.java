/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.sun.jmx.snmp.BerDecoder;
import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author SYSTEM
 */
 public class KKClass {
    static ArrayList<ImageIcon> img=new ArrayList<>();
    static ArrayList<JButton>btnPlus=new ArrayList<>();
    static ArrayList<JButton>btnMinus=new ArrayList<>();
    static  ArrayList<JTextField> txt=new ArrayList<>();
    static ArrayList  KLa=new ArrayList();
    static ArrayList  Klouk=new ArrayList();
    static ArrayList  Hen=new ArrayList();
    static ArrayList  Lobster=new ArrayList();
    static ArrayList  Kdam=new ArrayList();
    static ArrayList  Fish=new ArrayList();
    
    
    
    
    
        public static void setKLa(ArrayList KLa) {
            KKClass.KLa = KLa;
        }
        public static void setKlouk(ArrayList Klouk) {
            KKClass.Klouk = Klouk;
        }
        public static void setHen(ArrayList Hen) {
            KKClass.Hen = Hen;
        }
        public static void setLobster(ArrayList Lobster) {
            KKClass.Lobster = Lobster;
        }
        public static void setKdam(ArrayList Kdam) {
            KKClass.Kdam = Kdam;
        }
        public static void setFish(ArrayList Fish) {
            KKClass.Fish = Fish;
        }
        public static void setFtxt(ArrayList<JTextField> Ftxt) {
            KKClass.txt = Ftxt;
        }
        public static ArrayList<JButton> getBtnPlus(JButton[]Plus) {
         btnPlus.addAll(Arrays.asList(Plus));
            return btnPlus;
        }
        public static ArrayList<JButton> getBtnMinus(JButton[]Minus) {
            btnMinus.addAll(Arrays.asList(Minus));
            return btnMinus;
        }
        static boolean Check(String Ftxt){
            boolean b;
            int MoneyCheck=Integer.parseInt(Ftxt);
            if(MoneyCheck==0)
                b=false;
            else
                b=true;
            return b;
        }   
        static  public void PlusorMinus(JTextField txt ,JFormattedTextField Ftxt,String Operater){
            int num=Integer.parseInt(txt.getText())+1;
            int M=Integer.parseInt(Ftxt.getText());
            if(Operater.equalsIgnoreCase("+")){
              switch(txt.getName()){
                        case "100":{
                                        txt.setText(num+"");
                                        Ftxt.setText((M-100)+"");
                                        } break;
                        case "500":{
                                        txt.setText(num+"");
                                        Ftxt.setText((M-500)+"");
                                        } break;
                        case "1000":{
                                        txt.setText(num+"");
                                        Ftxt.setText((M-1000)+"");
                                        } break;
                        case "2000":{
                                        txt.setText(num+"");
                                        Ftxt.setText((M-2000)+"");
                                        } break;
                        case "5000":{
                                           txt.setText(num+"");
                                        Ftxt.setText((M-5000)+"");
                                            } break;
                        default:{
                                        txt.setText(num+"");
                                        Ftxt.setText((M-10000)+"");
                                        } break;
              }
            }
            else{
                num=Integer.parseInt(txt.getText());
                switch(txt.getName()){
                        case "100":{
                                        txt.setText((num-1)+"");
                                        Ftxt.setText((M+100)+"");
                                        } break;
                        case "500":{
                                         txt.setText((num-1)+"");
                                        Ftxt.setText((M+500)+"");
                                        } break;
                        case "1000":{
                                         txt.setText((num-1)+"");
                                        Ftxt.setText((M+1000)+"");
                                        } break;
                        case "2000":{
                                         txt.setText((num-1)+"");
                                        Ftxt.setText((M+2000)+"");
                                        } break;
                        case "5000":{
                                        txt.setText((num-1)+"");
                                        Ftxt.setText((M+5000)+"");
                                            } break;
                        default:{
                                        txt.setText((num-1)+"");
                                        Ftxt.setText((M+10000)+"");
                                        } break;
            }

        }

    }
         public static void EnableBtnPlus(JFormattedTextField Ftxt ,String Operater) {
             int Money=Integer.parseInt(Ftxt.getText());
            // JOptionPane.showMessageDialog(Ftxt, Money+"");

             if(Operater.equalsIgnoreCase("-")){
                        if(Money>=100&&Money<=500)
                        {
                            btnPlus.get(0).setEnabled(true);
                        };
                        if(Money==500&&Money<=1000)
                        {
                            btnPlus.get(0).setEnabled(true);
                            btnPlus.get(1).setEnabled(true);

                        };
                        if(Money>=1000&&Money<=2000)
                        {
                           btnPlus.get(0).setEnabled(true);
                            btnPlus.get(1).setEnabled(true);
                            btnPlus.get(2).setEnabled(true);
                        };
                        if(Money>=2000&&Money<=5000)
                        {
                            btnPlus.get(0).setEnabled(true);
                            btnPlus.get(1).setEnabled(true);
                            btnPlus.get(2).setEnabled(true);
                            btnPlus.get(3).setEnabled(true);
                        };
                        if(Money>=5000&&Money<=10000)
                        {
                              btnPlus.get(0).setEnabled(true);
                            btnPlus.get(1).setEnabled(true);
                            btnPlus.get(2).setEnabled(true);
                            btnPlus.get(3).setEnabled(true);
                            btnPlus.get(4).setEnabled(true);
                        };
                if(Money>=10000)
                {
                    btnPlus.get(0).setEnabled(true);
                    btnPlus.get(1).setEnabled(true);
                    btnPlus.get(2).setEnabled(true);
                    btnPlus.get(3).setEnabled(true);
                    btnPlus.get(4).setEnabled(true);
                    btnPlus.get(5).setEnabled(true);

                };
                }
             else
             {
                    if(Money<100)
                        btnPlus.get(0).setEnabled(false);
                    if(Money<500)
                        btnPlus.get(1).setEnabled(false);
                    if(Money<1000)
                        btnPlus.get(2).setEnabled(false);
                    if(Money<2000)
                        btnPlus.get(3).setEnabled(false);
                    if(Money<5000)
                        btnPlus.get(4).setEnabled(false);
                    if(Money<10000)
                        btnPlus.get(5).setEnabled(false);



             }
         }
        public static void PlusAmount(JFormattedTextField Ftxt,String operater,JTextField Text,JFormattedTextField FtxtMoney){
            int Money=Integer.parseInt(Ftxt.getText());
            int M=Integer.parseInt(FtxtMoney.getText());
            int n=Integer.parseInt(Text.getText());
            Text.setText((n+1)+"");
            for(JTextField temp:txt){
                if(!(temp.getText().equalsIgnoreCase("0"))&&temp.getName().equalsIgnoreCase(Text.getName())){
                 Money+=Integer.parseInt(temp.getName());
                }}
            Ftxt.setText(Money+"");
            M-=Integer.parseInt(Text.getName());
            FtxtMoney.setText(M+"");
        }
        public static void MinusAmount(JFormattedTextField Ftxt,JTextField Text,JFormattedTextField FtxtMoney){   
        int Minus=Integer.parseInt(Ftxt.getText());
        int Money=Integer.parseInt(FtxtMoney.getText());
        int n=Integer.parseInt(Text.getText());
        Text.setText((n-1)+"");
        Money+=(Integer.parseInt(Text.getName()));
        Ftxt.setText((Minus-(Integer.parseInt(Text.getName())))+"");
        Ftxt.setFocusable(true);
        FtxtMoney.setText(Money+"");
        FtxtMoney.setFocusable(true);
    }
        public static void PutMoney(JFormattedTextField Ftxt,JTextField txtputmoney){
            if (txtputmoney.getText().equalsIgnoreCase("0")) {
                txtputmoney.setText(Ftxt.getText());
                
            }else{
                int A=Integer.parseInt(Ftxt.getText());
                int B=Integer.parseInt(txtputmoney.getText());
                txtputmoney.setText((A+B)+"");
                
            }
            Ftxt.setText("0");
        }
        
 
        //pov
        
    public static Thread [] th=new Thread[3];
    public static JLabel [] lbResult;
    public static JTextField [] txtUser;
    static int[] result = new int[3];
    
    public static HashMap<Integer,Integer> multiplier=new HashMap<Integer,Integer>();
    static int l;
    public static Thread RenewThread(JLabel lb,int resultIndex){
        return new Thread(()->{
            try{
                Random r=new Random();
                while(true){
                    l=r.nextInt(6);
                    Image temp=img.get(l).getImage();
                    temp=temp.getScaledInstance(lb.getWidth(), lb.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon temp1=new ImageIcon(temp);
                    result[resultIndex]=l;
                    lb.setIcon(temp1);
                    
                    Thread.sleep(10);
            }
            }catch(Exception e){
               
            }
            
        });
    }
    
    public static Boolean ClickStart(){
        for(JTextField txt:txtUser)
            if(!txt.getText().equals("0")){
                for(int i=0;i<th.length;i++){
                    th[i]=RenewThread(lbResult[i],i);
                    th[i].start();
                }
                return true;
            }
        return false;
    }
    
    public static void ClickStop(){
       for(int i=0;i<th.length;i++){
           th[i].interrupt();
            JOptionPane.showMessageDialog(null, result[i]);
           int k=result[i];
           
           if(multiplier.containsKey(k))
               multiplier.put(k,multiplier.get(k)+1);
           else
               multiplier.put(k,1);
                       
       }
        long win,lose,got; 
        win=lose=got=0;
       for(int i=0;i<txtUser.length;i++)
           if(!txtUser[i].getText().equals("0"))
               if(multiplier.containsKey(i)){
                   txtUser[i].setForeground(Color.green);
                   win+=Long.valueOf(txtUser[i].getText())*multiplier.get(i);
               }else{
                   txtUser[i].setForeground(Color.red);
                   lose+=Long.valueOf(txtUser[i].getText());
               } 
       
         String st="";
         
       if(win>0)
           st+="Win:"+win+" ៛\r\n";
       if(lose>0)
           st+="Lose:"+lose+" ៛\r\n";
       
       got=win-lose;
       
       
       if(got>0)
           st+="Get:"+got+" ៛";
       else if(got<0)
           st+="Lost:"+Math.abs(got)+" ៛";
        
       
        JOptionPane.showMessageDialog(null, st);

        for(JTextField temp:txtUser){
             temp.setForeground(Color.black);
             temp.setText("0");
        }
           
        
        //allMoney+=got;
       //txtALlMoney.setText(allMoney+"");
    }
        
 }


import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout; 
import java.awt.event.*;

import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.border.Border;


class tictactoe 
{
    private JFrame f1;    
    private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,restart,resetTable,exit;  
    private JLabel headl,l1,l2,l3,l4,l5,l6,l7,l8,l9,result,turn,recordp1,recordp2,record,p1name,p2name,tableHalfBound,tableBound,tableVertical1Line,showRecord;
    private int checkClick=0,totalMatch=0,p1Won=0,p2Won=0,matchDraw=0;
    private int count=0,v1=11,v2=2,v3=3,v4=4,v5=5,v6=6,v7=7,v8=8,v9=9,setwin=0,p_no;
    // pn= number of players
    private String p1,p2;
   


    
    int arrlist[]=new int[9];



    public tictactoe(){
        setName();
        getGUI();
        setFunction();
        restart();

    }

    

    private void setButton(int i){
        if(count<9 && setwin==0)
        { arrlist[i-1]=0;

            
            
            if (checkClick==0)
            {
                switch (i) {
                    case 1:
                        l1.setText(" X");
                        v1=1;
                        b1.setVisible(false);
                        
                        
                        break;
                    case 2:
                        l2.setText(" X");
                        v2=1;
                        b2.setVisible(false);
                        
                       
                        break;
                    case 3:
                        l3.setText(" X");
                        v3=1;
                        b3.setVisible(false);
                        
                        
                        break;
                    case 4:
                        l4.setText(" X");
                        v4=1;
                        b4.setVisible(false);
                       
                       
                        break;
                    case 5:
                        l5.setText(" X");
                        v5=1;
                        b5.setVisible(false);
                        
                        
                        break;
                    case 6:
                        l6.setText(" X");
                        v6=1;
                        b6.setVisible(false);
                      
                       
                        break;
                    case 7:
                        l7.setText(" X");
                        v7=1;
                        b7.setVisible(false);
                        
                       
                        break;
                    case 8:
                        l8.setText(" X");
                        v8=1;
                        b8.setVisible(false);
                       
                       
                        break;
                    case 9:
                        l9.setText(" X");
                        v9=1;
                        b9.setVisible(false);
                        
                        
                        break;
                
                    default:
                        break;
                }
                checkClick=1;
                turn.setText("Turn -> "+p2);
            }
            else {
                switch (i) {
                    case 1:
                        l1.setText(" O");
                        v1=0;
                        b1.setVisible(false);
                        
                        break;
                    case 2:
                        l2.setText(" O");
                        v2=0;
                        b2.setVisible(false);
                        
                        break;
                    case 3:
                        l3.setText(" O");
                        v3=0;
                        b3.setVisible(false);
                        
                        break;
                    case 4:
                        l4.setText(" O");
                        v4=0;
                        b4.setVisible(false);
                        
                        break;
                    case 5:
                        l5.setText(" O");
                        v5=0;
                        b5.setVisible(false);
                        
                        break;
                    case 6:
                        l6.setText(" O");
                        v6=0;
                        b6.setVisible(false);
                        
                        break;
                    case 7:
                        l7.setText(" O");
                        v7=0;
                        b7.setVisible(false);
                        
                        break;
                    case 8:
                        l8.setText(" O");
                        v8=0;
                        b8.setVisible(false);
                        
                        break;
                    case 9:
                        l9.setText(" O");
                        v9=0;
                        b9.setVisible(false);
                        
                        break;
                
                    default:
                        break;
                }
                checkClick=0;
                turn.setText("Turn -> "+p1);
            }
            count++;
            if (count>4)
            {
                checkWin();
            }
        

            if (p_no==1 && checkClick==1 && count<9) {
                Random rand=new Random();
                int temp=rand.nextInt(8);
                while(arrlist[temp]!=1){
                    temp=rand.nextInt(8);
                }
                setButton(temp+1);
                
            }
        }

    
    }

    private void restart()
    {
        for(int i=0;i<9;i++){
            arrlist[i]=1;
        }
        


        turn.setText("Turn -> "+p1);

                b1.setVisible(true);
                b2.setVisible(true);
                b3.setVisible(true);
                b4.setVisible(true);
                b5.setVisible(true);
                b6.setVisible(true);
                b7.setVisible(true);
                b8.setVisible(true);
                b9.setVisible(true);
                
                v1=11;
                v2=2;
                v3=3;
                v4=4;
                v5=5;
                v6=6;
                v7=7;
                v8=8;
                v9=9;
                count=0;
                checkClick=0;
                setwin=0;
                result.setText("");
                turn.setText("Turn -> "+p1);
                
                
            ;
      
    }

    private void setName()
    {
        int choice;
        
        String choices[]={"Computer","Player"};

        choice=JOptionPane.showOptionDialog(f1, "Choose who you want to play with ?", "Tic Tac Toe", 0, 3, null,choices,choices );
        
        p_no=choice+1;

        if(choice==1){

        p1=JOptionPane.showInputDialog(f1,"Enter Name Of Player 1");
        p2=JOptionPane.showInputDialog(f1,"Enter Name Of Player 2");  
        }

        else{
            p1=JOptionPane.showInputDialog(f1,"Enter Name Of Player 1");
            p2="Computer";

        }
    }

    private void getGUI()
    {
        
    f1=new JFrame("Tic Tac Toe");

    
    // JTextField tf1=new JTextField("Tic Tac Toe");
    

    Font ft1=new Font(Font.SANS_SERIF,Font.BOLD,70);
    Font ft2=new Font(Font.SERIF,Font.ITALIC,80);
    Font ft3=new Font(Font.SERIF,Font.BOLD,40);
    Font ft4=new Font(Font.SERIF,Font.BOLD,25);



    b1=new JButton();
    b2=new JButton();
    b3=new JButton();
    b4=new JButton();
    b5=new JButton();
    b6=new JButton();
    b7=new JButton();
    b8=new JButton();
    b9=new JButton();
    restart=new JButton("Restart");
    resetTable=new JButton("Reset");
    exit=new JButton("Exit");


    headl=new JLabel("Tic Tac Toe");
    l1=new JLabel();
    l2=new JLabel();
    l3=new JLabel();
    l4=new JLabel();
    l5=new JLabel();
    l6=new JLabel();
    l7=new JLabel();
    l8=new JLabel();
    l9=new JLabel();
    result=new JLabel();
    turn=new JLabel();
    recordp1=new JLabel();
    recordp2=new JLabel();
    record=new JLabel();
    p1name=new JLabel();
    p2name=new JLabel();
    tableBound=new JLabel();
    tableHalfBound=new JLabel();
    tableVertical1Line=new JLabel();
    showRecord=new JLabel();

    

    Border blackline = BorderFactory.createLineBorder(Color.black,4);

    l1.setBorder(blackline);
    l2.setBorder(blackline);
    l3.setBorder(blackline);
    l4.setBorder(blackline);
    l5.setBorder(blackline);
    l6.setBorder(blackline);
    l7.setBorder(blackline);
    l8.setBorder(blackline);
    l9.setBorder(blackline);
    // record.setBorder(blackline);
    // recordp1.setBorder(blackline);
    // recordp2.setBorder(blackline);
    tableBound.setBorder(blackline);
    tableHalfBound.setBorder(blackline);
    tableVertical1Line.setBorder(blackline);


    

    b1.setBorder(blackline);
    b2.setBorder(blackline);
    b3.setBorder(blackline);
    b4.setBorder(blackline);
    b5.setBorder(blackline);
    b6.setBorder(blackline);
    b7.setBorder(blackline);
    b8.setBorder(blackline);
    b9.setBorder(blackline);
    resetTable.setBorder(blackline);
    restart.setBorder(blackline);
    exit.setBorder(blackline);



    b1.setBounds(450,200,100,100);
    b2.setBounds(550,200,100,100);
    b3.setBounds(650,200,100,100);
    b4.setBounds(450,300,100,100);
    b5.setBounds(550,300,100,100);
    b6.setBounds(650,300,100,100);
    b7.setBounds(450,400,100,100);
    b8.setBounds(550,400,100,100);
    b9.setBounds(650,400,100,100);
    restart.setBounds(170,250,150,60);
    resetTable.setBounds(1150,480,80,50);
    exit.setBounds(170,340,150,60);

 

    headl.setBounds(430,30,500,100);
    l1.setBounds(450,200,100,100);
    l2.setBounds(550,200,100,100);
    l3.setBounds(650,200,100,100);
    l4.setBounds(450,300,100,100);
    l5.setBounds(550,300,100,100);
    l6.setBounds(650,300,100,100);
    l7.setBounds(450,400,100,100);
    l8.setBounds(550,400,100,100);
    l9.setBounds(650,400,100,100);
    result.setBounds(350,520,1000,100);
    turn.setBounds(100,360,300,200);
    recordp1.setBounds(1030,300,270,50);
    recordp2.setBounds(1030,360,270,50);
    record.setBounds(870,220,440,60);
    p1name.setBounds(870,300,200,60);
    p2name.setBounds(870,360,200,60);
    tableBound.setBounds(860,220,420,230);
    tableHalfBound.setBounds(860,275,420,4);
    tableVertical1Line.setBounds(1010,220,4,230);
    showRecord.setBounds(940,460,300,100);



    l1.setFont(ft1);
    l2.setFont(ft1);
    l3.setFont(ft1);
    l4.setFont(ft1);
    l5.setFont(ft1);
    l6.setFont(ft1);
    l7.setFont(ft1);
    l8.setFont(ft1);
    l9.setFont(ft1);
    result.setFont(ft3);
    record.setFont(ft4);    
    recordp1.setFont(ft4);    
    recordp2.setFont(ft4);    
    p1name.setFont(ft4);
    p2name.setFont(ft4);
    headl.setFont(ft2);
    turn.setFont(ft3);
    restart.setFont(ft4);
    showRecord.setFont(ft4);

    resetTable.setFont(ft4);
    exit.setFont(ft4);

 


    
    f1.add(b1);
    f1.add(b2);
    f1.add(b3);
    f1.add(b4);
    f1.add(b5);
    f1.add(b6);
    f1.add(b7);
    f1.add(b8);
    f1.add(b9);
    f1.add(restart);
    f1.add(resetTable);
    f1.add(exit);


    f1.add(headl);
    f1.add(l1);
    f1.add(l2);
    f1.add(l3);
    f1.add(l4);
    f1.add(l5);
    f1.add(l6);
    f1.add(l7);
    f1.add(l8);
    f1.add(l9);
    f1.add(result);
    f1.add(turn);
    f1.add(recordp1);
    f1.add(recordp2);
    f1.add(record);
    f1.add(p1name);
    f1.add(p2name);
    f1.add(tableBound);
    f1.add(tableHalfBound);
    f1.add(showRecord);



    record.setText("Player       "+"Total   "+"Won   "+"Loss   "+"Draw  ");
    recordp1.setText(totalMatch+"        "+p1Won+"        "+p2Won+"        "+matchDraw);
    recordp2.setText(totalMatch+"        "+p2Won+"        "+p1Won+"        "+matchDraw);

    p1name.setText(p1);
    p2name.setText(p2);

    showRecord.setText("Previous Records");




        f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f1.setLayout(null);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void setFunction()
    {
        restart.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                restart();
            }
        });


        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                setButton(1);
                
            }
        });
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                setButton(2);
                

            }
        });  
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                setButton(3);
                
            }
        });
        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                setButton(4);
               
            }
        });
        b5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                setButton(5);
                
            }
        });
        b6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                setButton(6);
               
            }
        });
        b7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                setButton(7);
                
            }
        });
        b8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                setButton(8);
               
            }
        });
        b9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                setButton(9);
                
            }
        }
        );

            resetTable.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    totalMatch=0;
                    p1Won=0;
                    p2Won=0;
                    matchDraw=0;

                    recordp1.setText(totalMatch+"        "+p1Won+"        "+p2Won+"        "+matchDraw);
                    recordp2.setText(totalMatch+"        "+p2Won+"        "+p1Won+"        "+matchDraw);
                

                }

            
        });

        exit.addActionListener(new ActionListener(){
            public void actionPerformed( ActionEvent e){
                f1.setVisible(false);
                f1.dispose();

            }
        }
        
        );

 
    }

 
    public void checkWin()
    {
        
        if((v1==v2 && v2==v3) || (v5==v4 && v5==v6)|| (v7==v8 && v8==v9)|| (v1==v4 && v4==v7)|| (v2==v5 && v5==v8)|| (v3==v6 && v6==v9)|| (v1==v5 && v5==v9)|| (v3==v5 && v5==v7))

       {
            if(checkClick==0){

                result.setText("Congratulations ! "+p2+" Won");
                setwin=1;
                p2Won++;

                turn.setText("");
                totalMatch++;



            }

            else
            {
                result.setText("Congratulations ! "+p1+" Won");
                setwin=1;
                p1Won++;
                turn.setText("");
                totalMatch++;


            }}

            if (count==9 && setwin==0)
            {
                result.setText("                Match Draw");
                turn.setText("");
                matchDraw++;
                totalMatch++;
            }

            
            
            recordp1.setText(totalMatch+"        "+p1Won+"        "+p2Won+"         "+matchDraw);
            recordp2.setText(totalMatch+"        "+p2Won+"        "+p1Won+"         "+matchDraw);


         }
     


    public static void main(String[] args) {

        tictactoe t1=new tictactoe();
        
    }
}
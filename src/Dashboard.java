import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard implements ActionListener
{



    //labels
    JLabel totalRent;



    //textfields
    JTextField totalRenttxtf;


    //textarea
    JTextArea display;

    //buttons
    JButton proceed;


    //imageIcon
    ImageIcon i1;



    //frame
    JFrame frame;
    Dashboard()
    {
        frame = new JFrame ("Dashboard");

        //construct components
        totalRent = new JLabel ("Total Rent:");
        totalRent.setForeground(new Color(230, 238, 250));





        totalRenttxtf = new JTextField ();


        display = new JTextArea (5, 5);

        proceed = new JButton("Proceed");


        i1 = new ImageIcon("download.png");

        frame.add(totalRent);

        frame.add(totalRenttxtf);

        frame.add(display);
        frame.add(proceed);


        totalRent.setBounds (35, 70, 100, 25);


        totalRenttxtf.setBounds (155, 70, 100, 25);


        display.setBounds (35, 180, 380, 300);

        proceed.setBounds(355, 70, 120, 30);


        //add action listener
        proceed.addActionListener(this);


        frame.setSize (880, 550);
        frame.setLocationRelativeTo(null);//to center screen gui
        frame.setLayout (null);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(i1.getImage());
        frame.getContentPane().setBackground(new Color (186, 132, 189));//setting a background color
        frame.setResizable(false);
        frame.setVisible (true);






    }

    //procedd button
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()==proceed)
        {

          String rent=totalRenttxtf.getText();
          double rentDouble=Rent.convertToDouble(rent);


            if (rent.isEmpty()==false )
            {

                Rent r1=new Rent();
                Rent r2=new Rent();
                Rent r3=new Rent();
                Rent r4=new Rent();
                r1.setName("Sikto & Bikash");
                r1.setTotalcost(rentDouble);
                r1.set(3875,700,150);
                //r1.print(display);
                System.out.println("*********************");
                r2.setName("Faysal");
                r2.setTotalcost(rentDouble);
                r2.set(3375*2,700,150);

//                r2.print(display);
                System.out.println("*********************");
                r3.setName("Shanto & soham");
                r3.setTotalcost(rentDouble);
                r3.set(3250,700,150);
//                r3.print(display);
                System.out.println("*********************");
                r4.setName("sajal & tanvir");
                r4.setTotalcost(rentDouble);
                r4.set(2000,700,150);
//                r4.print(display);

                String printStr = r1.getName()+"\n" +
                        "Total Cost :"+ Rent.decfor.format(r1.getSum())+"\n" +
                        "*********************\n" +
                        r2.getName()+"\n" +
                        "Total Cost :"+ Rent.decfor.format(r2.getSum())+"\n" +
                        "*********************\n" +
                        r3.getName()+"\n" +
                        "Total Cost :"+ Rent.decfor.format(r3.getSum())+"\n" +
                        "*********************\n" +
                        r2.getName()+"\n" +
                        "Total Cost :"+ Rent.decfor.format(r4.getSum())+"\n";

                display.setText(printStr);


            }
            else {
                JOptionPane.showMessageDialog(null,"please add your courses");
            }

        }



        }


    }







package 示例;

import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
public class Calendar extends JFrame
{
    private JPanel pCenter, pNorth, pSouth;
    private final int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
    int firstDay=6;
    int lastDay=5;
    int year=2019;
    int month=6;       
    int getMonthDays(int year, int month)
    {
        int dayNum=days[month-1];
        if(year%400==0||(year%4==0&&year%100!=0))
        {
            if(month==2)
                dayNum= 29;
        }
        return dayNum;
       
    }
    void setPNorth()
    {
        FlowLayout layout=new FlowLayout(FlowLayout.CENTER,10,10);
        pNorth=new JPanel();
        pNorth.setLayout(layout);
        
        JButton button1=new JButton("上月");
        JButton button2=new JButton("下月");
        buttonAction listener=new buttonAction();
        button1.addActionListener(listener);
        button2.addActionListener(listener);
        pNorth.add(button1);
        pNorth.add(button2);
        this.getContentPane().add(pNorth,"North");
    }
    void setPSouth()
    {
        pSouth=new JPanel();
        FlowLayout layout=new FlowLayout(FlowLayout.CENTER,10,10);
        pSouth.setLayout(layout);
        
        JLabel label=new JLabel("日历："+year+"年"+month+"月");
        pSouth.add(label);
        this.getContentPane().add(pSouth,"South");
    }
    void updatePSouth()
    {
        JLabel label=(JLabel)pSouth.getComponent(0);
        label.setText("日历："+year+"年"+month+"月");
    }
    void setPCenter() {
		pCenter = new JPanel();
	    Border Border01 = BorderFactory.createLineBorder(Color.GRAY, 1);
		pCenter.setLayout(new GridLayout(7, 7));
		String name[] = { "日", "一", "二", "三", "四", "五", "六" };
		Button titleName[] = new Button[7];
		for (int i = 0; i < 7; i++) {
			titleName[i] = new Button(name[i]);
			titleName[i].setBackground(Color.lightGray);
			pCenter.add(titleName[i]);
			
		}
		pCenter.setBorder(Border01);
		int i = 0;
		for (; i < firstDay; i++) {
			JLabel label=new JLabel(" ");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			pCenter.add(label);
		}
		int dayNum = this.getMonthDays(year, month);
		for (; i < firstDay + dayNum; i++) {
			JLabel label=new JLabel("" + (i - firstDay + 1));
			label.setHorizontalAlignment(SwingConstants.CENTER);
			pCenter.add(label);
		}
		for (; i < 49 - 7; i++) {
			JLabel label=new JLabel(" ");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			pCenter.add(label);
		}
		this.getContentPane().add(pCenter, "Center");
	}
    void updatePCenter()
    {
        Component[] clabel=( Component[] ) pCenter.getComponents();
        JLabel[] label=new JLabel[clabel.length-7];
        for(int i=0;i<label.length;i++)
        {
            label[i]=(JLabel)(clabel[i+7]);
        }
     
        int i=0;
        for(;i<firstDay;i++)
        {
            label[i].setText(" ");
        }
        int dayNum=this.getMonthDays(year, month);
        for(;i<firstDay+dayNum;i++)
        {
            label[i].setText(""+(i-firstDay+1));
        }
        for(;i<label.length;i++)
        {
            label[i].setText(" ");
        }
    }
    public Calendar()
    {
        setLayout(new BorderLayout());
        setPNorth();
        setPSouth();
        setPCenter();
        
        setSize(500,500);
        setVisible(true);
    }
    class buttonAction implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String choose=e.getActionCommand();
            if("上月".equals(choose))
            {
                month=(month-1);
                if(month==0)
                {
                    month=12;
                    year--;
                }
                //System.out.println(""+month+" "+year);
                int dayNum=getMonthDays(year, month);
                lastDay=(firstDay+7-1)%7;
                firstDay=(lastDay-dayNum+1+35)%7;
            }
            else
            {
                month=(month+1);
                if(month==13)
                {
                    month=1;
                    year++;
                }
                int dayNum=getMonthDays(year, month);
                firstDay=(lastDay+1)%7;
                lastDay=(firstDay+dayNum-1)%7;
            }
            System.out.println(firstDay);
            System.out.println(lastDay);
            updatePSouth();
            updatePCenter();
        }
    }
    
    
}


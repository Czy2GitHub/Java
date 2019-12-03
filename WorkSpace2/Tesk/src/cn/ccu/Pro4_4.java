package cn.ccu;

public class Pro4_4 {
	    int count=9;
	    public void count1(){
	        count=10;
	        System.out.println("count1="+count);
	    }
	    public void count2(){
	        System.out.print("count2="+count);
	    }
	    public static void main(String[ ] args) {
	        Pro4_4 t=new Pro4_4();
	        t.count1();
	        t.count2();
	    }
	}


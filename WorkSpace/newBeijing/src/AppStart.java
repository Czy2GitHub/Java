

import po.Car;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AppStart {
    //创建一个map集合存放汽车
  private static   Map<Integer, Car> map=new HashMap<>();

  //定义接收用户键盘输入内容
   static Scanner input=new Scanner(System.in);
   //定义用户选择存储数字
   static  int n=0;
    public static void main(String[] args) {
        //直接调用初始化数据方法
        initData();

        do{
            //打印主菜单
            printMain();
            //获取用户输入
            System.out.println("请输入你要进入的功能项(1-6):");
            String str = input.nextLine();
            //把用户输入数据转换成整数
            if(str!=null&&!str.equals("")){
                //把用户输入转换成整数
                try {
                   n = Integer.parseInt(str);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    break;
                }
            }
        }while (n>0&&n<7);

        System.out.println("你输入的值不正确，请重新输入");




        //演示用户输入
      /*  System.out.println("请输入内容:");
        String next = input.nextLine();
        System.out.println("你输入的是:"+next);*/
       // userSelectMenu();
    }

    //定义一个主菜单打印方法
    public static  void printMain(){
        System.out.println("****欢迎访问汽车租赁店****");
        System.out.println("1、查看汽车");
        System.out.println("2、租赁汽车");
        System.out.println("3、归还汽车");
        System.out.println("4、新增汽车");
        System.out.println("5、删除汽车");
        System.out.println("6、退出系统");

        //增加用户选项处理逻辑
        //使用分支语句switch，来处理多条件情况
        switch (n){
            case 1:
                //System.out.println("你输入的是1，查看汽车");
                list();
                break;
            case 2:
               // System.out.println("你是输入的是2,租赁汽车");
                chuzu();
                break;
            case 3:
                guihuan();
                break;
            case 4:
                /*System.out.println("你是输入的是4,新增汽车");*/
                addCar();
                break;
            case 5:
                /*System.out.println("你是输入的是5,删除汽车");*/
                deleteCar();
                break;
            case 6:
                System.out.println("你是输入的是6,退出系统");
                //结束当前java程序的运行退出系统
                System.exit(0);
                break;
            default:
                //System.out.println("对不起你输入的功能未开发！");
                break;
        }



    }

    //定义初始化数据方法
    public static void initData(){
        Car car1 = new Car(1001, "玛莎拉蒂", "待出租");
        Car car2 = new Car(1002, "比亚迪", "待出租");
        Car car3 = new Car(1003, "兰博基尼", "已出租");
        Car car4 = new Car(1004, "迈巴赫", "待出租");
        Car car5 = new Car(1005, "保时捷", "待出租");
        Car car6 = new Car(1006, "奇瑞", "已出租");
        Car car7 = new Car(1007, "野马", "待出租");
        Car car8 = new Car(1008, "捷豹", "待出租");
        Car car9 = new Car(1009, "法拉利", "待出租");
        Car car10 = new Car(1010, "五菱宏光", "已出租");
        //把汽车对象存放到map容器
        map.put(1001,car1);
        map.put(1002,car2);
        map.put(1003,car3);
        map.put(1004,car4);
        map.put(1005,car5);
        map.put(1006,car6);
        map.put(1007,car7);
        map.put(1008,car8);
        map.put(1009,car9);
        map.put(1010,car10);
    }

    //处理用户主菜单选择，跳转到对应功能
    public static  void userSelectMenu(){
        System.out.println("请输入你要选择的功能:");
        String num = input.nextLine();

        if(num.equals("1")){
            System.out.println("你选择的是查看汽车");
        }
        if(num.equals("2")){
            System.out.println("你选择的是租赁汽车");
        }

    }

    //查看汽车功能

    public static void list(){
        System.out.println("你选择的功能：查看全部汽车信息");
        //从map集合读取全部汽车数据，遍历集合，打印
     for(Map.Entry<Integer,Car> entry:map.entrySet()){
         Integer id = entry.getKey();
         Car car = entry.getValue();
         System.out.println("汽车编号:"+id+"\t 名称:"+car.getName()+"\t 状态:"+car.getState());
     }
    }



   //汽车租赁流程
    public static void chuzu(){
        //提示用户输入要租赁汽车编号
        System.out.println("请输入你要租赁的汽车编号:");
        //获取用户的输入
        String str = input.nextLine();
        if(str!=null&&!str.equals("")) {
            //把用户输入的内容转换成数字
            int id = Integer.parseInt(str);
           /* System.out.println("你要租赁编号为:" + id + " 的汽车");*/
            //去map集合查找对应汽车信息
            Car car = map.get(id);
            //System.out.println("获取到租赁汽车对象:"+car);
            //鲁棒
            if(car==null){
                System.out.println("你要租赁的编号为:"+id+" 的汽车不存在！");
            }else {
              //判断当前汽车状态,是否是 待出租
                if(car.getState().equals("待出租")){
                    //修改汽车状态为已出租
                    car.setState("已出租");
                    //提示用户汽车租赁手续办理完毕
                    System.out.println("你要租赁的汽车:"+car.getName()+" 编号:"+id+" 的租赁手续已经成功办理");
                }else {
                    System.out.println("你要租赁的汽车，编号为:"+id+" 当前状态为:"+car.getState()+" 不能办理租赁手续!");
                }

            }

        }else {
            System.out.println("你输入的要租赁的汽车编号不正确！");
        }
    }



    //归还租赁的汽车
    public static void guihuan(){
        System.out.println("请输入你要归还的汽车编号:");
        String str = input.nextLine();
        if(str!=null&&!str.equals("")){
            //转换编号为数字
            try {
                int id = Integer.parseInt(str);
                //根据编号去查询汽车数据
                Car car = map.get(id);
                //判断car是否为空
                if(car==null){
                    System.out.println("你输入的汽车编号:"+id+" 不存在");
                }else {
                    //判断汽车的状态，是否是已出租
                    if(car.getState().equals("已出租")){
                        //修改汽车的租赁状态
                        car.setState("待出租");
                        System.out.println("用户你好，编号为:"+id+" 汽车归还手续已经办理完成！");
                    }else {
                        System.out.println("用户你好，编号为:"+id+" 汽车归还手续无法正常办理！");
                    }
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }

        }
    }

    //新增汽车方法
    public static void addCar(){
        //提示用户输入汽车编号
        System.out.println("请输入要新增汽车的编号:");
        //捕获用户输入信息
        String str = input.nextLine();
        //校验用户的输入
        if(str!=null&&!str.equals("")){
            //转换用户的输入信息为数字
            try {
                int id = Integer.parseInt(str);
                //根据id查询map集合
                Car car = map.get(id);
                if(car!=null){
                    System.out.println("你输入的汽车编号:"+id+" 已经被占用！");
                }else {
                    //提示用户输入汽车名称
                    System.out.println("请输入汽车名称:");
                    //捕获用户输入的汽车名称
                  String name=  input.nextLine();
                  if(name!=null&&!name.equals("")){
                      car=new Car(id,name,"待出租");
                      //保存汽车对象到map集合
                      map.put(id,car);
                      //提示新增汽车完成
                      System.out.println("新增汽车编号:"+id+" 名称为:"+name+" 已经完成！");
                  }
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }


    }

    // //删除汽车信息

    public static void deleteCar(){
        //提示用户输入要删除的汽车编号
        System.out.println("请输入要删除的汽车编号:");
        //捕获用户输入
        String str = input.nextLine();
        //判断用户输入
        if(str!=null&&!str.equals("")){
            //转换为整数
            try {
                int id = Integer.parseInt(str);

                //从map获取该编号的汽车信息
                Car car = map.get(id);
                if(car==null){
                    System.out.println("你要删除的汽车编号为:"+id+"不存在!");
                }else {
                    map.remove(id);
                    //提示删除成功
                    System.out.println("删除汽车编号为:"+id+" 成功！");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }

        }
    }
}

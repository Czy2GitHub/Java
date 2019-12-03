package po;

public class Car {
    //封装的第一步:把java类属性设置为私有的
    private Integer id; //汽车编号
    private String name; //汽车的名称
    private String state;//租赁的状态  出租、待出租

    //封装的第二步：编写对象get、set方法(public)，获取、设置属性值


    //构造方法 1、方法名和类名相同  2、构造没有返回值 连void页不要写
    public Car(Integer id,String name,String state){
        this.id=id;
        this.name=name;
        this.state=state;
    }

    public Car(){

    }

 //alt+insert


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //toString


    @Override
    public String toString() {
        return "Car  id:"+id+" name:"+name+" state:"+state;
    }
}

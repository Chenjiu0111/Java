package e2;

class  Person{
    String name="人";
    void work(){
        System.out.println("工作！");
    }
}
class Teacher extends Person{
    String name="教师";
    //子类中可以定义与父类相同名字的成员变量
    void printlname(){
        System.out.println("教师姓名："+name);
    }
    //重写父类的work()方法
    void work(){
        System.out.println("教书！");
    }
}
public class demo
{
    public static void main(String[] args)
    {
        Teacher teacher =new Teacher();
        teacher.printlname();
        teacher.work();
    }
}

package e3.text2;

import java.util.Random;

public class Role {
    private String name;//名字
    private int blood;//血量
    private char gender;//性别
    private String face;//外貌
    String[] boyfaces ={"风流俊雅","气宇轩昂","相貌英俊","五官端正","相貌平平","一塌糊涂"," 面目狰狞"};
    String[] girlfaces ={"美轮绝伦","沉鱼落雁","亭亭玉立","身材娇好","相貌平平","相貌简陋","惨不忍睹"};

    //攻击描述
    String[] attacks_desc ={
            "%s使出了一招[游空探爪],飞起身形自半空中变掌为抓锁向%s.",
            "%s使出了一招[背心钉],转到对方的身后,一掌向%s背心的灵台穴拍去",
            "%s使出了一招[背心钉],转到对方的身后,一掌向%s背心的灵台穴拍去",
            "%s上步抢身,一招[批刮连环],连环攻向%s."
    };
    //受伤描述
    String[] injurde_desc ={
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步"
    };

    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        //随机长相
        setFace(gender);
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        Random r = new Random();
        //长相是随机的
        if(gender == '男'){
            //从boyfaces里面随机长相
           int index = r.nextInt(boyfaces.length);
            this.face = boyfaces[index];
        }else if(gender == '女'){
            //从girlfaces里面随机长相
            int index = r.nextInt(girlfaces.length);
            this.face = girlfaces[index];
        }else{
            this.face = "面目狰狞";
        }
        this.face = face;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBlood() {
        return blood;
    }
    public void setBlood(int blood) {
        this.blood = blood;
    }
//定义一个方法用于攻击别人
    //思考：谁攻击谁
    public void attack(Role role){
        Random r = new Random();
        int index = r.nextInt(attacks_desc.length);
        String kungFu = attacks_desc[index];
        System.out.printf(kungFu,this.getName(),role.getName());
        System.out.println();
        //计算伤害

        int hurt = r.nextInt(20) + 1;

        //剩余血量

        int remainBlood = role.getBlood() - hurt;

        //对剩余血量做一个验证，如果为负数就修改为0

        remainBlood = remainBlood < 0 ? 0 : remainBlood;

        //修改一下挨揍人的血量

        role.setBlood(remainBlood);

        //受伤的描述
        //血量》90 0 索引的描述
        //80~90 1
        //90以下 2
         if(remainBlood > 90){
             System.out.printf(injurde_desc[0],role.getName());

         }
        else if(remainBlood > 80 && remainBlood <= 90){
             System.out.printf(injurde_desc[1],role.getName());
         }
        else{
            System.out.printf(injurde_desc[2],role.getName());
         }
        System.out.println();
        }
        public void showRoleInfo(){
            System.out.println("姓名为："+ getName());
            System.out.println("血量为："+ getBlood());
            System.out.println("性别为："+ getGender());
            System.out.println("颜值为："+ getFace());
        }
}

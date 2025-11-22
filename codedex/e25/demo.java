package e25;
import java.util.Arrays;
/*你被困在一个谋杀谜案中，需要破解密码才能入侵一个包含可疑邮件的电子邮件账户！🕵️

你找到一个名为 password.txt 的文本文件，里面写着以下乱码：

// password.txt
ASDFDFA
34958234985234820934
        243082304920394
ASDFAFMMMMMMMMM99999999
12212112
        23094230482

创建一个字符串数组，其中包含文本文件中的六个字符串（即使包含数字也可以！）

        使用 .sort() 对数组进行排序。

仅将前三个元素添加到名为 sortedPasswords 的全新字符串数组中，然后遍历该新数组，将它们连接起来，形成一个秘密密码短语！

将这些元素连接成一个名为 passphrase 字符串，并打印出结果。（这将是您的电子邮件密码！）

祝你好运！*/
public class demo {
    public static void main(String[] args) {
        String[] sum = {"ASDFDFA","34958234985234820934","243082304920394","ASDFAFMMMMMMMMM99999999","12212112","23094230482"};
        String[] sortedPasswords = new String[3];
        Arrays.sort(sum);
        for (int i = 0; i < 3; i++) {
            sortedPasswords[i] = sum[i];
        }
        String passphrase = sortedPasswords[0] + sortedPasswords[1] + sortedPasswords[2];
        System.out.println(passphrase);
    }
}

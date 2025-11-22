package e30;

public class demo {
    public static void willCallBack(String phoneNum) {
        // 检查电话号码长度是否为10位
        if (phoneNum.length() != 10) {
            System.out.println("很遗憾，" + phoneNum + " 不是一个有效的电话号码。");
            return;
        }

        // 检查是否只包含数字
        if (!phoneNum.matches("\\d+")) {
            System.out.println("电话号码 " + phoneNum + " 中包含无效字符。");
            return;
        }

        // 检查是否以800开头（可能的垃圾电话）
        if (phoneNum.startsWith("800")) {
            System.out.println("号码 " + phoneNum + " 可能是垃圾电话。");
            return;
        }

        // 正常来电
        System.out.println("有一个来自 " + phoneNum + " 的语音留言消息。");
    }

    public static void main(String[] args) {
        willCallBack("1234567890");    // 正常号码
        willCallBack("8005551234");    // 垃圾电话
        willCallBack("987654321");     // 长度不足
        willCallBack("12345abcd1");    // 包含非数字字符
        willCallBack("4567890123");    // 正常号码
    }
}
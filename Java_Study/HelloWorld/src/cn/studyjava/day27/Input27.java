package cn.studyjava.day27;

/*
* 输入的线程，对资源对象Resource27中成员变量赋值
* 一次赋值 张三 男
* 下一次赋值 lily nv
* */

public class Input27 implements Runnable {

    private Resource27 resource27;

    public Input27(Resource27 resource27) {
        this.resource27 = resource27;
    }

    public void run() {
        int i = 0;
        while (true) {
            // 标记是true，等待
            if (resource27.flag) {
                try {
                    resource27.wait();
                } catch (Exception ex) {

                }

                if (i%2 == 0) {
                    resource27.name = "张三";
                    resource27.sex = "男";
                } else {
                    resource27.name = "Lily";
                    resource27.sex = "girl";
                }

                // 将对方线程唤醒，标记改成true
                resource27.flag = true;
                resource27.notify();
            }
            i++;
        }

    }
}

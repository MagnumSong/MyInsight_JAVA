package cn.studyjava.day27;

/*
* 输出线程，对资源对象Resource27中成员变量，输出值
* */

public class Output27 implements Runnable {

    private Resource27 resource27;

    public Output27(Resource27 resource27) {
        this.resource27 = resource27;
    }

    public void run() {
        while (true) {
            synchronized (resource27) {
                // 判断标记
                if (!resource27.flag) {
                    try {
                        resource27.wait();
                    } catch (Exception ex) {

                    }
                }
                System.out.println(resource27.name+"..."+resource27.sex);
                // 将标记改成false，唤醒对方线程
                resource27.flag = false;
                resource27.notify();
            }
        }
    }
}

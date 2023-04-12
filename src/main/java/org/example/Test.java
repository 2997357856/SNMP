package org.example;

import java.io.IOException;
import java.util.HashMap;

/**
 * @Author YZX
 * @Create 2023-04-11 17:07
 * @Java-version jdk1.8
 */
public class Test {
    public static void main(String[] args) throws IOException {
//        MySnmp mySnmp = new MySnmp();
//        GetMessage getMessage = new GetMessage();
//        System.out.println("获取容器信息："+getMessage.getMessageByIpAndOid("10.137.5.86",mySnmp.Sys_Desc));
//        System.out.println("获取容器名称："+getMessage.getMessageByIpAndOid("10.137.5.86",mySnmp.Sys_Name));
//        System.out.println("获取容器开启时长："+getMessage.getMessageByIpAndOid("10.137.5.86",mySnmp.Sys_Up_Time));
//        System.out.println("获取容器eth0网口当前速率："+getMessage.getMessageByIpAndOid("10.137.5.86",mySnmp.If_Speed));
//        System.out.println("获取容器eth0网口当前时刻进流量："+getMessage.getMessageByIpAndOid("10.137.5.86", mySnmp.If_In_Octets));
//        System.out.println("获取容器eth0网口当前时刻出流量："+getMessage.getMessageByIpAndOid("10.137.5.86", mySnmp.If_Out_Octets));
        TrafficMonitoring monitoring = new TrafficMonitoring();
        monitoring.getTrafficMonitoring(5);
    }
}

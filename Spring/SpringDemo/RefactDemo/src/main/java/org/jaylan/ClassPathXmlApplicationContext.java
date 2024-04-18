//package org.jaylan;
//
//
//import org.dom4j.Document;
//import org.dom4j.Node;
//import org.dom4j.io.SAXReader;
//import org.dom4j.*;
//import java.io.InputStream;
//import java.util.List;
//
////不要实现错了 这里是 最自己写道
//public class ClassPathXmlApplicationContext implements ApplicationContext{
//
//    @Override
//    public Object getBean(String id) {
//        return null;
//    }
//
//    public ClassPathXmlApplicationContext(String str) {
//
////        自动读取文件 读取二进制文件
//        InputStream inputStream=ClassLoader.getSystemClassLoader().getResourceAsStream("app.xml");
//
//
//        //        dom4j中专门读取文件的类 创建一个读取文件中的类
//        SAXReader saxReader=new SAXReader();
////        调用这个read方法
////        读取流中的文件
//        try{
////            将读取到的内容转换成document对象
//            Document read=saxReader.read(inputStream);
//            Element element = (Element) bean;
//
//            // 假设我们想要获取bean标签的某个属性值，例如class
//            String aClass = element.getAttribute("class");
//
//            // 假设我们还需要获取bean标签内的文本内容
//            String textContent = element.getTextContent();
//
//            // 这里可以进行其他处理，例如封装成Java对象等
//            // BeanInfo beanInfo = new BeanInfo(aClass, textContent);
//            // processBean(beanInfo);
//
//            });
////            获取值
//
//        }
//
//    }
//}

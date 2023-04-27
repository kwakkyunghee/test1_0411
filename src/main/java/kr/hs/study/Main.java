package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx1 = new AnnotationConfigApplicationContext(BeanConfig.class);
        TestBean1 t1 = ctx1.getBean(TestBean1.class);

        System.out.println(t1.getData1().getName1());

        System.out.println(t1.getData2().getName2());

        TestBean2 t2 = ctx1.getBean(TestBean2.class);
        System.out.println(t2.getData3().getI1());
        System.out.println(t2.getData4().getI2());
        System.out.println(t2.getData5().getI3());


        ctx1.close();

    }
}
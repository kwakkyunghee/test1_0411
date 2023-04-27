package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;

@Component
public class TestBean2 {

    @Value("1")
    private int data1;
    @Value("2.2")
    private double data2;

    @Autowired
    @Qualifier("data3")
    private DataBean1 data3;

    @Autowired
    @Qualifier("data4")
    private DataBean2 data4;

    @Autowired
    @Qualifier("data5")
    private DataBean3 data5;

    public DataBean1 getData3(){
        return data3;
    }

    public DataBean2 getData4(){
        return data4;
    }

    public DataBean3 getData5(){
        return data5;
    }

}

package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class TestBean1 {

    @Autowired
    @Qualifier("data1")
    private Car data1;

    @Autowired
    @Qualifier("data2")
    private Train data2;

    public Car getData1(){
        return data1;
    }

    public Train getData2(){
        return data2;
    }

}

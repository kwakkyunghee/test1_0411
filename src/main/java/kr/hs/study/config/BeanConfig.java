package kr.hs.study.config;

import kr.hs.study.beans.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "kr.hs.study.beans")
public class BeanConfig {
    @Bean
    public Car data1(){
        return new Car("car");
    }

    @Bean
    public Train data2(){
        return new Train("Train");
    }

    @Bean
    public DataBean1 data3(){
        return new DataBean1(1);
    }
    @Bean
    public DataBean2 data4(){
        return new DataBean2(2);
    }
    @Bean
    public DataBean3 data5(){
        return new DataBean3(3);
    }

}

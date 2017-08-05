package com.niit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestProduct{
    public static void main(String[] args)
    {

        ApplicationContext ctx=new AnnotationConfigApplicationContext(Config.class);
        DaoImpl bean1 =  ctx.getBean(DaoImpl.class);


        Product p=new Product();
        p.setpName("Valve");
        p.setpId(1);
        p.setpQty(20);


        bean1.save(p);

    }

}

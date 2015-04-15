package org.hfeng.qs;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ActionTest {
    @Test
    public void testQuickStart() {

        ApplicationContext ctx = new FileSystemXmlApplicationContext("bean.xml");
        Action action = (Action)ctx.getBean("TheAction");
        System.out.println(action.execute("Rod Johnson"));
    }
}

package org.hfeng.qs;

import org.apache.commons.beanutils.BeanUtils;

import java.io.FileInputStream;
import java.util.Properties;

public class ActionFactory {
    public static Action getAction(String actionName) {
        Properties pro = new Properties();

        try {
            pro.load(new FileInputStream("config.properties"));
            String actionImplName = (String)pro.get(actionName);
            String actionMessage = (String)pro.get(actionName + "_msg");

            Object obj = Class.forName(actionImplName).newInstance();
            BeanUtils.setProperty(obj, "message", actionMessage);
            return (Action)obj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

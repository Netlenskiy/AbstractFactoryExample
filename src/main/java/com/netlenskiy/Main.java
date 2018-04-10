package com.netlenskiy;

import java.util.ResourceBundle;

public class Main {

    public static void main(String[] args) throws Exception {
        ResourceBundle bundle = ResourceBundle.getBundle("SystemConfiguration");
        String uiFactoryClassName = bundle.getString("AbstractUIFactory");
        System.out.println("UI Factory class assigned in SystemConfiguration.properties: " + uiFactoryClassName);
        Class c = Class.forName(uiFactoryClassName);
        AbstractUIFactory uiFactory = (AbstractUIFactory) c.newInstance();
        AbstractWindow window = uiFactory.getWindow();
        AbstractButton button = uiFactory.getButton();
        System.out.println("A title of the window created: " + window.getTitle());
        System.out.println("A text of the button created: " + button.getText());
    }
}

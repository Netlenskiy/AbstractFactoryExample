package com.netlenskiy.macintosh;

import com.netlenskiy.AbstractButton;
import com.netlenskiy.AbstractUIFactory;
import com.netlenskiy.AbstractWindow;

public class UIFactory implements AbstractUIFactory {
    @Override
    public AbstractWindow getWindow() {
        return new Window();
    }

    @Override
    public AbstractButton getButton() {
        return new Button();
    }
}

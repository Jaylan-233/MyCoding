package org.jaylan;

import org.springframework.stereotype.Component;

/**
 * User Bean类
 */
@Component
public class User implements UserInterface{
    @Override
    public void addUser() {
        System.out.println("调用了User的addUser方法");
    }
}

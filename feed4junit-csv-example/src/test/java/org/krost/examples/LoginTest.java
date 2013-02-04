package org.krost.examples;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.databene.benerator.anno.Source;
import org.databene.feed4junit.Feeder;

@RunWith(Feeder.class)
public class LoginTest {
    
    @Test
    @Source("userloginFromTestResources.csv")
    public void testLoginFromTestResources(String name, String password) {
        System.out.println("name:" + name + " password:" + password);
    }
    
    
    @Test
    @Source("userloginFromMainResources.csv")
    public void testLoginFromMainResources(String name, String password) {
        System.out.println("name:" + name + " password:" + password);
    }
    
}
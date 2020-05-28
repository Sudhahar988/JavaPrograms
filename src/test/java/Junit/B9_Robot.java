package Junit;

//Some of the popular methods under Robot Class are:
//.keyPress();
//.mousePress();
//.mouseMove();
//.keyRelease();
//.mouseRelease();
//
//Example:
//
//First of all create the object of the Robot Class as following:
//
//Robot robot=new Robot();
//
//1. .keyPress()
//
//robot.keyPress(KeyEvent.VK_ESC);
//
//This will press Escape key on keyboard.
//
//2. .keyRelease()
//
//robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
//
//This will release the CAPS_LOCK key.
//
//3. .mousePress()
//
//robot.mousePress(InputEvent.BUTTON1_MASK);
//
//This will press Left mouse button.
//
//4. .mouseRelease()
//
//robot.mouseRelease(InputEvent.BUTTON1_MASK);
//
//This will release Left mouse button.
//
//5. .mouseMove()
//
//robot.mouseMove(coordinates.getX(), coordinates.getY());
//
//This will move the mouse pointer to X and Y co-ordinates.
//
//Code Example of Using Robot Class:
//
//package com.esteyaqueSelenium.SeleProg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Driver;
import java.util.List;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class B9_Robot {
    
    @Test
    public void robotandselenium() throws InterruptedException
    {
        WebDriver driver=new FirefoxDriver();        
        Robot robot=null;        
        driver.get("http://www.makemytrip.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath(".//*[@id='ssologinlink']")).click();
        driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("username@gmail.com");
        driver.findElement(By.xpath(".//*[@id='password_text']")).sendKeys("password");        
        try {
            robot=new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        //Keyboard Activity Using Robot Class
        robot.keyPress(KeyEvent.VK_ENTER);
    }
}
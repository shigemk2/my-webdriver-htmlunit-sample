package com.example

import org.openqa.selenium.{By, WebElement}
import org.openqa.selenium.htmlunit.HtmlUnitDriver
import scala.collection.JavaConversions._

object Hello {
  def main(args: Array[String]): Unit = {
    val url = "http://www.shigemk2.com"
    val driver = new HtmlUnitDriver()
    driver.get(url)
    println(s"title: ${driver.getTitle()}")
    driver.findElementByXPath("//div[@id='container']")
      .findElements(By.xpath("//a[@class='entry-title-link bookmark']"))
      .foreach{ we: WebElement =>
        println(s"title: ${we.getText()}")
        println(s"link: ${we.getAttribute("href")}")
      }
    println("Hello, world!")
  }
}

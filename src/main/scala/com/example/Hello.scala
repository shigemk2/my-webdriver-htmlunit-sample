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
      .findElements(By.xpath("//h1[@class='entry-title']"))
      .foreach{ we: WebElement =>
        println(s"title: ${we.getText()}")
      }
    println("Hello, world!")
  }
}

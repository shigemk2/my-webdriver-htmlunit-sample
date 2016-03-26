# my-webdriver-htmlunit-sample

Scalaでスクレイピング。

mvnはあるけど公式サイトが見当たらない…

http://mvnrepository.com/artifact/org.seleniumhq.webdriver/webdriver-htmlunit/0.9.7376

あと、class="entry-title-link bookmark"みたいなのがあったときに、こういうふうに書かないとスクレイピング出来ない。

```scala
      .findElements(By.xpath("//a[@class='entry-title-link bookmark']"))
```

http://qiita.com/rkaneko/items/96588cf31b1ce3d41c79


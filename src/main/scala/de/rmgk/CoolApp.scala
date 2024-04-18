package de.rmgk

object CoolApp {

  def main(args: Array[String]): Unit = {
    val input = args.mkString(" ")
    val doc   = org.jsoup.Jsoup.parse(input)
    println(doc.outerHtml())
  }

}

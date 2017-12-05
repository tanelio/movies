import slick.jdbc.H2Profile.api._
import slick.lifted.Tag

package main {

  class Files(tag: Tag) extends Table[(String, String, Timestamp)](tag, "FILES") {
    def fname = column[String]("fname", O.PrimaryKey)
    def URL = column[String]("URL")
    def released = comun[Timetamp]("released")
    def * = (fname, URL, released)
  }

  object main extends App {
    val maindir = "/data/movies/"
    val netflixURL = ""
    val imdbURL = ""

    // ToDo: Scan movie files recursively
    // ToDo: Add the ones NOT in DB
    // ToDo: are there ANY unatched? => ask
    // ToDo; present a web site with movies and matched URLs
  }

}

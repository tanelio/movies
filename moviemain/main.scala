import slick.jdbc.H2Profile.api._
import slick.lifted.Tag

package main {

  class Files(tag: Tag) extends Table[(String, String, Timestamp, Boolean, Boolean, String)](tag, "FILES") {
    def fname = column[String]("fname", O.PrimaryKey)
    def URL = column[String]("URL")
    def released = column[Timetamp]("released")
    def deleted = column[Boolean]("deleted")
    def noomdb = column[Boolean]("noomdb")
    def xml = column[String]("xml")
    def * = (fname, URL, released, deleted, noomdb, xml)
  }

  object main extends App {
    val exts = ".m4v,.mkv,.avi,.mpg,.mp4"
    val aux = ".sub,.idx"
    val maindir = "/data/movies/"
    val omDBURL = s"http://www.omdbapi.com/?apikey=$apikey&t=blade+runner&plot=full&r=xml"
    // val x = scala.xml.XML.load("http://www.omdbapi.com/?apikey=&t=blade+runner&plot=full&r=xml")
    // val plot = (x \\ "@plot").mkString

    // Actions:
    // - sync: match filesystem with DB (adds, removes)
    // - match: get descriptions from imDB for new movies
    // - play: put up web interface for viewing & playing

    // ToDo: Scan movie files recursively
    // ToDo: Add the ones NOT in DB
    // ToDo: are there ANY unatched? => ask
    // ToDo; present a web site with movies and matched URLs
  }

}

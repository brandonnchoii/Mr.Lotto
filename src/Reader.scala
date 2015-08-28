/**
 * @author brandonchoi
 * Reader parses and reads the text file of member info.
 */

class Reader {
  
  val memberListName = "lunchlotto.txt"
  
  //reads File and parses lines into a String
  def readFile(fileName: String): String = {
    val text = scala.io.Source.fromFile(fileName).mkString
    return text
  }
  
  //creates a new member 
  def createMember(): Unit = {
    
  }
  
  //reads in past pairings
  def readPastGroupings(): Unit = {
    
  }
}
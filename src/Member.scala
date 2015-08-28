/**
 * @author brandonchoi
 * Represents a Member object
 */

import scala.collection.mutable.MutableList

class Member (val name: String, val year: Int) {
  
  var groupings = new MutableList();
  var bans = new MutableList()
  
  //set pairing(s)
  def group(individuals: List[Member]): Unit = {
    individuals.foreach { x => groupings }
  }
}
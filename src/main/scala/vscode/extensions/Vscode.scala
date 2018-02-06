package vscode.extensions
import scala.scalajs.js
import js.annotation._
import vscode._

@js.native
@JSGlobal("vscode")
object Vscode extends js.Object {
  val version: String = js.native
  
}
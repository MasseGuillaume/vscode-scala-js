package vscode
import scala.scalajs.js

@js.native
trait EnterAction extends js.Object {
  var indentAction: IndentAction = js.native
  var appendText: String = js.native
  var removeText: Double = js.native
}
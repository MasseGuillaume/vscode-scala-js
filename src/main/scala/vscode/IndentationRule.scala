package vscode
import scala.scalajs.js
import js.RegExp

@js.native
trait IndentationRule extends js.Object {
  var decreaseIndentPattern: RegExp = js.native
  var increaseIndentPattern: RegExp = js.native
  var indentNextLinePattern: RegExp = js.native
  var unIndentedLinePattern: RegExp = js.native
}
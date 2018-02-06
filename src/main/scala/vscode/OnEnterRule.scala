package vscode
import scala.scalajs.js
import js.RegExp

@js.native
trait OnEnterRule extends js.Object {
  var beforeText: RegExp = js.native
  var afterText: RegExp = js.native
  var action: EnterAction = js.native
}
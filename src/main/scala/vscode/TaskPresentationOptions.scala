package vscode
import scala.scalajs.js

@js.native
trait TaskPresentationOptions extends js.Object {
  var reveal: TaskRevealKind = js.native
  var echo: Boolean = js.native
  var focus: Boolean = js.native
  var panel: TaskPanelKind = js.native
}
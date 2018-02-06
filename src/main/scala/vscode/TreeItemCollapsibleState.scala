package vscode
import scala.scalajs.js
import js.annotation._

@js.native
sealed trait TreeItemCollapsibleState extends js.Object {
}
@js.native
@JSGlobal("vscode.TreeItemCollapsibleState")
object TreeItemCollapsibleState extends js.Object {
  var None: TreeItemCollapsibleState = js.native
  var Collapsed: TreeItemCollapsibleState = js.native
  var Expanded: TreeItemCollapsibleState = js.native
  @JSBracketAccess
  def apply(value: TreeItemCollapsibleState): String = js.native
}
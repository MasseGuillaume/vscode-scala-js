package vscode
import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal("vscode.TreeItem")
class TreeItem protected () extends js.Object {
  def this(label: String, collapsibleState: TreeItemCollapsibleState ) = this()
  def this(resourceUri: Uri, collapsibleState: TreeItemCollapsibleState ) = this()
  var label: String = js.native
  var id: String = js.native
  var iconPath: String | Uri | js.Any = js.native
  var resourceUri: Uri = js.native
  var command: Command = js.native
  var collapsibleState: TreeItemCollapsibleState = js.native
  var contextValue: String = js.native
}
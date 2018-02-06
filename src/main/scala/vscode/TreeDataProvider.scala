package vscode
import scala.scalajs.js
import js.|

@js.native
trait TreeDataProvider[T] extends js.Object {
  var onDidChangeTreeData: Event[T | Unit | Null] = js.native
  def getTreeItem(element: T): TreeItem | Thenable[TreeItem] = js.native
  def getChildren(element: T ): ProviderResult[js.Array[T]] = js.native
}
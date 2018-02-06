package vscode
import scala.scalajs.js
import js.|

@js.native
trait ExtensionContext extends js.Object {
  var subscriptions: js.Array[js.Any] = js.native
  var workspaceState: Memento = js.native
  var globalState: Memento = js.native
  var extensionPath: String = js.native
  def asAbsolutePath(relativePath: String): String = js.native
  var storagePath: String | Unit = js.native
}
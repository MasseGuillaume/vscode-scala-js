package vscode
import scala.scalajs.js
import js.|

@js.native
trait QuickPickOptions extends js.Object {
  var matchOnDescription: Boolean = js.native
  var matchOnDetail: Boolean = js.native
  var placeHolder: String = js.native
  var ignoreFocusOut: Boolean = js.native
  def onDidSelectItem(item: QuickPickItem | String): js.Dynamic = js.native
}
package vscode
import scala.scalajs.js
import js.|

@js.native
trait InputBoxOptions extends js.Object {
  var value: String = js.native
  var valueSelection: js.Tuple2[Double, Double] = js.native
  var prompt: String = js.native
  var placeHolder: String = js.native
  var password: Boolean = js.native
  var ignoreFocusOut: Boolean = js.native
  def validateInput(value: String): String | Unit | Null | Thenable[String | Unit | Null] = js.native
}
package vscode.extensions
import scala.scalajs.js
import js.annotation._
import js.|
import vscode._

@js.native
@JSGlobal("vscode.extensions")
object Extensions extends js.Object {
  // def getExtension(extensionId: String): Extension[js.Any] | Unit = js.native
  def getExtension[T](extensionId: String): Extension[T] | Unit = js.native
  def all: js.Array[Extension[js.Any]] = js.native
}
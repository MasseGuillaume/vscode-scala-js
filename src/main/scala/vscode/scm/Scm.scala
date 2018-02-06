package vscode.scm
import scala.scalajs.js
import js.annotation._
import vscode._

@js.native
@JSGlobal("vscode.scm")
object Scm extends js.Object {
  val inputBox: SourceControlInputBox = js.native
  def createSourceControl(id: String, label: String, rootUri: Uri ): SourceControl = js.native
}
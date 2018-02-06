package vscode
import scala.scalajs.js

@js.native
trait TextEditorDecorationType extends js.Object {
  def key: String = js.native
  def dispose(): Unit = js.native
}
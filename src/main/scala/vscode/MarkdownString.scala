package vscode
import scala.scalajs.js
import js.annotation._

@js.native
@JSGlobal("vscode.MarkdownString")
class MarkdownString protected () extends js.Object {
  def this(value: String ) = this()
  var value: String = js.native
  var isTrusted: Boolean = js.native
  def appendText(value: String): MarkdownString = js.native
  def appendMarkdown(value: String): MarkdownString = js.native
  def appendCodeblock(value: String, language: String ): MarkdownString = js.native
}
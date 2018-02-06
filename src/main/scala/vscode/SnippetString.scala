package vscode
import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal("vscode.SnippetString")
class SnippetString protected () extends js.Object {
  def this(value: String ) = this()
  var value: String = js.native
  def appendText(string: String): SnippetString = js.native
  def appendTabstop(number: Double ): SnippetString = js.native
  def appendPlaceholder(value: String | js.Function1[SnippetString, Any], number: Double ): SnippetString = js.native
  def appendVariable(name: String, defaultValue: String | js.Function1[SnippetString, Any]): SnippetString = js.native
}
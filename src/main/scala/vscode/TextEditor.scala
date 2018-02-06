package vscode
import scala.scalajs.js
import js.|

@js.native
trait TextEditor extends js.Object {
  var document: TextDocument = js.native
  var selection: Selection = js.native
  var selections: js.Array[Selection] = js.native
  var options: TextEditorOptions = js.native
  var viewColumn: ViewColumn = js.native
  def edit(callback: js.Function1[TextEditorEdit, Unit], options: js.Any ): Thenable[Boolean] = js.native
  def insertSnippet(snippet: SnippetString, location: Position | Range | js.Array[Position] | js.Array[Range] , options: js.Any ): Thenable[Boolean] = js.native
  def setDecorations(decorationType: TextEditorDecorationType, rangesOrOptions: js.Array[Range] | js.Array[DecorationOptions]): Unit = js.native
  def revealRange(range: Range, revealType: TextEditorRevealType ): Unit = js.native
  def show(column: ViewColumn ): Unit = js.native
  def hide(): Unit = js.native
}
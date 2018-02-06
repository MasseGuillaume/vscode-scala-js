package vscode
import scala.scalajs.js
import js.annotation._

@js.native
@JSGlobal("vscode.WorkspaceEdit")
class WorkspaceEdit extends js.Object {
  def size: Double = js.native
  def replace(uri: Uri, range: Range, newText: String): Unit = js.native
  def insert(uri: Uri, position: Position, newText: String): Unit = js.native
  def delete(uri: Uri, range: Range): Unit = js.native
  def has(uri: Uri): Boolean = js.native
  def set(uri: Uri, edits: js.Array[TextEdit]): Unit = js.native
  def get(uri: Uri): js.Array[TextEdit] = js.native
  def entries(): js.Array[js.Tuple2[Uri, js.Array[TextEdit]]] = js.native
}
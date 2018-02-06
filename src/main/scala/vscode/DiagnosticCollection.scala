package vscode
import scala.scalajs.js
import js.|

@js.native
trait DiagnosticCollection extends js.Object {
  def name: String = js.native
  def set(uri: Uri, diagnostics: js.Array[Diagnostic] | Unit): Unit = js.native
  def set(entries: js.Array[js.Tuple2[Uri, js.Array[Diagnostic] | Unit]]): Unit = js.native
  def delete(uri: Uri): Unit = js.native
  def clear(): Unit = js.native
  def forEach(callback: js.Function3[Uri, js.Array[Diagnostic], DiagnosticCollection, Any], thisArg: js.Any ): Unit = js.native
  def get(uri: Uri): js.Array[Diagnostic] | Unit = js.native
  def has(uri: Uri): Boolean = js.native
  def dispose(): Unit = js.native
}
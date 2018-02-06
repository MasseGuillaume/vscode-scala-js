package vscode
import scala.scalajs.js
import js.annotation._

@js.native
@JSGlobal("vscode.Uri")
class Uri extends js.Object {
  def scheme: String = js.native
  def authority: String = js.native
  def path: String = js.native
  def query: String = js.native
  def fragment: String = js.native
  def fsPath: String = js.native
  def `with`(change: js.Any): Uri = js.native
  def toString(skipEncoding: Boolean ): String = js.native
  def toJSON(): js.Dynamic = js.native
}
@js.native
@JSGlobal("vscode.Uri")
object Uri extends js.Object {
  def file(path: String): Uri = js.native
  def parse(value: String): Uri = js.native
}
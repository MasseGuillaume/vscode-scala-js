package vscode
import scala.scalajs.js
import js.|
import js.RegExp

@js.native
trait TextDocument extends js.Object {
  def uri: Uri = js.native
  def fileName: String = js.native
  def isUntitled: Boolean = js.native
  def languageId: String = js.native
  def version: Double = js.native
  def isDirty: Boolean = js.native
  def isClosed: Boolean = js.native
  def save(): Thenable[Boolean] = js.native
  def eol: EndOfLine = js.native
  def lineCount: Double = js.native
  def lineAt(line: Double): TextLine = js.native
  def lineAt(position: Position): TextLine = js.native
  def offsetAt(position: Position): Double = js.native
  def positionAt(offset: Double): Position = js.native
  def getText(range: Range ): String = js.native
  def getWordRangeAtPosition(position: Position, regex: RegExp ): Range | Unit = js.native
  def validateRange(range: Range): Range = js.native
  def validatePosition(position: Position): Position = js.native
}
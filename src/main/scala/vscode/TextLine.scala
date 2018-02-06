package vscode
import scala.scalajs.js

@js.native
trait TextLine extends js.Object {
  def lineNumber: Double = js.native
  def text: String = js.native
  def range: Range = js.native
  def rangeIncludingLineBreak: Range = js.native
  def firstNonWhitespaceCharacterIndex: Double = js.native
  def isEmptyOrWhitespace: Boolean = js.native
}
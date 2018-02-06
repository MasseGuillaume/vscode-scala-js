package vscode
import scala.scalajs.js
import js.|

@js.native
trait DecorationOptions extends js.Object {
  var range: Range = js.native
  var hoverMessage: MarkedString | js.Array[MarkedString] = js.native
  var renderOptions: DecorationInstanceRenderOptions = js.native
}
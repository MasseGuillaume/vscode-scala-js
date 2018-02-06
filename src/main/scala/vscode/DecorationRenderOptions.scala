package vscode
import scala.scalajs.js

@js.native
trait DecorationRenderOptions extends ThemableDecorationRenderOptions {
  var isWholeLine: Boolean = js.native
  var rangeBehavior: DecorationRangeBehavior = js.native
  var overviewRulerLane: OverviewRulerLane = js.native
  var light: ThemableDecorationRenderOptions = js.native
  var dark: ThemableDecorationRenderOptions = js.native
}
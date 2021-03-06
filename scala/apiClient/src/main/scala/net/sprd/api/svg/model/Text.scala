package net.sprd.api.svg.model

class Text (
  var x: Double,
  var y: Double,
  var width: Double,
  var height: Double,
  var fontFamily: String,
  var fontSize: Double,
  var fontWeight: String,
  var fontStyle: String,
  var fill: String,
  var printColorId: String,
  var text:String,
  var tspans: Seq[Tspan]
  ) {
  
  def toXml =
  <text x={x.toString} y={y.toString} width={width.toString} height={height.toString}
    font-family={fontFamily} font-size={fontSize.toString} font-style={fontStyle} font-weight={fontWeight}
    fill ={fill} printColorId={printColorId}
    >{text}{tspans map (a=>a.toXml)}</text>

}

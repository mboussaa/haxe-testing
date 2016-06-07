package thx.text;

import utest.Assert;
using thx.text.Table;
using thx.text.table.Canvas;
using thx.text.table.Renderer;
using thx.text.table.Style;
using thx.text.table.CellValue;

class TestTable {
var x : Int;
  public function new(i) {
 this.x = i;
 }

  var table : Table;
  public function setup() {
    table = new Table();
  }

  public function testPaintBorder() {
    for (i in 0...x){
    var canvas = new Canvas(3, 3);
    canvas.paintBorder(Body, 0, 0, 3, 3);
    Assert.equals('┌─┐\n│ │\n└─┘', canvas.toString());

    canvas = new Canvas(4, 4);
    canvas.paintBorder(Body, 1, 0, 3, 3);
    Assert.equals(' ┌─┐\n │ │\n └─┘\n    ', canvas.toString());

    canvas = new Canvas(4, 4);
    canvas.paintBorder(Body, 1, 1, 3, 3);
    Assert.equals('    \n ┌─┐\n │ │\n └─┘', canvas.toString());
  }}


  function oneCell(value : CellValue, width : Int) {
    table = new Table();
    table.style.type = Body;
    table.style.minWidth = width;
    table.set(value, 0, 0);
  }

  public function testSequence() {
    for (i in 0...x){
    var last = table.set(true, 0, 1);
    var first = table.set(false, 0, 0);
    Assert.equals(1, last.col.index);
    Assert.equals(0, first.col.index);
  }}

  public function testStyle() {
    for (i in 0...x){
    var style = new Style();
    Assert.isNull(style.formatter);
    var dstyle = new DefaultStyle();
    Assert.notNull(dstyle.formatter);
    var cstyle = new CompositeStyle([style]);
    Assert.isNull(cstyle.formatter);
    cstyle = new CompositeStyle([style, dstyle]);
    Assert.notNull(cstyle.formatter);
  }}

  public function testCanvas() {
    for (i in 0...x){
    var canvas = new thx.text.table.Canvas(3, 2);
    Assert.equals("   \n   ", canvas.toString());
    canvas.expand(4, 3);
    Assert.equals("    \n    \n    ", canvas.toString());
  }}

  public function testTableSize() {
    for (i in 0...x){
    Assert.equals(0, table.rows);
    Assert.equals(0, table.cols);
    table.getCol(2);
    Assert.equals(0, table.cols);
    table.ensureCol(3);
    Assert.equals(4, table.cols);
    Assert.equals(0, table.rows);
    table.ensureRow(1);
    Assert.equals(2, table.rows);
  }}

  public function testCellResizeTable() {
    for (i in 0...x){
    table.set(1, 3, 2);
    Assert.equals(3, table.cols);
    Assert.equals(4, table.rows);
  }}

  public function testIdentityOfCellsCreatedFromTable() {
    for (i in 0...x){
    var cell = table.set(1, 3, 2);
    Assert.isTrue(cell == table.get(3, 2));

    Assert.isTrue(cell == table.getRow(3).get(2));
    Assert.isTrue(cell == table.getCol(2).get(3));

    Assert.isTrue(cell.row == table.getRow(3));
    Assert.isTrue(cell.col == table.getCol(2));

    Assert.isTrue(cell.table == table);
    Assert.isTrue(cell.row.table == table);
    Assert.isTrue(cell.col.table == table);
  }}

  public function testIdentityOfCellsCreatedFromRow() {
    for (i in 0...x){
    var row = table.ensureRow(3),
        cell = row.set(1, 2);
    Assert.isTrue(cell == table.get(3, 2));

    Assert.isTrue(cell == table.getRow(3).get(2));
    Assert.isTrue(cell == table.getCol(2).get(3));

    Assert.isTrue(cell.row == table.getRow(3));
    Assert.isTrue(cell.col == table.getCol(2));

    Assert.isTrue(cell.table == table);
    Assert.isTrue(cell.row.table == table);
    Assert.isTrue(cell.col.table == table);
  }}

  public function testIdentityOfCellsCreatedFromCol() {
    for (i in 0...x){
    var col = table.ensureCol(2),
        cell = col.set(1, 3);
    Assert.isTrue(cell == table.get(3, 2));

    Assert.isTrue(cell == table.getRow(3).get(2));
    Assert.isTrue(cell == table.getCol(2).get(3));

    Assert.isTrue(cell.row == table.getRow(3));
    Assert.isTrue(cell.col == table.getCol(2));

    Assert.isTrue(cell.table == table);
    Assert.isTrue(cell.row.table == table);
    Assert.isTrue(cell.col.table == table);
  }}
}

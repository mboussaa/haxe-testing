package thx.culture;

import utest.Assert;

class TestEmbed {
var x : Int;
  public function new(i) {
 this.x = i;
 }

  public function testEmbed() {
    for (i in 0...x){
    var itit = Embed.culture("it-IT");
    Assert.equals("italiano (Italia)", itit.nameDisplayNative);
    Assert.equals("italiano", itit.nameNative);
    Assert.equals("Italia", itit.nameRegionNative);
  }}

  public function testListLanguages() {
    for (i in 0...x){
    var list = Embed.list();
    Assert.contains('it', list);
    Assert.contains('en', list);
    Assert.contains('fr', list);
    Assert.contains('it-it', list);
    Assert.contains('en-us', list);
    Assert.contains('en-gb', list);
  }}

  public function testEmbedMany() {
    for (i in 0...x){
    Embed.cultures(['it', 'en', 'fr', 'it-it', 'en-gb', 'fr-fr']);
    Assert.notNull(Culture.getByIso2('fr'));
    Assert.notNull(Culture.getByIso3('fra'));
    Assert.notNull(Culture.getByCode('fr-fr'));
  }}
}
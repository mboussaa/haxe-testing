// Generated by Haxe 3.3.0
#include <hxcpp.h>

#ifndef INCLUDED_thx_math_random_PseudoRandom
#include <thx/math/random/PseudoRandom.h>
#endif
#ifndef INCLUDED_thx_math_random_TestPseudoRandom
#include <thx/math/random/TestPseudoRandom.h>
#endif
#ifndef INCLUDED_utest_Assert
#include <utest/Assert.h>
#endif

namespace thx{
namespace math{
namespace random{

void TestPseudoRandom_obj::__construct(){
            	HX_STACK_FRAME("thx.math.random.TestPseudoRandom","new",0xaf4c65f4,"thx.math.random.TestPseudoRandom.new","thx/math/random/TestPseudoRandom.hx",6,0xc2638cfb)
            	HX_STACK_THIS(this)
            	}

Dynamic TestPseudoRandom_obj::__CreateEmpty() { return new TestPseudoRandom_obj; }

hx::ObjectPtr< TestPseudoRandom_obj > TestPseudoRandom_obj::__new()
{
	hx::ObjectPtr< TestPseudoRandom_obj > _hx_result = new TestPseudoRandom_obj();
	_hx_result->__construct();
	return _hx_result;
}

Dynamic TestPseudoRandom_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< TestPseudoRandom_obj > _hx_result = new TestPseudoRandom_obj();
	_hx_result->__construct();
	return _hx_result;
}

void TestPseudoRandom_obj::testSequence1(){
            	HX_STACK_FRAME("thx.math.random.TestPseudoRandom","testSequence1",0x23c2aeb2,"thx.math.random.TestPseudoRandom.testSequence1","thx/math/random/TestPseudoRandom.hx",8,0xc2638cfb)
            	HX_STACK_THIS(this)
HXLINE(   9)		HX_VARI( ::Array< Int >,expected) = ::Array_obj< Int >::__new(200)->init(0,(int)48271)->init(1,(int)182605794)->init(2,(int)217653062)->init(3,(int)840978813)->init(4,(int)1004927217)->init(5,(int)407355683)->init(6,(int)32160337)->init(7,(int)854716505)->init(8,(int)564586691)->init(9,(int)522939007)->init(10,(int)192302371)->init(11,(int)129686383)->init(12,(int)176586923)->init(13,(int)664789325)->init(14,(int)197394089)->init(15,(int)25152515)->init(16,(int)808815145)->init(17,(int)1063185970)->init(18,(int)485785999)->init(19,(int)1002040271)->init(20,(int)638022372)->init(21,(int)914937185)->init(22,(int)857914756)->init(23,(int)328562263)->init(24,(int)862288313)->init(25,(int)991134804)->init(26,(int)353718330)->init(27,(int)768771956)->init(28,(int)873692051)->init(29,(int)631416347)->init(30,(int)936825989)->init(31,(int)890442452)->init(32,(int)662405787)->init(33,(int)31982270)->init(34,(int)849178936)->init(35,(int)622307543)->init(36,(int)406178052)->init(37,(int)95075117)->init(38,(int)198443203)->init(39,(int)201068705)->init(40,(int)235116438)->init(41,(int)928270262)->init(42,(int)213780523)->init(43,(int)740726033)->init(44,(int)1057382352)->init(45,(int)585933319)->init(46,(int)153892771)->init(47,(int)412013968)->init(48,(int)480194461)->init(49,(int)602083036)->init(50,(int)180318217)->init(51,(int)389431516)->init(52,(int)250604821)->init(53,(int)169955075)->init(54,(int)513917920)->init(55,(int)674592135)->init(56,(int)942409124)->init(57,(int)884730203)->init(58,(int)878082947)->init(59,(int)1057217933)->init(60,(int)165480670)->init(61,(int)352020689)->init(62,(int)426321831)->init(63,(int)719080959)->init(64,(int)978785428)->init(65,(int)163677341)->init(66,(int)276590098)->init(67,(int)374787159)->init(68,(int)948709761)->init(69,(int)80100956)->init(70,(int)8940652)->init(71,(int)1003765604)->init(72,(int)169685246)->init(73,(int)373904143)->init(74,(int)200599677)->init(75,(int)143244144)->init(76,(int)714473507)->init(77,(int)837051536)->init(78,(int)409875951)->init(79,(int)355190910)->init(80,(int)984720785)->init(81,(int)1053994172)->init(82,(int)243877847)->init(83,(int)795941506)->init(84,(int)262531784)->init(85,(int)370768652)->init(86,(int)244910729)->init(87,(int)188346959)->init(88,(int)324062450)->init(89,(int)547639202)->init(90,(int)641966995)->init(91,(int)199813570)->init(92,(int)851802928)->init(93,(int)583514338)->init(94,(int)425095546)->init(95,(int)580853881)->init(96,(int)851194519)->init(97,(int)206008598)->init(98,(int)318006624)->init(99,(int)284662483)->init(100,(int)268625699)->init(101,(int)324855843)->init(102,(int)190807059)->init(103,(int)963924829)->init(104,(int)87265245)->init(105,(int)91491940)->init(106,(int)107315684)->init(107,(int)504849935)->init(108,(int)1040552188)->init(109,(int)999647265)->init(110,(int)15580725)->init(111,(int)477900025)->init(112,(int)442770701)->init(113,(int)153511203)->init(114,(int)246980175)->init(115,(int)224561104)->init(116,(int)365367087)->init(117,(int)425205589)->init(118,(int)524054552)->init(119,(int)353659755)->init(120,(int)88805914)->init(121,(int)372915282)->init(122,(int)785648268)->init(123,(int)540080431)->init(124,(int)844776180)->init(125,(int)697753720)->init(126,(int)136322707)->init(127,(int)543519324)->init(128,(int)413597540)->init(129,(int)685153140)->init(130,(int)705315316)->init(131,(int)69903233)->init(132,(int)602174841)->init(133,(int)316870078)->init(134,(int)183259380)->init(135,(int)628414122)->init(136,(int)971593322)->init(137,(int)885903564)->init(138,(int)609099268)->init(139,(int)632178686)->init(140,(int)154752171)->init(141,(int)20204387)->init(142,(int)328389139)->init(143,(int)21588338)->init(144,(int)561118938)->init(145,(int)634782546)->init(146,(int)217860746)->init(147,(int)128674942)->init(148,(int)745442293)->init(149,(int)8960406)->init(150,(int)883569114)->init(151,(int)665754786)->init(152,(int)630239474)->init(153,(int)1036330187)->init(154,(int)136665771)->init(155,(int)997410180)->init(156,(int)477198999)->init(157,(int)963283007)->init(158,(int)244364229)->init(159,(int)651791047)->init(160,(int)896459363)->init(161,(int)120706635)->init(162,(int)506843774)->init(163,(int)648366306)->init(164,(int)937051507)->init(165,(int)1038979459)->init(166,(int)244397486)->init(167,(int)109656047)->init(168,(int)733596705)->init(169,(int)514973984)->init(170,(int)112225815)->init(171,(int)224840443)->init(172,(int)964413938)->init(173,(int)74725667)->init(174,(int)383910756)->init(175,(int)45971089)->init(176,(int)719853903)->init(177,(int)708625565)->init(178,(int)945118699)->init(179,(int)682122561)->init(180,(int)445124403)->init(181,(int)1026193113)->init(182,(int)436238233)->init(183,(int)504844484)->init(184,(int)777426967)->init(185,(int)974134555)->init(186,(int)73452005)->init(187,(int)106232158)->init(188,(int)815291605)->init(189,(int)155774168)->init(190,(int)1034639516)->init(191,(int)130664516)->init(192,(int)147380597)->init(193,(int)669217099)->init(194,(int)255849967)->init(195,(int)1029044983)->init(196,(int)659901595)->init(197,(int)484956294)->init(198,(int)679773550)->init(199,(int)872671849);
HXDLIN(   9)		HX_VARI(  ::thx::math::random::PseudoRandom,random) =  ::thx::math::random::PseudoRandom_obj::__new((int)1);
HXLINE(  12)		{
HXLINE(  12)			HX_VARI( Int,_g) = (int)0;
HXDLIN(  12)			while((_g < expected->length)){
HXLINE(  12)				HX_VARI( Int,e) = expected->__get(_g);
HXDLIN(  12)				++_g;
HXLINE(  13)				Int _hx_tmp = random->_hx_int();
HXDLIN(  13)				::utest::Assert_obj::equals(e,_hx_tmp,null(),hx::SourceInfo(HX_("TestPseudoRandom.hx",eb,9c,2e,93),13,HX_("thx.math.random.TestPseudoRandom",02,9c,c5,a0),HX_("testSequence1",1e,d8,c7,19)));
            			}
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestPseudoRandom_obj,testSequence1,(void))

void TestPseudoRandom_obj::testSequence2(){
            	HX_STACK_FRAME("thx.math.random.TestPseudoRandom","testSequence2",0x23c2aeb3,"thx.math.random.TestPseudoRandom.testSequence2","thx/math/random/TestPseudoRandom.hx",16,0xc2638cfb)
            	HX_STACK_THIS(this)
HXLINE(  17)		HX_VARI( ::Array< Int >,expected) = ::Array_obj< Int >::__new(200)->init(0,(int)37506567)->init(1,(int)150781236)->init(2,(int)538963273)->init(3,(int)605509401)->init(4,(int)218142313)->init(5,(int)835269582)->init(6,(int)292520297)->init(7,(int)542277462)->init(8,(int)597194919)->init(9,(int)449199544)->init(10,(int)168828800)->init(11,(int)908330394)->init(12,(int)842827975)->init(13,(int)71488810)->init(14,(int)903868604)->init(15,(int)216151720)->init(16,(int)310401306)->init(17,(int)388036807)->init(18,(int)572341563)->init(19,(int)122468918)->init(20,(int)748402410)->init(21,(int)89105588)->init(22,(int)879835230)->init(23,(int)816066570)->init(24,(int)1056863549)->init(25,(int)238855647)->init(26,(int)1034977417)->init(27,(int)335356334)->init(28,(int)253891563)->init(29,(int)984230103)->init(30,(int)990579332)->init(31,(int)384050870)->init(32,(int)366963042)->init(33,(int)154162238)->init(34,(int)534553643)->init(35,(int)349140724)->init(36,(int)993992507)->init(37,(int)858922299)->init(38,(int)645288359)->init(39,(int)537819377)->init(40,(int)149362719)->init(41,(int)785230005)->init(42,(int)751225940)->init(43,(int)18510633)->init(44,(int)173592526)->init(45,(int)3656087)->init(46,(int)389340658)->init(47,(int)159789733)->init(48,(int)522683442)->init(49,(int)740826138)->init(50,(int)520817554)->init(51,(int)866835528)->init(52,(int)372676252)->init(53,(int)1058591196)->init(54,(int)956007710)->init(55,(int)172079027)->init(56,(int)1033707544)->init(57,(int)240600691)->init(58,(int)444392285)->init(59,(int)45839352)->init(60,(int)803203982)->init(61,(int)789652184)->init(62,(int)539581437)->init(63,(int)380156923)->init(64,(int)307066518)->init(65,(int)475758784)->init(66,(int)162141446)->init(67,(int)225588374)->init(68,(int)560593376)->init(69,(int)1035158872)->init(70,(int)504436051)->init(71,(int)389310447)->init(72,(int)848934063)->init(73,(int)613227154)->init(74,(int)173384621)->init(75,(int)705292067)->init(76,(int)21392578)->init(77,(int)775240254)->init(78,(int)646034171)->init(79,(int)31688430)->init(80,(int)623872001)->init(81,(int)762202525)->init(82,(int)514526183)->init(83,(int)1045002038)->init(84,(int)1049991915)->init(85,(int)324434294)->init(86,(int)243334062)->init(87,(int)316699535)->init(88,(int)540936951)->init(89,(int)313897848)->init(90,(int)592149399)->init(91,(int)636321694)->init(92,(int)425912168)->init(93,(int)271591109)->init(94,(int)660499427)->init(95,(int)351899667)->init(96,(int)1026919810)->init(97,(int)81148944)->init(98,(int)130527831)->init(99,(int)1065675862)->init(100,(int)416254364)->init(101,(int)83661488)->init(102,(int)80713200)->init(103,(int)571541542)->init(104,(int)159360873)->init(105,(int)222277029)->init(106,(int)706166447)->init(107,(int)352634306)->init(108,(int)1055198804)->init(109,(int)410586514)->init(110,(int)295063266)->init(111,(int)887390317)->init(112,(int)435451157)->init(113,(int)92862711)->init(114,(int)777551392)->init(115,(int)537802789)->init(116,(int)422385195)->init(117,(int)746003227)->init(118,(int)242235797)->init(119,(int)989465031)->init(120,(int)282718474)->init(121,(int)918623592)->init(122,(int)563348488)->init(123,(int)883184110)->init(124,(int)334837701)->init(125,(int)988761784)->init(126,(int)696045024)->init(127,(int)333978501)->init(128,(int)316483742)->init(129,(int)861787147)->init(130,(int)421670935)->init(131,(int)627721254)->init(132,(int)812158623)->init(133,(int)321173024)->init(134,(int)658617946)->init(135,(int)798985313)->init(136,(int)87509662)->init(137,(int)78560753)->init(138,(int)823729284)->init(139,(int)502826071)->init(140,(int)1057094847)->init(141,(int)666423170)->init(142,(int)681548833)->init(143,(int)668011662)->init(144,(int)50234873)->init(145,(int)378541255)->init(146,(int)700333741)->init(147,(int)122440737)->init(148,(int)461819183)->init(149,(int)519784909)->init(150,(int)412176750)->init(151,(int)821651618)->init(152,(int)69800170)->init(153,(int)995929886)->init(154,(int)962605364)->init(155,(int)819855505)->init(156,(int)342693115)->init(157,(int)72845459)->init(158,(int)892445385)->init(159,(int)709244650)->init(160,(int)764223811)->init(161,(int)373516750)->init(162,(int)828104997)->init(163,(int)195704929)->init(164,(int)92064606)->init(165,(int)906930583)->init(166,(int)918286074)->init(167,(int)377144462)->init(168,(int)921473718)->init(169,(int)702827226)->init(170,(int)226370940)->init(171,(int)754848804)->init(172,(int)951579235)->init(173,(int)79785178)->init(174,(int)872172302)->init(175,(int)286056366)->init(176,(int)980734799)->init(177,(int)846250373)->init(178,(int)991563672)->init(179,(int)654510911)->init(180,(int)116794352)->init(181,(int)635616152)->init(182,(int)728432638)->init(183,(int)348398879)->init(184,(int)617848552)->init(185,(int)988305879)->init(186,(int)163891239)->init(187,(int)938008180)->init(188,(int)1047643432)->init(189,(int)777444692)->init(190,(int)756020342)->init(191,(int)594597523)->init(192,(int)698090578)->init(193,(int)290643737)->init(194,(int)153187011)->init(195,(int)704035495)->init(196,(int)568689505)->init(197,(int)1001402213)->init(198,(int)976813400)->init(199,(int)534936044);
HXDLIN(  17)		HX_VARI(  ::thx::math::random::PseudoRandom,random) =  ::thx::math::random::PseudoRandom_obj::__new((int)777);
HXLINE(  20)		{
HXLINE(  20)			HX_VARI( Int,_g) = (int)0;
HXDLIN(  20)			while((_g < expected->length)){
HXLINE(  20)				HX_VARI( Int,e) = expected->__get(_g);
HXDLIN(  20)				++_g;
HXLINE(  21)				Int _hx_tmp = random->_hx_int();
HXDLIN(  21)				::utest::Assert_obj::equals(e,_hx_tmp,null(),hx::SourceInfo(HX_("TestPseudoRandom.hx",eb,9c,2e,93),21,HX_("thx.math.random.TestPseudoRandom",02,9c,c5,a0),HX_("testSequence2",1f,d8,c7,19)));
            			}
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC0(TestPseudoRandom_obj,testSequence2,(void))


TestPseudoRandom_obj::TestPseudoRandom_obj()
{
}

hx::Val TestPseudoRandom_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 13:
		if (HX_FIELD_EQ(inName,"testSequence1") ) { return hx::Val( testSequence1_dyn()); }
		if (HX_FIELD_EQ(inName,"testSequence2") ) { return hx::Val( testSequence2_dyn()); }
	}
	return super::__Field(inName,inCallProp);
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *TestPseudoRandom_obj_sMemberStorageInfo = 0;
static hx::StaticInfo *TestPseudoRandom_obj_sStaticStorageInfo = 0;
#endif

static ::String TestPseudoRandom_obj_sMemberFields[] = {
	HX_HCSTRING("testSequence1","\x1e","\xd8","\xc7","\x19"),
	HX_HCSTRING("testSequence2","\x1f","\xd8","\xc7","\x19"),
	::String(null()) };

static void TestPseudoRandom_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(TestPseudoRandom_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void TestPseudoRandom_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(TestPseudoRandom_obj::__mClass,"__mClass");
};

#endif

hx::Class TestPseudoRandom_obj::__mClass;

void TestPseudoRandom_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("thx.math.random.TestPseudoRandom","\x02","\x9c","\xc5","\xa0");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &hx::Class_obj::GetNoStaticField;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = TestPseudoRandom_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(0 /* sStaticFields */);
	__mClass->mMembers = hx::Class_obj::dupFunctions(TestPseudoRandom_obj_sMemberFields);
	__mClass->mCanCast = hx::TCanCast< TestPseudoRandom_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = TestPseudoRandom_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = TestPseudoRandom_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = TestPseudoRandom_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

} // end namespace thx
} // end namespace math
} // end namespace random
